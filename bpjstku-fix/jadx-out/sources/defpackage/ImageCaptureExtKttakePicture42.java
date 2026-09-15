package defpackage;

import com.datadog.android.api.InternalLogger;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"LImageCaptureExtKttakePicture42;", "LImageCaptureExtKt;", "Ljava/io/File;", "p0", "LgetSavedUri;", "p1", "Lcom/datadog/android/api/InternalLogger;", "p2", "<init>", "(Ljava/io/File;LgetSavedUri;Lcom/datadog/android/api/InternalLogger;)V", "", "run", "()V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LgetSavedUri;", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "Ljava/io/File;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ImageCaptureExtKttakePicture42 implements ImageCaptureExtKt {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final getSavedUri TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final File TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TimeUnit.MILLISECONDS.toNanos(500);

    public ImageCaptureExtKttakePicture42(File file, getSavedUri getsaveduri, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(getsaveduri, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = file;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getsaveduri;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = internalLogger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            resizeNearestNeighbor.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new Function0<Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.advanced.WipeDataMigrationOperation$run$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                }

                {
                    super(0);
                }
            });
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.advanced.WipeDataMigrationOperation$run$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Can't wipe data from a null directory";
                }
            }, null, false, null);
        }
    }
}
