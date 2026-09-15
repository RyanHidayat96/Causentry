package defpackage;

import java.lang.Enum;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes4.dex */
public final class getInitializationFuture<T extends Enum<T>> implements videoProfileHdrFormatsToDynamicRangeEncoding<T> {
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final T[] b;

    @Override // defpackage.isBitDepthMatched
    public final /* synthetic */ Object deserialize(stopListeningToRotationEvents stoplisteningtorotationevents) {
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        int iDecodeEnum = stoplisteningtorotationevents.decodeEnum(getDescriptor());
        if (iDecodeEnum >= 0) {
            T[] tArr = this.b;
            if (iDecodeEnum < tArr.length) {
                return tArr[iDecodeEnum];
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(iDecodeEnum);
        sb.append(" is not among valid ");
        sb.append(getDescriptor().getINotificationSideChannel());
        sb.append(" enum values, values size is ");
        sb.append(this.b.length);
        throw new SerializationException(sb.toString());
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final /* synthetic */ void serialize(startListeningToRotationEvents startlisteningtorotationevents, Object obj) {
        Enum r5 = (Enum) obj;
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        Intrinsics.checkNotNullParameter(r5, "");
        int iIndexOf = ArraysKt.indexOf(this.b, r5);
        if (iIndexOf == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(r5);
            sb.append(" is not a valid enum ");
            sb.append(getDescriptor().getINotificationSideChannel());
            sb.append(", must be one of ");
            String string = Arrays.toString(this.b);
            Intrinsics.checkNotNullExpressionValue(string, "");
            sb.append(string);
            throw new SerializationException(sb.toString());
        }
        startlisteningtorotationevents.encodeEnum(getDescriptor(), iIndexOf);
    }

    public getInitializationFuture(final String str, T[] tArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        this.b = tArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: getVideoCaptureMirrorMode
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getInitializationFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, str);
            }
        });
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return (createImageAnalysis) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("kotlinx.serialization.internal.EnumSerializer<");
        sb.append(getDescriptor().getINotificationSideChannel());
        sb.append(Typography.greater);
        return sb.toString();
    }

    public static /* synthetic */ createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault3(getInitializationFuture getinitializationfuture, String str) {
        createImageAnalysis createimageanalysis = getinitializationfuture.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        getPreviewResolutionSelector getpreviewresolutionselector = new getPreviewResolutionSelector(str, getinitializationfuture.b.length);
        for (T t : getinitializationfuture.b) {
            getpreviewresolutionselector.TuitionPaymentFragmentspecialinlinedviewModeldefault2(t.name(), false);
        }
        return getpreviewresolutionselector;
    }
}
