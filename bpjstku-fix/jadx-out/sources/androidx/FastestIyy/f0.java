package androidx.FastestIyy;

import com.zimperium.api.v5.ZDefendPolicyType;
import defpackage.withAudioEnabled;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 implements withAudioEnabled {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZDefendPolicyType f280a;
    public final Date b;
    public final String c;

    public f0(ZDefendPolicyType zDefendPolicyType, Date date, String str) {
        this.f280a = zDefendPolicyType;
        this.b = date;
        this.c = str;
    }

    public final Date getDownloadDate() {
        return this.b;
    }

    public final String getPolicyHash() {
        return this.c;
    }

    public final String getPolicyName() {
        int i = e0.f279a[this.f280a.ordinal()];
        if (i == 1) {
            return "App Settings Policy";
        }
        if (i == 2) {
            return "Phishing Policy";
        }
        if (i == 3) {
            return "Privacy Policy";
        }
        if (i != 4) {
            return i != 5 ? "Unknown Policy" : "Knox Policy";
        }
        return "Threat Policy";
    }

    @Override // defpackage.withAudioEnabled
    public final ZDefendPolicyType getPolicyType() {
        return this.f280a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getPolicyName());
        sb.append(" ");
        sb.append(this.c);
        sb.append(" Download Date: ");
        sb.append(this.b);
        return sb.toString();
    }
}
