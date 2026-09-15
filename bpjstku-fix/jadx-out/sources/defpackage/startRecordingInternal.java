package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes4.dex */
public final class startRecordingInternal {
    public static final Void b(String str, KClass<?> kClass) {
        String string;
        Intrinsics.checkNotNullParameter(kClass, "");
        StringBuilder sb = new StringBuilder("in the polymorphic scope of '");
        sb.append(kClass.getSimpleName());
        sb.append('\'');
        String string2 = sb.toString();
        if (str == null) {
            StringBuilder sb2 = new StringBuilder("Class discriminator was missing and no default serializers were registered ");
            sb2.append(string2);
            sb2.append('.');
            string = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder("Serializer for subclass '");
            sb3.append(str);
            sb3.append("' is not found ");
            sb3.append(string2);
            sb3.append(".\nCheck if class with serial name '");
            sb3.append(str);
            sb3.append("' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '");
            sb3.append(str);
            sb3.append("' has to be '@Serializable', and the base class '");
            sb3.append(kClass.getSimpleName());
            sb3.append("' has to be sealed and '@Serializable'.");
            string = sb3.toString();
        }
        throw new SerializationException(string);
    }
}
