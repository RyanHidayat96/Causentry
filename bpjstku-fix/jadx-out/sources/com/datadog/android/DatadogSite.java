package com.datadog.android;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/datadog/android/DatadogSite;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "p1", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "intakeEndpoint", "Ljava/lang/String;", "getIntakeEndpoint", "()Ljava/lang/String;", "intakeHostName", "siteName", "getSiteName$dd_sdk_android_core_release", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asInterface", "a", "EU1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
public enum DatadogSite {
    US1("us1", "browser-intake-datadoghq.com"),
    US3("us3"),
    US5("us5"),
    EU1("eu1", "browser-intake-datadoghq.eu"),
    AP1("ap1"),
    US1_FED("us1_fed", "browser-intake-ddog-gov.com"),
    STAGING("staging", "browser-intake-datad0g.com");

    private final String intakeEndpoint;
    private final String intakeHostName;
    private final String siteName;

    DatadogSite(String str, String str2) {
        this.siteName = str;
        this.intakeHostName = str2;
        this.intakeEndpoint = "https://".concat(String.valueOf(str2));
    }

    /* JADX INFO: renamed from: getSiteName$dd_sdk_android_core_release, reason: from getter */
    public final String getSiteName() {
        return this.siteName;
    }

    DatadogSite(String str) {
        StringBuilder sb = new StringBuilder("browser-intake-");
        sb.append(str);
        sb.append("-datadoghq.com");
        this(str, sb.toString());
    }

    public final String getIntakeEndpoint() {
        return this.intakeEndpoint;
    }
}
