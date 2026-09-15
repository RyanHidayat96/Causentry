package com.google.firebase.crashlytics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0010¢\u0006\u0004\b\u0004\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0011J\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0012¢\u0006\u0004\b\u000e\u0010\u0013J\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0014¢\u0006\u0004\b\u000e\u0010\u0015J\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0016¢\u0006\u0004\b\u000e\u0010\u0017J\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/google/firebase/crashlytics/KeyValueBuilder;", "", "Lcom/google/firebase/crashlytics/CustomKeysAndValues$Builder;", "p0", "<init>", "(Lcom/google/firebase/crashlytics/CustomKeysAndValues$Builder;)V", "()V", "Lcom/google/firebase/crashlytics/CustomKeysAndValues;", "build$com_google_firebase_firebase_crashlytics", "()Lcom/google/firebase/crashlytics/CustomKeysAndValues;", "", "", "p1", "", "key", "(Ljava/lang/String;Z)V", "", "(Ljava/lang/String;D)V", "", "(Ljava/lang/String;F)V", "", "(Ljava/lang/String;I)V", "", "(Ljava/lang/String;J)V", "(Ljava/lang/String;Ljava/lang/String;)V", "builder", "Lcom/google/firebase/crashlytics/CustomKeysAndValues$Builder;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeyValueBuilder {
    private final CustomKeysAndValues.Builder builder;

    private KeyValueBuilder(CustomKeysAndValues.Builder builder) {
        this.builder = builder;
    }

    public KeyValueBuilder() {
        this(new CustomKeysAndValues.Builder());
    }

    public final CustomKeysAndValues build$com_google_firebase_firebase_crashlytics() {
        CustomKeysAndValues customKeysAndValuesBuild = this.builder.build();
        Intrinsics.checkNotNullExpressionValue(customKeysAndValuesBuild, "");
        return customKeysAndValuesBuild;
    }

    public final void key(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.builder.putBoolean(p0, p1);
    }

    public final void key(String p0, double p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.builder.putDouble(p0, p1);
    }

    public final void key(String p0, float p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.builder.putFloat(p0, p1);
    }

    public final void key(String p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.builder.putInt(p0, p1);
    }

    public final void key(String p0, long p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.builder.putLong(p0, p1);
    }

    public final void key(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        this.builder.putString(p0, p1);
    }
}
