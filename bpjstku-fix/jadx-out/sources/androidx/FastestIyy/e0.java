package androidx.FastestIyy;

import com.zimperium.api.v5.ZDefendPolicyType;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f279a;

    static {
        int[] iArr = new int[ZDefendPolicyType.values().length];
        f279a = iArr;
        try {
            iArr[ZDefendPolicyType.APP_SETTINGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f279a[ZDefendPolicyType.PHISHING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f279a[ZDefendPolicyType.PRIVACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f279a[ZDefendPolicyType.THREAT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f279a[ZDefendPolicyType.KNOX.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
