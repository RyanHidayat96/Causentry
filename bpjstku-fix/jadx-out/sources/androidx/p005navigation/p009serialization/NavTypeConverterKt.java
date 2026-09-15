package androidx.p005navigation.p009serialization;

import androidx.p005navigation.NavType;
import defpackage.PreviewViewImplementationOnSurfaceNotInUseListener;
import defpackage.createImageAnalysis;
import defpackage.deactivateRecording;
import defpackage.isCloseToRealtime;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import defpackage.waitForNextFrame;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LcreateImageAnalysis;", "Landroidx/navigation/NavType;", "getNavType", "(LcreateImageAnalysis;)Landroidx/navigation/NavType;", "Landroidx/navigation/serialization/InternalType;", "toInternalType", "(LcreateImageAnalysis;)Landroidx/navigation/serialization/InternalType;", "Lkotlin/reflect/KType;", "p0", "", "matchKType", "(LcreateImageAnalysis;Lkotlin/reflect/KType;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NavTypeConverterKt {

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InternalType.values().length];
            try {
                iArr[InternalType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalType.STRING_NULLABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InternalType.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InternalType.BOOL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InternalType.DOUBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InternalType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InternalType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InternalType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[InternalType.INT_NULLABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[InternalType.BOOL_NULLABLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[InternalType.DOUBLE_NULLABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[InternalType.FLOAT_NULLABLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[InternalType.LONG_NULLABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[InternalType.INT_ARRAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[InternalType.BOOL_ARRAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[InternalType.DOUBLE_ARRAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[InternalType.FLOAT_ARRAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[InternalType.LONG_ARRAY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[InternalType.ARRAY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[InternalType.LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[InternalType.ENUM_NULLABLE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final NavType<?> getNavType(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        switch (WhenMappings.$EnumSwitchMapping$0[toInternalType(createimageanalysis).ordinal()]) {
            case 1:
                return InternalNavType.INSTANCE.getStringNonNullableType();
            case 2:
                return NavType.StringType;
            case 3:
                return NavType.IntType;
            case 4:
                return NavType.BoolType;
            case 5:
                return InternalNavType.INSTANCE.getDoubleType();
            case 6:
                return NavType.FloatType;
            case 7:
                return NavType.LongType;
            case 8:
                return NavTypeConverter_androidKt.parseEnum(createimageanalysis);
            case 9:
                return InternalNavType.INSTANCE.getIntNullableType();
            case 10:
                return InternalNavType.INSTANCE.getBoolNullableType();
            case 11:
                return InternalNavType.INSTANCE.getDoubleNullableType();
            case 12:
                return InternalNavType.INSTANCE.getFloatNullableType();
            case 13:
                return InternalNavType.INSTANCE.getLongNullableType();
            case 14:
                return NavType.IntArrayType;
            case 15:
                return NavType.BoolArrayType;
            case 16:
                return InternalNavType.INSTANCE.getDoubleArrayType();
            case 17:
                return NavType.FloatArrayType;
            case 18:
                return NavType.LongArrayType;
            case 19:
                int i = WhenMappings.$EnumSwitchMapping$0[toInternalType(createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0)).ordinal()];
                if (i == 1) {
                    return NavType.StringArrayType;
                }
                if (i == 2) {
                    return InternalNavType.INSTANCE.getStringNullableArrayType();
                }
                return UNKNOWN.INSTANCE;
            case 20:
                switch (WhenMappings.$EnumSwitchMapping$0[toInternalType(createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0)).ordinal()]) {
                    case 1:
                        return NavType.StringListType;
                    case 2:
                        return InternalNavType.INSTANCE.getStringNullableListType();
                    case 3:
                        return NavType.IntListType;
                    case 4:
                        return NavType.BoolListType;
                    case 5:
                        return InternalNavType.INSTANCE.getDoubleListType();
                    case 6:
                        return NavType.FloatListType;
                    case 7:
                        return NavType.LongListType;
                    case 8:
                        return NavTypeConverter_androidKt.parseEnumList(createimageanalysis);
                    default:
                        return UNKNOWN.INSTANCE;
                }
            case 21:
                return NavTypeConverter_androidKt.parseNullableEnum(createimageanalysis);
            default:
                return UNKNOWN.INSTANCE;
        }
    }

    private static final InternalType toInternalType(createImageAnalysis createimageanalysis) {
        String strReplace$default = StringsKt.replace$default(createimageanalysis.getINotificationSideChannel(), "?", "", false, 4, (Object) null);
        if (Intrinsics.areEqual(createimageanalysis.TuitionPaymentFragmentbindingInflater1(), deactivateRecording.TuitionPaymentFragmentbindingInflater1.INSTANCE)) {
            return createimageanalysis.d() ? InternalType.ENUM_NULLABLE : InternalType.ENUM;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.Int")) {
            return createimageanalysis.d() ? InternalType.INT_NULLABLE : InternalType.INT;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.Boolean")) {
            return createimageanalysis.d() ? InternalType.BOOL_NULLABLE : InternalType.BOOL;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.Double")) {
            return createimageanalysis.d() ? InternalType.DOUBLE_NULLABLE : InternalType.DOUBLE;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.Float")) {
            return createimageanalysis.d() ? InternalType.FLOAT_NULLABLE : InternalType.FLOAT;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.Long")) {
            return createimageanalysis.d() ? InternalType.LONG_NULLABLE : InternalType.LONG;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.String")) {
            return createimageanalysis.d() ? InternalType.STRING_NULLABLE : InternalType.STRING;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.IntArray")) {
            return InternalType.INT_ARRAY;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.DoubleArray")) {
            return InternalType.DOUBLE_ARRAY;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.BooleanArray")) {
            return InternalType.BOOL_ARRAY;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.FloatArray")) {
            return InternalType.FLOAT_ARRAY;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.LongArray")) {
            return InternalType.LONG_ARRAY;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.Array")) {
            return InternalType.ARRAY;
        }
        return StringsKt.startsWith$default(strReplace$default, "kotlin.collections.ArrayList", false, 2, (Object) null) ? InternalType.LIST : InternalType.UNKNOWN;
    }

    public static final boolean matchKType(createImageAnalysis createimageanalysis, KType kType) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(kType, "");
        if (createimageanalysis.d() != kType.isMarkedNullable()) {
            return false;
        }
        Intrinsics.checkNotNullParameter(kType, "");
        PreviewViewImplementationOnSurfaceNotInUseListener previewViewImplementationOnSurfaceNotInUseListenerB = waitForNextFrame.b();
        Intrinsics.checkNotNullParameter(previewViewImplementationOnSurfaceNotInUseListenerB, "");
        Intrinsics.checkNotNullParameter(kType, "");
        videoProfileHdrFormatsToDynamicRangeEncoding<Object> videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault1 = isCloseToRealtime.TuitionPaymentFragmentspecialinlinedviewModeldefault1(previewViewImplementationOnSurfaceNotInUseListenerB, kType, false);
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            StringBuilder sb = new StringBuilder("Cannot find KSerializer for [");
            sb.append(createimageanalysis.getINotificationSideChannel());
            sb.append("]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.");
            throw new IllegalStateException(sb.toString().toString());
        }
        return Intrinsics.areEqual(createimageanalysis, videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault1.getDescriptor());
    }
}
