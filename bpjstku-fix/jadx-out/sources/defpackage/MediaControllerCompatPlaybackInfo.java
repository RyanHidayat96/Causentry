package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaControllerCompatPlaybackInfo {
    public final List<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public getAudioStream TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public MediaControllerCompatPlaybackInfo(String... strArr) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Arrays.asList(strArr);
    }

    public MediaControllerCompatPlaybackInfo(MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList(mediaControllerCompatPlaybackInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mediaControllerCompatPlaybackInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[RETURN] */
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, int i) {
        if (i >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size()) {
            return false;
        }
        boolean z = i == this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() - 1;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i);
        if (!str2.equals("**")) {
            boolean z2 = str2.equals(str) || str2.equals("*");
            if (z) {
                if (z2) {
                    return true;
                }
            } else if (i == this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() - 2) {
                List<String> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (list.get(list.size() - 1).equals("**")) {
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (z || !this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i + 1).equals(str)) {
            if (z) {
                return true;
            }
            int i2 = i + 1;
            if (i2 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() - 1) {
                return false;
            }
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i2).equals(str);
        }
        if (i != this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() - 2) {
            if (i == this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() - 3) {
                List<String> list2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (!list2.get(list2.size() - 1).equals("**")) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean TuitionPaymentFragmentbindingInflater1(String str, int i) {
        return "__container".equals(str) || i < this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() - 1 || this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i).equals("**");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(",resolved=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null);
        sb.append('}');
        return sb.toString();
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, int i) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i).equals("**")) {
            return (i != this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() - 1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size()) {
            return false;
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i).equals(str) || this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i).equals("**") || this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i).equals("*");
    }
}
