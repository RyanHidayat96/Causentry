package androidx.p005navigation.p009serialization;

import androidx.exifinterface.media.ExifInterface;
import androidx.p005navigation.CollectionNavType;
import androidx.p005navigation.NavType;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001#B\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u00112\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010 "}, d2 = {"Landroidx/navigation/serialization/RouteBuilder;", ExifInterface.GPS_DIRECTION_TRUE, "", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "p0", "<init>", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;)V", "", "p1", "(Ljava/lang/String;LvideoProfileHdrFormatsToDynamicRangeEncoding;)V", "build", "()Ljava/lang/String;", "", "addPath", "(Ljava/lang/String;)V", "addQuery", "(Ljava/lang/String;Ljava/lang/String;)V", "", "Landroidx/navigation/NavType;", "p2", "appendPattern", "(ILjava/lang/String;Landroidx/navigation/NavType;)V", "", "p3", "appendArg", "(ILjava/lang/String;Landroidx/navigation/NavType;Ljava/util/List;)V", "Landroidx/navigation/serialization/RouteBuilder$ParamType;", "computeParamType", "(ILandroidx/navigation/NavType;)Landroidx/navigation/serialization/RouteBuilder$ParamType;", "serializer", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "path", "Ljava/lang/String;", "pathArgs", "queryArgs", "ParamType"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteBuilder<T> {
    private final String path;
    private String pathArgs;
    private String queryArgs;
    private final videoProfileHdrFormatsToDynamicRangeEncoding<T> serializer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ParamType.values().length];
            try {
                iArr[ParamType.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParamType.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RouteBuilder(videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding) {
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        this.pathArgs = "";
        this.queryArgs = "";
        this.serializer = videoprofilehdrformatstodynamicrangeencoding;
        this.path = videoprofilehdrformatstodynamicrangeencoding.getDescriptor().getINotificationSideChannel();
    }

    public RouteBuilder(String str, videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        this.pathArgs = "";
        this.queryArgs = "";
        this.serializer = videoprofilehdrformatstodynamicrangeencoding;
        this.path = str;
    }

    public final String build() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.path);
        sb.append(this.pathArgs);
        sb.append(this.queryArgs);
        return sb.toString();
    }

    private final void addPath(String p0) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.pathArgs);
        sb.append('/');
        sb.append(p0);
        this.pathArgs = sb.toString();
    }

    private final void addQuery(String p0, String p1) {
        String str = this.queryArgs.length() == 0 ? "?" : "&";
        StringBuilder sb = new StringBuilder();
        sb.append(this.queryArgs);
        sb.append(str);
        sb.append(p0);
        sb.append('=');
        sb.append(p1);
        this.queryArgs = sb.toString();
    }

    public final void appendPattern(int p0, String p1, NavType<Object> p2) {
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        int i = WhenMappings.$EnumSwitchMapping$0[computeParamType(p0, p2).ordinal()];
        if (i == 1) {
            StringBuilder sb = new StringBuilder("{");
            sb.append(p1);
            sb.append('}');
            addPath(sb.toString());
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder sb2 = new StringBuilder("{");
        sb2.append(p1);
        sb2.append('}');
        addQuery(p1, sb2.toString());
    }

    public final void appendArg(int p0, String p1, NavType<Object> p2, List<String> p3) {
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        int i = WhenMappings.$EnumSwitchMapping$0[computeParamType(p0, p2).ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = p3.iterator();
            while (it.hasNext()) {
                addQuery(p1, (String) it.next());
            }
            return;
        }
        if (p3.size() != 1) {
            StringBuilder sb = new StringBuilder("Expected one value for argument ");
            sb.append(p1);
            sb.append(", found ");
            sb.append(p3.size());
            sb.append("values instead.");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        addPath((String) CollectionsKt.first((List) p3));
    }

    private final ParamType computeParamType(int p0, NavType<Object> p1) {
        if ((p1 instanceof CollectionNavType) || this.serializer.getDescriptor().TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0)) {
            return ParamType.QUERY;
        }
        return ParamType.PATH;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/navigation/serialization/RouteBuilder$ParamType;", "", "<init>", "(Ljava/lang/String;I)V", "PATH", "QUERY"}, k = 1, mv = {2, 0, 0}, xi = 48)
    enum ParamType {
        PATH,
        QUERY;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        public static EnumEntries<ParamType> getEntries() {
            return $ENTRIES;
        }
    }
}
