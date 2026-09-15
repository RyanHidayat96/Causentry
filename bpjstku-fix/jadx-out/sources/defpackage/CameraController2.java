package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraController2 {
    private static final Map<KClass<?>, videoProfileHdrFormatsToDynamicRangeEncoding<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    public static final <T> videoProfileHdrFormatsToDynamicRangeEncoding<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        return (videoProfileHdrFormatsToDynamicRangeEncoding) TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(kClass);
    }

    public static final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, checkAudioPermissionGranted checkaudiopermissiongranted) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(checkaudiopermissiongranted, "");
        for (videoProfileHdrFormatsToDynamicRangeEncoding<?> videoprofilehdrformatstodynamicrangeencoding : TuitionPaymentFragmentspecialinlinedviewModeldefault1.values()) {
            if (Intrinsics.areEqual(str, videoprofilehdrformatstodynamicrangeencoding.getDescriptor().getINotificationSideChannel())) {
                StringBuilder sb = new StringBuilder("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ");
                sb.append(str);
                sb.append(" there already exists ");
                sb.append(Reflection.getOrCreateKotlinClass(videoprofilehdrformatstodynamicrangeencoding.getClass()).getSimpleName());
                sb.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(StringsKt.trimIndent(sb.toString()));
            }
        }
        return new CameraController3(str, checkaudiopermissiongranted);
    }
}
