package com.datadog.android;

import defpackage.downsample;
import defpackage.getNormalizedToBuffer;
import defpackage.getRectToRect;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "TuitionPaymentFragmentbindingInflater1", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class Datadog$getInstance$1$1 extends Lambda implements Function0<String> {
    final /* synthetic */ String $sdkInstanceName;
    final /* synthetic */ Throwable $stackCapture;

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        Locale locale = Locale.US;
        String str = this.$sdkInstanceName;
        Throwable th = this.$stackCapture;
        Intrinsics.checkNotNullExpressionValue(th, "");
        String str2 = String.format(locale, "SDK instance with name %s is not found, returning no-op implementation. Please make sure to call Datadog.initialize([instanceName]) before getting the instance. SDK instance was requested from:\n%s", Arrays.copyOf(new Object[]{str, CollectionsKt.joinToString$default(CollectionsKt.drop(StringsKt.lines(downsample.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th)), 1), "\n", null, null, 0, null, null, 62, null)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Datadog$getInstance$1$1(String str, Throwable th) {
        super(0);
        this.$sdkInstanceName = str;
        this.$stackCapture = th;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        getRectToRect.TuitionPaymentFragmentbindingInflater1[0] = getNormalizedToBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0];
    }
}
