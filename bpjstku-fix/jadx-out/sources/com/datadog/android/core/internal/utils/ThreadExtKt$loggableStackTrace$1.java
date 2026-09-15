package com.datadog.android.core.internal.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/StackTraceElement;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/StackTraceElement;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class ThreadExtKt$loggableStackTrace$1 extends Lambda implements Function1<StackTraceElement, CharSequence> {
    public static final ThreadExtKt$loggableStackTrace$1 TuitionPaymentFragmentbindingInflater1 = new ThreadExtKt$loggableStackTrace$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final CharSequence invoke(StackTraceElement stackTraceElement) {
        Intrinsics.checkNotNullParameter(stackTraceElement, "");
        return "at ".concat(String.valueOf(stackTraceElement));
    }

    ThreadExtKt$loggableStackTrace$1() {
        super(1);
    }
}
