package defpackage;

import com.datadog.android.api.InternalLogger;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class getProcessingLatencyMillis implements ImageCaptureOutputFileOptionsBuilder {
    private final File TuitionPaymentFragmentbindingInflater1;
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.ImageCaptureOutputFileOptionsBuilder
    public final File TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return null;
    }

    public getProcessingLatencyMillis(File file, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentbindingInflater1 = file;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = internalLogger;
    }

    @Override // defpackage.ImageCaptureOutputFileOptionsBuilder
    public final File TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z) {
        File parentFile = this.TuitionPaymentFragmentbindingInflater1.getParentFile();
        if (parentFile != null) {
            ImageCaptureOutputFileResults.a(parentFile, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.ImageCaptureOutputFileOptionsBuilder
    public final File b(Set<? extends File> set) {
        Intrinsics.checkNotNullParameter(set, "");
        File parentFile = this.TuitionPaymentFragmentbindingInflater1.getParentFile();
        if (parentFile != null) {
            ImageCaptureOutputFileResults.a(parentFile, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        if (set.contains(this.TuitionPaymentFragmentbindingInflater1)) {
            return null;
        }
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.ImageCaptureOutputFileOptionsBuilder
    public final List<File> b() {
        File parentFile = this.TuitionPaymentFragmentbindingInflater1.getParentFile();
        if (parentFile != null) {
            ImageCaptureOutputFileResults.a(parentFile, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return CollectionsKt.listOf(this.TuitionPaymentFragmentbindingInflater1);
    }

    @Override // defpackage.ImageCaptureOutputFileOptionsBuilder
    public final File b(File file) {
        Intrinsics.checkNotNullParameter(file, "");
        return null;
    }
}
