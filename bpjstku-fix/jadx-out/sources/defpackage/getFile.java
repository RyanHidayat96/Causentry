package defpackage;

import com.datadog.android.api.InternalLogger;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"LgetFile;", "", "Lcom/datadog/android/api/InternalLogger;", "p0", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "Ljava/io/File;", "", "p1", "b", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class getFile {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getFile(InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = internalLogger;
    }

    public static File b(File p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        String str = String.format(Locale.US, "datastore_v%s", Arrays.copyOf(new Object[]{0}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(p1);
        return new File(p0, sb.toString());
    }
}
