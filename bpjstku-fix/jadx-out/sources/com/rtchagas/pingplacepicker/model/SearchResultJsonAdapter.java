package com.rtchagas.pingplacepicker.model;

import androidx.core.app.NotificationCompat;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r"}, d2 = {"Lcom/rtchagas/pingplacepicker/model/SearchResultJsonAdapter;", "LAutoValue_RecordingStats;", "Lcom/rtchagas/pingplacepicker/model/SearchResult;", "LCapabilitiesByQuality;", "p0", "<init>", "(LCapabilitiesByQuality;)V", "", "toString", "()Ljava/lang/String;", "", "Lcom/rtchagas/pingplacepicker/model/SimplePlace;", "listOfSimplePlaceAdapter", "LAutoValue_RecordingStats;", "Lcom/squareup/moshi/JsonReader$TuitionPaymentFragmentbindingInflater1;", "options", "Lcom/squareup/moshi/JsonReader$TuitionPaymentFragmentbindingInflater1;", "stringAdapter"}, k = 1, mv = {2, 3, 0})
public final class SearchResultJsonAdapter extends AutoValue_RecordingStats<SearchResult> {
    private final AutoValue_RecordingStats<List<SimplePlace>> listOfSimplePlaceAdapter;
    private final JsonReader.TuitionPaymentFragmentbindingInflater1 options;
    private final AutoValue_RecordingStats<String> stringAdapter;

    @Override // defpackage.AutoValue_RecordingStats
    public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, SearchResult searchResult) throws IOException {
        SearchResult searchResult2 = searchResult;
        if (searchResult2 == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        setqualityselector.b();
        setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault1("results");
        this.listOfSimplePlaceAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setqualityselector, searchResult2.results);
        setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(NotificationCompat.CATEGORY_STATUS);
        this.stringAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setqualityselector, searchResult2.status);
        setqualityselector.TuitionPaymentFragmentbindingInflater1();
    }

    public SearchResultJsonAdapter(CapabilitiesByQuality capabilitiesByQuality) {
        JsonReader.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = JsonReader.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3("results", NotificationCompat.CATEGORY_STATUS);
        Intrinsics.checkExpressionValueIsNotNull(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.options = tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        AutoValue_RecordingStats<List<SimplePlace>> autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = capabilitiesByQuality.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, List.class, SimplePlace.class), SetsKt.emptySet(), "results");
        Intrinsics.checkExpressionValueIsNotNull(autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        this.listOfSimplePlaceAdapter = autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        AutoValue_RecordingStats<String> autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = capabilitiesByQuality.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.class, SetsKt.emptySet(), NotificationCompat.CATEGORY_STATUS);
        Intrinsics.checkExpressionValueIsNotNull(autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.stringAdapter = autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(SearchResult)");
        String string = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(string, "");
        return string;
    }

    @Override // defpackage.AutoValue_RecordingStats
    public final /* bridge */ /* synthetic */ SearchResult b(JsonReader jsonReader) throws IOException {
        jsonReader.b();
        List<SimplePlace> listB = null;
        String strB = null;
        while (jsonReader.a()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.options);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == -1) {
                jsonReader.INotificationSideChannelDefault();
                jsonReader.RemoteActionCompatParcelizer();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                listB = this.listOfSimplePlaceAdapter.b(jsonReader);
                if (listB == null) {
                    JsonDataException jsonDataExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault3 = checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3("results", "results", jsonReader);
                    Intrinsics.checkExpressionValueIsNotNull(jsonDataExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    throw jsonDataExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1 && (strB = this.stringAdapter.b(jsonReader)) == null) {
                JsonDataException jsonDataExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault4 = checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3(NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, jsonReader);
                Intrinsics.checkExpressionValueIsNotNull(jsonDataExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                throw jsonDataExceptionTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            }
        }
        jsonReader.TuitionPaymentFragmentbindingInflater1();
        if (listB == null) {
            JsonDataException jsonDataExceptionB = checkQualityConstantsOrThrow.b("results", "results", jsonReader);
            Intrinsics.checkExpressionValueIsNotNull(jsonDataExceptionB, "");
            throw jsonDataExceptionB;
        }
        if (strB != null) {
            return new SearchResult(listB, strB);
        }
        JsonDataException jsonDataExceptionB2 = checkQualityConstantsOrThrow.b(NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, jsonReader);
        Intrinsics.checkExpressionValueIsNotNull(jsonDataExceptionB2, "");
        throw jsonDataExceptionB2;
    }
}
