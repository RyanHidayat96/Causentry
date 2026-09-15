package okhttp3.internal.http2;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.midtrans.sdk.corekit.core.Constants;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListenerWrapper;
import defpackage.SurfaceViewImplementation;
import defpackage.tryToComplete;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.Util;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "<init>", "()V", "Lokio/ByteString;", "p0", "checkLowercase", "(Lokio/ByteString;)Lokio/ByteString;", "", "", "nameToFirstIndex", "()Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "Ljava/util/Map;", "getNAME_TO_FIRST_INDEX", "PREFIX_4_BITS", "I", "PREFIX_5_BITS", "PREFIX_6_BITS", "PREFIX_7_BITS", "SETTINGS_HEADER_TABLE_SIZE", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "", "Lokhttp3/internal/http2/Header;", "STATIC_HEADER_TABLE", "[Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "Reader", "Writer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    private Hpack() {
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        STATIC_HEADER_TABLE = new Header[]{new Header(Header.TARGET_AUTHORITY, ""), new Header(Header.TARGET_METHOD, ShareTarget.METHOD_GET), new Header(Header.TARGET_METHOD, ShareTarget.METHOD_POST), new Header(Header.TARGET_PATH, "/"), new Header(Header.TARGET_PATH, "/index.html"), new Header(Header.TARGET_SCHEME, "http"), new Header(Header.TARGET_SCHEME, "https"), new Header(Header.RESPONSE_STATUS, Constants.STATUS_CODE_200), new Header(Header.RESPONSE_STATUS, "204"), new Header(Header.RESPONSE_STATUS, "206"), new Header(Header.RESPONSE_STATUS, "304"), new Header(Header.RESPONSE_STATUS, Constants.STATUS_CODE_400), new Header(Header.RESPONSE_STATUS, "404"), new Header(Header.RESPONSE_STATUS, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header(DynamicLink.Builder.KEY_LINK, ""), new Header(FirebaseAnalytics.Param.LOCATION, ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    public final Map<ByteString, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u000bJ\u0017\u0010\"\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010#J\u000f\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b'\u0010\u000bJ\u0017\u0010(\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010#J\u000f\u0010)\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010\u000bR\u001e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u0011008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u0010.R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010.R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u0010.R\u0014\u00106\u001a\u0002058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "LtryToComplete;", "p0", "", "p1", "p2", "<init>", "(LtryToComplete;II)V", "", "adjustDynamicTableByteCount", "()V", "clearDynamicTable", "dynamicTableIndex", "(I)I", "evictToRecoverBytes", "", "Lokhttp3/internal/http2/Header;", "getAndResetHeaderList", "()Ljava/util/List;", "Lokio/ByteString;", "getName", "(I)Lokio/ByteString;", "insertIntoDynamicTable", "(ILokhttp3/internal/http2/Header;)V", "", "isStaticHeader", "(I)Z", "maxDynamicTableByteCount", "()I", "readByte", "readByteString", "()Lokio/ByteString;", "readHeaders", "readIndexedHeader", "(I)V", "readInt", "(II)I", "readLiteralHeaderWithIncrementalIndexingIndexedName", "readLiteralHeaderWithIncrementalIndexingNewName", "readLiteralHeaderWithoutIndexingIndexedName", "readLiteralHeaderWithoutIndexingNewName", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "dynamicTableByteCount", "I", "headerCount", "", "headerList", "Ljava/util/List;", "headerTableSizeSetting", "nextHeaderIndex", "LRotationProvider1;", "source", "LRotationProvider1;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final RotationProvider1 source;

        public Reader(tryToComplete trytocomplete, int i, int i2) {
            Intrinsics.checkNotNullParameter(trytocomplete, "");
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.headerList = new ArrayList();
            this.source = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(trytocomplete);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = 7;
        }

        public /* synthetic */ Reader(tryToComplete trytocomplete, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(trytocomplete, i, (i3 & 4) != 0 ? i : i2);
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> list = CollectionsKt.toList(this.headerList);
            this.headerList.clear();
            return list;
        }

        /* JADX INFO: renamed from: maxDynamicTableByteCount, reason: from getter */
        public final int getMaxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            ArraysKt.fill$default(this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int p0) {
            int i;
            int i2 = 0;
            if (p0 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i = this.nextHeaderIndex;
                    if (length < i || p0 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    Intrinsics.checkNotNull(header);
                    p0 -= header.hpackSize;
                    this.dynamicTableByteCount -= header.hpackSize;
                    this.headerCount--;
                    i2++;
                }
                Header[] headerArr = this.dynamicTable;
                int i3 = i + 1;
                System.arraycopy(headerArr, i3, headerArr, i3 + i2, this.headerCount);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        public final void readHeaders() throws IOException {
            while (!this.source.d()) {
                int iAnd = Util.and(this.source.cancel(), 255);
                if (iAnd == 128) {
                    throw new IOException("index == 0");
                }
                if ((iAnd & 128) == 128) {
                    readIndexedHeader(readInt(iAnd, 127) - 1);
                } else if (iAnd == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((iAnd & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(iAnd, 63) - 1);
                } else if ((iAnd & 32) == 32) {
                    int i = readInt(iAnd, 31);
                    this.maxDynamicTableByteCount = i;
                    if (i < 0 || i > this.headerTableSizeSetting) {
                        StringBuilder sb = new StringBuilder("Invalid dynamic table size update ");
                        sb.append(this.maxDynamicTableByteCount);
                        throw new IOException(sb.toString());
                    }
                    adjustDynamicTableByteCount();
                } else if (iAnd == 16 || iAnd == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(iAnd, 15) - 1);
                }
            }
        }

        private final void readIndexedHeader(int p0) throws IOException {
            if (isStaticHeader(p0)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[p0]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(p0 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[iDynamicTableIndex];
                    Intrinsics.checkNotNull(header);
                    list.add(header);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("Header index too large ");
            sb.append(p0 + 1);
            throw new IOException(sb.toString());
        }

        private final int dynamicTableIndex(int p0) {
            return this.nextHeaderIndex + 1 + p0;
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int p0) throws IOException {
            this.headerList.add(new Header(getName(p0), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int p0) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(p0), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final ByteString getName(int p0) throws IOException {
            if (isStaticHeader(p0)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[p0].name;
            }
            int iDynamicTableIndex = dynamicTableIndex(p0 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    Header header = headerArr[iDynamicTableIndex];
                    Intrinsics.checkNotNull(header);
                    return header.name;
                }
            }
            StringBuilder sb = new StringBuilder("Header index too large ");
            sb.append(p0 + 1);
            throw new IOException(sb.toString());
        }

        private final boolean isStaticHeader(int p0) {
            return p0 >= 0 && p0 <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final void insertIntoDynamicTable(int p0, Header p1) {
            this.headerList.add(p1);
            int i = p1.hpackSize;
            if (p0 != -1) {
                Header header = this.dynamicTable[dynamicTableIndex(p0)];
                Intrinsics.checkNotNull(header);
                i -= header.hpackSize;
            }
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            if (p0 == -1) {
                int i3 = this.headerCount;
                Header[] headerArr = this.dynamicTable;
                if (i3 + 1 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i4 = this.nextHeaderIndex;
                this.nextHeaderIndex = i4 - 1;
                this.dynamicTable[i4] = p1;
                this.headerCount++;
            } else {
                this.dynamicTable[p0 + dynamicTableIndex(p0) + iEvictToRecoverBytes] = p1;
            }
            this.dynamicTableByteCount += i;
        }

        private final int readByte() throws IOException {
            return Util.and(this.source.cancel(), 255);
        }

        public final int readInt(int p0, int p1) throws IOException {
            int i = p0 & p1;
            if (i < p1) {
                return i;
            }
            int i2 = 0;
            while (true) {
                int i3 = readByte();
                if ((i3 & 128) == 0) {
                    return p1 + (i3 << i2);
                }
                p1 += (i3 & 127) << i2;
                i2 += 7;
            }
        }

        public final ByteString readByteString() throws IOException {
            int i = readByte();
            boolean z = (i & 128) == 128;
            long j = readInt(i, 127);
            if (z) {
                RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
                Huffman.INSTANCE.decode(this.source, j, rotationProviderListenerWrapper);
                return rotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.size);
            }
            return this.source.TuitionPaymentFragmentbindingInflater1(j);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Reader(tryToComplete trytocomplete, int i) {
            this(trytocomplete, i, 0, 4, null);
            Intrinsics.checkNotNullParameter(trytocomplete, "");
        }
    }

    private final Map<ByteString, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i = 0; i < length; i++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i].name)) {
                linkedHashMap.put(headerArr2[i].name, Integer.valueOf(i));
            }
        }
        Map<ByteString, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "");
        return mapUnmodifiableMap;
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000e\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010!R\u0016\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010!R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010!R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010!R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010#"}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "", "p0", "", "p1", "LRotationProviderListenerWrapper;", "p2", "<init>", "(IZLRotationProviderListenerWrapper;)V", "", "adjustDynamicTableByteCount", "()V", "clearDynamicTable", "evictToRecoverBytes", "(I)I", "Lokhttp3/internal/http2/Header;", "insertIntoDynamicTable", "(Lokhttp3/internal/http2/Header;)V", "resizeHeaderTable", "(I)V", "Lokio/ByteString;", "writeByteString", "(Lokio/ByteString;)V", "", "writeHeaders", "(Ljava/util/List;)V", "writeInt", "(III)V", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "dynamicTableByteCount", "I", "emitDynamicTableSizeUpdate", "Z", "headerCount", "headerTableSizeSetting", "maxDynamicTableByteCount", "nextHeaderIndex", "out", "LRotationProviderListenerWrapper;", "smallestHeaderTableSizeSetting", "useCompression"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final RotationProviderListenerWrapper out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int i, boolean z, RotationProviderListenerWrapper rotationProviderListenerWrapper) {
            Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
            this.headerTableSizeSetting = i;
            this.useCompression = z;
            this.out = rotationProviderListenerWrapper;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = 7;
        }

        public /* synthetic */ Writer(int i, boolean z, RotationProviderListenerWrapper rotationProviderListenerWrapper, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, rotationProviderListenerWrapper);
        }

        private final void clearDynamicTable() {
            ArraysKt.fill$default(this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int p0) {
            int i;
            int i2 = 0;
            if (p0 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i = this.nextHeaderIndex;
                    if (length < i || p0 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    Intrinsics.checkNotNull(header);
                    p0 -= header.hpackSize;
                    int i3 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    Intrinsics.checkNotNull(header2);
                    this.dynamicTableByteCount = i3 - header2.hpackSize;
                    this.headerCount--;
                    i2++;
                }
                Header[] headerArr = this.dynamicTable;
                int i4 = i + 1;
                System.arraycopy(headerArr, i4, headerArr, i4 + i2, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i5 = this.nextHeaderIndex + 1;
                Arrays.fill(headerArr2, i5, i5 + i2, (Object) null);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        private final void insertIntoDynamicTable(Header p0) {
            int i = p0.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount;
            Header[] headerArr = this.dynamicTable;
            if (i3 + 1 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = p0;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0079  */
        public final void writeHeaders(List<Header> p0) throws IOException {
            int length;
            int length2;
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.emitDynamicTableSizeUpdate) {
                int i = this.smallestHeaderTableSizeSetting;
                if (i < this.maxDynamicTableByteCount) {
                    writeInt(i, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = p0.size();
            for (int i2 = 0; i2 < size; i2++) {
                Header header = p0.get(i2);
                ByteString byteStringG = header.name.g();
                ByteString byteString = header.value;
                Integer num = Hpack.INSTANCE.getNAME_TO_FIRST_INDEX().get(byteStringG);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = -1;
                    } else if (Intrinsics.areEqual(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[iIntValue].value, byteString)) {
                        length = length2;
                    } else if (Intrinsics.areEqual(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[length2].value, byteString)) {
                        length = iIntValue + 2;
                    } else {
                        length = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length == -1) {
                    int length3 = this.dynamicTable.length;
                    for (int i3 = this.nextHeaderIndex + 1; i3 < length3; i3++) {
                        Header header2 = this.dynamicTable[i3];
                        Intrinsics.checkNotNull(header2);
                        if (Intrinsics.areEqual(header2.name, byteStringG)) {
                            Header header3 = this.dynamicTable[i3];
                            Intrinsics.checkNotNull(header3);
                            if (Intrinsics.areEqual(header3.value, byteString)) {
                                length = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i3 - this.nextHeaderIndex);
                                break;
                            } else if (length2 == -1) {
                                length2 = (i3 - this.nextHeaderIndex) + Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                    }
                }
                if (length != -1) {
                    writeInt(length, 127, 128);
                } else if (length2 == -1) {
                    this.out.TuitionPaymentFragmentspecialinlinedviewModeldefault3(64);
                    writeByteString(byteStringG);
                    writeByteString(byteString);
                    insertIntoDynamicTable(header);
                } else {
                    ByteString byteString2 = Header.PSEUDO_PREFIX;
                    Intrinsics.checkNotNullParameter(byteString2, "");
                    if (byteStringG.TuitionPaymentFragmentspecialinlinedviewModeldefault1(0, byteString2, byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) && !Intrinsics.areEqual(Header.TARGET_AUTHORITY, byteStringG)) {
                        writeInt(length2, 15, 0);
                        writeByteString(byteString);
                    } else {
                        writeInt(length2, 63, 64);
                        writeByteString(byteString);
                        insertIntoDynamicTable(header);
                    }
                }
            }
        }

        public final void writeInt(int p0, int p1, int p2) {
            if (p0 < p1) {
                this.out.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0 | p2);
                return;
            }
            this.out.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p2 | p1);
            int i = p0 - p1;
            while (i >= 128) {
                this.out.TuitionPaymentFragmentspecialinlinedviewModeldefault3(128 | (i & 127));
                i >>>= 7;
            }
            this.out.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        }

        public final void writeByteString(ByteString p0) throws IOException {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.useCompression && Huffman.INSTANCE.encodedLength(p0) < p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
                Huffman.INSTANCE.encode(p0, rotationProviderListenerWrapper);
                ByteString byteStringTuitionPaymentFragmentbindingInflater1 = rotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.size);
                writeInt(byteStringTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 127, 128);
                RotationProviderListenerWrapper rotationProviderListenerWrapper2 = this.out;
                Intrinsics.checkNotNullParameter(byteStringTuitionPaymentFragmentbindingInflater1, "");
                byteStringTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper2, 0, byteStringTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                return;
            }
            writeInt(p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 127, 0);
            RotationProviderListenerWrapper rotationProviderListenerWrapper3 = this.out;
            Intrinsics.checkNotNullParameter(p0, "");
            p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper3, 0, p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }

        public final void resizeHeaderTable(int p0) {
            this.headerTableSizeSetting = p0;
            int iMin = Math.min(p0, 16384);
            int i = this.maxDynamicTableByteCount;
            if (i == iMin) {
                return;
            }
            if (iMin < i) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            adjustDynamicTableByteCount();
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(int i, RotationProviderListenerWrapper rotationProviderListenerWrapper) {
            this(i, false, rotationProviderListenerWrapper, 2, null);
            Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(RotationProviderListenerWrapper rotationProviderListenerWrapper) {
            this(0, false, rotationProviderListenerWrapper, 3, null);
            Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        }
    }

    public final ByteString checkLowercase(ByteString p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        for (int i = 0; i < iTuitionPaymentFragmentspecialinlinedviewModeldefault3; i++) {
            byte b = p0.b(i);
            if (65 <= b && b < 91) {
                StringBuilder sb = new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                String str = p0.utf8;
                if (str == null) {
                    byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
                    String str2 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, Charsets.UTF_8);
                    p0.utf8 = str2;
                    str = str2;
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
        }
        return p0;
    }
}
