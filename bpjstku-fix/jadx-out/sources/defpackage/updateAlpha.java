package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.ItemDetails;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class updateAlpha extends TypeAdapter implements SessionProcessorSurface {
    private Gson TuitionPaymentFragmentbindingInflater1;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public updateAlpha(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
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
        ItemDetails itemDetails = (ItemDetails) obj;
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonWriter.beginObject();
        if (itemDetails != itemDetails.f843id) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 84);
            jsonWriter.value(itemDetails.f843id);
        }
        if (itemDetails != itemDetails.name) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 111);
            jsonWriter.value(itemDetails.name);
        }
        if (itemDetails != itemDetails.price) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 49);
            Double d = itemDetails.price;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, Double.class, d).write(jsonWriter, d);
        }
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 61);
        jsonWriter.value(Integer.valueOf(itemDetails.quantity));
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        ItemDetails itemDetails = new ItemDetails();
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 40) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 91) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 176) {
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 196) {
                            jsonReader.skipValue();
                        } else if (z) {
                            itemDetails.price = (Double) gson.getAdapter(Double.class).read(jsonReader);
                        } else {
                            itemDetails.price = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        itemDetails.name = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        itemDetails.name = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    itemDetails.f843id = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    itemDetails.f843id = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                try {
                    itemDetails.quantity = jsonReader.nextInt();
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            } else {
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return itemDetails;
    }
}
