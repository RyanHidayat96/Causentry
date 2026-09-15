package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"LgetOrCreateCameraXInstancelambda18lambda17lambda16lambda15;", "", "Lorg/json/JSONObject;", "p0", "<init>", "(Lorg/json/JSONObject;)V", "", "toString", "()Ljava/lang/String;", "b", "Lorg/json/JSONObject;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class getOrCreateCameraXInstancelambda18lambda17lambda16lambda15 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final getOrCreateCameraXInstancelambda18lambda17lambda16lambda15 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final JSONObject b;

    private getOrCreateCameraXInstancelambda18lambda17lambda16lambda15(JSONObject jSONObject) {
        this.b = jSONObject;
    }

    /* JADX INFO: renamed from: getOrCreateCameraXInstancelambda18lambda17lambda16lambda15$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"LgetOrCreateCameraXInstancelambda18lambda17lambda16lambda15$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "LgetOrCreateCameraXInstancelambda18lambda17lambda16lambda15;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LgetOrCreateCameraXInstancelambda18lambda17lambda16lambda15;", "TuitionPaymentFragmentbindingInflater1", "()LgetOrCreateCameraXInstancelambda18lambda17lambda16lambda15;", "b"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getOrCreateCameraXInstancelambda18lambda17lambda16lambda15 TuitionPaymentFragmentbindingInflater1() {
            return getOrCreateCameraXInstancelambda18lambda17lambda16lambda15.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3("controls", 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getOrCreateCameraXInstancelambda18lambda17lambda16lambda15(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, defaultConstructorMarker);
    }

    public final String toString() {
        String string = this.b.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"LgetOrCreateCameraXInstancelambda18lambda17lambda16lambda15$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;I)V", "Lorg/json/JSONObject;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lorg/json/JSONObject;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TuitionPaymentFragmentbindingInflater1 {
        final JSONObject TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentbindingInflater1() {
            JSONObject jSONObject = new JSONObject();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = jSONObject;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3("autoplay", 0);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3("mute", 0);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3("controls", 0);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3("enablejsapi", 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3("fs", 0);
            try {
                jSONObject.put("origin", "https://www.youtube.com");
                TuitionPaymentFragmentspecialinlinedviewModeldefault3("rel", 0);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3("iv_load_policy", 3);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3("cc_load_policy", 0);
            } catch (JSONException unused) {
                StringBuilder sb = new StringBuilder("Illegal JSON value ");
                sb.append("origin");
                sb.append(": ");
                sb.append("https://www.youtube.com");
                throw new RuntimeException(sb.toString());
            }
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0, int p1) {
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.put(p0, p1);
            } catch (JSONException unused) {
                StringBuilder sb = new StringBuilder("Illegal JSON value ");
                sb.append(p0);
                sb.append(": ");
                sb.append(p1);
                throw new RuntimeException(sb.toString());
            }
        }
    }

    public /* synthetic */ getOrCreateCameraXInstancelambda18lambda17lambda16lambda15(JSONObject jSONObject, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject);
    }
}
