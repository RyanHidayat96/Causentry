package androidx.p005navigation;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0015B-\b\u0007\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u000b"}, d2 = {"Landroidx/navigation/NavDeepLinkRequest;", "", "Landroid/net/Uri;", "Landroidx/navigation/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "p0", "", "p1", "p2", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "action", "Ljava/lang/String;", "getAction", "mimeType", "getMimeType", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class NavDeepLinkRequest {
    private final String action;
    private final String mimeType;
    private final Uri uri;

    public NavDeepLinkRequest(Uri uri, String str, String str2) {
        this.uri = uri;
        this.action = str;
        this.mimeType = str2;
    }

    public Uri getUri() {
        return this.uri;
    }

    public String getAction() {
        return this.action;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
        if (getUri() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(getUri()));
        }
        if (getAction() != null) {
            sb.append(" action=");
            sb.append(getAction());
        }
        if (getMimeType() != null) {
            sb.append(" mimetype=");
            sb.append(getMimeType());
        }
        sb.append(" }");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00002\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Landroidx/navigation/NavDeepLinkRequest$Builder;", "", "<init>", "()V", "Landroid/net/Uri;", "Landroidx/navigation/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "p0", "setUri", "(Landroid/net/Uri;)Landroidx/navigation/NavDeepLinkRequest$Builder;", "", "setAction", "(Ljava/lang/String;)Landroidx/navigation/NavDeepLinkRequest$Builder;", "setMimeType", "Landroidx/navigation/NavDeepLinkRequest;", "build", "()Landroidx/navigation/NavDeepLinkRequest;", "uri", "Landroid/net/Uri;", "action", "Ljava/lang/String;", "mimeType", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String action;
        private String mimeType;
        private Uri uri;

        private Builder() {
        }

        public final Builder setUri(Uri p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.uri = p0;
            return this;
        }

        public final Builder setAction(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.".toString());
            }
            this.action = p0;
            return this;
        }

        public final Builder setMimeType(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (!new Regex("^[-\\w*.]+/[-\\w+*.]+$").matches(p0)) {
                StringBuilder sb = new StringBuilder("The given mimeType ");
                sb.append(p0);
                sb.append(" does not match to required \"type/subtype\" format");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            this.mimeType = p0;
            return this;
        }

        public final NavDeepLinkRequest build() {
            return new NavDeepLinkRequest(this.uri, this.action, this.mimeType);
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Landroidx/navigation/NavDeepLinkRequest$Builder$Companion;", "", "<init>", "()V", "Landroid/net/Uri;", "Landroidx/navigation/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "p0", "Landroidx/navigation/NavDeepLinkRequest$Builder;", "fromUri", "(Landroid/net/Uri;)Landroidx/navigation/NavDeepLinkRequest$Builder;", "", "fromAction", "(Ljava/lang/String;)Landroidx/navigation/NavDeepLinkRequest$Builder;", "fromMimeType"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public final Builder fromUri(Uri p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                Builder builder = new Builder(null);
                builder.setUri(p0);
                return builder;
            }

            @JvmStatic
            public final Builder fromAction(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.".toString());
                }
                Builder builder = new Builder(null);
                builder.setAction(p0);
                return builder;
            }

            @JvmStatic
            public final Builder fromMimeType(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                Builder builder = new Builder(null);
                builder.setMimeType(p0);
                return builder;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Builder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static final Builder fromAction(String str) {
            return INSTANCE.fromAction(str);
        }

        @JvmStatic
        public static final Builder fromMimeType(String str) {
            return INSTANCE.fromMimeType(str);
        }

        @JvmStatic
        public static final Builder fromUri(Uri uri) {
            return INSTANCE.fromUri(uri);
        }
    }
}
