package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes6.dex */
public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f820id;

    DeliveryMechanism(int i) {
        this.f820id = i;
    }

    public final int getId() {
        return this.f820id;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f820id);
    }

    public static DeliveryMechanism determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }
}
