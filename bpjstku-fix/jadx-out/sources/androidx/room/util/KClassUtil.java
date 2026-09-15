package androidx.room.util;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a3\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "C", "Ljava/lang/Class;", "p0", "", "p1", "findAndInstantiateDatabaseImpl", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KClassUtil {
    public static /* synthetic */ Object findAndInstantiateDatabaseImpl$default(Class cls, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "_Impl";
        }
        return findAndInstantiateDatabaseImpl(cls, str);
    }

    public static final <T, C> T findAndInstantiateDatabaseImpl(Class<C> cls, String str) {
        String name;
        String string;
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(str, "");
        Package r1 = cls.getPackage();
        if (r1 == null || (name = r1.getName()) == null) {
            name = "";
        }
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNull(canonicalName);
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "");
        }
        String str2 = canonicalName;
        StringBuilder sb = new StringBuilder();
        sb.append(StringsKt.replace$default(str2, '.', '_', false, 4, (Object) null));
        sb.append(str);
        String string2 = sb.toString();
        try {
            if (name.length() == 0) {
                string = string2;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name);
                sb2.append('.');
                sb2.append(string2);
                string = sb2.toString();
            }
            Class<?> cls2 = Class.forName(string, true, cls.getClassLoader());
            Intrinsics.checkNotNull(cls2, "");
            return (T) cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e2) {
            StringBuilder sb3 = new StringBuilder("Cannot find implementation for ");
            sb3.append(cls.getCanonicalName());
            sb3.append(". ");
            sb3.append(string2);
            sb3.append(" does not exist. Is Room annotation processor correctly configured?");
            throw new RuntimeException(sb3.toString(), e2);
        } catch (IllegalAccessException e3) {
            StringBuilder sb4 = new StringBuilder("Cannot access the constructor ");
            sb4.append(cls.getCanonicalName());
            throw new RuntimeException(sb4.toString(), e3);
        } catch (InstantiationException e4) {
            StringBuilder sb5 = new StringBuilder("Failed to create an instance of ");
            sb5.append(cls.getCanonicalName());
            throw new RuntimeException(sb5.toString(), e4);
        }
    }
}
