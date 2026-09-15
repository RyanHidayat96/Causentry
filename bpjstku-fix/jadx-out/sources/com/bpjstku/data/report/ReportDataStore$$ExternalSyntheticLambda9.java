package com.bpjstku.data.report;

import defpackage.readableMs;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ReportDataStore$$ExternalSyntheticLambda9 implements readableMs {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int b;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ReportDataStore$$ExternalSyntheticLambda9(Function1 function1) {
        this.f$0 = function1;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 8720378;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        b = iFreeMemory;
        return iFreeMemory;
    }

    @Override // defpackage.readableMs
    public final Object apply(Object obj) {
        return ReportDataStore.postPreloadData$lambda$9(this.f$0, obj);
    }
}
