package com.datadog.android.rum.internal;

import defpackage.rotateRect;
import defpackage.sizeToVertices;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "TuitionPaymentFragmentbindingInflater1", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class RumFeature$handleMapLikeEvent$2 extends Lambda implements Function0<String> {
    final /* synthetic */ Map<?, ?> $event;

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        String str = String.format(Locale.US, "RUM feature received an event with unknown value of \"type\" property=%s.", Arrays.copyOf(new Object[]{this.$event.get("type")}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RumFeature$handleMapLikeEvent$2(Map<?, ?> map) {
        super(0);
        this.$event = map;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        sizeToVertices.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] = rotateRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0];
    }
}
