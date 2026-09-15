package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileExtKt$existsSafe$1;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageCaptureOutputFileResults {
    public static final <T> T TuitionPaymentFragmentspecialinlinedviewModeldefault2(final File file, T t, InternalLogger internalLogger, Function1<? super File, ? extends T> function1) {
        try {
            return function1.invoke(file);
        } catch (SecurityException e2) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$safeCall$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Security exception was thrown for file ".concat(String.valueOf(file.getPath()));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e2, false, null);
            return t;
        } catch (Exception e3) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$safeCall$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Unexpected exception was thrown for file ".concat(String.valueOf(file.getPath()));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e3, false, null);
            return t;
        }
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(File file, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, Boolean.FALSE, internalLogger, new Function1<File, Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$canWriteSafe$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(File file2) {
                Intrinsics.checkNotNullParameter(file2, "");
                return Boolean.valueOf(file2.canWrite());
            }
        })).booleanValue();
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(File file, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, Boolean.FALSE, internalLogger, new Function1<File, Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$canReadSafe$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(File file2) {
                Intrinsics.checkNotNullParameter(file2, "");
                return Boolean.valueOf(file2.canRead());
            }
        })).booleanValue();
    }

    public static final boolean TuitionPaymentFragmentbindingInflater1(File file, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, Boolean.FALSE, internalLogger, new Function1<File, Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$deleteSafe$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(File file2) {
                Intrinsics.checkNotNullParameter(file2, "");
                return Boolean.valueOf(file2.delete());
            }
        })).booleanValue();
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(File file, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, Boolean.FALSE, internalLogger, FileExtKt$existsSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)).booleanValue();
    }

    public static final boolean b(File file, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, Boolean.FALSE, internalLogger, new Function1<File, Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$isDirectorySafe$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(File file2) {
                Intrinsics.checkNotNullParameter(file2, "");
                return Boolean.valueOf(file2.isDirectory());
            }
        })).booleanValue();
    }

    public static final long d(File file, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        return ((Number) TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, 0L, internalLogger, new Function1<File, Long>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$lengthSafe$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final Long invoke(File file2) {
                Intrinsics.checkNotNullParameter(file2, "");
                return Long.valueOf(file2.length());
            }
        })).longValue();
    }

    public static final boolean a(File file, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, Boolean.FALSE, internalLogger, new Function1<File, Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$mkdirsSafe$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(File file2) {
                Intrinsics.checkNotNullParameter(file2, "");
                return Boolean.valueOf(file2.mkdirs());
            }
        })).booleanValue();
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(File file, final Charset charset, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, internalLogger) && TuitionPaymentFragmentspecialinlinedviewModeldefault1(file, internalLogger)) {
            return (String) TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, null, internalLogger, new Function1<File, String>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$readTextSafe$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                public final String invoke(File file2) {
                    Intrinsics.checkNotNullParameter(file2, "");
                    return FilesKt.readText(file2, charset);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
        return null;
    }
}
