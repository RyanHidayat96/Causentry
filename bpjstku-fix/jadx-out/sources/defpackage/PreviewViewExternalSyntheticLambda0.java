package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonException;

/* JADX INFO: loaded from: classes7.dex */
public final class PreviewViewExternalSyntheticLambda0 {
    private static final setImplementationMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2<Map<String, Integer>> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new setImplementationMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2<>();
    private static final setImplementationMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2<String[]> b = new setImplementationMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2<>();

    public static final setImplementationMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2<Map<String, Integer>> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private static final void TuitionPaymentFragmentbindingInflater1(Map<String, Integer> map, createImageAnalysis createimageanalysis, String str, int i) {
        String str2 = Intrinsics.areEqual(createimageanalysis.TuitionPaymentFragmentbindingInflater1(), deactivateRecording.TuitionPaymentFragmentbindingInflater1.INSTANCE) ? "enum value" : "property";
        if (map.containsKey(str)) {
            StringBuilder sb = new StringBuilder("The suggested name '");
            sb.append(str);
            sb.append("' for ");
            sb.append(str2);
            sb.append(' ');
            sb.append(createimageanalysis.TuitionPaymentFragmentbindingInflater1(i));
            sb.append(" is already one of the names for ");
            sb.append(str2);
            sb.append(' ');
            sb.append(createimageanalysis.TuitionPaymentFragmentbindingInflater1(((Number) MapsKt.getValue(map, str)).intValue()));
            sb.append(" in ");
            sb.append(createimageanalysis);
            throw new JsonException(sb.toString());
        }
        map.put(str, Integer.valueOf(i));
    }

    public static final Map<String, Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault2(final PreviewStreamStateObserver2 previewStreamStateObserver2, final createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        return (Map) previewStreamStateObserver2.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(createimageanalysis, TuitionPaymentFragmentspecialinlinedviewModeldefault3, new Function0() { // from class: onZoomEvent
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreviewViewExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(createimageanalysis, previewStreamStateObserver2);
            }
        });
    }

    public static final String TuitionPaymentFragmentbindingInflater1(final createImageAnalysis createimageanalysis, PreviewStreamStateObserver2 previewStreamStateObserver2, int i) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        final attachToControllerIfReady attachtocontrollerifreadyB = b(createimageanalysis, previewStreamStateObserver2);
        if (attachtocontrollerifreadyB == null) {
            return createimageanalysis.TuitionPaymentFragmentbindingInflater1(i);
        }
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        Intrinsics.checkNotNullParameter(attachtocontrollerifreadyB, "");
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        return ((String[]) previewStreamStateObserver2.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(createimageanalysis, b, new Function0() { // from class: PreviewView1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreviewViewExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(createimageanalysis, attachtocontrollerifreadyB);
            }
        }))[i];
    }

    public static final attachToControllerIfReady b(createImageAnalysis createimageanalysis, PreviewStreamStateObserver2 previewStreamStateObserver2) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        if (Intrinsics.areEqual(createimageanalysis.TuitionPaymentFragmentbindingInflater1(), isCameraAttached.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE)) {
            return previewStreamStateObserver2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel;
        }
        return null;
    }

    public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(createImageAnalysis createimageanalysis, PreviewStreamStateObserver2 previewStreamStateObserver2, String str, String str2) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(createimageanalysis, previewStreamStateObserver2, str);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != -3) {
            return iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(createimageanalysis.getINotificationSideChannel());
        sb.append(" does not contain element with name '");
        sb.append(str);
        sb.append('\'');
        sb.append(str2);
        throw new SerializationException(sb.toString());
    }

    public static /* synthetic */ Map TuitionPaymentFragmentspecialinlinedviewModeldefault3(createImageAnalysis createimageanalysis, PreviewStreamStateObserver2 previewStreamStateObserver2) {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = previewStreamStateObserver2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact && Intrinsics.areEqual(createimageanalysis.TuitionPaymentFragmentbindingInflater1(), deactivateRecording.TuitionPaymentFragmentbindingInflater1.INSTANCE);
        attachToControllerIfReady attachtocontrollerifreadyB = b(createimageanalysis, previewStreamStateObserver2);
        int tuitionPaymentFragmentspecialinlinedviewModeldefault1 = createimageanalysis.getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
        for (int i = 0; i < tuitionPaymentFragmentspecialinlinedviewModeldefault1; i++) {
            List<Annotation> listB = createimageanalysis.b(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listB) {
                if (obj instanceof isViewportAspectRatioMatchPreviewView) {
                    arrayList.add(obj);
                }
            }
            isViewportAspectRatioMatchPreviewView isviewportaspectratiomatchpreviewview = (isViewportAspectRatioMatchPreviewView) CollectionsKt.singleOrNull((List) arrayList);
            if (isviewportaspectratiomatchpreviewview != null && (strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = isviewportaspectratiomatchpreviewview.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) != null) {
                for (String lowerCase : strArrTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    if (z) {
                        lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    }
                    TuitionPaymentFragmentbindingInflater1(linkedHashMap, createimageanalysis, lowerCase, i);
                }
            }
            if (z) {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = createimageanalysis.TuitionPaymentFragmentbindingInflater1(i).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            } else {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = attachtocontrollerifreadyB != null ? attachtocontrollerifreadyB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(createimageanalysis, createimageanalysis.TuitionPaymentFragmentbindingInflater1(i)) : null;
            }
            if (strTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                TuitionPaymentFragmentbindingInflater1(linkedHashMap, createimageanalysis, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, i);
            }
        }
        return linkedHashMap.isEmpty() ? MapsKt.emptyMap() : linkedHashMap;
    }

    public static /* synthetic */ String[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(createImageAnalysis createimageanalysis, attachToControllerIfReady attachtocontrollerifready) {
        int tuitionPaymentFragmentspecialinlinedviewModeldefault1 = createimageanalysis.getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
        String[] strArr = new String[tuitionPaymentFragmentspecialinlinedviewModeldefault1];
        for (int i = 0; i < tuitionPaymentFragmentspecialinlinedviewModeldefault1; i++) {
            strArr[i] = attachtocontrollerifready.TuitionPaymentFragmentspecialinlinedviewModeldefault3(createimageanalysis, createimageanalysis.TuitionPaymentFragmentbindingInflater1(i));
        }
        return strArr;
    }

    public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(createImageAnalysis createimageanalysis, PreviewStreamStateObserver2 previewStreamStateObserver2, String str) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (previewStreamStateObserver2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact && Intrinsics.areEqual(createimageanalysis.TuitionPaymentFragmentbindingInflater1(), deactivateRecording.TuitionPaymentFragmentbindingInflater1.INSTANCE)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            Integer num = TuitionPaymentFragmentspecialinlinedviewModeldefault2(previewStreamStateObserver2, createimageanalysis).get(lowerCase);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        if (b(createimageanalysis, previewStreamStateObserver2) == null) {
            int iTuitionPaymentFragmentbindingInflater1 = createimageanalysis.TuitionPaymentFragmentbindingInflater1(str);
            if (iTuitionPaymentFragmentbindingInflater1 != -3 || !previewStreamStateObserver2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll) {
                return iTuitionPaymentFragmentbindingInflater1;
            }
            Integer num2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(previewStreamStateObserver2, createimageanalysis).get(str);
            if (num2 != null) {
                return num2.intValue();
            }
            return -3;
        }
        Integer num3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(previewStreamStateObserver2, createimageanalysis).get(str);
        if (num3 != null) {
            return num3.intValue();
        }
        return -3;
    }
}
