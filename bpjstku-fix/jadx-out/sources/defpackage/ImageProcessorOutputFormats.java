package defpackage;

import com.datadog.android.api.InternalLogger;
import com.google.gson.JsonParseException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"LImageProcessorOutputFormats;", "LisReversedVertical;", "", "LlambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer;", "Lcom/datadog/android/api/InternalLogger;", "p0", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)LlambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ImageProcessorOutputFormats implements isReversedVertical<String, lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ImageProcessorOutputFormats(InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = internalLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.isReversedVertical
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer TuitionPaymentFragmentspecialinlinedviewModeldefault1(final String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            return lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer.INSTANCE.b(p0);
        } catch (JsonParseException e2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.user.UserInfoDeserializer$deserialize$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "Error while trying to deserialize the serialized UserInfo: %s", Arrays.copyOf(new Object[]{p0}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e2, false, null);
            return null;
        }
    }
}
