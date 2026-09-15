package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class setImageCaptureTargetSize extends ForwardingLiveData<String> {
    @Override // defpackage.ForwardingLiveData
    public final /* bridge */ /* synthetic */ String b(createImageAnalysis createimageanalysis, int i) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(createimageanalysis, i);
        Intrinsics.checkNotNullParameter(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        String str = (String) ForwardingLiveData.b(new Object[]{this}, 744126603, -744126603, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(str != null ? str : "", strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    protected final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(createImageAnalysis createimageanalysis, int i) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(createimageanalysis, i);
        Intrinsics.checkNotNullParameter(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        String str = (String) ForwardingLiveData.b(new Object[]{this}, 744126603, -744126603, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(str != null ? str : "", strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    protected String TuitionPaymentFragmentspecialinlinedviewModeldefault2(createImageAnalysis createimageanalysis, int i) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        return createimageanalysis.TuitionPaymentFragmentbindingInflater1(i);
    }

    protected String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() == 0) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        sb.append(str2);
        return sb.toString();
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2().isEmpty() ? "$" : CollectionsKt.joinToString$default(TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ".", "$.", null, 0, null, null, 60, null);
    }
}
