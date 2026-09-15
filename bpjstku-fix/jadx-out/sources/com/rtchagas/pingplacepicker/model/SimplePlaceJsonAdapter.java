package com.rtchagas.pingplacepicker.model;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import defpackage.AutoValue_RecordingStats;
import defpackage.CapabilitiesByQuality;
import defpackage.checkQualityConstantsOrThrow;
import defpackage.setQualitySelector;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tR \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f"}, d2 = {"Lcom/rtchagas/pingplacepicker/model/SimplePlaceJsonAdapter;", "LAutoValue_RecordingStats;", "Lcom/rtchagas/pingplacepicker/model/SimplePlace;", "LCapabilitiesByQuality;", "p0", "<init>", "(LCapabilitiesByQuality;)V", "", "toString", "()Ljava/lang/String;", "", "listOfStringAdapter", "LAutoValue_RecordingStats;", "Lcom/squareup/moshi/JsonReader$TuitionPaymentFragmentbindingInflater1;", "options", "Lcom/squareup/moshi/JsonReader$TuitionPaymentFragmentbindingInflater1;", "stringAdapter"}, k = 1, mv = {2, 3, 0})
public final class SimplePlaceJsonAdapter extends AutoValue_RecordingStats<SimplePlace> {
    private final AutoValue_RecordingStats<List<String>> listOfStringAdapter;
    private final JsonReader.TuitionPaymentFragmentbindingInflater1 options;
    private final AutoValue_RecordingStats<String> stringAdapter;

    @Override // defpackage.AutoValue_RecordingStats
    public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, SimplePlace simplePlace) throws IOException {
        SimplePlace simplePlace2 = simplePlace;
        if (simplePlace2 == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        setqualityselector.b();
        setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault1("place_id");
        this.stringAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setqualityselector, simplePlace2.placeId);
        setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault1("types");
        this.listOfStringAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setqualityselector, simplePlace2.types);
        setqualityselector.TuitionPaymentFragmentbindingInflater1();
    }

    public SimplePlaceJsonAdapter(CapabilitiesByQuality capabilitiesByQuality) {
        JsonReader.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = JsonReader.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3("place_id", "types");
        Intrinsics.checkExpressionValueIsNotNull(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.options = tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        AutoValue_RecordingStats<String> autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = capabilitiesByQuality.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.class, SetsKt.emptySet(), "placeId");
        Intrinsics.checkExpressionValueIsNotNull(autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        this.stringAdapter = autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        AutoValue_RecordingStats<List<String>> autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = capabilitiesByQuality.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, List.class, String.class), SetsKt.emptySet(), "types");
        Intrinsics.checkExpressionValueIsNotNull(autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.listOfStringAdapter = autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(SimplePlace)");
        String string = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(string, "");
        return string;
    }

    @Override // defpackage.AutoValue_RecordingStats
    public final /* bridge */ /* synthetic */ SimplePlace b(JsonReader jsonReader) throws IOException {
        jsonReader.b();
        String strB = null;
        List<String> listB = null;
        while (jsonReader.a()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.options);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == -1) {
                jsonReader.INotificationSideChannelDefault();
                jsonReader.RemoteActionCompatParcelizer();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                strB = this.stringAdapter.b(jsonReader);
                if (strB == null) {
                    JsonDataException jsonDataExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault3 = checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3("placeId", "place_id", jsonReader);
                    Intrinsics.checkExpressionValueIsNotNull(jsonDataExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    throw jsonDataExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1 && (listB = this.listOfStringAdapter.b(jsonReader)) == null) {
                JsonDataException jsonDataExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault4 = checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3("types_", "types", jsonReader);
                Intrinsics.checkExpressionValueIsNotNull(jsonDataExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                throw jsonDataExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            }
        }
        jsonReader.TuitionPaymentFragmentbindingInflater1();
        if (strB == null) {
            JsonDataException jsonDataExceptionB = checkQualityConstantsOrThrow.b("placeId", "place_id", jsonReader);
            Intrinsics.checkExpressionValueIsNotNull(jsonDataExceptionB, "");
            throw jsonDataExceptionB;
        }
        if (listB != null) {
            return new SimplePlace(strB, listB);
        }
        JsonDataException jsonDataExceptionB2 = checkQualityConstantsOrThrow.b("types_", "types", jsonReader);
        Intrinsics.checkExpressionValueIsNotNull(jsonDataExceptionB2, "");
        throw jsonDataExceptionB2;
    }
}
