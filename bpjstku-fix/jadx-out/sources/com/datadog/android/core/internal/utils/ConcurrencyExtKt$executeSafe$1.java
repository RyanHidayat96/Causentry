package com.datadog.android.core.internal.utils;

import defpackage.preRotate;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class ConcurrencyExtKt$executeSafe$1 extends Lambda implements Function0<String> {
    final /* synthetic */ String $operationName;

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        String str = String.format(Locale.US, "Unable to schedule %s task on the executor", Arrays.copyOf(new Object[]{this.$operationName}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcurrencyExtKt$executeSafe$1(String str) {
        super(0);
        this.$operationName = str;
    }

    public static /* synthetic */ void b() {
        preRotate.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = Class.forName("setLinearZoom").getDeclaredField("TuitionPaymentFragmentspecialinlinedviewModeldefault3");
    }
}
