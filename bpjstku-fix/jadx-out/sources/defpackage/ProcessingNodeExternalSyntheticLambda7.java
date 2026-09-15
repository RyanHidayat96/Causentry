package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ProcessingNodeExternalSyntheticLambda7 {
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public static ProcessingNodeExternalSyntheticLambda7 TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        return new ProcessingNodeExternalSyntheticLambda7(str);
    }

    public ProcessingNodeExternalSyntheticLambda7(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProcessingNodeExternalSyntheticLambda7) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(((ProcessingNodeExternalSyntheticLambda7) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return false;
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Encoding{name=\"");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append("\"}");
        return sb.toString();
    }
}
