package defpackage;

import kotlin.Metadata;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LlambdastartPreviewStreamStateFlow0androidxcameraviewPreviewStreamStateObserver;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Lkotlin/ULongArray;", "LonRotationChanged;", "Lkotlin/ULong;", "LPreviewStreamStateObserver;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdastartPreviewStreamStateFlow0androidxcameraviewPreviewStreamStateObserver extends onRotationChanged<ULong, ULongArray, PreviewStreamStateObserver> {
    public static final lambdastartPreviewStreamStateFlow0androidxcameraviewPreviewStreamStateObserver INSTANCE = new lambdastartPreviewStreamStateFlow0androidxcameraviewPreviewStreamStateObserver();

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        long[] storage = ((ULongArray) obj).getStorage();
        Intrinsics.checkNotNullParameter(storage, "");
        return new PreviewStreamStateObserver(storage, null);
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isUseCaseEnabled isusecaseenabled, ULongArray uLongArray, int i) {
        long[] storage = uLongArray.getStorage();
        Intrinsics.checkNotNullParameter(isusecaseenabled, "");
        Intrinsics.checkNotNullParameter(storage, "");
        for (int i2 = 0; i2 < i; i2++) {
            isusecaseenabled.encodeInlineElement(getDescriptor(), i2).encodeLong(ULongArray.m8263getsVKNKU(storage, i2));
        }
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setActiveRecording setactiverecording, int i, Object obj, boolean z) {
        PreviewStreamStateObserver previewStreamStateObserver = (PreviewStreamStateObserver) obj;
        Intrinsics.checkNotNullParameter(setactiverecording, "");
        Intrinsics.checkNotNullParameter(previewStreamStateObserver, "");
        long jM8203constructorimpl = ULong.m8203constructorimpl(setactiverecording.decodeInlineElement(getDescriptor(), i).decodeLong());
        PreviewStreamStateObserver previewStreamStateObserver2 = previewStreamStateObserver;
        previewStreamStateObserver2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(previewStreamStateObserver2.getTuitionPaymentFragmentbindingInflater1() + 1);
        long[] jArr = previewStreamStateObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = previewStreamStateObserver.TuitionPaymentFragmentbindingInflater1;
        previewStreamStateObserver.TuitionPaymentFragmentbindingInflater1 = i2 + 1;
        ULongArray.m8268setk8EXiF4(jArr, i2, jM8203constructorimpl);
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int b(Object obj) {
        long[] storage = ((ULongArray) obj).getStorage();
        Intrinsics.checkNotNullParameter(storage, "");
        return ULongArray.m8264getSizeimpl(storage);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private lambdastartPreviewStreamStateFlow0androidxcameraviewPreviewStreamStateObserver() {
        super(cancelFlow.INSTANCE);
        Intrinsics.checkNotNullParameter(ULong.INSTANCE, "");
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ ULongArray b() {
        return ULongArray.m8256boximpl(ULongArray.m8257constructorimpl(0));
    }
}
