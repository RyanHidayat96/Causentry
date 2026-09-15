package defpackage;

import com.google.gson.JsonObject;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageProxyPlaneProxy implements ImageReaderFormatRecommender<lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer> {
    @Override // defpackage.ImageReaderFormatRecommender
    public final /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer) {
        lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer2 = lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer;
        Intrinsics.checkNotNullParameter(lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer2, "");
        JsonObject jsonObject = new JsonObject();
        String str = lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer2.b;
        if (str != null) {
            jsonObject.addProperty("id", str);
        }
        String str2 = lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (str2 != null) {
            jsonObject.addProperty("name", str2);
        }
        String str3 = lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer2.TuitionPaymentFragmentbindingInflater1;
        if (str3 != null) {
            jsonObject.addProperty("email", str3);
        }
        for (Map.Entry<String, Object> entry : lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!ArraysKt.contains(lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault1, key)) {
                toBitmap tobitmap = toBitmap.INSTANCE;
                jsonObject.add(key, toBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(value));
            }
        }
        String string = jsonObject.getAsJsonObject().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
