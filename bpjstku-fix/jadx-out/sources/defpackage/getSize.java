package defpackage;

import com.datadog.android.api.InternalLogger;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\b0\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\f"}, d2 = {"LgetSize;", "", "<init>", "()V", "Lcom/google/gson/JsonObject;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lcom/google/gson/JsonObject;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "LgetSize$TuitionPaymentFragmentspecialinlinedviewModeldefault2;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class getSize {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract String TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    private getSize() {
    }

    public JsonObject TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        return jsonObject;
    }

    public /* synthetic */ getSize(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends getSize {
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "view";
        }

        @Override // defpackage.getSize
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        @Override // defpackage.getSize
        public final JsonObject TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            JsonObject jsonObjectTuitionPaymentFragmentspecialinlinedviewModeldefault3 = super.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            jsonObjectTuitionPaymentFragmentspecialinlinedviewModeldefault3.addProperty("viewId", this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            jsonObjectTuitionPaymentFragmentspecialinlinedviewModeldefault3.addProperty("documentVersion", Long.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            return jsonObjectTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) obj;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("View(viewId=");
            sb.append(str);
            sb.append(", documentVersion=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: getSize$b, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"LgetSize$b;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/api/InternalLogger;", "p1", "LgetSize;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)LgetSize;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getSize TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0, InternalLogger p1) throws JsonParseException {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            try {
                JsonObject asJsonObject = JsonParser.parseString(p0).getAsJsonObject();
                final String asString = asJsonObject.get("type").getAsString();
                if (Intrinsics.areEqual(asString, "view")) {
                    String asString2 = asJsonObject.get("viewId").getAsString();
                    long asLong = asJsonObject.get("documentVersion").getAsLong();
                    Intrinsics.checkNotNullExpressionValue(asString2, "");
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(asString2, asLong);
                } else {
                    p1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventMeta$Companion$fromJson$1
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            String str = String.format(Locale.US, "Unknown RUM event meta type value [%s]", Arrays.copyOf(new Object[]{asString}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "");
                            return str;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, null, false, null);
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                }
                return tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } catch (ClassCastException e2) {
                throw new JsonParseException("Unable to parse json into RUM event meta", e2);
            } catch (IllegalStateException e3) {
                throw new JsonParseException("Unable to parse json into RUM event meta", e3);
            } catch (NullPointerException e4) {
                throw new JsonParseException("Unable to parse json into RUM event meta", e4);
            } catch (NumberFormatException e5) {
                throw new JsonParseException("Unable to parse json into RUM event meta", e5);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
