package defpackage;

import com.datadog.android.api.InternalLogger;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0006*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"LMetadataImageReaderExternalSyntheticLambda1;", "", "Lcom/datadog/android/api/InternalLogger;", "p0", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/io/InputStream;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/io/InputStream;)Ljava/lang/String;", "b", "Lcom/datadog/android/api/InternalLogger;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class MetadataImageReaderExternalSyntheticLambda1 {
    public static final Regex TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Regex("^\"(.+)\".+$");
    public final InternalLogger b;

    public MetadataImageReaderExternalSyntheticLambda1(InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.b = internalLogger;
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
        if (Intrinsics.areEqual(p0, "TimedWaiting")) {
            p0 = "Timed_Waiting";
        }
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String lowerCase = p0.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(InputStream inputStream) {
        try {
            InputStream inputStream2 = inputStream;
            try {
                String text = TextStreamsKt.readText(new InputStreamReader(inputStream2, Charsets.UTF_8));
                CloseableKt.closeFinally(inputStream2, null);
                return text;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(inputStream2, th);
                    throw th2;
                }
            }
        } catch (IOException e2) {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.anr.AndroidTraceParser$safeReadText$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Failed to read crash trace stream.";
                }
            }, e2, false, null);
            return "";
        }
    }
}
