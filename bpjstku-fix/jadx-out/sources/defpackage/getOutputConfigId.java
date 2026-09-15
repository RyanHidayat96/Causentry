package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes4.dex */
public final class getOutputConfigId {
    public static TypeAdapter TuitionPaymentFragmentbindingInflater1(Gson gson, TypeToken typeToken, Object obj) {
        Type type = typeToken.getType();
        Type type2 = (obj == null || !(type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) ? type : obj.getClass();
        TypeAdapter adapter = gson.getAdapter(TypeToken.get(type2));
        if (type != type2 && ((adapter instanceof SessionProcessorSurface) || (adapter instanceof ReflectiveTypeAdapterFactory.Adapter))) {
            TypeAdapter adapter2 = gson.getAdapter(typeToken);
            if (!(adapter2 instanceof SessionProcessorSurface) && !(adapter2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                return adapter2;
            }
        }
        return adapter;
    }

    public static TypeAdapter TuitionPaymentFragmentspecialinlinedviewModeldefault1(Gson gson, Class cls, Object obj) {
        Class cls2 = (obj == null || !(cls == Object.class || (cls instanceof Class))) ? cls : obj.getClass();
        TypeAdapter adapter = gson.getAdapter(TypeToken.get((Type) cls2));
        if (cls != cls2 && ((adapter instanceof SessionProcessorSurface) || (adapter instanceof ReflectiveTypeAdapterFactory.Adapter))) {
            TypeAdapter adapter2 = gson.getAdapter(cls);
            if (!(adapter2 instanceof SessionProcessorSurface) && !(adapter2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                return adapter2;
            }
        }
        return adapter;
    }
}
