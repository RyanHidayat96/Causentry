package okhttp3;

import androidx.browser.trusted.sharing.ShareTarget;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B%\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0010J!\u0010\u0018\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0011\u0010 \u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b \u0010\u0014"}, d2 = {"Lokhttp3/FormBody;", "Lokhttp3/RequestBody;", "", "", "p0", "p1", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "contentLength", "()J", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "encodedName", "(I)Ljava/lang/String;", "encodedValue", "name", "-deprecated_size", "()I", "value", "LRotationProviderListener;", "", "writeOrCountBytes", "(LRotationProviderListener;Z)J", "", "writeTo", "(LRotationProviderListener;)V", "encodedNames", "Ljava/util/List;", "encodedValues", "size", "Companion", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FormBody extends RequestBody {
    private final List<String> encodedNames;
    private final List<String> encodedValues;
    private static final MediaType CONTENT_TYPE = MediaType.INSTANCE.get(ShareTarget.ENCODING_TYPE_URL_ENCODED);

    public FormBody(List<String> list, List<String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.encodedNames = Util.toImmutableList(list);
        this.encodedValues = Util.toImmutableList(list2);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m9556deprecated_size() {
        return size();
    }

    public final String encodedName(int p0) {
        return this.encodedNames.get(p0);
    }

    public final String name(int p0) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, encodedName(p0), 0, 0, true, 3, null);
    }

    public final String encodedValue(int p0) {
        return this.encodedValues.get(p0);
    }

    public final String value(int p0) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, encodedValue(p0), 0, 0, true, 3, null);
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public final MediaType getContentType() {
        return CONTENT_TYPE;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(RotationProviderListener p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        writeOrCountBytes(p0, false);
    }

    private final long writeOrCountBytes(RotationProviderListener p0, boolean p1) throws EOFException {
        RotationProviderListenerWrapper rotationProviderListenerWrapperAsInterface;
        if (p1) {
            rotationProviderListenerWrapperAsInterface = new RotationProviderListenerWrapper();
        } else {
            Intrinsics.checkNotNull(p0);
            rotationProviderListenerWrapperAsInterface = p0.asInterface();
        }
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                rotationProviderListenerWrapperAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(38);
            }
            String str = this.encodedNames.get(i);
            Intrinsics.checkNotNullParameter(str, "");
            rotationProviderListenerWrapperAsInterface.b(str, 0, str.length());
            rotationProviderListenerWrapperAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(61);
            String str2 = this.encodedValues.get(i);
            Intrinsics.checkNotNullParameter(str2, "");
            rotationProviderListenerWrapperAsInterface.b(str2, 0, str2.length());
        }
        if (!p1) {
            return 0L;
        }
        long j = rotationProviderListenerWrapperAsInterface.size;
        rotationProviderListenerWrapperAsInterface.g(rotationProviderListenerWrapperAsInterface.size);
        return j;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012"}, d2 = {"Lokhttp3/FormBody$Builder;", "", "Ljava/nio/charset/Charset;", "p0", "<init>", "(Ljava/nio/charset/Charset;)V", "", "p1", "add", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/FormBody$Builder;", "addEncoded", "Lokhttp3/FormBody;", "build", "()Lokhttp3/FormBody;", "charset", "Ljava/nio/charset/Charset;", "", "names", "Ljava/util/List;", "values"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder(Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public /* synthetic */ Builder(Charset charset, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charset);
        }

        public final Builder add(String p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.names.add(HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p0, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p1, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            return this;
        }

        public final Builder addEncoded(String p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.names.add(HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p0, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, p1, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            return this;
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
