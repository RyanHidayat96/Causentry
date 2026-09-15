package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class onStateAttached {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3("\"dt.send_timestamp\":");

    public static String b(String str, long j) {
        StringBuilder sb = new StringBuilder();
        String str2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        sb.append(str2);
        sb.append("%%SEND_NOW%%");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(j);
        return str.replaceAll(string, sb2.toString());
    }
}
