package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.BillingAddress;
import com.midtrans.sdk.corekit.models.CustomerDetails;
import com.midtrans.sdk.corekit.models.ShippingAddress;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class GLUtilsBlankShaderProgram extends TypeAdapter implements SessionProcessorSurface {
    private Gson TuitionPaymentFragmentbindingInflater1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservableErrorWrapper b;

    public GLUtilsBlankShaderProgram(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentbindingInflater1 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservable;
        this.b = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        CustomerDetails customerDetails = (CustomerDetails) obj;
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.b;
        jsonWriter.beginObject();
        if (customerDetails != customerDetails.billingAddress) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 130);
            BillingAddress billingAddress = customerDetails.billingAddress;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, BillingAddress.class, billingAddress).write(jsonWriter, billingAddress);
        }
        if (customerDetails != customerDetails.customerIdentifier) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 69);
            jsonWriter.value(customerDetails.customerIdentifier);
        }
        if (customerDetails != customerDetails.email) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 176);
            jsonWriter.value(customerDetails.email);
        }
        if (customerDetails != customerDetails.firstName) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 104);
            jsonWriter.value(customerDetails.firstName);
        }
        if (customerDetails != customerDetails.lastName) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 138);
            jsonWriter.value(customerDetails.lastName);
        }
        if (customerDetails != customerDetails.phone) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 235);
            jsonWriter.value(customerDetails.phone);
        }
        if (customerDetails != customerDetails.shippingAddress) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 68);
            ShippingAddress shippingAddress = customerDetails.shippingAddress;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, ShippingAddress.class, shippingAddress).write(jsonWriter, shippingAddress);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        CustomerDetails customerDetails = new CustomerDetails();
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 34) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 61) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 82) {
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 94) {
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 104) {
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 185) {
                                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 239) {
                                        jsonReader.skipValue();
                                    } else if (z) {
                                        customerDetails.phone = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        customerDetails.phone = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    customerDetails.shippingAddress = (ShippingAddress) gson.getAdapter(ShippingAddress.class).read(jsonReader);
                                } else {
                                    customerDetails.shippingAddress = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                customerDetails.firstName = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                customerDetails.firstName = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            customerDetails.billingAddress = (BillingAddress) gson.getAdapter(BillingAddress.class).read(jsonReader);
                        } else {
                            customerDetails.billingAddress = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        customerDetails.customerIdentifier = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        customerDetails.customerIdentifier = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    customerDetails.email = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    customerDetails.email = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                customerDetails.lastName = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                customerDetails.lastName = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return customerDetails;
    }
}
