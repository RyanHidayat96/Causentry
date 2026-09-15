package com.datadog.android.core.internal.time;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/datadog/android/core/internal/time/DatadogNtpEndpoint;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "host", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public enum DatadogNtpEndpoint {
    NTP_0("0.datadog.pool.ntp.org"),
    NTP_1("1.datadog.pool.ntp.org"),
    NTP_2("2.datadog.pool.ntp.org"),
    NTP_3("3.datadog.pool.ntp.org");

    private final String host;

    DatadogNtpEndpoint(String str) {
        this.host = str;
    }

    public final String getHost() {
        return this.host;
    }
}
