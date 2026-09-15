package defpackage;

import kotlin.Metadata;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LwaitForCaptureResult;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Lkotlin/UIntArray;", "LonRotationChanged;", "Lkotlin/UInt;", "LshutDownForTests;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class waitForCaptureResult extends onRotationChanged<UInt, UIntArray, shutDownForTests> {
    public static final waitForCaptureResult INSTANCE = new waitForCaptureResult();

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        int[] storage = ((UIntArray) obj).getStorage();
        Intrinsics.checkNotNullParameter(storage, "");
        return new shutDownForTests(storage, null);
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isUseCaseEnabled isusecaseenabled, UIntArray uIntArray, int i) {
        int[] storage = uIntArray.getStorage();
        Intrinsics.checkNotNullParameter(isusecaseenabled, "");
        Intrinsics.checkNotNullParameter(storage, "");
        for (int i2 = 0; i2 < i; i2++) {
            isusecaseenabled.encodeInlineElement(getDescriptor(), i2).encodeInt(UIntArray.m8184getpVg5ArA(storage, i2));
        }
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setActiveRecording setactiverecording, int i, Object obj, boolean z) {
        shutDownForTests shutdownfortests = (shutDownForTests) obj;
        Intrinsics.checkNotNullParameter(setactiverecording, "");
        Intrinsics.checkNotNullParameter(shutdownfortests, "");
        int iM8124constructorimpl = UInt.m8124constructorimpl(setactiverecording.decodeInlineElement(getDescriptor(), i).decodeInt());
        shutDownForTests shutdownfortests2 = shutdownfortests;
        shutdownfortests2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(shutdownfortests2.getTuitionPaymentFragmentbindingInflater1() + 1);
        int[] iArr = shutdownfortests.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = shutdownfortests.b;
        shutdownfortests.b = i2 + 1;
        UIntArray.m8189setVXSXFK8(iArr, i2, iM8124constructorimpl);
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int b(Object obj) {
        int[] storage = ((UIntArray) obj).getStorage();
        Intrinsics.checkNotNullParameter(storage, "");
        return UIntArray.m8185getSizeimpl(storage);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private waitForCaptureResult() {
        super(startPreviewStreamStateFlow.INSTANCE);
        Intrinsics.checkNotNullParameter(UInt.INSTANCE, "");
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ UIntArray b() {
        return UIntArray.m8177boximpl(UIntArray.m8178constructorimpl(0));
    }
}
