package defpackage;

import com.datadog.android.api.InternalLogger;
import java.util.Arrays;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes6.dex */
public final class ImmutableImageInfo {
    public static final <T> byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageReaderFormatRecommender<T> imageReaderFormatRecommender, final T t, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(imageReaderFormatRecommender, "");
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = imageReaderFormatRecommender.TuitionPaymentFragmentspecialinlinedviewModeldefault1(t);
            if (strTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                return null;
            }
            byte[] bytes = strTuitionPaymentFragmentspecialinlinedviewModeldefault1.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            return bytes;
        } catch (Throwable th) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.persistence.SerializerKt$serializeToByteArray$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "Error serializing %s model", Arrays.copyOf(new Object[]{t.getClass().getSimpleName()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, th, false, null);
            return null;
        }
    }
}
