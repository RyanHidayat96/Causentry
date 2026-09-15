package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.CardPaymentDetails;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class loadShader extends TypeAdapter implements SessionProcessorSurface {
    private Gson TuitionPaymentFragmentbindingInflater1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private StateObservableErrorWrapper b;

    public loadShader(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentbindingInflater1 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stateObservable;
        this.b = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        CardPaymentDetails cardPaymentDetails = (CardPaymentDetails) obj;
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.b;
        jsonWriter.beginObject();
        if (cardPaymentDetails != cardPaymentDetails.bank) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 8);
            jsonWriter.value(cardPaymentDetails.bank);
        }
        if (cardPaymentDetails != cardPaymentDetails.binsArray) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 120);
            deleteTexture deletetexture = new deleteTexture();
            ArrayList<String> arrayList = cardPaymentDetails.binsArray;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, deletetexture, arrayList).write(jsonWriter, arrayList);
        }
        if (cardPaymentDetails != cardPaymentDetails.instalmentTerm) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 172);
            jsonWriter.value(cardPaymentDetails.instalmentTerm);
        }
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 152);
        jsonWriter.value(cardPaymentDetails.recurring);
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 109);
        jsonWriter.value(cardPaymentDetails.saveTokenId);
        if (cardPaymentDetails != cardPaymentDetails.tokenId) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 89);
            jsonWriter.value(cardPaymentDetails.tokenId);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        CardPaymentDetails cardPaymentDetails = new CardPaymentDetails();
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 11) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 17) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 29) {
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 204) {
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 212) {
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 218) {
                                    jsonReader.skipValue();
                                } else if (z) {
                                    cardPaymentDetails.saveTokenId = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                                } else {
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                cardPaymentDetails.binsArray = (ArrayList) gson.getAdapter(new deleteTexture()).read(jsonReader);
                            } else {
                                cardPaymentDetails.binsArray = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            cardPaymentDetails.recurring = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                        } else {
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        cardPaymentDetails.instalmentTerm = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        cardPaymentDetails.instalmentTerm = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    cardPaymentDetails.bank = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    cardPaymentDetails.bank = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                cardPaymentDetails.tokenId = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                cardPaymentDetails.tokenId = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return cardPaymentDetails;
    }
}
