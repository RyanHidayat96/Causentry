package com.datadog.android.core.internal.persistence.file;

import defpackage.UseCaseConfig;
import defpackage.getDefaultCaptureConfig;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/io/File;", "", "b", "(Ljava/io/File;)V"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class FileExtKt$writeTextSafe$1 extends Lambda implements Function1<File, Unit> {
    final /* synthetic */ Charset $charset;
    final /* synthetic */ String $text;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(File file) {
        b(file);
        return Unit.INSTANCE;
    }

    public final void b(File file) {
        Intrinsics.checkNotNullParameter(file, "");
        FilesKt.writeText(file, this.$text, this.$charset);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileExtKt$writeTextSafe$1(String str, Charset charset) {
        super(1);
        this.$text = str;
        this.$charset = charset;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        UseCaseConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] = getDefaultCaptureConfig.b[0];
    }
}
