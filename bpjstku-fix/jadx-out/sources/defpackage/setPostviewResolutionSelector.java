package defpackage;

import com.datadog.android.api.context.NetworkInfo;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class setPostviewResolutionSelector implements ImageReaderFormatRecommender<NetworkInfo> {
    @Override // defpackage.ImageReaderFormatRecommender
    public final /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1(NetworkInfo networkInfo) {
        NetworkInfo networkInfo2 = networkInfo;
        Intrinsics.checkNotNullParameter(networkInfo2, "");
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("connectivity", new JsonPrimitive(networkInfo2.TuitionPaymentFragmentbindingInflater1.jsonValue));
        String str = networkInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str != null) {
            jsonObject.addProperty("carrier_name", str);
        }
        Long l = networkInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (l != null) {
            jsonObject.addProperty("carrier_id", Long.valueOf(l.longValue()));
        }
        Long l2 = networkInfo2.asInterface;
        if (l2 != null) {
            jsonObject.addProperty("up_kbps", Long.valueOf(l2.longValue()));
        }
        Long l3 = networkInfo2.b;
        if (l3 != null) {
            jsonObject.addProperty("down_kbps", Long.valueOf(l3.longValue()));
        }
        Long l4 = networkInfo2.a;
        if (l4 != null) {
            jsonObject.addProperty("strength", Long.valueOf(l4.longValue()));
        }
        String str2 = networkInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (str2 != null) {
            jsonObject.addProperty("cellular_technology", str2);
        }
        String string = jsonObject.getAsJsonObject().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
