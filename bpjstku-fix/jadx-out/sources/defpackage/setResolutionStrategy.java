package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.snap.SnapPromo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class setResolutionStrategy extends TypeAdapter implements SessionProcessorSurface {
    private Gson TuitionPaymentFragmentbindingInflater1;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public setResolutionStrategy(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentbindingInflater1 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        SnapPromo snapPromo = (SnapPromo) obj;
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonWriter.beginObject();
        if (snapPromo != snapPromo.allowedPromoCodes) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 46);
            intersectDynamicRange intersectdynamicrange = new intersectDynamicRange();
            List<String> list = snapPromo.allowedPromoCodes;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, intersectdynamicrange, list).write(jsonWriter, list);
        }
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 216);
        jsonWriter.value(snapPromo.enabled);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        SnapPromo snapPromo = new SnapPromo();
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 66) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 125) {
                    jsonReader.skipValue();
                } else if (z) {
                    snapPromo.enabled = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                } else {
                    jsonReader.nextNull();
                }
            } else if (z) {
                snapPromo.allowedPromoCodes = (List) gson.getAdapter(new intersectDynamicRange()).read(jsonReader);
            } else {
                snapPromo.allowedPromoCodes = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return snapPromo;
    }
}
