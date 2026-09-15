package defpackage;

import com.datadog.android.api.InternalLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n"}, d2 = {"LgetSavedUri;", "", "Lcom/datadog/android/api/InternalLogger;", "p0", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "Ljava/io/File;", "", "TuitionPaymentFragmentbindingInflater1", "(Ljava/io/File;)Z", "Lcom/datadog/android/api/InternalLogger;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class getSavedUri {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final InternalLogger b;

    public getSavedUri(InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.b = internalLogger;
    }

    public final boolean TuitionPaymentFragmentbindingInflater1(final File p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            return FilesKt.deleteRecursively(p0);
        } catch (FileNotFoundException e2) {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$delete$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{p0.getPath()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e2, false, null);
            return false;
        } catch (SecurityException e3) {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$delete$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{p0.getPath()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e3, false, null);
            return false;
        }
    }
}
