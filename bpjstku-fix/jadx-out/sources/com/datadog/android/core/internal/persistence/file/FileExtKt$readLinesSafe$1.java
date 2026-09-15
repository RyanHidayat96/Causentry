package com.datadog.android.core.internal.persistence.file;

import android.os.Process;
import java.io.File;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/File;", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/io/File;)Ljava/util/List;"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class FileExtKt$readLinesSafe$1 extends Lambda implements Function1<File, List<? extends String>> {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final /* synthetic */ Charset $charset;

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final List<String> invoke(File file) {
        Intrinsics.checkNotNullParameter(file, "");
        return FilesKt.readLines(file, this.$charset);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileExtKt$readLinesSafe$1(Charset charset) {
        super(1);
        this.$charset = charset;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 6445754;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
