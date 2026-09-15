package okhttp3;

import androidx.autofill.HintConstants;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ImagesContract;
import defpackage.RotationProviderListenerWrapper;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \u0018\u0000 Z2\u00020\u0001:\u0002[ZBc\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u001b\u0010\u0011J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b \u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0007¢\u0006\u0004\b#\u0010\u0011J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b$\u0010\u0015J\u000f\u0010%\u001a\u00020\u0007H\u0007¢\u0006\u0004\b%\u0010\u001dJ\u000f\u0010&\u001a\u00020\u0007H\u0007¢\u0006\u0004\b&\u0010\u001dJ\u0011\u0010'\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b'\u0010\u0011J\u0017\u0010(\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b/\u0010+J\u001f\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0007H\u0007¢\u0006\u0004\b2\u0010\u001dJ\u000f\u00103\u001a\u00020\u0002H\u0007¢\u0006\u0004\b3\u0010\u0011J\u0017\u00104\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0002H\u0007¢\u0006\u0004\b6\u0010\u0011J\u000f\u00107\u001a\u00020\u0002H\u0017¢\u0006\u0004\b7\u0010\u0011J\u000f\u00109\u001a\u000208H\u0007¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0007¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b>\u0010\u0011J\u000f\u0010?\u001a\u000208H\u0007¢\u0006\u0004\b?\u0010:J\u000f\u0010@\u001a\u00020;H\u0007¢\u0006\u0004\b@\u0010=J\u000f\u0010A\u001a\u00020\u0002H\u0007¢\u0006\u0004\bA\u0010\u0011R\u0013\u0010B\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\bB\u0010\u0011R\u0011\u0010C\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bC\u0010\u0011R\u0011\u0010D\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bD\u0010\u0011R\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00020\t8G¢\u0006\u0006\u001a\u0004\bE\u0010\u0015R\u0013\u0010F\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\bF\u0010\u0011R\u0011\u0010G\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bG\u0010\u0011R\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bH\u0010\u0011R\u001a\u0010J\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010I\u001a\u0004\bJ\u0010\u0011R\u001a\u0010K\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bK\u0010MR\u001a\u0010N\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bN\u0010\u0011R \u0010O\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bO\u0010\u0015R\u0011\u0010Q\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bQ\u0010\u001dR\u001a\u0010R\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bR\u0010\u001dR\u0013\u0010T\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\bT\u0010\u0011R\u001e\u0010U\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bU\u0010PR\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00020,8G¢\u0006\u0006\u001a\u0004\bV\u0010.R\u0011\u0010W\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bW\u0010\u001dR\u001a\u0010X\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010I\u001a\u0004\bX\u0010\u0011R\u0014\u0010<\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010IR\u001a\u0010Y\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010I\u001a\u0004\bY\u0010\u0011"}, d2 = {"Lokhttp3/HttpUrl;", "", "", "p0", "p1", "p2", "p3", "", "p4", "", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "-deprecated_encodedFragment", "()Ljava/lang/String;", "-deprecated_encodedPassword", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "()Ljava/util/List;", "-deprecated_encodedQuery", "-deprecated_encodedUsername", "", "equals", "(Ljava/lang/Object;)Z", "-deprecated_fragment", "hashCode", "()I", "-deprecated_host", "Lokhttp3/HttpUrl$Builder;", "newBuilder", "()Lokhttp3/HttpUrl$Builder;", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "-deprecated_password", "-deprecated_pathSegments", "-deprecated_pathSize", "-deprecated_port", "-deprecated_query", "queryParameter", "(Ljava/lang/String;)Ljava/lang/String;", "queryParameterName", "(I)Ljava/lang/String;", "", "-deprecated_queryParameterNames", "()Ljava/util/Set;", "queryParameterValue", "queryParameterValues", "(Ljava/lang/String;)Ljava/util/List;", "-deprecated_querySize", "redact", "resolve", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "-deprecated_scheme", "toString", "Ljava/net/URI;", "uri", "()Ljava/net/URI;", "Ljava/net/URL;", ImagesContract.URL, "()Ljava/net/URL;", "topPrivateDomain", "-deprecated_uri", "-deprecated_url", "-deprecated_username", "encodedFragment", "encodedPassword", "encodedPath", "encodedPathSegments", "encodedQuery", "encodedUsername", "fragment", "Ljava/lang/String;", "host", "isHttps", "Z", "()Z", HintConstants.AUTOFILL_HINT_PASSWORD, "pathSegments", "Ljava/util/List;", "pathSize", "port", "I", SearchIntents.EXTRA_QUERY, "queryNamesAndValues", "queryParameterNames", "querySize", "scheme", HintConstants.AUTOFILL_HINT_USERNAME, "Companion", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public HttpUrl(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = Intrinsics.areEqual(str, "https");
    }

    public final String scheme() {
        return this.scheme;
    }

    public final String username() {
        return this.username;
    }

    public final String password() {
        return this.password;
    }

    public final String host() {
        return this.host;
    }

    public final int port() {
        return this.port;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final String fragment() {
        return this.fragment;
    }

    /* JADX INFO: renamed from: isHttps, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e2) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String strSubstring = this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.url, ':', this.scheme.length() + 3, false, 4, (Object) null);
        String strSubstring = this.url.substring(iIndexOf$default + 1, StringsKt.indexOf$default((CharSequence) this.url, '@', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final String encodedPath() {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        String strSubstring = this.url.substring(iIndexOf$default, Util.delimiterOffset(str, "?#", iIndexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final List<String> encodedPathSegments() {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iIndexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (iIndexOf$default < iDelimiterOffset) {
            int i = iIndexOf$default + 1;
            int iDelimiterOffset2 = Util.delimiterOffset(this.url, '/', i, iDelimiterOffset);
            String strSubstring = this.url.substring(i, iDelimiterOffset2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            arrayList.add(strSubstring);
            iIndexOf$default = iDelimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.url, '?', 0, false, 6, (Object) null) + 1;
        String str = this.url;
        String strSubstring = this.url.substring(iIndexOf$default, Util.delimiterOffset(str, '#', iIndexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        INSTANCE.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String queryParameter(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, list.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(p0, this.queryNamesAndValues.get(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return this.queryNamesAndValues.get(first + 1);
        }
        return null;
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return SetsKt.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                String str = this.queryNamesAndValues.get(first);
                Intrinsics.checkNotNull(str);
                linkedHashSet.add(str);
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "");
        return setUnmodifiableSet;
    }

    public final List<String> queryParameterValues(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.queryNamesAndValues == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (Intrinsics.areEqual(p0, this.queryNamesAndValues.get(first))) {
                    arrayList.add(this.queryNamesAndValues.get(first + 1));
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "");
        return listUnmodifiableList;
    }

    public final String queryParameterName(int p0) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(p0 * 2);
        Intrinsics.checkNotNull(str);
        return str;
    }

    public final String queryParameterValue(int p0) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        return list.get((p0 * 2) + 1);
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String strSubstring = this.url.substring(StringsKt.indexOf$default((CharSequence) this.url, '#', 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final String redact() {
        Builder builderNewBuilder = newBuilder("/...");
        Intrinsics.checkNotNull(builderNewBuilder);
        return builderNewBuilder.username("").password("").build().toString();
    }

    public final HttpUrl resolve(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Builder builderNewBuilder = newBuilder(p0);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != INSTANCE.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final Builder newBuilder(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            return new Builder().parse$okhttp(this, p0);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(Object p0) {
        return (p0 instanceof HttpUrl) && Intrinsics.areEqual(((HttpUrl) p0).url, this.url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(this.host);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to toUrl()", replaceWith = @ReplaceWith(expression = "toUrl()", imports = {}))
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final URL m9584deprecated_url() {
        return url();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to toUri()", replaceWith = @ReplaceWith(expression = "toUri()", imports = {}))
    /* JADX INFO: renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m9583deprecated_uri() {
        return uri();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "scheme", imports = {}))
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedUsername", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m9572deprecated_encodedUsername() {
        return encodedUsername();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = HintConstants.AUTOFILL_HINT_USERNAME, imports = {}))
    /* JADX INFO: renamed from: -deprecated_username, reason: not valid java name and from getter */
    public final String getUsername() {
        return this.username;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPassword", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m9568deprecated_encodedPassword() {
        return encodedPassword();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = HintConstants.AUTOFILL_HINT_PASSWORD, imports = {}))
    /* JADX INFO: renamed from: -deprecated_password, reason: not valid java name and from getter */
    public final String getPassword() {
        return this.password;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "host", imports = {}))
    /* JADX INFO: renamed from: -deprecated_host, reason: not valid java name and from getter */
    public final String getHost() {
        return this.host;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "port", imports = {}))
    /* JADX INFO: renamed from: -deprecated_port, reason: not valid java name and from getter */
    public final int getPort() {
        return this.port;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pathSize", imports = {}))
    /* JADX INFO: renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m9577deprecated_pathSize() {
        return pathSize();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPath", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m9569deprecated_encodedPath() {
        return encodedPath();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPathSegments", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m9570deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pathSegments", imports = {}))
    /* JADX INFO: renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m9576deprecated_pathSegments() {
        return this.pathSegments;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedQuery", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m9571deprecated_encodedQuery() {
        return encodedQuery();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = SearchIntents.EXTRA_QUERY, imports = {}))
    /* JADX INFO: renamed from: -deprecated_query, reason: not valid java name */
    public final String m9579deprecated_query() {
        return query();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "querySize", imports = {}))
    /* JADX INFO: renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m9581deprecated_querySize() {
        return querySize();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "queryParameterNames", imports = {}))
    /* JADX INFO: renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m9580deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedFragment", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m9567deprecated_encodedFragment() {
        return encodedFragment();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "fragment", imports = {}))
    /* JADX INFO: renamed from: -deprecated_fragment, reason: not valid java name and from getter */
    public final String getFragment() {
        return this.fragment;
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0010!\n\u0002\b\u0013\b\u0007\u0018\u0000 X2\u00020\u0001:\u0001XB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J!\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0007J\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0007J\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\r\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0007J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0007J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0007J\u0019\u0010\u001a\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0007J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u0007J\u0019\u0010\u001c\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u0007J\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u0007J\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u001fJ!\u0010!\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010\u0007J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010\u0003J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0014H\u0007¢\u0006\u0004\b&\u0010'J7\u0010+\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u000eH\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b-\u0010\u0007J\u000f\u0010.\u001a\u00020\u0000H\u0001¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b2\u0010\u0007J\u0017\u00103\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b3\u0010\u0007J\u0017\u00104\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0014H\u0007¢\u0006\u0004\b4\u0010'J'\u00105\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u0014H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b7\u0010\u0007J\u001f\u00108\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b8\u00109J!\u0010:\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b:\u0010\u000bJ\u001f\u0010;\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b;\u00109J!\u0010<\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b<\u0010\u000bJ\u000f\u0010=\u001a\u00020\u0004H\u0017¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b?\u0010\u0007R$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010@\u001a\u0004\bA\u0010>\"\u0004\bB\u00101R\"\u0010\u0018\u001a\u00020\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010@\u001a\u0004\bC\u0010>\"\u0004\bD\u00101R \u0010F\u001a\b\u0012\u0004\u0012\u00020\u00040E8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR,\u0010J\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010E8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010I\"\u0004\bL\u0010MR\"\u0010\u001b\u001a\u00020\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010@\u001a\u0004\bN\u0010>\"\u0004\bO\u00101R$\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010@\u001a\u0004\bP\u0010>\"\u0004\bQ\u00101R\"\u0010&\u001a\u00020\u00148\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b&\u0010R\u001a\u0004\bS\u0010\u0016\"\u0004\bT\u0010UR$\u00107\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b7\u0010@\u001a\u0004\bV\u0010>\"\u0004\bW\u00101"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "<init>", "()V", "", "p0", "addEncodedPathSegment", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "addEncodedPathSegments", "p1", "addEncodedQueryParameter", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "addPathSegment", "addPathSegments", "", "(Ljava/lang/String;Z)Lokhttp3/HttpUrl$Builder;", "addQueryParameter", "Lokhttp3/HttpUrl;", "build", "()Lokhttp3/HttpUrl;", "", "effectivePort", "()I", "encodedFragment", "encodedPassword", "encodedPath", "encodedQuery", "encodedUsername", "fragment", "host", "isDot", "(Ljava/lang/String;)Z", "isDotDot", "parse$okhttp", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", HintConstants.AUTOFILL_HINT_PASSWORD, "", "pop", "port", "(I)Lokhttp3/HttpUrl$Builder;", "p2", "p3", "p4", "push", "(Ljava/lang/String;IIZZ)V", SearchIntents.EXTRA_QUERY, "reencodeForUri$okhttp", "()Lokhttp3/HttpUrl$Builder;", "removeAllCanonicalQueryParameters", "(Ljava/lang/String;)V", "removeAllEncodedQueryParameters", "removeAllQueryParameters", "removePathSegment", "resolvePath", "(Ljava/lang/String;II)V", "scheme", "setEncodedPathSegment", "(ILjava/lang/String;)Lokhttp3/HttpUrl$Builder;", "setEncodedQueryParameter", "setPathSegment", "setQueryParameter", "toString", "()Ljava/lang/String;", HintConstants.AUTOFILL_HINT_USERNAME, "Ljava/lang/String;", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "", "encodedPathSegments", "Ljava/util/List;", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "getHost$okhttp", "setHost$okhttp", "I", "getPort$okhttp", "setPort$okhttp", "(I)V", "getScheme$okhttp", "setScheme$okhttp", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        /* JADX INFO: renamed from: getScheme$okhttp, reason: from getter */
        public final String getScheme() {
            return this.scheme;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX INFO: renamed from: getEncodedUsername$okhttp, reason: from getter */
        public final String getEncodedUsername() {
            return this.encodedUsername;
        }

        public final void setEncodedUsername$okhttp(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.encodedUsername = str;
        }

        /* JADX INFO: renamed from: getEncodedPassword$okhttp, reason: from getter */
        public final String getEncodedPassword() {
            return this.encodedPassword;
        }

        public final void setEncodedPassword$okhttp(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.encodedPassword = str;
        }

        /* JADX INFO: renamed from: getHost$okhttp, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        /* JADX INFO: renamed from: getPort$okhttp, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        /* JADX INFO: renamed from: getEncodedFragment$okhttp, reason: from getter */
        public final String getEncodedFragment() {
            return this.encodedFragment;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final Builder scheme(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (StringsKt.equals(p0, "http", true)) {
                this.scheme = "http";
                return this;
            }
            if (StringsKt.equals(p0, "https", true)) {
                this.scheme = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: ".concat(String.valueOf(p0)));
        }

        public final Builder username(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p0, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder encodedUsername(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p0, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder password(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p0, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder encodedPassword(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p0, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder host(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, p0, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(p0)));
            }
            this.host = canonicalHost;
            return this;
        }

        public final Builder port(int p0) {
            if (p0 <= 0 || p0 >= 65536) {
                throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(p0)).toString());
            }
            this.port = p0;
            return this;
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.INSTANCE;
            String str = this.scheme;
            Intrinsics.checkNotNull(str);
            return companion.defaultPort(str);
        }

        public final Builder addPathSegment(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            push(p0, 0, p0.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return addPathSegments(p0, false);
        }

        public final Builder addEncodedPathSegment(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            push(p0, 0, p0.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return addPathSegments(p0, true);
        }

        private final Builder addPathSegments(String p0, boolean p1) {
            int i = 0;
            do {
                int iDelimiterOffset = Util.delimiterOffset(p0, "/\\", i, p0.length());
                push(p0, i, iDelimiterOffset, iDelimiterOffset < p0.length(), p1);
                i = iDelimiterOffset + 1;
            } while (i <= p0.length());
            return this;
        }

        public final Builder setPathSegment(int p0, String p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p1, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(String.valueOf(p1)).toString());
            }
            this.encodedPathSegments.set(p0, strCanonicalize$okhttp$default);
            return this;
        }

        public final Builder setEncodedPathSegment(int p0, String p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p1, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(p0, strCanonicalize$okhttp$default);
            if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(String.valueOf(p1)).toString());
            }
            return this;
        }

        public final Builder removePathSegment(int p0) {
            this.encodedPathSegments.remove(p0);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final Builder encodedPath(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (!StringsKt.startsWith$default(p0, "/", false, 2, (Object) null)) {
                throw new IllegalArgumentException("unexpected encodedPath: ".concat(String.valueOf(p0)).toString());
            }
            resolvePath(p0, 0, p0.length());
            return this;
        }

        public final Builder query(String p0) {
            String strCanonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (p0 == null || (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p0, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null)) == null) ? null : HttpUrl.INSTANCE.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            return this;
        }

        public final Builder encodedQuery(String p0) {
            String strCanonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (p0 == null || (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p0, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null)) == null) ? null : HttpUrl.INSTANCE.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            return this;
        }

        public final Builder addQueryParameter(String p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            list.add(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p0, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list2);
            list2.add(p1 != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p1, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        public final Builder addEncodedQueryParameter(String p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            list.add(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p0, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list2);
            list2.add(p1 != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p1, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null);
            return this;
        }

        public final Builder setQueryParameter(String p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            removeAllQueryParameters(p0);
            addQueryParameter(p0, p1);
            return this;
        }

        public final Builder setEncodedQueryParameter(String p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            removeAllEncodedQueryParameters(p0);
            addEncodedQueryParameter(p0, p1);
            return this;
        }

        public final Builder removeAllQueryParameters(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p0, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p0, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        private final void removeAllCanonicalQueryParameters(String p0) {
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            int size = list.size() - 2;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                Intrinsics.checkNotNull(list2);
                if (Intrinsics.areEqual(p0, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == progressionLastElement) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        public final Builder fragment(String p0) {
            this.encodedFragment = p0 != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p0, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        public final Builder encodedFragment(String p0) {
            this.encodedFragment = p0 != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p0, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                this.encodedPathSegments.set(i, Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, this.encodedPathSegments.get(i), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list = this.encodedQueryNamesAndValues;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = list.get(i2);
                    list.set(i2, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strPercentDecode$okhttp$default = Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, (String) it.next(), 0, 0, false, 7, null));
            }
            ArrayList arrayList3 = arrayList2;
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (String str3 : list3) {
                    arrayList4.add(str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iEffectivePort, arrayList3, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str4, 0, 0, false, 7, null) : null, toString());
        }

        /* JADX WARN: Code duplicated, block: B:28:0x008e  */
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                if (StringsKt.contains$default((CharSequence) str2, ':', false, 2, (Object) null)) {
                    sb.append('[');
                    sb.append(this.host);
                    sb.append(']');
                } else {
                    sb.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int iEffectivePort = effectivePort();
                if (this.scheme != null) {
                    Companion companion = HttpUrl.INSTANCE;
                    String str3 = this.scheme;
                    Intrinsics.checkNotNull(str3);
                    if (iEffectivePort != companion.defaultPort(str3)) {
                        sb.append(':');
                        sb.append(iEffectivePort);
                    }
                } else {
                    sb.append(':');
                    sb.append(iEffectivePort);
                }
            }
            HttpUrl.INSTANCE.toPathString$okhttp(this.encodedPathSegments, sb);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                Companion companion2 = HttpUrl.INSTANCE;
                List<String> list = this.encodedQueryNamesAndValues;
                Intrinsics.checkNotNull(list);
                companion2.toQueryString$okhttp(list, sb);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        public final Builder parse$okhttp(HttpUrl p0, String p1) {
            int iDelimiterOffset;
            int i;
            int i2;
            String string = p1;
            Intrinsics.checkNotNullParameter(string, "");
            int iIndexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(string, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(string, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = INSTANCE;
            int iSchemeDelimiterOffset = companion.schemeDelimiterOffset(string, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            byte b = -1;
            if (iSchemeDelimiterOffset != -1) {
                if (StringsKt.startsWith(string, "https:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else if (StringsKt.startsWith(string, "http:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "http";
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String strSubstring = string.substring(0, iSchemeDelimiterOffset);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    sb.append(strSubstring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (p0 != null) {
                this.scheme = p0.scheme();
            } else {
                if (p1.length() > 6) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(StringsKt.take(string, 6));
                    sb2.append("...");
                    string = sb2.toString();
                }
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(String.valueOf(string)));
            }
            int iSlashCount = companion.slashCount(string, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            byte b2 = 63;
            byte b3 = 35;
            if (iSlashCount >= 2 || p0 == null || !Intrinsics.areEqual(p0.scheme(), this.scheme)) {
                boolean z = false;
                boolean z2 = false;
                int i3 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                while (true) {
                    iDelimiterOffset = Util.delimiterOffset(string, "@/\\?#", i3, iIndexOfLastNonAsciiWhitespace$default);
                    byte bCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? string.charAt(iDelimiterOffset) : b;
                    if (bCharAt == b || bCharAt == b3 || bCharAt == 47 || bCharAt == 92 || bCharAt == b2) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z) {
                            int iDelimiterOffset2 = Util.delimiterOffset(string, ':', i3, iDelimiterOffset);
                            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p1, i3, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z2) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(this.encodedUsername);
                                sb3.append("%40");
                                sb3.append(strCanonicalize$okhttp$default);
                                strCanonicalize$okhttp$default = sb3.toString();
                            }
                            this.encodedUsername = strCanonicalize$okhttp$default;
                            if (iDelimiterOffset2 != iDelimiterOffset) {
                                this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p1, iDelimiterOffset2 + 1, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z = true;
                            }
                            i2 = iDelimiterOffset;
                            z2 = true;
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(this.encodedPassword);
                            sb4.append("%40");
                            i2 = iDelimiterOffset;
                            sb4.append(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p1, i3, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb4.toString();
                        }
                        i3 = i2 + 1;
                        iIndexOfLastNonAsciiWhitespace$default = iIndexOfLastNonAsciiWhitespace$default;
                        b3 = 35;
                        b2 = 63;
                        b = -1;
                    }
                }
                i = iIndexOfLastNonAsciiWhitespace$default;
                Companion companion2 = INSTANCE;
                int iPortColonOffset = companion2.portColonOffset(string, i3, iDelimiterOffset);
                int i4 = iPortColonOffset + 1;
                if (i4 < iDelimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, p1, i3, iPortColonOffset, false, 4, null));
                    int port = companion2.parsePort(string, i4, iDelimiterOffset);
                    this.port = port;
                    if (port == -1) {
                        StringBuilder sb5 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = string.substring(i4, iDelimiterOffset);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb5.append(strSubstring2);
                        sb5.append(Typography.quote);
                        throw new IllegalArgumentException(sb5.toString().toString());
                    }
                } else {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, p1, i3, iPortColonOffset, false, 4, null));
                    Companion companion3 = HttpUrl.INSTANCE;
                    String str = this.scheme;
                    Intrinsics.checkNotNull(str);
                    this.port = companion3.defaultPort(str);
                }
                if (this.host == null) {
                    StringBuilder sb6 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = string.substring(i3, iPortColonOffset);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb6.append(strSubstring3);
                    sb6.append(Typography.quote);
                    throw new IllegalArgumentException(sb6.toString().toString());
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = p0.encodedUsername();
                this.encodedPassword = p0.encodedPassword();
                this.host = p0.host();
                this.port = p0.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(p0.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || string.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(p0.encodedQuery());
                }
                i = iIndexOfLastNonAsciiWhitespace$default;
            }
            int i5 = i;
            int iDelimiterOffset3 = Util.delimiterOffset(string, "?#", iIndexOfFirstNonAsciiWhitespace$default, i5);
            resolvePath(string, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 < i5 && string.charAt(iDelimiterOffset3) == '?') {
                int iDelimiterOffset4 = Util.delimiterOffset(string, '#', iDelimiterOffset3, i5);
                this.encodedQueryNamesAndValues = HttpUrl.INSTANCE.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p1, iDelimiterOffset3 + 1, iDelimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                iDelimiterOffset3 = iDelimiterOffset4;
            }
            if (iDelimiterOffset3 < i5 && string.charAt(iDelimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p1, 1 + iDelimiterOffset3, i5, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        private final void resolvePath(String p0, int p1, int p2) {
            if (p1 != p2) {
                char cCharAt = p0.charAt(p1);
                if (cCharAt == '/' || cCharAt == '\\') {
                    this.encodedPathSegments.clear();
                    this.encodedPathSegments.add("");
                    p1++;
                } else {
                    List<String> list = this.encodedPathSegments;
                    list.set(list.size() - 1, "");
                }
                while (true) {
                    int i = p1;
                    while (i < p2) {
                        p1 = Util.delimiterOffset(p0, "/\\", i, p2);
                        boolean z = p1 < p2;
                        push(p0, i, p1, z, true);
                        if (z) {
                            i = p1 + 1;
                        }
                    }
                    return;
                }
            }
        }

        private final void push(String p0, int p1, int p2, boolean p3, boolean p4) {
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p0, p1, p2, HttpUrl.PATH_SEGMENT_ENCODE_SET, p4, false, false, false, null, 240, null);
            if (isDot(strCanonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(strCanonicalize$okhttp$default)) {
                pop();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, strCanonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(strCanonicalize$okhttp$default);
            }
            if (p3) {
                this.encodedPathSegments.add("");
            }
        }

        private final boolean isDot(String p0) {
            return Intrinsics.areEqual(p0, ".") || StringsKt.equals(p0, "%2e", true);
        }

        private final boolean isDotDot(String p0) {
            return Intrinsics.areEqual(p0, "..") || StringsKt.equals(p0, "%2e.", true) || StringsKt.equals(p0, ".%2e", true) || StringsKt.equals(p0, "%2e%2e", true);
        }

        private final void pop() {
            List<String> list = this.encodedPathSegments;
            if (list.remove(list.size() - 1).length() == 0 && !this.encodedPathSegments.isEmpty()) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
            } else {
                this.encodedPathSegments.add("");
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ#\u0010\r\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "parsePort", "(Ljava/lang/String;II)I", "portColonOffset", "schemeDelimiterOffset", "slashCount", "INVALID_HOST", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String p0, int p1, int p2) {
                if (p2 - p1 < 2) {
                    return -1;
                }
                char cCharAt = p0.charAt(p1);
                if ((Intrinsics.compare((int) cCharAt, 97) >= 0 && Intrinsics.compare((int) cCharAt, 122) <= 0) || (Intrinsics.compare((int) cCharAt, 65) >= 0 && Intrinsics.compare((int) cCharAt, 90) <= 0)) {
                    while (true) {
                        p1++;
                        if (p1 >= p2) {
                            break;
                        }
                        char cCharAt2 = p0.charAt(p1);
                        if ('a' > cCharAt2 || cCharAt2 >= '{') {
                            if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                    if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                        if (cCharAt2 == ':') {
                                            return p1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String p0, int p1, int p2) {
                while (p1 < p2) {
                    char cCharAt = p0.charAt(p1);
                    if (cCharAt == '[') {
                        do {
                            p1++;
                            if (p1 >= p2) {
                                break;
                            }
                        } while (p0.charAt(p1) != ']');
                    } else if (cCharAt == ':') {
                        return p1;
                    }
                    p1++;
                }
                return p2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String p0, int p1, int p2) {
                try {
                    int i = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p0, p1, p2, "", false, false, false, false, null, 248, null));
                    if (i <= 0 || i >= 65536) {
                        return -1;
                    }
                    return i;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u000fJc\u0010\u001a\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\u0013*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010\u001e\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\n*\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\u000fJ\u0015\u0010 \u001a\u0004\u0018\u00010\n*\u00020\tH\u0007¢\u0006\u0004\b \u0010\fJ\u0015\u0010 \u001a\u0004\u0018\u00010\n*\u00020\rH\u0007¢\u0006\u0004\b \u0010\u000eJ\u0015\u0010!\u001a\u0004\u0018\u00010\n*\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\u000fJ%\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u00040\"2\n\u0010\u0005\u001a\u00060#j\u0002`$H\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040(*\u00020\u0004H\u0001¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020%*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\"2\n\u0010\u0005\u001a\u00060#j\u0002`$H\u0000¢\u0006\u0004\b+\u0010'J]\u0010.\u001a\u00020%*\u00020,2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b.\u0010/J3\u00100\u001a\u00020%*\u00020,2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u00107\u001a\u0002068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b9\u00103R\u0014\u0010:\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b:\u00103R\u0014\u0010;\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b;\u00103R\u0014\u0010<\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b<\u00103R\u0014\u0010=\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b=\u00103R\u0014\u0010>\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b>\u00103R\u0014\u0010?\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b?\u00103R\u0014\u0010@\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b@\u00103"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "<init>", "()V", "", "p0", "", "defaultPort", "(Ljava/lang/String;)I", "Ljava/net/URI;", "Lokhttp3/HttpUrl;", "-deprecated_get", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "-deprecated_parse", "p1", "p2", "", "p3", "p4", "p5", "p6", "Ljava/nio/charset/Charset;", "p7", "canonicalize$okhttp", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "isPercentEncoded", "(Ljava/lang/String;II)Z", "percentDecode$okhttp", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "get", "parse", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "toPathString$okhttp", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "", "toQueryNamesAndValues$okhttp", "(Ljava/lang/String;)Ljava/util/List;", "toQueryString$okhttp", "LRotationProviderListenerWrapper;", "p8", "writeCanonicalized", "(LRotationProviderListenerWrapper;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "writePercentDecoded", "(LRotationProviderListenerWrapper;Ljava/lang/String;IIZ)V", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final int defaultPort(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (Intrinsics.areEqual(p0, "http")) {
                return 80;
            }
            return Intrinsics.areEqual(p0, "https") ? 443 : -1;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder sb) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(sb, "");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder sb) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(sb, "");
            IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, list.size()), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return;
            }
            while (true) {
                String str = list.get(first);
                String str2 = list.get(first + 1);
                if (first > 0) {
                    sb.append(Typography.amp);
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step;
                }
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                String str2 = str;
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, Typography.amp, i, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = str.length();
                }
                int i2 = iIndexOf$default;
                int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str2, '=', i, false, 4, (Object) null);
                if (iIndexOf$default2 == -1 || iIndexOf$default2 > i2) {
                    String strSubstring = str.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i, iIndexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iIndexOf$default2 + 1, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                    arrayList.add(strSubstring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        @JvmStatic
        public final HttpUrl get(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Builder().parse$okhttp(null, str).build();
        }

        @JvmStatic
        public final HttpUrl parse(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @JvmStatic
        public final HttpUrl get(URL url) {
            Intrinsics.checkNotNullParameter(url, "");
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return parse(string);
        }

        @JvmStatic
        public final HttpUrl get(URI uri) {
            Intrinsics.checkNotNullParameter(uri, "");
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return parse(string);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m9586deprecated_get(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return get(p0);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m9589deprecated_parse(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return parse(p0);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m9588deprecated_get(URL p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return get(p0);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m9587deprecated_get(URI p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return get(p0);
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i, i2, z);
        }

        public final String percentDecode$okhttp(String str, int i, int i2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            for (int i3 = i; i3 < i2; i3++) {
                char cCharAt = str.charAt(i3);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
                    rotationProviderListenerWrapper.b(str, i, i3);
                    writePercentDecoded(rotationProviderListenerWrapper, str, i3, i2, z);
                    return rotationProviderListenerWrapper.b(rotationProviderListenerWrapper.size, Charsets.UTF_8);
                }
            }
            String strSubstring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return strSubstring;
        }

        private final void writePercentDecoded(RotationProviderListenerWrapper rotationProviderListenerWrapper, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                int iCodePointAt = str.codePointAt(i);
                if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                    int hexDigit = Util.parseHexDigit(str.charAt(i + 1));
                    int hexDigit2 = Util.parseHexDigit(str.charAt(i3));
                    if (hexDigit != -1 && hexDigit2 != -1) {
                        rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3((hexDigit << 4) + hexDigit2);
                        i = Character.charCount(iCodePointAt) + i3;
                    } else {
                        rotationProviderListenerWrapper.asBinder(iCodePointAt);
                        i += Character.charCount(iCodePointAt);
                    }
                } else if (iCodePointAt == 43 && z) {
                    rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
                    i++;
                } else {
                    rotationProviderListenerWrapper.asBinder(iCodePointAt);
                    i += Character.charCount(iCodePointAt);
                }
            }
        }

        private final boolean isPercentEncoded(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && Util.parseHexDigit(str.charAt(i + 1)) != -1 && Util.parseHexDigit(str.charAt(i3)) != -1;
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            return companion.canonicalize$okhttp(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x003f  */
        public final String canonicalize$okhttp(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) throws EOFException {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            int iCharCount = i;
            while (true) {
                if (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || StringsKt.contains$default((CharSequence) str2, (char) iCodePointAt, false, 2, (Object) null))) {
                        break;
                    }
                    if (iCodePointAt == 37) {
                        if (!z) {
                            break;
                        }
                        if (z2) {
                            if (isPercentEncoded(str, iCharCount, i2)) {
                            }
                        }
                        if (iCodePointAt == 43) {
                        }
                        iCharCount += Character.charCount(iCodePointAt);
                    } else if (iCodePointAt == 43 || !z3) {
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                    RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
                    rotationProviderListenerWrapper.b(str, i, iCharCount);
                    writeCanonicalized(rotationProviderListenerWrapper, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
                    return rotationProviderListenerWrapper.b(rotationProviderListenerWrapper.size, Charsets.UTF_8);
                }
                String strSubstring = str.substring(i, i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                return strSubstring;
            }
            RotationProviderListenerWrapper rotationProviderListenerWrapper2 = new RotationProviderListenerWrapper();
            rotationProviderListenerWrapper2.b(str, i, iCharCount);
            writeCanonicalized(rotationProviderListenerWrapper2, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
            return rotationProviderListenerWrapper2.b(rotationProviderListenerWrapper2.size, Charsets.UTF_8);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x006c  */
        /* JADX WARN: Code duplicated, block: B:39:0x0071  */
        /* JADX WARN: Code duplicated, block: B:41:0x0074  */
        /* JADX WARN: Code duplicated, block: B:46:0x008c  */
        /* JADX WARN: Code duplicated, block: B:50:0x009e A[LOOP:1: B:47:0x008f->B:50:0x009e, LOOP_END] */
        private final void writeCanonicalized(RotationProviderListenerWrapper rotationProviderListenerWrapper, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) throws EOFException {
            int iCharCount = i;
            RotationProviderListenerWrapper rotationProviderListenerWrapper2 = null;
            while (iCharCount < i2) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z3) {
                        String str3 = z ? "+" : "%2B";
                        Intrinsics.checkNotNullParameter(str3, "");
                        rotationProviderListenerWrapper.b(str3, 0, str3.length());
                    } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || StringsKt.contains$default((CharSequence) str2, (char) iCodePointAt, false, 2, (Object) null))) {
                        if (rotationProviderListenerWrapper2 == null) {
                            rotationProviderListenerWrapper2 = new RotationProviderListenerWrapper();
                        }
                        if (charset != null || Intrinsics.areEqual(charset, StandardCharsets.UTF_8)) {
                            rotationProviderListenerWrapper2.asBinder(iCodePointAt);
                        } else {
                            rotationProviderListenerWrapper2.b(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (rotationProviderListenerWrapper2.size != 0) {
                            byte bCancel = rotationProviderListenerWrapper2.cancel();
                            rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(37);
                            rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) HttpUrl.HEX_DIGITS[((bCancel & UByte.MAX_VALUE) >> 4) & 15]);
                            rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) HttpUrl.HEX_DIGITS[bCancel & 15]);
                        }
                    } else {
                        if (iCodePointAt == 37) {
                            if (z) {
                                if (z2) {
                                    if (isPercentEncoded(str, iCharCount, i2)) {
                                    }
                                }
                            }
                            if (rotationProviderListenerWrapper2 == null) {
                                rotationProviderListenerWrapper2 = new RotationProviderListenerWrapper();
                            }
                            if (charset != null) {
                                rotationProviderListenerWrapper2.asBinder(iCodePointAt);
                            } else {
                                rotationProviderListenerWrapper2.asBinder(iCodePointAt);
                            }
                            while (rotationProviderListenerWrapper2.size != 0) {
                                byte bCancel2 = rotationProviderListenerWrapper2.cancel();
                                rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(37);
                                rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) HttpUrl.HEX_DIGITS[((bCancel2 & UByte.MAX_VALUE) >> 4) & 15]);
                                rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) HttpUrl.HEX_DIGITS[bCancel2 & 15]);
                            }
                        }
                        rotationProviderListenerWrapper.asBinder(iCodePointAt);
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    public static final int defaultPort(String str) {
        return INSTANCE.defaultPort(str);
    }

    @JvmStatic
    public static final HttpUrl get(String str) {
        return INSTANCE.get(str);
    }

    @JvmStatic
    public static final HttpUrl get(URI uri) {
        return INSTANCE.get(uri);
    }

    @JvmStatic
    public static final HttpUrl get(URL url) {
        return INSTANCE.get(url);
    }

    @JvmStatic
    public static final HttpUrl parse(String str) {
        return INSTANCE.parse(str);
    }
}
