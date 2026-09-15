package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.BillingAddress;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class querySurface extends TypeAdapter implements SessionProcessorSurface {
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public querySurface(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        BillingAddress billingAddress = (BillingAddress) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonWriter.beginObject();
        if (billingAddress != billingAddress.address) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 31);
            jsonWriter.value(billingAddress.address);
        }
        if (billingAddress != billingAddress.city) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 234);
            jsonWriter.value(billingAddress.city);
        }
        if (billingAddress != billingAddress.countryCode) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 145);
            jsonWriter.value(billingAddress.countryCode);
        }
        if (billingAddress != billingAddress.firstName) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 104);
            jsonWriter.value(billingAddress.firstName);
        }
        if (billingAddress != billingAddress.lastName) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 138);
            jsonWriter.value(billingAddress.lastName);
        }
        if (billingAddress != billingAddress.phone) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 235);
            jsonWriter.value(billingAddress.phone);
        }
        if (billingAddress != billingAddress.postalCode) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 226);
            jsonWriter.value(billingAddress.postalCode);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        BillingAddress billingAddress = new BillingAddress();
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
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
                                        billingAddress.phone = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        billingAddress.phone = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    billingAddress.postalCode = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    billingAddress.postalCode = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                billingAddress.city = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                billingAddress.city = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            billingAddress.firstName = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            billingAddress.firstName = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        billingAddress.countryCode = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        billingAddress.countryCode = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    billingAddress.address = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    billingAddress.address = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                billingAddress.lastName = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                billingAddress.lastName = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return billingAddress;
    }
}
