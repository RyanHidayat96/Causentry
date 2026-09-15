package com.datadog.android.core.internal.persistence.file;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0002\u001a \u0012\b\u0012\u0006*\u00020\u00000\u0000\u0018\u0001*\u0010\u0012\n\b\u0001\u0012\u0006*\u00020\u00000\u0000\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/io/File;", "", "TuitionPaymentFragmentbindingInflater1", "(Ljava/io/File;)[Ljava/io/File;"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class FileExtKt$listFilesSafe$1 extends Lambda implements Function1<File, File[]> {
    public static final FileExtKt$listFilesSafe$1 TuitionPaymentFragmentbindingInflater1 = new FileExtKt$listFilesSafe$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final File[] invoke(File file) {
        Intrinsics.checkNotNullParameter(file, "");
        return file.listFiles();
    }

    FileExtKt$listFilesSafe$1() {
        super(1);
    }
}
