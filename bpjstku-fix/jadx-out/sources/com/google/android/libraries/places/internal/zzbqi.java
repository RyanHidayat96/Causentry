package com.google.android.libraries.places.internal;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import defpackage.CameraStateRegistryCameraRegistration;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbqi {
    private static final Logger zza = Logger.getLogger(zzbqi.class.getName());

    public static Object zza(String str) throws IOException {
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        try {
            Object objZzb = zzb(jsonReader);
            try {
                return objZzb;
            } catch (IOException e2) {
                return objZzb;
            }
        } finally {
            try {
                jsonReader.close();
            } catch (IOException e3) {
                zza.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e3);
            }
        }
    }

    private static Object zzb(JsonReader jsonReader) throws IOException {
        boolean z;
        if (!jsonReader.hasNext()) {
            throw new IllegalStateException("unexpected end of JSON");
        }
        switch (zzbqh.zza[jsonReader.peek().ordinal()]) {
            case 1:
                jsonReader.beginArray();
                ArrayList arrayList = new ArrayList();
                while (jsonReader.hasNext()) {
                    arrayList.add(zzb(jsonReader));
                }
                z = jsonReader.peek() == JsonToken.END_ARRAY;
                String strConcat = "Bad token: ".concat(String.valueOf(jsonReader.getPath()));
                if (!z) {
                    throw new IllegalStateException(String.valueOf(strConcat));
                }
                jsonReader.endArray();
                return Collections.unmodifiableList(arrayList);
            case 2:
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    if (!(!linkedHashMap.containsKey(strNextName))) {
                        throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Duplicate key found: %s", strNextName));
                    }
                    linkedHashMap.put(strNextName, zzb(jsonReader));
                }
                z = jsonReader.peek() == JsonToken.END_OBJECT;
                String strConcat2 = "Bad token: ".concat(String.valueOf(jsonReader.getPath()));
                if (!z) {
                    throw new IllegalStateException(String.valueOf(strConcat2));
                }
                jsonReader.endObject();
                return Collections.unmodifiableMap(linkedHashMap);
            case 3:
                return jsonReader.nextString();
            case 4:
                return Double.valueOf(jsonReader.nextDouble());
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException("Bad token: ".concat(String.valueOf(jsonReader.getPath())));
        }
    }

    private zzbqi() {
    }
}
