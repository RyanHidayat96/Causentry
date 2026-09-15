package defpackage;

import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumErrorSource;
import com.datadog.android.rum.RumPerformanceMetric;
import com.datadog.android.rum.RumResourceKind;
import com.datadog.android.rum.RumResourceMethod;
import com.datadog.android.rum.internal.RumErrorSourceType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\"\u0007\u0005\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\"()*+,-./0123456789:;<=>?@ABCDEFGHI"}, d2 = {"LgetPreviewCapabilities;", "", "<init>", "()V", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "g", "d", "asInterface", "a", "notify", "onTransact", "cancelAll", "INotificationSideChannel", "cancel", "RemoteActionCompatParcelizer", "INotificationSideChannelStub", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "INotificationSideChannelDefault", "MediaBrowserCompat", "connect", "write", "read", "IconCompatParcelizer", "disconnect", "getExtras", "getNotifyChildrenChangedOptions", "getRoot", "getItem", "sendCustomAction", "getServiceComponent", FirebaseAnalytics.Event.SEARCH, "getSessionToken", "LgetPreviewCapabilities$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LgetPreviewCapabilities$TuitionPaymentFragmentbindingInflater1;", "LgetPreviewCapabilities$b;", "LgetPreviewCapabilities$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "LgetPreviewCapabilities$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LgetPreviewCapabilities$asBinder;", "LgetPreviewCapabilities$g;", "LgetPreviewCapabilities$d;", "LgetPreviewCapabilities$asInterface;", "LgetPreviewCapabilities$a;", "LgetPreviewCapabilities$notify;", "LgetPreviewCapabilities$onTransact;", "LgetPreviewCapabilities$cancelAll;", "LgetPreviewCapabilities$INotificationSideChannel;", "LgetPreviewCapabilities$cancel;", "LgetPreviewCapabilities$RemoteActionCompatParcelizer;", "LgetPreviewCapabilities$INotificationSideChannelStub;", "LgetPreviewCapabilities$INotificationSideChannelStubProxy;", "LgetPreviewCapabilities$getInterfaceDescriptor;", "LgetPreviewCapabilities$INotificationSideChannelDefault;", "LgetPreviewCapabilities$MediaBrowserCompat;", "LgetPreviewCapabilities$connect;", "LgetPreviewCapabilities$write;", "LgetPreviewCapabilities$read;", "LgetPreviewCapabilities$IconCompatParcelizer;", "LgetPreviewCapabilities$disconnect;", "LgetPreviewCapabilities$getExtras;", "LgetPreviewCapabilities$getNotifyChildrenChangedOptions;", "LgetPreviewCapabilities$getRoot;", "LgetPreviewCapabilities$getItem;", "LgetPreviewCapabilities$sendCustomAction;", "LgetPreviewCapabilities$getServiceComponent;", "LgetPreviewCapabilities$search;", "LgetPreviewCapabilities$getSessionToken;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class getPreviewCapabilities {
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1 */
    public abstract lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2();

    private getPreviewCapabilities() {
    }

    public /* synthetic */ getPreviewCapabilities(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0014\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"LgetPreviewCapabilities$read;", "LgetPreviewCapabilities;", "LonAppEdgeInvalidated;", "p0", "", "", "", "p1", "Llambdanew0androidxcameracoreMetadataImageReader;", "p2", "<init>", "(LonAppEdgeInvalidated;Ljava/util/Map;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/Map;", "b", "TuitionPaymentFragmentbindingInflater1", "Llambdanew0androidxcameracoreMetadataImageReader;", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LonAppEdgeInvalidated;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class read extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public final onAppEdgeInvalidated TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Map<String, Object> b;

        public /* synthetic */ read(onAppEdgeInvalidated onappedgeinvalidated, Map map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(onappedgeinvalidated, map, (i & 4) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(onAppEdgeInvalidated onappedgeinvalidated, Map<String, ? extends Object> map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(onappedgeinvalidated, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = onappedgeinvalidated;
            this.b = map;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof read)) {
                return false;
            }
            read readVar = (read) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, readVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, readVar.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, readVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            onAppEdgeInvalidated onappedgeinvalidated = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Map<String, Object> map = this.b;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("read(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(onappedgeinvalidated);
            sb.append(", b=");
            sb.append(map);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019R\u0014\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"LgetPreviewCapabilities$getItem;", "LgetPreviewCapabilities;", "LonAppEdgeInvalidated;", "p0", "", "", "", "p1", "Llambdanew0androidxcameracoreMetadataImageReader;", "p2", "<init>", "(LonAppEdgeInvalidated;Ljava/util/Map;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/Map;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Llambdanew0androidxcameracoreMetadataImageReader;", "()Llambdanew0androidxcameracoreMetadataImageReader;", "b", "LonAppEdgeInvalidated;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getItem extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        private final lambdanew0androidxcameracoreMetadataImageReader b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final Map<String, Object> TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final onAppEdgeInvalidated TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public /* synthetic */ getItem(onAppEdgeInvalidated onappedgeinvalidated, Map map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(onappedgeinvalidated, map, (i & 4) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public getItem(onAppEdgeInvalidated onappedgeinvalidated, Map<String, ? extends Object> map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(onappedgeinvalidated, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = onappedgeinvalidated;
            this.TuitionPaymentFragmentbindingInflater1 = map;
            this.b = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getItem)) {
                return false;
            }
            getItem getitem = (getItem) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getitem.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, getitem.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, getitem.b);
        }

        public final int hashCode() {
            return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.b.hashCode();
        }

        public final String toString() {
            onAppEdgeInvalidated onappedgeinvalidated = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Map<String, Object> map = this.TuitionPaymentFragmentbindingInflater1;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.b;
            StringBuilder sb = new StringBuilder("getItem(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(onappedgeinvalidated);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(map);
            sb.append(", b=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            setImageWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0] = setIso.b[0];
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u0014\u0010\u0018\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 "}, d2 = {"LgetPreviewCapabilities$connect;", "LgetPreviewCapabilities;", "Lcom/datadog/android/rum/RumActionType;", "p0", "", "p1", "", "p2", "", "", "p3", "Llambdanew0androidxcameracoreMetadataImageReader;", "p4", "<init>", "(Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;ZLjava/util/Map;Llambdanew0androidxcameracoreMetadataImageReader;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Llambdanew0androidxcameracoreMetadataImageReader;", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/rum/RumActionType;", "Z"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class connect extends getPreviewCapabilities {
        final Map<String, Object> TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final RumActionType b;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public /* synthetic */ connect(RumActionType rumActionType, String str, boolean z, Map map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rumActionType, str, z, map, (i & 16) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public connect(RumActionType rumActionType, String str, boolean z, Map<String, ? extends Object> map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(rumActionType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.b = rumActionType;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
            this.TuitionPaymentFragmentbindingInflater1 = map;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof connect)) {
                return false;
            }
            connect connectVar = (connect) p0;
            return this.b == connectVar.b && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, connectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == connectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, connectVar.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, connectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            return (((((((this.b.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            RumActionType rumActionType = this.b;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Map<String, Object> map = this.TuitionPaymentFragmentbindingInflater1;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("connect(b=");
            sb.append(rumActionType);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(z);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(map);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"LgetPreviewCapabilities$IconCompatParcelizer;", "LgetPreviewCapabilities;", "Lcom/datadog/android/rum/RumActionType;", "p0", "", "p1", "", "", "p2", "Llambdanew0androidxcameracoreMetadataImageReader;", "p3", "<init>", "(Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;Ljava/util/Map;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Llambdanew0androidxcameracoreMetadataImageReader;", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/RumActionType;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        private final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final RumActionType TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        final Map<String, Object> TuitionPaymentFragmentbindingInflater1;

        public /* synthetic */ IconCompatParcelizer(RumActionType rumActionType, String str, Map map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rumActionType, str, map, (i & 8) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(RumActionType rumActionType, String str, Map<String, ? extends Object> map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = rumActionType;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.TuitionPaymentFragmentbindingInflater1 = map;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) p0;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, iconCompatParcelizer.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            RumActionType rumActionType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode = rumActionType == null ? 0 : rumActionType.hashCode();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return (((((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            RumActionType rumActionType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Map<String, Object> map = this.TuitionPaymentFragmentbindingInflater1;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("IconCompatParcelizer(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(rumActionType);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(map);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0014\u0010\u001b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0014\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 "}, d2 = {"LgetPreviewCapabilities$write;", "LgetPreviewCapabilities;", "", "p0", "", "p1", "Lcom/datadog/android/rum/RumResourceMethod;", "p2", "", "p3", "Llambdanew0androidxcameracoreMetadataImageReader;", "p4", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lcom/datadog/android/rum/RumResourceMethod;Ljava/util/Map;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "Ljava/lang/Object;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/rum/RumResourceMethod;", "Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class write extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        final String b;
        final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final RumResourceMethod TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public /* synthetic */ write(Object obj, String str, RumResourceMethod rumResourceMethod, Map map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, str, rumResourceMethod, map, (i & 16) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private write(Object obj, String str, RumResourceMethod rumResourceMethod, Map<String, ? extends Object> map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(rumResourceMethod, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = obj;
            this.b = str;
            this.TuitionPaymentFragmentbindingInflater1 = rumResourceMethod;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = map;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public static /* synthetic */ write b(write writeVar, Map map) {
            Object obj = writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str = writeVar.b;
            RumResourceMethod rumResourceMethod = writeVar.TuitionPaymentFragmentbindingInflater1;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(rumResourceMethod, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            return new write(obj, str, rumResourceMethod, map, lambdanew0androidxcameracoremetadataimagereader);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof write)) {
                return false;
            }
            write writeVar = (write) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.b, writeVar.b) && this.TuitionPaymentFragmentbindingInflater1 == writeVar.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, writeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return (((((((this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str = this.b;
            RumResourceMethod rumResourceMethod = this.TuitionPaymentFragmentbindingInflater1;
            Map<String, Object> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("write(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(obj);
            sb.append(", b=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(rumResourceMethod);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(map);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"LgetPreviewCapabilities$search;", "LgetPreviewCapabilities;", "", "p0", "Llambdanew0androidxcameracoreMetadataImageReader;", "p1", "<init>", "(Ljava/lang/Object;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "b", "Ljava/lang/Object;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class search extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        private final lambdanew0androidxcameracoreMetadataImageReader b;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public /* synthetic */ search(Object obj, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private search(Object obj, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = obj;
            this.b = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof search)) {
                return false;
            }
            search searchVar = (search) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, searchVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, searchVar.b);
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() * 31) + this.b.hashCode();
        }

        public final String toString() {
            Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.b;
            StringBuilder sb = new StringBuilder("search(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(obj);
            sb.append(", b=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"LgetPreviewCapabilities$d;", "LgetPreviewCapabilities;", "", "p0", "LgetX;", "p1", "Llambdanew0androidxcameracoreMetadataImageReader;", "p2", "<init>", "(Ljava/lang/Object;LgetX;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "Ljava/lang/Object;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LgetX;", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class d extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final getX b;

        public /* synthetic */ d(Object obj, getX getx, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, getx, (i & 4) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(Object obj, getX getx, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(getx, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = obj;
            this.b = getx;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof d)) {
                return false;
            }
            d dVar = (d) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, dVar.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            getX getx = this.b;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("d(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(obj);
            sb.append(", b=");
            sb.append(getx);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0018\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0016\u0010$\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\""}, d2 = {"LgetPreviewCapabilities$disconnect;", "LgetPreviewCapabilities;", "", "p0", "", "p1", "p2", "Lcom/datadog/android/rum/RumResourceKind;", "p3", "", "", "p4", "Llambdanew0androidxcameracoreMetadataImageReader;", "p5", "<init>", "(Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/Object;", "Lcom/datadog/android/rum/RumResourceKind;", "Ljava/lang/Long;", "asBinder", "d"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class disconnect extends getPreviewCapabilities {
        public static int g = 810461673;

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        final Long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        final RumResourceKind b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
        final Long d;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public /* synthetic */ disconnect(Object obj, Long l, Long l2, RumResourceKind rumResourceKind, Map map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, l, l2, rumResourceKind, map, (i & 32) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private disconnect(Object obj, Long l, Long l2, RumResourceKind rumResourceKind, Map<String, ? extends Object> map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(rumResourceKind, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = obj;
            this.d = l;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = l2;
            this.b = rumResourceKind;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = map;
            this.TuitionPaymentFragmentbindingInflater1 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof disconnect)) {
                return false;
            }
            disconnect disconnectVar = (disconnect) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.d, disconnectVar.d) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.b == disconnectVar.b && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, disconnectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, disconnectVar.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            Long l = this.d;
            int iHashCode2 = l == null ? 0 : l.hashCode();
            Long l2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + (l2 != null ? l2.hashCode() : 0)) * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Long l = this.d;
            Long l2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            RumResourceKind rumResourceKind = this.b;
            Map<String, Object> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("disconnect(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(obj);
            sb.append(", d=");
            sb.append(l);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(l2);
            sb.append(", b=");
            sb.append(rumResourceKind);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(map);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\u00020\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u001fR\u0014\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\"\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u0014\u0010)\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"LgetPreviewCapabilities$getExtras;", "LgetPreviewCapabilities;", "", "p0", "", "p1", "", "p2", "Lcom/datadog/android/rum/RumErrorSource;", "p3", "", "p4", "", "p5", "Llambdanew0androidxcameracoreMetadataImageReader;", "p6", "<init>", "(Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/util/Map;", "TuitionPaymentFragmentbindingInflater1", "asInterface", "Llambdanew0androidxcameracoreMetadataImageReader;", "()Llambdanew0androidxcameracoreMetadataImageReader;", "b", "Ljava/lang/Object;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/RumErrorSource;", "Ljava/lang/Long;", "g", "Ljava/lang/Throwable;", "d"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getExtras extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        final Long g;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        final Map<String, Object> TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final RumErrorSource TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
        private final lambdanew0androidxcameracoreMetadataImageReader b;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        final Throwable d;

        public /* synthetic */ getExtras(Object obj, Long l, String str, RumErrorSource rumErrorSource, Throwable th, Map map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, l, str, rumErrorSource, th, map, (i & 64) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private getExtras(Object obj, Long l, String str, RumErrorSource rumErrorSource, Throwable th, Map<String, ? extends Object> map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(rumErrorSource, "");
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = obj;
            this.g = l;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = rumErrorSource;
            this.d = th;
            this.TuitionPaymentFragmentbindingInflater1 = map;
            this.b = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getExtras)) {
                return false;
            }
            getExtras getextras = (getExtras) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getextras.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.g, getextras.g) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getextras.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == getextras.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && Intrinsics.areEqual(this.d, getextras.d) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, getextras.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, getextras.b);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            Long l = this.g;
            return (((((((((((iHashCode * 31) + (l == null ? 0 : l.hashCode())) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.d.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.b.hashCode();
        }

        public final String toString() {
            Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Long l = this.g;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            RumErrorSource rumErrorSource = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Throwable th = this.d;
            Map<String, Object> map = this.TuitionPaymentFragmentbindingInflater1;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.b;
            StringBuilder sb = new StringBuilder("getExtras(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(obj);
            sb.append(", g=");
            sb.append(l);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(rumErrorSource);
            sb.append(", d=");
            sb.append(th);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(map);
            sb.append(", b=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001d\u001a\u00020\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R\u0014\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0014\u0010$\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0014\u0010 \u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010%R\u0014\u0010'\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u0016\u0010(\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"LgetPreviewCapabilities$getNotifyChildrenChangedOptions;", "LgetPreviewCapabilities;", "", "p0", "", "p1", "", "p2", "Lcom/datadog/android/rum/RumErrorSource;", "p3", "p4", "p5", "", "p6", "Llambdanew0androidxcameracoreMetadataImageReader;", "p7", "<init>", "(Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/Map;", "b", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "Llambdanew0androidxcameracoreMetadataImageReader;", "()Llambdanew0androidxcameracoreMetadataImageReader;", "Ljava/lang/Object;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/rum/RumErrorSource;", "asInterface", "asBinder", "d", "Ljava/lang/Long;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getNotifyChildrenChangedOptions extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final Map<String, Object> b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final RumErrorSource a;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
        final String asBinder;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final Long d;

        public /* synthetic */ getNotifyChildrenChangedOptions(Object obj, Long l, String str, RumErrorSource rumErrorSource, String str2, String str3, Map map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, l, str, rumErrorSource, str2, str3, map, (i & 128) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private getNotifyChildrenChangedOptions(Object obj, Long l, String str, RumErrorSource rumErrorSource, String str2, String str3, Map<String, ? extends Object> map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(rumErrorSource, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = obj;
            this.d = l;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.a = rumErrorSource;
            this.asBinder = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str3;
            this.b = map;
            this.TuitionPaymentFragmentbindingInflater1 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getNotifyChildrenChangedOptions)) {
                return false;
            }
            getNotifyChildrenChangedOptions getnotifychildrenchangedoptions = (getNotifyChildrenChangedOptions) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getnotifychildrenchangedoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.d, getnotifychildrenchangedoptions.d) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getnotifychildrenchangedoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.a == getnotifychildrenchangedoptions.a && Intrinsics.areEqual(this.asBinder, getnotifychildrenchangedoptions.asBinder) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getnotifychildrenchangedoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.b, getnotifychildrenchangedoptions.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, getnotifychildrenchangedoptions.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            Long l = this.d;
            int iHashCode2 = l == null ? 0 : l.hashCode();
            int iHashCode3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            int iHashCode4 = this.a.hashCode();
            int iHashCode5 = this.asBinder.hashCode();
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Long l = this.d;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            RumErrorSource rumErrorSource = this.a;
            String str2 = this.asBinder;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Map<String, Object> map = this.b;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("getNotifyChildrenChangedOptions(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(obj);
            sb.append(", d=");
            sb.append(l);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", a=");
            sb.append(rumErrorSource);
            sb.append(", asBinder=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str3);
            sb.append(", b=");
            sb.append(map);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001f\u0010 R\"\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010(\u001a\u00020\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010$\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010)R\u0014\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010*R\u0014\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010+R\u0014\u0010,\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00100\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00102\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u00104R\u0016\u00105\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010*"}, d2 = {"LgetPreviewCapabilities$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "LgetPreviewCapabilities;", "", "p0", "Lcom/datadog/android/rum/RumErrorSource;", "p1", "", "p2", "p3", "", "p4", "", "", "p5", "Llambdanew0androidxcameracoreMetadataImageReader;", "p6", "p7", "Lcom/datadog/android/rum/internal/RumErrorSourceType;", "p8", "", "LisImageFormatSupported;", "p9", "", "p10", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/lang/String;ZLjava/util/Map;Llambdanew0androidxcameracoreMetadataImageReader;Ljava/lang/String;Lcom/datadog/android/rum/internal/RumErrorSourceType;Ljava/util/List;Ljava/lang/Long;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "b", "Z", "Ljava/lang/String;", "Lcom/datadog/android/rum/RumErrorSource;", "asInterface", "Lcom/datadog/android/rum/internal/RumErrorSourceType;", "a", "g", "asBinder", "Ljava/util/List;", "d", "Ljava/lang/Throwable;", "Ljava/lang/Long;", "cancelAll"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final RumErrorSource TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final lambdanew0androidxcameracoreMetadataImageReader b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String g;

        /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
        public final List<isImageFormatSupported> a;
        public final RumErrorSourceType asInterface;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;
        public final String cancelAll;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final Throwable asBinder;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public final Long d;

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, RumErrorSource rumErrorSource, Throwable th, String str2, boolean z, Map map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, String str3, RumErrorSourceType rumErrorSourceType, List list, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, rumErrorSource, th, str2, z, map, (i & 64) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? RumErrorSourceType.ANDROID : rumErrorSourceType, list, (i & 1024) != 0 ? null : l);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, RumErrorSource rumErrorSource, Throwable th, String str2, boolean z, Map<String, ? extends Object> map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, String str3, RumErrorSourceType rumErrorSourceType, List<isImageFormatSupported> list, Long l) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(rumErrorSource, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            Intrinsics.checkNotNullParameter(rumErrorSourceType, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = rumErrorSource;
            this.asBinder = th;
            this.g = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = map;
            this.b = lambdanew0androidxcameracoremetadataimagereader;
            this.cancelAll = str3;
            this.asInterface = rumErrorSourceType;
            this.a = list;
            this.d = l;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Intrinsics.areEqual(this.asBinder, tuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder) && Intrinsics.areEqual(this.g, tuitionPaymentFragmentspecialinlinedviewModeldefault2.g) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, tuitionPaymentFragmentspecialinlinedviewModeldefault2.b) && Intrinsics.areEqual(this.cancelAll, tuitionPaymentFragmentspecialinlinedviewModeldefault2.cancelAll) && this.asInterface == tuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface && Intrinsics.areEqual(this.a, tuitionPaymentFragmentspecialinlinedviewModeldefault2.a) && Intrinsics.areEqual(this.d, tuitionPaymentFragmentspecialinlinedviewModeldefault2.d);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            Throwable th = this.asBinder;
            int iHashCode3 = th == null ? 0 : th.hashCode();
            String str = this.g;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            int iHashCode5 = Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int iHashCode6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            int iHashCode7 = this.b.hashCode();
            String str2 = this.cancelAll;
            int iHashCode8 = str2 == null ? 0 : str2.hashCode();
            int iHashCode9 = this.asInterface.hashCode();
            int iHashCode10 = this.a.hashCode();
            Long l = this.d;
            return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            RumErrorSource rumErrorSource = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Throwable th = this.asBinder;
            String str2 = this.g;
            boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Map<String, Object> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.b;
            String str3 = this.cancelAll;
            RumErrorSourceType rumErrorSourceType = this.asInterface;
            List<isImageFormatSupported> list = this.a;
            Long l = this.d;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(rumErrorSource);
            sb.append(", asBinder=");
            sb.append(th);
            sb.append(", g=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(z);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(map);
            sb.append(", b=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(", cancelAll=");
            sb.append(str3);
            sb.append(", asInterface=");
            sb.append(rumErrorSourceType);
            sb.append(", a=");
            sb.append(list);
            sb.append(", d=");
            sb.append(l);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"LgetPreviewCapabilities$INotificationSideChannelStubProxy;", "LgetPreviewCapabilities;", "", "p0", "Llambdanew0androidxcameracoreMetadataImageReader;", "p1", "<init>", "(Ljava/lang/String;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Llambdanew0androidxcameracoreMetadataImageReader;", "()Llambdanew0androidxcameracoreMetadataImageReader;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelStubProxy extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        private final lambdanew0androidxcameracoreMetadataImageReader b;
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public /* synthetic */ INotificationSideChannelStubProxy(String str, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private INotificationSideChannelStubProxy(String str, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.b = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof INotificationSideChannelStubProxy)) {
                return false;
            }
            INotificationSideChannelStubProxy iNotificationSideChannelStubProxy = (INotificationSideChannelStubProxy) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, iNotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.b, iNotificationSideChannelStubProxy.b);
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + this.b.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.b;
            StringBuilder sb = new StringBuilder("INotificationSideChannelStubProxy(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", b=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"LgetPreviewCapabilities$TuitionPaymentFragmentbindingInflater1;", "LgetPreviewCapabilities;", "", "p0", "", "p1", "Llambdanew0androidxcameracoreMetadataImageReader;", "p2", "<init>", "(Ljava/lang/String;ILlambdanew0androidxcameracoreMetadataImageReader;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentbindingInflater1 extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        private final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        public /* synthetic */ TuitionPaymentFragmentbindingInflater1(String str, int i, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private TuitionPaymentFragmentbindingInflater1(String str, int i, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentbindingInflater1)) {
                return false;
            }
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return (((this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + Integer.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(i);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"LgetPreviewCapabilities$onTransact;", "LgetPreviewCapabilities;", "", "p0", "Llambdanew0androidxcameracoreMetadataImageReader;", "p1", "<init>", "(Ljava/lang/String;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class onTransact extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        private final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public /* synthetic */ onTransact(String str, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private onTransact(String str, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof onTransact)) {
                return false;
            }
            onTransact ontransact = (onTransact) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ontransact.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ontransact.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("onTransact(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"LgetPreviewCapabilities$cancel;", "LgetPreviewCapabilities;", "", "p0", "", "p1", "Llambdanew0androidxcameracoreMetadataImageReader;", "p2", "<init>", "(Ljava/lang/String;ZLlambdanew0androidxcameracoreMetadataImageReader;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class cancel extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private final lambdanew0androidxcameracoreMetadataImageReader b;

        public /* synthetic */ cancel(String str, boolean z, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private cancel(String str, boolean z, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
            this.b = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof cancel)) {
                return false;
            }
            cancel cancelVar = (cancel) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && Intrinsics.areEqual(this.b, cancelVar.b);
        }

        public final int hashCode() {
            return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 31) + this.b.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.b;
            StringBuilder sb = new StringBuilder("cancel(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(z);
            sb.append(", b=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"LgetPreviewCapabilities$INotificationSideChannelStub;", "LgetPreviewCapabilities;", "", "p0", "Llambdanew0androidxcameracoreMetadataImageReader;", "p1", "<init>", "(Ljava/lang/String;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelStub extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        private final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentbindingInflater1;

        public /* synthetic */ INotificationSideChannelStub(String str, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private INotificationSideChannelStub(String str, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof INotificationSideChannelStub)) {
                return false;
            }
            INotificationSideChannelStub iNotificationSideChannelStub = (INotificationSideChannelStub) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, iNotificationSideChannelStub.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, iNotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("INotificationSideChannelStub(TuitionPaymentFragmentbindingInflater1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"LgetPreviewCapabilities$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LgetPreviewCapabilities;", "", "p0", "Llambdanew0androidxcameracoreMetadataImageReader;", "p1", "<init>", "(Ljava/lang/String;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private final lambdanew0androidxcameracoreMetadataImageReader b;

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.b = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.b, tuitionPaymentFragmentspecialinlinedviewModeldefault3.b);
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + this.b.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.b;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(str);
            sb.append(", b=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"LgetPreviewCapabilities$notify;", "LgetPreviewCapabilities;", "", "p0", "Llambdanew0androidxcameracoreMetadataImageReader;", "p1", "<init>", "(Ljava/lang/String;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class notify extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        private final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public /* synthetic */ notify(String str, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private notify(String str, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.TuitionPaymentFragmentbindingInflater1 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof notify)) {
                return false;
            }
            notify notifyVar = (notify) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, notifyVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, notifyVar.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("notify(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"LgetPreviewCapabilities$INotificationSideChannel;", "LgetPreviewCapabilities;", "", "p0", "", "p1", "Llambdanew0androidxcameracoreMetadataImageReader;", "p2", "<init>", "(Ljava/lang/String;ZLlambdanew0androidxcameracoreMetadataImageReader;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannel extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public /* synthetic */ INotificationSideChannel(String str, boolean z, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private INotificationSideChannel(String str, boolean z, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof INotificationSideChannel)) {
                return false;
            }
            INotificationSideChannel iNotificationSideChannel = (INotificationSideChannel) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() * 31) + Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("INotificationSideChannel(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(z);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012"}, d2 = {"LgetPreviewCapabilities$RemoteActionCompatParcelizer;", "LgetPreviewCapabilities;", "Llambdanew0androidxcameracoreMetadataImageReader;", "p0", "<init>", "(Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Llambdanew0androidxcameracoreMetadataImageReader;", "()Llambdanew0androidxcameracoreMetadataImageReader;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer extends getPreviewCapabilities {
        private final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentbindingInflater1;

        public /* synthetic */ RemoteActionCompatParcelizer(lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private RemoteActionCompatParcelizer(lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentbindingInflater1 = lambdanew0androidxcameracoremetadataimagereader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteActionCompatParcelizer() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof RemoteActionCompatParcelizer) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, ((RemoteActionCompatParcelizer) p0).TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("RemoteActionCompatParcelizer(TuitionPaymentFragmentbindingInflater1=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"LgetPreviewCapabilities$cancelAll;", "LgetPreviewCapabilities;", "Llambdanew0androidxcameracoreMetadataImageReader;", "p0", "<init>", "(Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class cancelAll extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        private final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public /* synthetic */ cancelAll(lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private cancelAll(lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdanew0androidxcameracoremetadataimagereader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public cancelAll() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof cancelAll) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((cancelAll) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("cancelAll(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017"}, d2 = {"LgetPreviewCapabilities$a;", "LgetPreviewCapabilities;", "Llambdanew0androidxcameracoreMetadataImageReader;", "p0", "", "p1", "<init>", "(Llambdanew0androidxcameracoreMetadataImageReader;J)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "Llambdanew0androidxcameracoreMetadataImageReader;", "()Llambdanew0androidxcameracoreMetadataImageReader;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class a extends getPreviewCapabilities {
        final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentbindingInflater1 = lambdanew0androidxcameracoremetadataimagereader;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof a)) {
                return false;
            }
            a aVar = (a) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, aVar.TuitionPaymentFragmentbindingInflater1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == aVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final String toString() {
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentbindingInflater1;
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("a(TuitionPaymentFragmentbindingInflater1=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"LgetPreviewCapabilities$b;", "LgetPreviewCapabilities;", "", "p0", "Llambdanew0androidxcameracoreMetadataImageReader;", "p1", "<init>", "(Ljava/lang/String;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class b extends getPreviewCapabilities {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public static int b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final String b;

        public /* synthetic */ b(String str, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private b(String str, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.b = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof b)) {
                return false;
            }
            b bVar = (b) p0;
            return Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            return (this.b.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            String str = this.b;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("b(b=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i2 = i % 7135672;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
            if (i2 != 0) {
                return b;
            }
            int i3 = (int) Runtime.getRuntime().totalMemory();
            b = i3;
            return i3;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016"}, d2 = {"LgetPreviewCapabilities$asInterface;", "LgetPreviewCapabilities;", "", "p0", "Llambdanew0androidxcameracoreMetadataImageReader;", "p1", "<init>", "(ZLlambdanew0androidxcameracoreMetadataImageReader;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Z"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class asInterface extends getPreviewCapabilities {
        public final boolean TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public /* synthetic */ asInterface(boolean z, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private asInterface(boolean z, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentbindingInflater1 = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof asInterface)) {
                return false;
            }
            asInterface asinterface = (asInterface) p0;
            return this.TuitionPaymentFragmentbindingInflater1 == asinterface.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return (Boolean.hashCode(this.TuitionPaymentFragmentbindingInflater1) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            boolean z = this.TuitionPaymentFragmentbindingInflater1;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("asInterface(TuitionPaymentFragmentbindingInflater1=");
            sb.append(z);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019"}, d2 = {"LgetPreviewCapabilities$g;", "LgetPreviewCapabilities;", "", "p0", "", "p1", "Llambdanew0androidxcameracoreMetadataImageReader;", "p2", "<init>", "(JLjava/lang/String;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "Ljava/lang/String;", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class g extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentbindingInflater1;

        public /* synthetic */ g(long j, String str, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, str, (i & 4) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private g(long j, String str, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
            this.b = str;
            this.TuitionPaymentFragmentbindingInflater1 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof g)) {
                return false;
            }
            g gVar = (g) p0;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == gVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Intrinsics.areEqual(this.b, gVar.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, gVar.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            return (((Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str = this.b;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("g(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(j);
            sb.append(", b=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"LgetPreviewCapabilities$INotificationSideChannelDefault;", "LgetPreviewCapabilities;", "Llambdanew0androidxcameracoreMetadataImageReader;", "p0", "<init>", "(Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class INotificationSideChannelDefault extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        private final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentbindingInflater1;

        public /* synthetic */ INotificationSideChannelDefault(lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private INotificationSideChannelDefault(lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentbindingInflater1 = lambdanew0androidxcameracoremetadataimagereader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public INotificationSideChannelDefault() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof INotificationSideChannelDefault) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, ((INotificationSideChannelDefault) p0).TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("INotificationSideChannelDefault(TuitionPaymentFragmentbindingInflater1=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019"}, d2 = {"LgetPreviewCapabilities$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LgetPreviewCapabilities;", "", "p0", "", "p1", "Llambdanew0androidxcameracoreMetadataImageReader;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/Object;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        private final lambdanew0androidxcameracoreMetadataImageReader b;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, Object obj, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, obj, (i & 4) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, Object obj, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = obj;
            this.b = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TuitionPaymentFragmentspecialinlinedviewModeldefault1) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, tuitionPaymentFragmentspecialinlinedviewModeldefault1.b);
        }

        public final int hashCode() {
            return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.b.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.b;
            StringBuilder sb = new StringBuilder("TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(obj);
            sb.append(", b=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017"}, d2 = {"LgetPreviewCapabilities$asBinder;", "LgetPreviewCapabilities;", "", "", "", "p0", "Llambdanew0androidxcameracoreMetadataImageReader;", "p1", "<init>", "(Ljava/util/Map;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/Map;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class asBinder extends getPreviewCapabilities {
        public final Map<String, Object> TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        private final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public /* synthetic */ asBinder(Map map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(map, (i & 2) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private asBinder(Map<String, ? extends Object> map, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentbindingInflater1 = map;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof asBinder)) {
                return false;
            }
            asBinder asbinder = (asBinder) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, asbinder.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            Map<String, Object> map = this.TuitionPaymentFragmentbindingInflater1;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("asBinder(TuitionPaymentFragmentbindingInflater1=");
            sb.append(map);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"LgetPreviewCapabilities$getRoot;", "LgetPreviewCapabilities;", "Llambdanew0androidxcameracoreMetadataImageReader;", "p0", "<init>", "(Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getRoot extends getPreviewCapabilities {
        private final lambdanew0androidxcameracoreMetadataImageReader b;

        public /* synthetic */ getRoot(lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private getRoot(lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.b = lambdanew0androidxcameracoremetadataimagereader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public getRoot() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof getRoot) && Intrinsics.areEqual(this.b, ((getRoot) p0).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.b;
            StringBuilder sb = new StringBuilder("getRoot(b=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"LgetPreviewCapabilities$getServiceComponent;", "LgetPreviewCapabilities;", "Lcom/datadog/android/rum/RumPerformanceMetric;", "p0", "", "p1", "Llambdanew0androidxcameracoreMetadataImageReader;", "p2", "<init>", "(Lcom/datadog/android/rum/RumPerformanceMetric;DLlambdanew0androidxcameracoreMetadataImageReader;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/rum/RumPerformanceMetric;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "D"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getServiceComponent extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        private final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final RumPerformanceMetric TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public final double TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public /* synthetic */ getServiceComponent(RumPerformanceMetric rumPerformanceMetric, double d, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rumPerformanceMetric, d, (i & 4) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private getServiceComponent(RumPerformanceMetric rumPerformanceMetric, double d, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(rumPerformanceMetric, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = rumPerformanceMetric;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = d;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getServiceComponent)) {
                return false;
            }
            getServiceComponent getservicecomponent = (getServiceComponent) p0;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == getservicecomponent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getservicecomponent.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == 0 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getservicecomponent.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            RumPerformanceMetric rumPerformanceMetric = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            double d = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("getServiceComponent(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(rumPerformanceMetric);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(d);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017"}, d2 = {"LgetPreviewCapabilities$MediaBrowserCompat;", "LgetPreviewCapabilities;", "", "p0", "p1", "Llambdanew0androidxcameracoreMetadataImageReader;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Llambdanew0androidxcameracoreMetadataImageReader;", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class MediaBrowserCompat extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        private final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public /* synthetic */ MediaBrowserCompat(String str, String str2, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private MediaBrowserCompat(String str, String str2, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof MediaBrowserCompat)) {
                return false;
            }
            MediaBrowserCompat mediaBrowserCompat = (MediaBrowserCompat) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, mediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, mediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, mediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("MediaBrowserCompat(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(str);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(str2);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"LgetPreviewCapabilities$getSessionToken;", "LgetPreviewCapabilities;", "Llambdanew0androidxcameracoreMetadataImageReader;", "p0", "<init>", "(Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentbindingInflater1", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getSessionToken extends getPreviewCapabilities {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private getSessionToken(lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public /* synthetic */ getSessionToken(lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public getSessionToken() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof getSessionToken) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((getSessionToken) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("getSessionToken(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016"}, d2 = {"LgetPreviewCapabilities$sendCustomAction;", "LgetPreviewCapabilities;", "LLayoutSettings;", "p0", "Llambdanew0androidxcameracoreMetadataImageReader;", "p1", "<init>", "(LLayoutSettings;Llambdanew0androidxcameracoreMetadataImageReader;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LLayoutSettings;", "TuitionPaymentFragmentbindingInflater1", "Llambdanew0androidxcameracoreMetadataImageReader;", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class sendCustomAction extends getPreviewCapabilities {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final LayoutSettings TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public /* synthetic */ sendCustomAction(LayoutSettings layoutSettings, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(layoutSettings, (i & 2) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private sendCustomAction(LayoutSettings layoutSettings, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(layoutSettings, "");
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = layoutSettings;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof sendCustomAction)) {
                return false;
            }
            sendCustomAction sendcustomaction = (sendCustomAction) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, sendcustomaction.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, sendcustomaction.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            LayoutSettings layoutSettings = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("sendCustomAction(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
            sb.append(layoutSettings);
            sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"LgetPreviewCapabilities$getInterfaceDescriptor;", "LgetPreviewCapabilities;", "", "p0", "Llambdanew0androidxcameracoreMetadataImageReader;", "p1", "<init>", "(ZLlambdanew0androidxcameracoreMetadataImageReader;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Llambdanew0androidxcameracoreMetadataImageReader;", "()Llambdanew0androidxcameracoreMetadataImageReader;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Z", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class getInterfaceDescriptor extends getPreviewCapabilities {
        private final lambdanew0androidxcameracoreMetadataImageReader TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public final boolean b;

        public /* synthetic */ getInterfaceDescriptor(boolean z, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? new lambdanew0androidxcameracoreMetadataImageReader(0L, 0L, 3, null) : lambdanew0androidxcameracoremetadataimagereader);
        }

        @Override // defpackage.getPreviewCapabilities
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
        public final lambdanew0androidxcameracoreMetadataImageReader getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private getInterfaceDescriptor(boolean z, lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader) {
            super(null);
            Intrinsics.checkNotNullParameter(lambdanew0androidxcameracoremetadataimagereader, "");
            this.b = z;
            this.TuitionPaymentFragmentbindingInflater1 = lambdanew0androidxcameracoremetadataimagereader;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof getInterfaceDescriptor)) {
                return false;
            }
            getInterfaceDescriptor getinterfacedescriptor = (getInterfaceDescriptor) p0;
            return this.b == getinterfacedescriptor.b && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, getinterfacedescriptor.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            return (Boolean.hashCode(this.b) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            boolean z = this.b;
            lambdanew0androidxcameracoreMetadataImageReader lambdanew0androidxcameracoremetadataimagereader = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("getInterfaceDescriptor(b=");
            sb.append(z);
            sb.append(", TuitionPaymentFragmentbindingInflater1=");
            sb.append(lambdanew0androidxcameracoremetadataimagereader);
            sb.append(")");
            return sb.toString();
        }
    }
}
