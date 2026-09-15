package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public final class setEglExtensions extends TypeAdapter implements SessionProcessorSurface {
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private StateObservableErrorWrapper b;

    public setEglExtensions(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable;
        this.b = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        checkEglErrorOrThrow checkeglerrororthrow = (checkEglErrorOrThrow) obj;
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.b;
        jsonWriter.beginObject();
        if (checkeglerrororthrow != checkeglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 128);
            jsonWriter.value(checkeglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 102);
        Class cls = Long.TYPE;
        Long lValueOf = Long.valueOf(checkeglerrororthrow.TuitionPaymentFragmentbindingInflater1);
        getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, cls, lValueOf).write(jsonWriter, lValueOf);
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 95);
        Class cls2 = Long.TYPE;
        Long lValueOf2 = Long.valueOf(checkeglerrororthrow.b);
        getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, cls2, lValueOf2).write(jsonWriter, lValueOf2);
        if (checkeglerrororthrow != checkeglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 136);
            jsonWriter.value(checkeglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        if (checkeglerrororthrow != checkeglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 215);
            jsonWriter.value(checkeglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        if (checkeglerrororthrow != checkeglerrororthrow.asBinder) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 99);
            jsonWriter.value(checkeglerrororthrow.asBinder);
        }
        if (checkeglerrororthrow != checkeglerrororthrow.asInterface) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 85);
            jsonWriter.value(checkeglerrororthrow.asInterface);
        }
        if (checkeglerrororthrow != checkeglerrororthrow.g) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 79);
            jsonWriter.value(checkeglerrororthrow.g);
        }
        if (checkeglerrororthrow != checkeglerrororthrow.f351a) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 21);
            jsonWriter.value(checkeglerrororthrow.f351a);
        }
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 107);
        Class cls3 = Long.TYPE;
        Long lValueOf3 = Long.valueOf(checkeglerrororthrow.d);
        getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, cls3, lValueOf3).write(jsonWriter, lValueOf3);
        if (checkeglerrororthrow != checkeglerrororthrow.INotificationSideChannel) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 58);
            jsonWriter.value(checkeglerrororthrow.INotificationSideChannel);
        }
        if (checkeglerrororthrow != checkeglerrororthrow.cancel) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 212);
            jsonWriter.value(checkeglerrororthrow.cancel);
        }
        if (checkeglerrororthrow != checkeglerrororthrow.onTransact) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 14);
            jsonWriter.value(checkeglerrororthrow.onTransact);
        }
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 197);
        jsonWriter.value(Integer.valueOf(checkeglerrororthrow.notify));
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 4);
        Class cls4 = Long.TYPE;
        Long lValueOf4 = Long.valueOf(checkeglerrororthrow.cancelAll);
        getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, cls4, lValueOf4).write(jsonWriter, lValueOf4);
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 5);
        Class cls5 = Long.TYPE;
        Long lValueOf5 = Long.valueOf(checkeglerrororthrow.INotificationSideChannelStubProxy);
        getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, cls5, lValueOf5).write(jsonWriter, lValueOf5);
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 156);
        Class cls6 = Double.TYPE;
        Double dValueOf = Double.valueOf(checkeglerrororthrow.getInterfaceDescriptor);
        getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, cls6, dValueOf).write(jsonWriter, dValueOf);
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 64);
        jsonWriter.value(Integer.valueOf(checkeglerrororthrow.RemoteActionCompatParcelizer));
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 154);
        jsonWriter.value(Integer.valueOf(checkeglerrororthrow.INotificationSideChannelDefault));
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        checkEglErrorOrThrow checkeglerrororthrow = new checkEglErrorOrThrow();
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            switch (iTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                case 2:
                    if (!z) {
                        checkeglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    } else {
                        checkeglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 15:
                    if (z) {
                        checkeglerrororthrow.d = ((Long) gson.getAdapter(Long.class).read(jsonReader)).longValue();
                    }
                    break;
                case 22:
                    if (!z) {
                        break;
                    } else {
                        try {
                            checkeglerrororthrow.INotificationSideChannelDefault = jsonReader.nextInt();
                        } catch (NumberFormatException e2) {
                            throw new JsonSyntaxException(e2);
                        }
                    }
                    break;
                case 26:
                    if (!z) {
                        checkeglerrororthrow.asInterface = null;
                    } else {
                        checkeglerrororthrow.asInterface = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 51:
                    if (!z) {
                        checkeglerrororthrow.g = null;
                    } else {
                        checkeglerrororthrow.g = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 55:
                    if (!z) {
                        break;
                    } else {
                        try {
                            checkeglerrororthrow.notify = jsonReader.nextInt();
                        } catch (NumberFormatException e3) {
                            throw new JsonSyntaxException(e3);
                        }
                    }
                    break;
                case 59:
                    if (z) {
                        checkeglerrororthrow.cancelAll = ((Long) gson.getAdapter(Long.class).read(jsonReader)).longValue();
                    }
                    break;
                case 96:
                    if (!z) {
                        checkeglerrororthrow.INotificationSideChannel = null;
                    } else {
                        checkeglerrororthrow.INotificationSideChannel = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 107:
                    if (z) {
                        checkeglerrororthrow.getInterfaceDescriptor = ((Double) gson.getAdapter(Double.class).read(jsonReader)).doubleValue();
                    }
                    break;
                case 136:
                    if (z) {
                        checkeglerrororthrow.INotificationSideChannelStubProxy = ((Long) gson.getAdapter(Long.class).read(jsonReader)).longValue();
                    }
                    break;
                case 153:
                    if (!z) {
                        checkeglerrororthrow.f351a = null;
                    } else {
                        checkeglerrororthrow.f351a = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 177:
                    if (!z) {
                        break;
                    } else {
                        try {
                            checkeglerrororthrow.RemoteActionCompatParcelizer = jsonReader.nextInt();
                        } catch (NumberFormatException e4) {
                            throw new JsonSyntaxException(e4);
                        }
                    }
                    break;
                case 188:
                    if (!z) {
                        checkeglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    } else {
                        checkeglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case DerHeader.TAG_CLASS_PRIVATE /* 192 */:
                    if (!z) {
                        checkeglerrororthrow.asBinder = null;
                    } else {
                        checkeglerrororthrow.asBinder = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 193:
                    if (z) {
                        checkeglerrororthrow.TuitionPaymentFragmentbindingInflater1 = ((Long) gson.getAdapter(Long.class).read(jsonReader)).longValue();
                    }
                    break;
                case 208:
                    if (!z) {
                        checkeglerrororthrow.onTransact = null;
                    } else {
                        checkeglerrororthrow.onTransact = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 214:
                    if (!z) {
                        checkeglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    } else {
                        checkeglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 220:
                    if (z) {
                        checkeglerrororthrow.b = ((Long) gson.getAdapter(Long.class).read(jsonReader)).longValue();
                    }
                    break;
                case 222:
                    if (!z) {
                        checkeglerrororthrow.cancel = null;
                    } else {
                        checkeglerrororthrow.cancel = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return checkeglerrororthrow;
    }
}
