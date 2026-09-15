package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.snap.Installment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class DynamicRangeUtils extends TypeAdapter implements SessionProcessorSurface {
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private Gson b;

    public DynamicRangeUtils(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.b = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Installment installment = (Installment) obj;
        Gson gson = this.b;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonWriter.beginObject();
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 210);
        jsonWriter.value(installment.required);
        if (installment != installment.terms) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 227);
            setAllowedResolutionMode setallowedresolutionmode = new setAllowedResolutionMode();
            Map<String, ArrayList<Integer>> map = installment.terms;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, setallowedresolutionmode, map).write(jsonWriter, map);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        Installment installment = new Installment();
        Gson gson = this.b;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 174) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 237) {
                    jsonReader.skipValue();
                } else if (z) {
                    installment.terms = (Map) gson.getAdapter(new setAllowedResolutionMode()).read(jsonReader);
                } else {
                    installment.terms = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                installment.required = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
            } else {
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return installment;
    }
}
