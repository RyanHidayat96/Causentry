package okhttp3.tls.internal.der;

import androidx.exifinterface.media.ExifInterface;
import defpackage.RotationProviderListener;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001EBM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\tHÂ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJd\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÇ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010\u0016J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020/2\u0006\u0010\u0004\u001a\u00020.2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0003H\u0017¢\u0006\u0004\b2\u0010\u0014J'\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00107\u001a\u0004\u0018\u00018\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u001eR\u001a\u0010:\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010\u001cR\u0014\u0010<\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u0018R\u001a\u0010A\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010\u0016R\u0014\u0010D\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010;"}, d2 = {"Lokhttp3/tls/internal/der/BasicDerAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Lokhttp3/tls/internal/der/DerAdapter;", "", "p0", "", "p1", "", "p2", "Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", "p3", "", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;IJLokhttp3/tls/internal/der/BasicDerAdapter$Codec;ZLjava/lang/Object;Z)V", "asTypeHint", "()Lokhttp3/tls/internal/der/BasicDerAdapter;", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()J", "component4", "()Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", "component5", "()Z", "component6", "()Ljava/lang/Object;", "component7", "copy", "(Ljava/lang/String;IJLokhttp3/tls/internal/der/BasicDerAdapter$Codec;ZLjava/lang/Object;Z)Lokhttp3/tls/internal/der/BasicDerAdapter;", "", "equals", "(Ljava/lang/Object;)Z", "Lokhttp3/tls/internal/der/DerReader;", "fromDer", "(Lokhttp3/tls/internal/der/DerReader;)Ljava/lang/Object;", "hashCode", "Lokhttp3/tls/internal/der/DerHeader;", "matches", "(Lokhttp3/tls/internal/der/DerHeader;)Z", "optional", "(Ljava/lang/Object;)Lokhttp3/tls/internal/der/BasicDerAdapter;", "Lokhttp3/tls/internal/der/DerWriter;", "", "toDer", "(Lokhttp3/tls/internal/der/DerWriter;Ljava/lang/Object;)V", "toString", "withTag", "(IJ)Lokhttp3/tls/internal/der/BasicDerAdapter;", "codec", "Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", "defaultValue", "Ljava/lang/Object;", "getDefaultValue", "isOptional", "Z", "name", "Ljava/lang/String;", "tag", "J", "getTag", "tagClass", "I", "getTagClass", "typeHint", "Codec"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class BasicDerAdapter<T> implements DerAdapter<T> {
    private final Codec<T> codec;
    private final T defaultValue;
    private final boolean isOptional;
    private final String name;
    private final long tag;
    private final int tagClass;
    private final boolean typeHint;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0001H&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lokhttp3/tls/internal/der/DerReader;", "p0", "decode", "(Lokhttp3/tls/internal/der/DerReader;)Ljava/lang/Object;", "Lokhttp3/tls/internal/der/DerWriter;", "p1", "", "encode", "(Lokhttp3/tls/internal/der/DerWriter;Ljava/lang/Object;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Codec<T> {
        T decode(DerReader p0);

        void encode(DerWriter p0, T p1);
    }

    public BasicDerAdapter(String str, int i, long j, Codec<T> codec, boolean z, T t, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(codec, "");
        this.name = str;
        this.tagClass = i;
        this.tag = j;
        this.codec = codec;
        this.isOptional = z;
        this.defaultValue = t;
        this.typeHint = z2;
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (j < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ BasicDerAdapter(String str, int i, long j, Codec codec, boolean z, Object obj, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, j, codec, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : obj, (i2 & 64) != 0 ? false : z2);
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public final BasicDerAdapter<List<T>> asSequenceOf(String str, int i, long j) {
        return DerAdapter.DefaultImpls.asSequenceOf(this, str, i, j);
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public final BasicDerAdapter<List<T>> asSetOf() {
        return DerAdapter.DefaultImpls.asSetOf(this);
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public final T fromDer(ByteString byteString) {
        return (T) DerAdapter.DefaultImpls.fromDer(this, byteString);
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public final ByteString toDer(T t) {
        return DerAdapter.DefaultImpls.toDer(this, t);
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public final BasicDerAdapter<T> withExplicitBox(int i, long j, Boolean bool) {
        return DerAdapter.DefaultImpls.withExplicitBox(this, i, j, bool);
    }

    public final int getTagClass() {
        return this.tagClass;
    }

    public final long getTag() {
        return this.tag;
    }

    public final boolean isOptional() {
        return this.isOptional;
    }

    public final T getDefaultValue() {
        return this.defaultValue;
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public final boolean matches(DerHeader p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0.getTagClass() == this.tagClass && p0.getTag() == this.tag;
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public final T fromDer(DerReader p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        DerHeader derHeaderPeekHeader = p0.peekHeader();
        if (derHeaderPeekHeader == null || derHeaderPeekHeader.getTagClass() != this.tagClass || derHeaderPeekHeader.getTag() != this.tag) {
            if (this.isOptional) {
                return this.defaultValue;
            }
            StringBuilder sb = new StringBuilder("expected ");
            sb.append(this);
            sb.append(" but was ");
            sb.append(derHeaderPeekHeader);
            sb.append(" at ");
            sb.append(p0);
            throw new ProtocolException(sb.toString());
        }
        String str = this.name;
        if (p0.hasNext()) {
            DerHeader derHeader = p0.peekedHeader;
            Intrinsics.checkNotNull(derHeader);
            p0.peekedHeader = null;
            long j = p0.limit;
            boolean z = p0.constructed;
            long byteCount = derHeader.getLength() != -1 ? p0.getByteCount() + derHeader.getLength() : -1L;
            if (j == -1 || byteCount <= j) {
                p0.limit = byteCount;
                p0.constructed = derHeader.getConstructed();
                if (str != null) {
                    p0.path.add(str);
                }
                try {
                    T tDecode = this.codec.decode(p0);
                    if (byteCount != -1 && p0.getByteCount() > byteCount) {
                        throw new ProtocolException(Intrinsics.stringPlus("unexpected byte count at ", p0));
                    }
                    p0.peekedHeader = null;
                    p0.limit = j;
                    p0.constructed = z;
                    if (str != null) {
                        p0.path.remove(p0.path.size() - 1);
                    }
                    if (this.typeHint) {
                        p0.setTypeHint(tDecode);
                    }
                    return tDecode;
                } catch (Throwable th) {
                    p0.peekedHeader = null;
                    p0.limit = j;
                    p0.constructed = z;
                    if (str != null) {
                        p0.path.remove(p0.path.size() - 1);
                    }
                    throw th;
                }
            }
            throw new ProtocolException("enclosed object too large");
        }
        throw new ProtocolException("expected a value");
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public final void toDer(final DerWriter p0, final T p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.typeHint) {
            p0.setTypeHint(p1);
        }
        if (this.isOptional && Intrinsics.areEqual(p1, this.defaultValue)) {
            return;
        }
        p0.write(this.name, this.tagClass, this.tag, new Function1<RotationProviderListener, Unit>(this) { // from class: okhttp3.tls.internal.der.BasicDerAdapter.toDer.1
            final /* synthetic */ BasicDerAdapter<T> this$0;

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(RotationProviderListener rotationProviderListener) {
                invoke2(rotationProviderListener);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RotationProviderListener rotationProviderListener) {
                Intrinsics.checkNotNullParameter(rotationProviderListener, "");
                ((BasicDerAdapter) this.this$0).codec.encode(p0, p1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }
        });
    }

    public static /* synthetic */ BasicDerAdapter withTag$default(BasicDerAdapter basicDerAdapter, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 128;
        }
        return basicDerAdapter.withTag(i, j);
    }

    public final BasicDerAdapter<T> withTag(int p0, long p1) {
        return copy$default(this, null, p0, p1, null, false, null, false, 121, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BasicDerAdapter optional$default(BasicDerAdapter basicDerAdapter, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return basicDerAdapter.optional(obj);
    }

    public final BasicDerAdapter<T> optional(T p0) {
        return copy$default(this, null, 0, 0L, null, true, p0, false, 79, null);
    }

    public final BasicDerAdapter<T> asTypeHint() {
        return copy$default(this, null, 0, 0L, null, false, null, true, 63, null);
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode();
        int i = this.tagClass;
        int i2 = (int) this.tag;
        int iHashCode2 = this.codec.hashCode();
        boolean z = this.isOptional;
        T t = this.defaultValue;
        return (((((((((((iHashCode * 31) + i) * 31) + i2) * 31) + iHashCode2) * 31) + (z ? 1 : 0)) * 31) + (t != null ? t.hashCode() : 0)) * 31) + (this.typeHint ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(" [");
        sb.append(this.tagClass);
        sb.append('/');
        sb.append(this.tag);
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getName() {
        return this.name;
    }

    private final Codec<T> component4() {
        return this.codec;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final boolean getTypeHint() {
        return this.typeHint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BasicDerAdapter copy$default(BasicDerAdapter basicDerAdapter, String str, int i, long j, Codec codec, boolean z, Object obj, boolean z2, int i2, Object obj2) {
        return basicDerAdapter.copy((i2 & 1) != 0 ? basicDerAdapter.name : str, (i2 & 2) != 0 ? basicDerAdapter.tagClass : i, (i2 & 4) != 0 ? basicDerAdapter.tag : j, (i2 & 8) != 0 ? basicDerAdapter.codec : codec, (i2 & 16) != 0 ? basicDerAdapter.isOptional : z, (i2 & 32) != 0 ? basicDerAdapter.defaultValue : obj, (i2 & 64) != 0 ? basicDerAdapter.typeHint : z2);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTagClass() {
        return this.tagClass;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsOptional() {
        return this.isOptional;
    }

    public final T component6() {
        return this.defaultValue;
    }

    public final BasicDerAdapter<T> copy(String p0, int p1, long p2, Codec<T> p3, boolean p4, T p5, boolean p6) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new BasicDerAdapter<>(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BasicDerAdapter)) {
            return false;
        }
        BasicDerAdapter basicDerAdapter = (BasicDerAdapter) p0;
        return Intrinsics.areEqual(this.name, basicDerAdapter.name) && this.tagClass == basicDerAdapter.tagClass && this.tag == basicDerAdapter.tag && Intrinsics.areEqual(this.codec, basicDerAdapter.codec) && this.isOptional == basicDerAdapter.isOptional && Intrinsics.areEqual(this.defaultValue, basicDerAdapter.defaultValue) && this.typeHint == basicDerAdapter.typeHint;
    }
}
