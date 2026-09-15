package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DualSurfaceProcessorNodeOut extends TypeAdapter implements SessionProcessorSurface {
    private Gson TuitionPaymentFragmentbindingInflater1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public DualSurfaceProcessorNodeOut(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentbindingInflater1 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        AutoValue_GraphicDeviceInfo autoValue_GraphicDeviceInfo = (AutoValue_GraphicDeviceInfo) obj;
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonWriter.beginObject();
        if (autoValue_GraphicDeviceInfo != autoValue_GraphicDeviceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 200);
            getEglExtensions geteglextensions = new getEglExtensions();
            List<String> list = autoValue_GraphicDeviceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, geteglextensions, list).write(jsonWriter, list);
        }
        if (autoValue_GraphicDeviceInfo != autoValue_GraphicDeviceInfo.TuitionPaymentFragmentbindingInflater1) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 12);
            jsonWriter.value(autoValue_GraphicDeviceInfo.TuitionPaymentFragmentbindingInflater1);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        AutoValue_GraphicDeviceInfo autoValue_GraphicDeviceInfo = new AutoValue_GraphicDeviceInfo();
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 158) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 184) {
                    jsonReader.skipValue();
                } else if (z) {
                    autoValue_GraphicDeviceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (List) gson.getAdapter(new getEglExtensions()).read(jsonReader);
                } else {
                    autoValue_GraphicDeviceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                autoValue_GraphicDeviceInfo.TuitionPaymentFragmentbindingInflater1 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                autoValue_GraphicDeviceInfo.TuitionPaymentFragmentbindingInflater1 = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return autoValue_GraphicDeviceInfo;
    }
}
