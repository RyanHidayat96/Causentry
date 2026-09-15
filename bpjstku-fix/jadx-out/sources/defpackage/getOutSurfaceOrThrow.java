package defpackage;

import com.koushikdutta.async.http.Multimap;
import com.koushikdutta.async.util.TaggedList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class getOutSurfaceOrThrow {
    public final Multimap TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Multimap() { // from class: com.koushikdutta.async.http.Headers$1
        @Override // com.koushikdutta.async.http.Multimap
        protected final List<String> b() {
            return new TaggedList();
        }
    };

    public getOutSurfaceOrThrow() {
    }

    public getOutSurfaceOrThrow(Map<String, List<String>> map) {
        for (String str : map.keySet()) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, map.get(str));
        }
    }

    public final getOutSurfaceOrThrow b(String str, String str2) {
        if (str2 != null && (str2.contains("\n") || str2.contains("\r"))) {
            throw new IllegalArgumentException("value must not contain a new line or line feed");
        }
        String lowerCase = str.toLowerCase(Locale.US);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(lowerCase, str2);
        TaggedList taggedList = (TaggedList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(lowerCase);
        synchronized (taggedList) {
            if (taggedList.tag == null) {
                taggedList.tag = str;
            }
        }
        return this;
    }

    public final getOutSurfaceOrThrow TuitionPaymentFragmentbindingInflater1(String str, String str2) {
        String lowerCase = str.toLowerCase(Locale.US);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lowerCase).add(str2);
        TaggedList taggedList = (TaggedList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(lowerCase);
        synchronized (taggedList) {
            if (taggedList.tag == null) {
                taggedList.tag = str;
            }
        }
        return this;
    }

    public final getOutSurfaceOrThrow TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        if (str != null) {
            String[] strArrSplit = str.trim().split(":", 2);
            if (strArrSplit.length == 2) {
                TuitionPaymentFragmentbindingInflater1(strArrSplit[0].trim(), strArrSplit[1].trim());
                return this;
            }
            TuitionPaymentFragmentbindingInflater1(strArrSplit[0].trim(), "");
        }
        return this;
    }

    public final getOutSurfaceOrThrow TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            TuitionPaymentFragmentbindingInflater1(str, it.next());
        }
        return this;
    }

    private StringBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        StringBuilder sb = new StringBuilder(256);
        Iterator<String> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.keySet().iterator();
        while (it.hasNext()) {
            TaggedList<String> taggedList = (TaggedList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(it.next());
            for (String str : taggedList) {
                sb.append((String) taggedList.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                sb.append(": ");
                sb.append(str);
                sb.append("\r\n");
            }
        }
        sb.append("\r\n");
        return sb;
    }

    public String toString() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3().toString();
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        StringBuilder sbTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\r\n");
        return sbTuitionPaymentFragmentspecialinlinedviewModeldefault3.insert(0, sb.toString()).toString();
    }
}
