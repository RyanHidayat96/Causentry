package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileExtKt$readLinesSafe$1;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\t\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"LsetRetryDelayInMillis;", "LwrapImageProxy;", "Ljava/io/File;", "p0", "Lcom/datadog/android/api/InternalLogger;", "p1", "<init>", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)V", "", "TuitionPaymentFragmentbindingInflater1", "()Ljava/lang/Double;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/api/InternalLogger;", "b", "Ljava/io/File;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class setRetryDelayInMillis implements wrapImageProxy {
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final File TuitionPaymentFragmentbindingInflater1;
    private static final File TuitionPaymentFragmentbindingInflater1 = new File("/proc/self/status");
    private static final Regex TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Regex("VmRSS:\\s+(\\d+) kB");

    private setRetryDelayInMillis(File file, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentbindingInflater1 = file;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = internalLogger;
    }

    public /* synthetic */ setRetryDelayInMillis(File file, InternalLogger internalLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TuitionPaymentFragmentbindingInflater1 : file, internalLogger);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    @Override // defpackage.wrapImageProxy
    public final Double TuitionPaymentFragmentbindingInflater1() {
        Double doubleOrNull;
        List<String> groupValues;
        if (!ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) || !ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            return null;
        }
        File file = this.TuitionPaymentFragmentbindingInflater1;
        InternalLogger internalLogger = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        List list = (ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, internalLogger) && ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault1(file, internalLogger)) ? (List) ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, null, internalLogger, new FileExtKt$readLinesSafe$1(charset)) : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MatchResult matchResultMatchEntire = TuitionPaymentFragmentspecialinlinedviewModeldefault3.matchEntire((String) it.next());
                String str = (matchResultMatchEntire == null || (groupValues = matchResultMatchEntire.getGroupValues()) == null) ? null : (String) CollectionsKt.getOrNull(groupValues, 1);
                if (str != null) {
                    arrayList.add(str);
                }
            }
            String str2 = (String) CollectionsKt.firstOrNull((List) arrayList);
            if (str2 != null) {
                doubleOrNull = StringsKt.toDoubleOrNull(str2);
            } else {
                doubleOrNull = null;
            }
        } else {
            doubleOrNull = null;
        }
        if (doubleOrNull == null) {
            return null;
        }
        return Double.valueOf(doubleOrNull.doubleValue() * 1000.0d);
    }
}
