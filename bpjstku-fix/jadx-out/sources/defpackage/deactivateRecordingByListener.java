package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LdeactivateRecordingByListener;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "", "LonRotationChanged;", "", "LclearImageAnalysisAnalyzer;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class deactivateRecordingByListener extends onRotationChanged<Character, char[], clearImageAnalysisAnalyzer> {
    public static final deactivateRecordingByListener INSTANCE = new deactivateRecordingByListener();

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        char[] cArr = (char[]) obj;
        Intrinsics.checkNotNullParameter(cArr, "");
        return new clearImageAnalysisAnalyzer(cArr);
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isUseCaseEnabled isusecaseenabled, char[] cArr, int i) {
        char[] cArr2 = cArr;
        Intrinsics.checkNotNullParameter(isusecaseenabled, "");
        Intrinsics.checkNotNullParameter(cArr2, "");
        for (int i2 = 0; i2 < i; i2++) {
            isusecaseenabled.encodeCharElement(getDescriptor(), i2, cArr2[i2]);
        }
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setActiveRecording setactiverecording, int i, Object obj, boolean z) {
        clearImageAnalysisAnalyzer clearimageanalysisanalyzer = (clearImageAnalysisAnalyzer) obj;
        Intrinsics.checkNotNullParameter(setactiverecording, "");
        Intrinsics.checkNotNullParameter(clearimageanalysisanalyzer, "");
        char cDecodeCharElement = setactiverecording.decodeCharElement(getDescriptor(), i);
        clearImageAnalysisAnalyzer clearimageanalysisanalyzer2 = clearimageanalysisanalyzer;
        clearimageanalysisanalyzer2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(clearimageanalysisanalyzer2.getTuitionPaymentFragmentspecialinlinedviewModeldefault1() + 1);
        char[] cArr = clearimageanalysisanalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = clearimageanalysisanalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        clearimageanalysisanalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 + 1;
        cArr[i2] = cDecodeCharElement;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int b(Object obj) {
        char[] cArr = (char[]) obj;
        Intrinsics.checkNotNullParameter(cArr, "");
        return cArr.length;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private deactivateRecordingByListener() {
        super(getImageAnalysisBackgroundExecutor.INSTANCE);
        Intrinsics.checkNotNullParameter(CharCompanionObject.INSTANCE, "");
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ char[] b() {
        return new char[0];
    }
}
