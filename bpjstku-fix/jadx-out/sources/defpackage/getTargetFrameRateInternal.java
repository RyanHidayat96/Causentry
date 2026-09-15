package defpackage;

import com.dynatrace.android.agent.crash.PlatformType;

/* JADX INFO: loaded from: classes4.dex */
public final class getTargetFrameRateInternal {
    public final PlatformType TuitionPaymentFragmentbindingInflater1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getTargetFrameRateInternal(String str, String str2, String str3, PlatformType platformType) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str3;
        this.TuitionPaymentFragmentbindingInflater1 = platformType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            getTargetFrameRateInternal gettargetframerateinternal = (getTargetFrameRateInternal) obj;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str == null ? gettargetframerateinternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null : !str.equals(gettargetframerateinternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return false;
            }
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str2 == null ? gettargetframerateinternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null : !str2.equals(gettargetframerateinternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                return false;
            }
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str3 == null ? gettargetframerateinternal.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null : !str3.equals(gettargetframerateinternal.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return false;
            }
            if (this.TuitionPaymentFragmentbindingInflater1 == gettargetframerateinternal.TuitionPaymentFragmentbindingInflater1) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        PlatformType platformType = this.TuitionPaymentFragmentbindingInflater1;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (platformType != null ? platformType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StacktraceData{name='");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append("', reason='");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("', stacktrace='");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append("', type=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append('}');
        return sb.toString();
    }
}
