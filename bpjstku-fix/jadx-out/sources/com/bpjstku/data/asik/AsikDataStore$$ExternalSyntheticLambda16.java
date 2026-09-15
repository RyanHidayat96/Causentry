package com.bpjstku.data.asik;

import android.os.Process;
import com.bpjstku.data.asik.model.response.AsikListKpjMobileResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AsikDataStore$$ExternalSyntheticLambda16 implements Function1 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public static int b;

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = b;
        int i2 = i % 5758411;
        b = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = startUptimeMillis;
        return startUptimeMillis;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return AsikDataStore.getListKpjMobile$lambda$41((AsikListKpjMobileResponse) obj);
    }
}
