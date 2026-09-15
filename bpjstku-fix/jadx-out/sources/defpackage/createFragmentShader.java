package defpackage;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
final class createFragmentShader {
    private static final Comparator<String> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Comparator<String>() { // from class: createFragmentShader.5
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (str3 == str4) {
                return 0;
            }
            if (str3 == null) {
                return -1;
            }
            if (str4 == null) {
                return 1;
            }
            return String.CASE_INSENSITIVE_ORDER.compare(str3, str4);
        }
    };
    String TuitionPaymentFragmentbindingInflater1;
    String b;
    final List<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList(20);
    private int asBinder = 1;
    int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1;

    public final void b(String str) {
        String strTrim;
        int iIndexOf;
        int iIndexOf2;
        String strTrim2 = str.trim();
        this.b = strTrim2;
        if (strTrim2 == null || !strTrim2.startsWith("HTTP/") || (iIndexOf2 = (iIndexOf = (strTrim = strTrim2.trim()).indexOf(" ")) + 1) == 0) {
            return;
        }
        if (strTrim.charAt(iIndexOf - 1) != '1') {
            this.asBinder = 0;
        }
        int length = iIndexOf + 4;
        if (length > strTrim.length()) {
            length = strTrim.length();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Integer.parseInt(strTrim.substring(iIndexOf2, length));
        int i = length + 1;
        if (i <= strTrim.length()) {
            this.TuitionPaymentFragmentbindingInflater1 = strTrim.substring(i);
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf == -1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1("", str);
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("fieldName == null");
        }
        if (str2 == null) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder("Ignoring HTTP header field '");
            sb.append(str);
            sb.append("' because its value is null");
            printStream.println(sb.toString());
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(str);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(str2.trim());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        for (int i = 0; i < this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size(); i += 2) {
            if (str.equalsIgnoreCase(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i))) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.remove(i);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.remove(i);
            }
        }
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        int i2 = i * 2;
        if (i2 < 0 || i2 >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size()) {
            return null;
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i2);
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        int i2 = (i * 2) + 1;
        if (i2 < 0 || i2 >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size()) {
            return null;
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i2);
    }

    public final Map<String, List<String>> TuitionPaymentFragmentbindingInflater1() {
        TreeMap treeMap = new TreeMap(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        for (int i = 0; i < this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size(); i += 2) {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i);
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i + 1);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(str);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(str2);
            treeMap.put(str, Collections.unmodifiableList(arrayList));
        }
        String str3 = this.b;
        if (str3 != null) {
            treeMap.put(null, Collections.unmodifiableList(Collections.singletonList(str3)));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    public static createFragmentShader TuitionPaymentFragmentspecialinlinedviewModeldefault1(Map<String, List<String>> map) {
        createFragmentShader createfragmentshader = new createFragmentShader();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (key == null) {
                if (!value.isEmpty()) {
                    createfragmentshader.b(value.get(value.size() - 1));
                }
            } else {
                Iterator<String> it = value.iterator();
                while (it.hasNext()) {
                    createfragmentshader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(key, it.next());
                }
            }
        }
        return createfragmentshader;
    }
}
