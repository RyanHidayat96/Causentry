package com.midtrans.sdk.corekit.models;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.StateObservable;
import defpackage.StateObservableErrorWrapper;
import defpackage.getOutputConfigId;
import defpackage.getPreferredAspectRatio;
import defpackage.getResolutionFilter;
import defpackage.getResolutionStrategy;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class TransactionModel {

    @SerializedName("cimb_clicks")
    public DescriptionModel cimbClicks;

    @SerializedName("mandiri_ecash")
    public DescriptionModel mandiriECash;

    @SerializedName(FirebaseAnalytics.Param.PAYMENT_TYPE)
    public String paymentType;

    @SerializedName("transaction_details")
    public TransactionDetails transactionDetails;

    @SerializedName("item_details")
    public ArrayList<ItemDetails> itemDetails = new ArrayList<>();

    @SerializedName("billing_address")
    public ArrayList<BillingAddress> billingAddresses = new ArrayList<>();

    @SerializedName("shipping_address")
    public ArrayList<ShippingAddress> shippingAddresses = new ArrayList<>();

    @SerializedName("customer_details")
    public CustomerDetails customerDetails = null;

    public final /* synthetic */ void b(Gson gson, JsonWriter jsonWriter, StateObservableErrorWrapper stateObservableErrorWrapper) throws IOException {
        jsonWriter.beginObject();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(gson, jsonWriter, stateObservableErrorWrapper);
        jsonWriter.endObject();
    }

    protected final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Gson gson, JsonWriter jsonWriter, StateObservableErrorWrapper stateObservableErrorWrapper) throws IOException {
        if (this != this.billingAddresses) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 130);
            getPreferredAspectRatio getpreferredaspectratio = new getPreferredAspectRatio();
            ArrayList<BillingAddress> arrayList = this.billingAddresses;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, getpreferredaspectratio, arrayList).write(jsonWriter, arrayList);
        }
        if (this != this.cimbClicks) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 91);
            DescriptionModel descriptionModel = this.cimbClicks;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, DescriptionModel.class, descriptionModel).write(jsonWriter, descriptionModel);
        }
        if (this != this.customerDetails) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 48);
            CustomerDetails customerDetails = this.customerDetails;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, CustomerDetails.class, customerDetails).write(jsonWriter, customerDetails);
        }
        if (this != this.itemDetails) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 124);
            getResolutionFilter getresolutionfilter = new getResolutionFilter();
            ArrayList<ItemDetails> arrayList2 = this.itemDetails;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, getresolutionfilter, arrayList2).write(jsonWriter, arrayList2);
        }
        if (this != this.mandiriECash) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 74);
            DescriptionModel descriptionModel2 = this.mandiriECash;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, DescriptionModel.class, descriptionModel2).write(jsonWriter, descriptionModel2);
        }
        if (this != this.paymentType) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 133);
            jsonWriter.value(this.paymentType);
        }
        if (this != this.shippingAddresses) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 68);
            getResolutionStrategy getresolutionstrategy = new getResolutionStrategy();
            ArrayList<ShippingAddress> arrayList3 = this.shippingAddresses;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, getresolutionstrategy, arrayList3).write(jsonWriter, arrayList3);
        }
        if (this != this.transactionDetails) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 139);
            TransactionDetails transactionDetails = this.transactionDetails;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, TransactionDetails.class, transactionDetails).write(jsonWriter, transactionDetails);
        }
    }

    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Gson gson, JsonReader jsonReader, StateObservable stateObservable) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            b(gson, jsonReader, stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader));
        }
        jsonReader.endObject();
    }

    protected final /* synthetic */ void b(Gson gson, JsonReader jsonReader, int i) throws IOException {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 1) {
            if (z) {
                this.transactionDetails = (TransactionDetails) gson.getAdapter(TransactionDetails.class).read(jsonReader);
                return;
            } else {
                this.transactionDetails = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 19) {
            if (!z) {
                this.paymentType = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.paymentType = jsonReader.nextString();
                return;
            } else {
                this.paymentType = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 94) {
            if (z) {
                this.billingAddresses = (ArrayList) gson.getAdapter(new getPreferredAspectRatio()).read(jsonReader);
                return;
            } else {
                this.billingAddresses = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 127) {
            if (z) {
                this.itemDetails = (ArrayList) gson.getAdapter(new getResolutionFilter()).read(jsonReader);
                return;
            } else {
                this.itemDetails = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 164) {
            if (z) {
                this.mandiriECash = (DescriptionModel) gson.getAdapter(DescriptionModel.class).read(jsonReader);
                return;
            } else {
                this.mandiriECash = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 209) {
            if (z) {
                this.cimbClicks = (DescriptionModel) gson.getAdapter(DescriptionModel.class).read(jsonReader);
                return;
            } else {
                this.cimbClicks = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 185) {
            if (z) {
                this.shippingAddresses = (ArrayList) gson.getAdapter(new getResolutionStrategy()).read(jsonReader);
                return;
            } else {
                this.shippingAddresses = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i != 186) {
            jsonReader.skipValue();
        } else if (z) {
            this.customerDetails = (CustomerDetails) gson.getAdapter(CustomerDetails.class).read(jsonReader);
        } else {
            this.customerDetails = null;
            jsonReader.nextNull();
        }
    }
}
