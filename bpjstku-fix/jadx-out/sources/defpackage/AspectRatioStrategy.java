package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.ShippingAddress;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class AspectRatioStrategy extends TypeAdapter implements SessionProcessorSurface {
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public AspectRatioStrategy(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonWriter.beginObject();
        if (shippingAddress != shippingAddress.address) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 31);
            jsonWriter.value(shippingAddress.address);
        }
        if (shippingAddress != shippingAddress.city) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 234);
            jsonWriter.value(shippingAddress.city);
        }
        if (shippingAddress != shippingAddress.countryCode) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 145);
            jsonWriter.value(shippingAddress.countryCode);
        }
        if (shippingAddress != shippingAddress.firstName) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 104);
            jsonWriter.value(shippingAddress.firstName);
        }
        if (shippingAddress != shippingAddress.lastName) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 138);
            jsonWriter.value(shippingAddress.lastName);
        }
        if (shippingAddress != shippingAddress.phone) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 235);
            jsonWriter.value(shippingAddress.phone);
        }
        if (shippingAddress != shippingAddress.postalCode) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 226);
            jsonWriter.value(shippingAddress.postalCode);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        ShippingAddress shippingAddress = new ShippingAddress();
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 34) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 36) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 84) {
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 104) {
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 139) {
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 202) {
                                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 239) {
                                        jsonReader.skipValue();
                                    } else if (z) {
                                        shippingAddress.phone = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        shippingAddress.phone = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    shippingAddress.postalCode = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    shippingAddress.postalCode = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                shippingAddress.city = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                shippingAddress.city = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            shippingAddress.firstName = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            shippingAddress.firstName = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        shippingAddress.countryCode = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        shippingAddress.countryCode = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    shippingAddress.address = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    shippingAddress.address = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                shippingAddress.lastName = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                shippingAddress.lastName = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return shippingAddress;
    }
}
