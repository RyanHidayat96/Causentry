package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileExtKt$listFilesSafe$1;
import defpackage.ImageCaptureOutputFileResults;
import defpackage.getSavedUri;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000e\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012"}, d2 = {"LImageCaptureLatencyEstimate;", "LImageCaptureExtKt;", "Ljava/io/File;", "p0", "p1", "LgetSavedUri;", "p2", "Lcom/datadog/android/api/InternalLogger;", "p3", "<init>", "(Ljava/io/File;Ljava/io/File;LgetSavedUri;Lcom/datadog/android/api/InternalLogger;)V", "", "run", "()V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LgetSavedUri;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "Ljava/io/File;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "Lcom/datadog/android/api/InternalLogger;", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ImageCaptureLatencyEstimate implements ImageCaptureExtKt {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final File TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final File TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final getSavedUri TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TimeUnit.MILLISECONDS.toNanos(500);

    public ImageCaptureLatencyEstimate(File file, File file2, getSavedUri getsaveduri, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(getsaveduri, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = file;
        this.TuitionPaymentFragmentbindingInflater1 = file2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getsaveduri;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = internalLogger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            if (this.TuitionPaymentFragmentbindingInflater1 != null) {
                resizeNearestNeighbor.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new Function0<Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation$run$3
                    /* JADX WARN: Code duplicated, block: B:17:0x00ba  */
                    /* JADX WARN: Code duplicated, block: B:19:0x00cf  */
                    /* JADX WARN: Code duplicated, block: B:22:0x00d5  */
                    /* JADX WARN: Code duplicated, block: B:25:0x0102 A[LOOP:0: B:21:0x00d3->B:25:0x0102, LOOP_END] */
                    /* JADX WARN: Code duplicated, block: B:29:0x005d A[SYNTHETIC] */
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
                        File[] fileArr;
                        int i;
                        final File file;
                        InternalLogger internalLogger;
                        getSavedUri getsaveduri = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        final File file2 = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        final File file3 = this.this$0.TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNullParameter(file2, "");
                        Intrinsics.checkNotNullParameter(file3, "");
                        boolean z = true;
                        if (ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, getsaveduri.b)) {
                            if (!ImageCaptureOutputFileResults.b(file2, getsaveduri.b)) {
                                getsaveduri.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$moveFiles$2
                                    @Override // kotlin.jvm.functions.Function0
                                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                    public final String invoke() {
                                        String str = String.format(Locale.US, "Unable to move files; file is not a directory: %s", Arrays.copyOf(new Object[]{file2.getPath()}, 1));
                                        Intrinsics.checkNotNullExpressionValue(str, "");
                                        return str;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }
                                }, null, false, null);
                            } else if (ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file3, getsaveduri.b)) {
                                if (ImageCaptureOutputFileResults.b(file3, getsaveduri.b)) {
                                    InternalLogger internalLogger2 = getsaveduri.b;
                                    Intrinsics.checkNotNullParameter(file2, "");
                                    Intrinsics.checkNotNullParameter(internalLogger2, "");
                                    fileArr = (File[]) ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, null, internalLogger2, FileExtKt$listFilesSafe$1.TuitionPaymentFragmentbindingInflater1);
                                    if (fileArr == null) {
                                        fileArr = new File[0];
                                    }
                                    for (File file4 : fileArr) {
                                        file = new File(file3, file4.getName());
                                        internalLogger = getsaveduri.b;
                                        Intrinsics.checkNotNullParameter(file4, "");
                                        Intrinsics.checkNotNullParameter(file, "");
                                        Intrinsics.checkNotNullParameter(internalLogger, "");
                                        if (!((Boolean) ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file4, Boolean.FALSE, internalLogger, new Function1<File, Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$renameToSafe$1
                                            @Override // kotlin.jvm.functions.Function1
                                            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(File file5) {
                                                Intrinsics.checkNotNullParameter(file5, "");
                                                return Boolean.valueOf(file5.renameTo(file));
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }
                                        })).booleanValue()) {
                                        }
                                    }
                                } else {
                                    getsaveduri.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$moveFiles$4
                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                                        public final String invoke() {
                                            String str = String.format(Locale.US, "Unable to move files; file is not a directory: %s", Arrays.copyOf(new Object[]{file3.getPath()}, 1));
                                            Intrinsics.checkNotNullExpressionValue(str, "");
                                            return str;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }
                                    }, null, false, null);
                                }
                            } else if (ImageCaptureOutputFileResults.a(file3, getsaveduri.b)) {
                                InternalLogger internalLogger3 = getsaveduri.b;
                                Intrinsics.checkNotNullParameter(file2, "");
                                Intrinsics.checkNotNullParameter(internalLogger3, "");
                                fileArr = (File[]) ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, null, internalLogger3, FileExtKt$listFilesSafe$1.TuitionPaymentFragmentbindingInflater1);
                                if (fileArr == null) {
                                    fileArr = new File[0];
                                }
                                while (i < r4) {
                                    file = new File(file3, file4.getName());
                                    internalLogger = getsaveduri.b;
                                    Intrinsics.checkNotNullParameter(file4, "");
                                    Intrinsics.checkNotNullParameter(file, "");
                                    Intrinsics.checkNotNullParameter(internalLogger, "");
                                    if (!((Boolean) ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file4, Boolean.FALSE, internalLogger, new Function1<File, Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$renameToSafe$1
                                        @Override // kotlin.jvm.functions.Function1
                                        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(File file5) {
                                            Intrinsics.checkNotNullParameter(file5, "");
                                            return Boolean.valueOf(file5.renameTo(file));
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }
                                    })).booleanValue()) {
                                    }
                                }
                            } else {
                                getsaveduri.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$moveFiles$3
                                    @Override // kotlin.jvm.functions.Function0
                                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                    public final String invoke() {
                                        String str = String.format(Locale.US, "Unable to move files; could not create directory: %s", Arrays.copyOf(new Object[]{file2.getPath()}, 1));
                                        Intrinsics.checkNotNullExpressionValue(str, "");
                                        return str;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }
                                }, null, false, null);
                            }
                            z = false;
                            break;
                        } else {
                            getsaveduri.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$moveFiles$1
                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                                public final String invoke() {
                                    String str = String.format(Locale.US, "Unable to move files; source directory does not exist: %s", Arrays.copyOf(new Object[]{file2.getPath()}, 1));
                                    Intrinsics.checkNotNullExpressionValue(str, "");
                                    return str;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }
                            }, null, false, null);
                        }
                        return Boolean.valueOf(z);
                    }

                    {
                        super(0);
                    }
                });
                return;
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation$run$2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Can't move data to a null directory";
                    }
                }, null, false, null);
                return;
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation$run$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Can't move data from a null directory";
            }
        }, null, false, null);
    }
}
