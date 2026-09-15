package com.datadog.android.core.internal.persistence.file.batch;

import android.os.SystemClock;
import defpackage.applyPixelShiftForYUV;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class BatchFileOrchestrator$getMetadataFile$1 extends Lambda implements Function0<String> {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final /* synthetic */ File $file;
    final /* synthetic */ applyPixelShiftForYUV this$0;

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        String str = String.format(Locale.US, "The file provided (%s) doesn't belong to the current folder (%s)", Arrays.copyOf(new Object[]{this.$file.getPath(), applyPixelShiftForYUV.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.this$0).getPath()}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchFileOrchestrator$getMetadataFile$1(File file, applyPixelShiftForYUV applypixelshiftforyuv) {
        super(0);
        this.$file = file;
        this.this$0 = applypixelshiftforyuv;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 5592104;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iUptimeMillis;
        return iUptimeMillis;
    }
}
