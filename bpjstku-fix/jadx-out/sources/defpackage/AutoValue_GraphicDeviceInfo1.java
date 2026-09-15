package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoValue_GraphicDeviceInfo1 extends TypeAdapter implements SessionProcessorSurface {
    private Gson TuitionPaymentFragmentbindingInflater1;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public AutoValue_GraphicDeviceInfo1(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentbindingInflater1 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        checkGlErrorOrThrow checkglerrororthrow = (checkGlErrorOrThrow) obj;
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        jsonWriter.beginObject();
        if (checkglerrororthrow != checkglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 194);
            shouldRespectInputCropRect shouldrespectinputcroprect = checkglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, shouldRespectInputCropRect.class, shouldrespectinputcroprect).write(jsonWriter, shouldrespectinputcroprect);
        }
        if (checkglerrororthrow != checkglerrororthrow.b) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 113);
            GLUtils gLUtils = checkglerrororthrow.b;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, GLUtils.class, gLUtils).write(jsonWriter, gLUtils);
        }
        if (checkglerrororthrow != checkglerrororthrow.TuitionPaymentFragmentbindingInflater1) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 162);
            checkEglErrorOrThrow checkeglerrororthrow = checkglerrororthrow.TuitionPaymentFragmentbindingInflater1;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, checkEglErrorOrThrow.class, checkeglerrororthrow).write(jsonWriter, checkeglerrororthrow);
        }
        if (checkglerrororthrow != checkglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 188);
            checkEglErrorOrLog checkeglerrororlog = checkglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, checkEglErrorOrLog.class, checkeglerrororlog).write(jsonWriter, checkeglerrororlog);
        }
        if (checkglerrororthrow != checkglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 75);
            jsonWriter.value(checkglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        if (checkglerrororthrow != checkglerrororthrow.asInterface) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 141);
            jsonWriter.value(checkglerrororthrow.asInterface);
        }
        if (checkglerrororthrow != checkglerrororthrow.d) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 22);
            AutoValue_GraphicDeviceInfo autoValue_GraphicDeviceInfo = checkglerrororthrow.d;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, AutoValue_GraphicDeviceInfo.class, autoValue_GraphicDeviceInfo).write(jsonWriter, autoValue_GraphicDeviceInfo);
        }
        if (checkglerrororthrow != checkglerrororthrow.g) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 170);
            List list = checkglerrororthrow.g;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, List.class, list).write(jsonWriter, list);
        }
        if (checkglerrororthrow != checkglerrororthrow.f352a) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 35);
            createPBufferSurface createpbuffersurface = checkglerrororthrow.f352a;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, createPBufferSurface.class, createpbuffersurface).write(jsonWriter, createpbuffersurface);
        }
        if (checkglerrororthrow != checkglerrororthrow.asBinder) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 134);
            Map map = checkglerrororthrow.asBinder;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, Map.class, map).write(jsonWriter, map);
        }
        if (checkglerrororthrow != checkglerrororthrow.notify) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 147);
            jsonWriter.value(checkglerrororthrow.notify);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        checkGlErrorOrThrow checkglerrororthrow = new checkGlErrorOrThrow();
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            switch (iTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                case 10:
                    if (!z) {
                        checkglerrororthrow.d = null;
                    } else {
                        checkglerrororthrow.d = (AutoValue_GraphicDeviceInfo) gson.getAdapter(AutoValue_GraphicDeviceInfo.class).read(jsonReader);
                    }
                    break;
                case 75:
                    if (!z) {
                        checkglerrororthrow.g = null;
                    } else {
                        checkglerrororthrow.g = (List) gson.getAdapter(List.class).read(jsonReader);
                    }
                    break;
                case 80:
                    if (!z) {
                        checkglerrororthrow.TuitionPaymentFragmentbindingInflater1 = null;
                    } else {
                        checkglerrororthrow.TuitionPaymentFragmentbindingInflater1 = (checkEglErrorOrThrow) gson.getAdapter(checkEglErrorOrThrow.class).read(jsonReader);
                    }
                    break;
                case 88:
                    if (!z) {
                        checkglerrororthrow.f352a = null;
                    } else {
                        checkglerrororthrow.f352a = (createPBufferSurface) gson.getAdapter(createPBufferSurface.class).read(jsonReader);
                    }
                    break;
                case 113:
                    if (!z) {
                        checkglerrororthrow.asInterface = null;
                    } else {
                        checkglerrororthrow.asInterface = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 124:
                    if (!z) {
                        checkglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    } else {
                        checkglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 150:
                    if (!z) {
                        checkglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    } else {
                        checkglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (checkEglErrorOrLog) gson.getAdapter(checkEglErrorOrLog.class).read(jsonReader);
                    }
                    break;
                case 187:
                    if (!z) {
                        checkglerrororthrow.asBinder = null;
                    } else {
                        checkglerrororthrow.asBinder = (Map) gson.getAdapter(Map.class).read(jsonReader);
                    }
                    break;
                case 207:
                    if (!z) {
                        checkglerrororthrow.b = null;
                    } else {
                        checkglerrororthrow.b = (GLUtils) gson.getAdapter(GLUtils.class).read(jsonReader);
                    }
                    break;
                case 226:
                    if (!z) {
                        checkglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    } else {
                        checkglerrororthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (shouldRespectInputCropRect) gson.getAdapter(shouldRespectInputCropRect.class).read(jsonReader);
                    }
                    break;
                case 234:
                    if (!z) {
                        checkglerrororthrow.notify = null;
                    } else {
                        checkglerrororthrow.notify = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return checkglerrororthrow;
    }
}
