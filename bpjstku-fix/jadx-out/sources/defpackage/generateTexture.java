package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.analytics.MixpanelProperties;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class generateTexture extends TypeAdapter implements SessionProcessorSurface {
    private StateObservable TuitionPaymentFragmentbindingInflater1;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public generateTexture(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = gson;
        this.TuitionPaymentFragmentbindingInflater1 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        MixpanelProperties mixpanelProperties = (MixpanelProperties) obj;
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonWriter.beginObject();
        if (mixpanelProperties != mixpanelProperties.buttonName) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 90);
            jsonWriter.value(mixpanelProperties.buttonName);
        }
        if (mixpanelProperties != mixpanelProperties.cardPaymentMode) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 186);
            jsonWriter.value(mixpanelProperties.cardPaymentMode);
        }
        if (mixpanelProperties != mixpanelProperties.deviceId) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 87);
            jsonWriter.value(mixpanelProperties.deviceId);
        }
        if (mixpanelProperties != mixpanelProperties.deviceType) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 43);
            jsonWriter.value(mixpanelProperties.deviceType);
        }
        if (mixpanelProperties != mixpanelProperties.distinctId) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 121);
            jsonWriter.value(mixpanelProperties.distinctId);
        }
        if (mixpanelProperties != mixpanelProperties.enabledPayments) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 78);
            create4x4IdentityMatrix create4x4identitymatrix = new create4x4IdentityMatrix();
            List<String> list = mixpanelProperties.enabledPayments;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, create4x4identitymatrix, list).write(jsonWriter, list);
        }
        if (mixpanelProperties != mixpanelProperties.firstPage) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 44);
            jsonWriter.value(mixpanelProperties.firstPage);
        }
        if (mixpanelProperties != mixpanelProperties.flow) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 7);
            jsonWriter.value(mixpanelProperties.flow);
        }
        if (mixpanelProperties != mixpanelProperties.installmentAvailable) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 209);
            jsonWriter.value(mixpanelProperties.installmentAvailable);
        }
        if (mixpanelProperties != mixpanelProperties.installmentRequired) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 190);
            jsonWriter.value(mixpanelProperties.installmentRequired);
        }
        if (mixpanelProperties != mixpanelProperties.merchant) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 193);
            jsonWriter.value(mixpanelProperties.merchant);
        }
        if (mixpanelProperties != mixpanelProperties.merchantId) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 117);
            jsonWriter.value(mixpanelProperties.merchantId);
        }
        if (mixpanelProperties != mixpanelProperties.message) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 63);
            jsonWriter.value(mixpanelProperties.message);
        }
        if (mixpanelProperties != mixpanelProperties.network) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 218);
            jsonWriter.value(mixpanelProperties.network);
        }
        if (mixpanelProperties != mixpanelProperties.oneClick) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 52);
            jsonWriter.value(mixpanelProperties.oneClick);
        }
        if (mixpanelProperties != mixpanelProperties.orderId) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 177);
            jsonWriter.value(mixpanelProperties.orderId);
        }
        if (mixpanelProperties != mixpanelProperties.osVersion) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 65);
            jsonWriter.value(mixpanelProperties.osVersion);
        }
        if (mixpanelProperties != mixpanelProperties.pageName) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 47);
            jsonWriter.value(mixpanelProperties.pageName);
        }
        if (mixpanelProperties != mixpanelProperties.platform) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 62);
            jsonWriter.value(mixpanelProperties.platform);
        }
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 41);
        Class cls = Long.TYPE;
        Long lValueOf = Long.valueOf(mixpanelProperties.responseTime);
        getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, cls, lValueOf).write(jsonWriter, lValueOf);
        if (mixpanelProperties != mixpanelProperties.timeStamp) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 173);
            jsonWriter.value(mixpanelProperties.timeStamp);
        }
        if (mixpanelProperties != mixpanelProperties.token) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 17);
            jsonWriter.value(mixpanelProperties.token);
        }
        if (mixpanelProperties != mixpanelProperties.transactionId) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 175);
            jsonWriter.value(mixpanelProperties.transactionId);
        }
        if (mixpanelProperties != mixpanelProperties.twoClicks) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 213);
            jsonWriter.value(mixpanelProperties.twoClicks);
        }
        if (mixpanelProperties != mixpanelProperties.version) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 189);
            jsonWriter.value(mixpanelProperties.version);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        MixpanelProperties mixpanelProperties = new MixpanelProperties();
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StateObservable stateObservable = this.TuitionPaymentFragmentbindingInflater1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            switch (iTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                case 0:
                    if (!z) {
                        mixpanelProperties.deviceType = null;
                    } else {
                        mixpanelProperties.deviceType = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 8:
                    if (!z) {
                        mixpanelProperties.merchant = null;
                    } else {
                        mixpanelProperties.merchant = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 16:
                    if (!z) {
                        mixpanelProperties.enabledPayments = null;
                    } else {
                        mixpanelProperties.enabledPayments = (List) gson.getAdapter(new create4x4IdentityMatrix()).read(jsonReader);
                    }
                    break;
                case 62:
                    if (!z) {
                        mixpanelProperties.token = null;
                    } else {
                        mixpanelProperties.token = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 63:
                    if (!z) {
                        mixpanelProperties.cardPaymentMode = null;
                    } else {
                        mixpanelProperties.cardPaymentMode = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 68:
                    if (!z) {
                        mixpanelProperties.version = null;
                    } else {
                        mixpanelProperties.version = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 83:
                    if (!z) {
                        mixpanelProperties.buttonName = null;
                    } else {
                        mixpanelProperties.buttonName = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 98:
                    if (!z) {
                        mixpanelProperties.timeStamp = null;
                    } else {
                        mixpanelProperties.timeStamp = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 100:
                    if (!z) {
                        mixpanelProperties.flow = null;
                    } else {
                        mixpanelProperties.flow = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 103:
                    if (!z) {
                        mixpanelProperties.message = null;
                    } else {
                        mixpanelProperties.message = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 108:
                    if (!z) {
                        mixpanelProperties.installmentRequired = null;
                    } else {
                        mixpanelProperties.installmentRequired = (Boolean) gson.getAdapter(Boolean.class).read(jsonReader);
                    }
                    break;
                case 116:
                    if (!z) {
                        mixpanelProperties.osVersion = null;
                    } else {
                        mixpanelProperties.osVersion = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 119:
                    if (!z) {
                        mixpanelProperties.network = null;
                    } else {
                        mixpanelProperties.network = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 128:
                    if (!z) {
                        mixpanelProperties.platform = null;
                    } else {
                        mixpanelProperties.platform = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 145:
                    if (!z) {
                        mixpanelProperties.deviceId = null;
                    } else {
                        mixpanelProperties.deviceId = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 148:
                    if (z) {
                        mixpanelProperties.responseTime = ((Long) gson.getAdapter(Long.class).read(jsonReader)).longValue();
                    }
                    break;
                case 149:
                    if (!z) {
                        mixpanelProperties.oneClick = null;
                    } else {
                        mixpanelProperties.oneClick = (Boolean) gson.getAdapter(Boolean.class).read(jsonReader);
                    }
                    break;
                case 161:
                    if (!z) {
                        mixpanelProperties.merchantId = null;
                    } else {
                        mixpanelProperties.merchantId = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 166:
                    if (!z) {
                        mixpanelProperties.firstPage = null;
                    } else {
                        mixpanelProperties.firstPage = (Boolean) gson.getAdapter(Boolean.class).read(jsonReader);
                    }
                    break;
                case 169:
                    if (!z) {
                        mixpanelProperties.orderId = null;
                    } else {
                        mixpanelProperties.orderId = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 173:
                    if (!z) {
                        mixpanelProperties.transactionId = null;
                    } else {
                        mixpanelProperties.transactionId = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 179:
                    if (!z) {
                        mixpanelProperties.distinctId = null;
                    } else {
                        mixpanelProperties.distinctId = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 190:
                    if (!z) {
                        mixpanelProperties.pageName = null;
                    } else {
                        mixpanelProperties.pageName = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 199:
                    if (!z) {
                        mixpanelProperties.twoClicks = null;
                    } else {
                        mixpanelProperties.twoClicks = (Boolean) gson.getAdapter(Boolean.class).read(jsonReader);
                    }
                    break;
                case 230:
                    if (!z) {
                        mixpanelProperties.installmentAvailable = null;
                    } else {
                        mixpanelProperties.installmentAvailable = (Boolean) gson.getAdapter(Boolean.class).read(jsonReader);
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return mixpanelProperties;
    }
}
