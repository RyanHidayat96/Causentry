package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.FreeText;
import com.midtrans.sdk.corekit.models.FreeTextLanguage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GLUtilsSamplerShaderProgram extends TypeAdapter implements SessionProcessorSurface {
    private Gson TuitionPaymentFragmentbindingInflater1;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public GLUtilsSamplerShaderProgram(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
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
        FreeText freeText = (FreeText) obj;
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonWriter.beginObject();
        if (freeText != freeText.inquiry) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 223);
            getFragmentShaderSource getfragmentshadersource = new getFragmentShaderSource();
            List<FreeTextLanguage> list = freeText.inquiry;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, getfragmentshadersource, list).write(jsonWriter, list);
        }
        if (freeText != freeText.payment) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 70);
            getGlVersionNumber getglversionnumber = new getGlVersionNumber();
            List<FreeTextLanguage> list2 = freeText.payment;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, getglversionnumber, list2).write(jsonWriter, list2);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        FreeText freeText = new FreeText();
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 49) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 142) {
                    jsonReader.skipValue();
                } else if (z) {
                    freeText.inquiry = (List) gson.getAdapter(new getFragmentShaderSource()).read(jsonReader);
                } else {
                    freeText.inquiry = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                freeText.payment = (List) gson.getAdapter(new getGlVersionNumber()).read(jsonReader);
            } else {
                freeText.payment = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return freeText;
    }
}
