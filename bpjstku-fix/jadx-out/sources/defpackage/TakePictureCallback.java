package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TakePictureCallback {
    public abstract long TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    public static TakePictureCallback TuitionPaymentFragmentspecialinlinedviewModeldefault2(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        RequestWithCallbackExternalSyntheticLambda1 requestWithCallbackExternalSyntheticLambda1 = new RequestWithCallbackExternalSyntheticLambda1(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return requestWithCallbackExternalSyntheticLambda1;
                    }
                    RequestWithCallbackExternalSyntheticLambda1 requestWithCallbackExternalSyntheticLambda2 = new RequestWithCallbackExternalSyntheticLambda1(jsonReader.nextLong());
                    jsonReader.close();
                    return requestWithCallbackExternalSyntheticLambda2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }
}
