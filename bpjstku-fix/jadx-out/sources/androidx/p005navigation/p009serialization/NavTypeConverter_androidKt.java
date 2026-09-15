package androidx.p005navigation.p009serialization;

import androidx.p005navigation.NavType;
import defpackage.createImageAnalysis;
import defpackage.deactivateRecording;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LcreateImageAnalysis;", "Landroidx/navigation/NavType;", "parseEnum", "(LcreateImageAnalysis;)Landroidx/navigation/NavType;", "parseNullableEnum", "parseEnumList", "Ljava/lang/Class;", "getClass", "(LcreateImageAnalysis;)Ljava/lang/Class;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NavTypeConverter_androidKt {
    public static final NavType<?> parseEnum(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        NavType<?> serializableOrParcelableType$navigation_common_release = NavType.INSTANCE.parseSerializableOrParcelableType$navigation_common_release(getClass(createimageanalysis), false);
        return serializableOrParcelableType$navigation_common_release == null ? UNKNOWN.INSTANCE : serializableOrParcelableType$navigation_common_release;
    }

    public static final NavType<?> parseNullableEnum(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Class<?> cls = getClass(createimageanalysis);
        if (Enum.class.isAssignableFrom(cls)) {
            Intrinsics.checkNotNull(cls, "");
            return new InternalAndroidNavType.EnumNullableType(cls);
        }
        return UNKNOWN.INSTANCE;
    }

    public static final NavType<?> parseEnumList(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Class<?> cls = getClass(createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0));
        Intrinsics.checkNotNull(cls, "");
        return new InternalAndroidNavType.EnumListType(cls);
    }

    private static final Class<?> getClass(createImageAnalysis createimageanalysis) {
        String strReplace$default = StringsKt.replace$default(createimageanalysis.getINotificationSideChannel(), "?", "", false, 4, (Object) null);
        try {
            Class<?> cls = Class.forName(strReplace$default);
            Intrinsics.checkNotNullExpressionValue(cls, "");
            return cls;
        } catch (ClassNotFoundException unused) {
            String str = strReplace$default;
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) ".", false, 2, (Object) null)) {
                Class<?> cls2 = Class.forName(new Regex("(\\.+)(?!.*\\.)").replace(str, "\\$"));
                Intrinsics.checkNotNullExpressionValue(cls2, "");
                return cls2;
            }
            StringBuilder sb = new StringBuilder("Cannot find class with name \"");
            sb.append(createimageanalysis.getINotificationSideChannel());
            sb.append("\". Ensure that the serialName for this argument is the default fully qualified name");
            String string = sb.toString();
            if (createimageanalysis.TuitionPaymentFragmentbindingInflater1() instanceof deactivateRecording.TuitionPaymentFragmentbindingInflater1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
                string = sb2.toString();
            }
            throw new IllegalArgumentException(string);
        }
    }
}
