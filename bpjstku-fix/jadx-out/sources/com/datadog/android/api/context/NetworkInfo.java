package com.datadog.android.api.context;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e!BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0016\u0010 \u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0017"}, d2 = {"Lcom/datadog/android/api/context/NetworkInfo;", "", "Lcom/datadog/android/api/context/NetworkInfo$Connectivity;", "p0", "", "p1", "", "p2", "p3", "p4", "p5", "p6", "<init>", "(Lcom/datadog/android/api/context/NetworkInfo$Connectivity;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/Long;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/api/context/NetworkInfo$Connectivity;", "asInterface", "b", "g", "a", "Connectivity"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class NetworkInfo {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final Connectivity TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final Long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Long asInterface;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final Long b;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final Long a;

    public NetworkInfo(Connectivity connectivity, String str, Long l, Long l2, Long l3, Long l4, String str2) {
        Intrinsics.checkNotNullParameter(connectivity, "");
        this.TuitionPaymentFragmentbindingInflater1 = connectivity;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = l;
        this.asInterface = l2;
        this.b = l3;
        this.a = l4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
    }

    public /* synthetic */ NetworkInfo(Connectivity connectivity, String str, Long l, Long l2, Long l3, Long l4, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Connectivity.NETWORK_NOT_CONNECTED : connectivity, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : l3, (i & 32) != 0 ? null : l4, (i & 64) == 0 ? str2 : null);
    }

    public NetworkInfo() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof NetworkInfo)) {
            return false;
        }
        NetworkInfo networkInfo = (NetworkInfo) p0;
        return this.TuitionPaymentFragmentbindingInflater1 == networkInfo.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.asInterface, networkInfo.asInterface) && Intrinsics.areEqual(this.b, networkInfo.b) && Intrinsics.areEqual(this.a, networkInfo.a) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, networkInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final int hashCode() {
        int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Long l = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Long l2 = this.asInterface;
        int iHashCode4 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.b;
        int iHashCode5 = l3 == null ? 0 : l3.hashCode();
        Long l4 = this.a;
        int iHashCode6 = l4 == null ? 0 : l4.hashCode();
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Connectivity connectivity = this.TuitionPaymentFragmentbindingInflater1;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Long l = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Long l2 = this.asInterface;
        Long l3 = this.b;
        Long l4 = this.a;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb = new StringBuilder("NetworkInfo(TuitionPaymentFragmentbindingInflater1=");
        sb.append(connectivity);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(l);
        sb.append(", asInterface=");
        sb.append(l2);
        sb.append(", b=");
        sb.append(l3);
        sb.append(", a=");
        sb.append(l4);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: com.datadog.android.api.context.NetworkInfo$b, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/api/context/NetworkInfo$b;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/api/context/NetworkInfo;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/api/context/NetworkInfo;", "Lcom/google/gson/JsonObject;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/api/context/NetworkInfo;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static NetworkInfo TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) throws JsonParseException {
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                JsonObject asJsonObject = JsonParser.parseString(p0).getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                return TuitionPaymentFragmentbindingInflater1(asJsonObject);
            } catch (IllegalStateException e2) {
                throw new JsonParseException("Unable to parse json into type NetworkInfo", e2);
            }
        }

        @JvmStatic
        private static NetworkInfo TuitionPaymentFragmentbindingInflater1(JsonObject p0) throws JsonParseException {
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                Connectivity.Companion companion = Connectivity.INSTANCE;
                String asString = p0.get("connectivity").getAsString();
                Intrinsics.checkNotNullExpressionValue(asString, "");
                Connectivity connectivityTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Connectivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asString);
                JsonElement jsonElement = p0.get("carrier_name");
                String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                JsonElement jsonElement2 = p0.get("carrier_id");
                Long lValueOf = jsonElement2 != null ? Long.valueOf(jsonElement2.getAsLong()) : null;
                JsonElement jsonElement3 = p0.get("up_kbps");
                Long lValueOf2 = jsonElement3 != null ? Long.valueOf(jsonElement3.getAsLong()) : null;
                JsonElement jsonElement4 = p0.get("down_kbps");
                Long lValueOf3 = jsonElement4 != null ? Long.valueOf(jsonElement4.getAsLong()) : null;
                JsonElement jsonElement5 = p0.get("strength");
                Long lValueOf4 = jsonElement5 != null ? Long.valueOf(jsonElement5.getAsLong()) : null;
                JsonElement jsonElement6 = p0.get("cellular_technology");
                return new NetworkInfo(connectivityTuitionPaymentFragmentspecialinlinedviewModeldefault1, asString2, lValueOf, lValueOf2, lValueOf3, lValueOf4, jsonElement6 != null ? jsonElement6.getAsString() : null);
            } catch (IllegalStateException e2) {
                throw new JsonParseException("Unable to parse json into type NetworkInfo", e2);
            } catch (NullPointerException e3) {
                throw new JsonParseException("Unable to parse json into type NetworkInfo", e3);
            } catch (NumberFormatException e4) {
                throw new JsonParseException("Unable to parse json into type NetworkInfo", e4);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/datadog/android/api/context/NetworkInfo$Connectivity;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "jsonValue", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asBinder", "asInterface", "cancelAll", "onTransact", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentbindingInflater1", "g", "d", "cancel"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Connectivity {
        NETWORK_NOT_CONNECTED("network_not_connected"),
        NETWORK_ETHERNET("network_ethernet"),
        NETWORK_WIFI("network_wifi"),
        NETWORK_WIMAX("network_wimax"),
        NETWORK_BLUETOOTH("network_bluetooth"),
        NETWORK_2G("network_2G"),
        NETWORK_3G("network_3G"),
        NETWORK_4G("network_4G"),
        NETWORK_5G("network_5G"),
        NETWORK_MOBILE_OTHER("network_mobile_other"),
        NETWORK_CELLULAR("network_cellular"),
        NETWORK_OTHER("network_other");


        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public final String jsonValue;

        Connectivity(String str) {
            this.jsonValue = str;
        }

        /* JADX INFO: renamed from: com.datadog.android.api.context.NetworkInfo$Connectivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/api/context/NetworkInfo$Connectivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/api/context/NetworkInfo$Connectivity;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Lcom/datadog/android/api/context/NetworkInfo$Connectivity;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public static Connectivity TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) throws JsonParseException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    for (Connectivity connectivity : Connectivity.values()) {
                        if (Intrinsics.areEqual(connectivity.jsonValue, p0)) {
                            return connectivity;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (NoSuchElementException e2) {
                    throw new JsonParseException("Unable to parse json into type NetworkInfo.Connectivity", e2);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}
