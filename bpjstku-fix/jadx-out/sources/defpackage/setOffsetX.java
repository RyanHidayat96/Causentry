package defpackage;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001e"}, d2 = {"LsetOffsetX;", "", "", "p0", "", "p1", "p2", "", "p3", "p4", "p5", "<init>", "(IJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "asBinder", "Ljava/lang/String;", "b", "d", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/Long;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "J", "g"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class setOffsetX {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    final String TuitionPaymentFragmentbindingInflater1;
    final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    final long g;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final String b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    final Long TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public setOffsetX(int i, long j, Long l, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        this.g = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = l;
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.b = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setOffsetX)) {
            return false;
        }
        setOffsetX setoffsetx = (setOffsetX) p0;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == setoffsetx.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.g == setoffsetx.g && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, setoffsetx.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, setoffsetx.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, setoffsetx.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, setoffsetx.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int iHashCode2 = Long.hashCode(this.g);
        Long l = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (l == null ? 0 : l.hashCode())) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
    }

    public final String toString() {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j = this.g;
        Long l = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str = this.TuitionPaymentFragmentbindingInflater1;
        String str2 = this.b;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb = new StringBuilder("setOffsetX(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(i);
        sb.append(", g=");
        sb.append(j);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(l);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str);
        sb.append(", b=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: setOffsetX$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LsetOffsetX$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "", "p0", "LsetOffsetX;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)LsetOffsetX;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static setOffsetX TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) throws JsonParseException, IllegalStateException {
            Intrinsics.checkNotNullParameter(p0, "");
            JsonObject asJsonObject = JsonParser.parseString(p0).getAsJsonObject();
            int asInt = asJsonObject.get("signal").getAsInt();
            long asLong = asJsonObject.get("timestamp").getAsLong();
            JsonElement jsonElement = asJsonObject.get("time_since_app_start_ms");
            Long lValueOf = (jsonElement == null || (jsonElement instanceof JsonNull)) ? null : Long.valueOf(jsonElement.getAsLong());
            String asString = asJsonObject.get("signal_name").getAsString();
            Intrinsics.checkNotNullExpressionValue(asString, "");
            String asString2 = asJsonObject.get("message").getAsString();
            Intrinsics.checkNotNullExpressionValue(asString2, "");
            String asString3 = asJsonObject.get("stacktrace").getAsString();
            Intrinsics.checkNotNullExpressionValue(asString3, "");
            return new setOffsetX(asInt, asLong, lValueOf, asString, asString2, asString3);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
