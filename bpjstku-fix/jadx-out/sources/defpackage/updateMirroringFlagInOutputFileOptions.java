package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Map;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes4.dex */
public final class updateMirroringFlagInOutputFileOptions {
    public static final <T> videoProfileHdrFormatsToDynamicRangeEncoding<T> TuitionPaymentFragmentbindingInflater1(KClass<T> kClass, videoProfileHdrFormatsToDynamicRangeEncoding<Object>... videoprofilehdrformatstodynamicrangeencodingArr) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr, "");
        return TuitionPaymentFragmentbindingInflater1(JvmClassMappingKt.getJavaClass((KClass) kClass), (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, videoprofilehdrformatstodynamicrangeencodingArr.length));
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0108  */
    public static final <T> videoProfileHdrFormatsToDynamicRangeEncoding<T> TuitionPaymentFragmentbindingInflater1(Class<T> cls, videoProfileHdrFormatsToDynamicRangeEncoding<Object>... videoprofilehdrformatstodynamicrangeencodingArr) {
        videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding;
        CorrectNegativeLatLongForMediaMuxer correctNegativeLatLongForMediaMuxer;
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr, "");
        if (!cls.isEnum() || cls.getAnnotation(CorrectNegativeLatLongForMediaMuxer.class) != null || cls.getAnnotation(videoProfileBitDepthToDynamicRangeBitDepth.class) != null) {
            videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr2 = (videoProfileHdrFormatsToDynamicRangeEncoding[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, videoprofilehdrformatstodynamicrangeencodingArr.length);
            Object objB = b(cls, "Companion");
            videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = objB == null ? null : TuitionPaymentFragmentbindingInflater1(objB, (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr2, videoprofilehdrformatstodynamicrangeencodingArr2.length));
            if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
                return videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1;
            }
            String canonicalName = cls.getCanonicalName();
            if (canonicalName == null || StringsKt.startsWith$default(canonicalName, "java.", false, 2, (Object) null) || StringsKt.startsWith$default(canonicalName, "kotlin.", false, 2, (Object) null)) {
                videoprofilehdrformatstodynamicrangeencoding = null;
            } else {
                Field[] declaredFields = cls.getDeclaredFields();
                Intrinsics.checkNotNullExpressionValue(declaredFields, "");
                Field[] fieldArr = declaredFields;
                int length = fieldArr.length;
                Field field = null;
                int i = 0;
                boolean z = false;
                while (true) {
                    if (i >= length) {
                        if (!z) {
                            break;
                        }
                        break;
                    }
                    Field field2 = fieldArr[i];
                    Field field3 = field2;
                    if (Intrinsics.areEqual(field3.getName(), "INSTANCE") && Intrinsics.areEqual(field3.getType(), cls) && Modifier.isStatic(field3.getModifiers())) {
                        if (!z) {
                            z = true;
                            field = field2;
                        }
                    }
                    i++;
                    field = null;
                    break;
                }
                Field field4 = field;
                if (field4 != null) {
                    Object obj = field4.get(null);
                    Method[] methods = cls.getMethods();
                    Intrinsics.checkNotNullExpressionValue(methods, "");
                    Method[] methodArr = methods;
                    int length2 = methodArr.length;
                    Method method = null;
                    int i2 = 0;
                    boolean z2 = false;
                    while (true) {
                        if (i2 >= length2) {
                            if (!z2) {
                                break;
                            }
                            break;
                        }
                        Method method2 = methodArr[i2];
                        Method method3 = method2;
                        if (Intrinsics.areEqual(method3.getName(), "serializer")) {
                            Class<?>[] parameterTypes = method3.getParameterTypes();
                            Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
                            if (parameterTypes.length == 0 && Intrinsics.areEqual(method3.getReturnType(), videoProfileHdrFormatsToDynamicRangeEncoding.class)) {
                                if (!z2) {
                                    z2 = true;
                                    method = method2;
                                }
                            }
                        }
                        i2++;
                        method = null;
                        break;
                    }
                    Method method4 = method;
                    if (method4 != null) {
                        Object objInvoke = method4.invoke(obj, new Object[0]);
                        if (objInvoke instanceof videoProfileHdrFormatsToDynamicRangeEncoding) {
                            videoprofilehdrformatstodynamicrangeencoding = (videoProfileHdrFormatsToDynamicRangeEncoding) objInvoke;
                        } else {
                            videoprofilehdrformatstodynamicrangeencoding = null;
                        }
                    } else {
                        videoprofilehdrformatstodynamicrangeencoding = null;
                    }
                } else {
                    videoprofilehdrformatstodynamicrangeencoding = null;
                }
            }
            if (videoprofilehdrformatstodynamicrangeencoding != null) {
                return videoprofilehdrformatstodynamicrangeencoding;
            }
            videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(cls, (videoProfileHdrFormatsToDynamicRangeEncoding[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, videoprofilehdrformatstodynamicrangeencodingArr.length));
            if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                return videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            if (cls.getAnnotation(videoProfileBitDepthToDynamicRangeBitDepth.class) == null && ((correctNegativeLatLongForMediaMuxer = (CorrectNegativeLatLongForMediaMuxer) cls.getAnnotation(CorrectNegativeLatLongForMediaMuxer.class)) == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(correctNegativeLatLongForMediaMuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault2()), Reflection.getOrCreateKotlinClass(getFirstVideoProfile.class)))) {
                return null;
            }
            return new getFirstVideoProfile(JvmClassMappingKt.getKotlinClass(cls));
        }
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName2 = cls.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName2, "");
        Intrinsics.checkNotNull(enumConstants, "");
        return new getInitializationFuture(canonicalName2, (Enum[]) enumConstants);
    }

    private static final <T> videoProfileHdrFormatsToDynamicRangeEncoding<T> TuitionPaymentFragmentbindingInflater1(Object obj, videoProfileHdrFormatsToDynamicRangeEncoding<Object>... videoprofilehdrformatstodynamicrangeencodingArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (videoprofilehdrformatstodynamicrangeencodingArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = videoprofilehdrformatstodynamicrangeencodingArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = videoProfileHdrFormatsToDynamicRangeEncoding.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, videoprofilehdrformatstodynamicrangeencodingArr.length));
            if (objInvoke instanceof videoProfileHdrFormatsToDynamicRangeEncoding) {
                return (videoProfileHdrFormatsToDynamicRangeEncoding) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e2.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final Object b(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Map<KClass<?>, videoProfileHdrFormatsToDynamicRangeEncoding<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        Intrinsics.checkNotNullParameter(StringCompanionObject.INSTANCE, "");
        mapCreateMapBuilder.put(orCreateKotlinClass, CameraControllerUseCases.INSTANCE);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Character.TYPE);
        Intrinsics.checkNotNullParameter(CharCompanionObject.INSTANCE, "");
        mapCreateMapBuilder.put(orCreateKotlinClass2, getImageAnalysisBackgroundExecutor.INSTANCE);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(char[].class), deactivateRecordingByListener.INSTANCE);
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Double.TYPE);
        Intrinsics.checkNotNullParameter(DoubleCompanionObject.INSTANCE, "");
        mapCreateMapBuilder.put(orCreateKotlinClass3, getImageCaptureIoExecutor.INSTANCE);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(double[].class), getImageCaptureFlashMode.INSTANCE);
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Float.TYPE);
        Intrinsics.checkNotNullParameter(FloatCompanionObject.INSTANCE, "");
        mapCreateMapBuilder.put(orCreateKotlinClass4, getVideoCaptureTargetFrameRate.INSTANCE);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(float[].class), getVideoCaptureQualitySelector.INSTANCE);
        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Long.TYPE);
        Intrinsics.checkNotNullParameter(LongCompanionObject.INSTANCE, "");
        mapCreateMapBuilder.put(orCreateKotlinClass5, setImageAnalysisBackgroundExecutor.INSTANCE);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(long[].class), setImageAnalysisOutputImageFormat.INSTANCE);
        KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(ULong.class);
        Intrinsics.checkNotNullParameter(ULong.INSTANCE, "");
        mapCreateMapBuilder.put(orCreateKotlinClass6, cancelFlow.INSTANCE);
        KClass orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(Integer.TYPE);
        Intrinsics.checkNotNullParameter(IntCompanionObject.INSTANCE, "");
        mapCreateMapBuilder.put(orCreateKotlinClass7, lambdanew1androidxcameraviewCameraController.INSTANCE);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(int[].class), lambdanew0androidxcameraviewCameraController.INSTANCE);
        KClass orCreateKotlinClass8 = Reflection.getOrCreateKotlinClass(UInt.class);
        Intrinsics.checkNotNullParameter(UInt.INSTANCE, "");
        mapCreateMapBuilder.put(orCreateKotlinClass8, startPreviewStreamStateFlow.INSTANCE);
        KClass orCreateKotlinClass9 = Reflection.getOrCreateKotlinClass(Short.TYPE);
        Intrinsics.checkNotNullParameter(ShortCompanionObject.INSTANCE, "");
        mapCreateMapBuilder.put(orCreateKotlinClass9, CameraControllerOutputSize.INSTANCE);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(short[].class), FlashModeConverter.INSTANCE);
        KClass orCreateKotlinClass10 = Reflection.getOrCreateKotlinClass(UShort.class);
        Intrinsics.checkNotNullParameter(UShort.INSTANCE, "");
        mapCreateMapBuilder.put(orCreateKotlinClass10, PreviewStreamStateObserverExternalSyntheticLambda0.INSTANCE);
        KClass orCreateKotlinClass11 = Reflection.getOrCreateKotlinClass(Byte.TYPE);
        Intrinsics.checkNotNullParameter(ByteCompanionObject.INSTANCE, "");
        mapCreateMapBuilder.put(orCreateKotlinClass11, unbindVideoAndRecreate.INSTANCE);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(byte[].class), wrapListenerToDeactivateRecordingOnFinalized.INSTANCE);
        KClass orCreateKotlinClass12 = Reflection.getOrCreateKotlinClass(UByte.class);
        Intrinsics.checkNotNullParameter(UByte.INSTANCE, "");
        mapCreateMapBuilder.put(orCreateKotlinClass12, lambdasetValue0androidxcameraviewPendingValue.INSTANCE);
        KClass orCreateKotlinClass13 = Reflection.getOrCreateKotlinClass(Boolean.TYPE);
        Intrinsics.checkNotNullParameter(BooleanCompanionObject.INSTANCE, "");
        mapCreateMapBuilder.put(orCreateKotlinClass13, unbindPreviewAndRecreate.INSTANCE);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(boolean[].class), throwExceptionForInvalidScreenFlashCapture.INSTANCE);
        KClass orCreateKotlinClass14 = Reflection.getOrCreateKotlinClass(Unit.class);
        Intrinsics.checkNotNullParameter(Unit.INSTANCE, "");
        mapCreateMapBuilder.put(orCreateKotlinClass14, PreviewStreamStateObserverExternalSyntheticLambda1.INSTANCE);
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Void.class), setPreviewDynamicRange.INSTANCE);
        try {
            KClass orCreateKotlinClass15 = Reflection.getOrCreateKotlinClass(Duration.class);
            Intrinsics.checkNotNullParameter(Duration.INSTANCE, "");
            mapCreateMapBuilder.put(orCreateKotlinClass15, getPreviewDynamicRange.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(ULongArray.class), lambdastartPreviewStreamStateFlow0androidxcameraviewPreviewStreamStateObserver.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UIntArray.class), waitForCaptureResult.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UShortArray.class), lambdastartPreviewStreamStateFlow1androidxcameraviewPreviewStreamStateObserver.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UByteArray.class), PendingValueExternalSyntheticLambda0.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            KClass orCreateKotlinClass16 = Reflection.getOrCreateKotlinClass(Uuid.class);
            Intrinsics.checkNotNullParameter(Uuid.INSTANCE, "");
            mapCreateMapBuilder.put(orCreateKotlinClass16, lambdawaitForCaptureResult2androidxcameraviewPreviewStreamStateObserver.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    private static final <T> videoProfileHdrFormatsToDynamicRangeEncoding<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Class<T> cls, videoProfileHdrFormatsToDynamicRangeEncoding<Object>... videoprofilehdrformatstodynamicrangeencodingArr) {
        Class<?> cls2;
        Object objB;
        Field field;
        videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "");
        Class<?>[] clsArr = declaredClasses;
        int length = clsArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                cls2 = null;
                break;
            }
            cls2 = clsArr[i2];
            if (cls2.getAnnotation(setImageAnalysisTargetSize.class) != null) {
                break;
            }
            i2++;
        }
        Class<?> cls3 = cls2;
        if (cls3 == null) {
            objB = null;
        } else {
            String simpleName = cls3.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            objB = b(cls, simpleName);
        }
        if (objB != null && (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(objB, (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, videoprofilehdrformatstodynamicrangeencodingArr.length))) != null) {
            return videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1;
        }
        try {
            Class<?>[] declaredClasses2 = cls.getDeclaredClasses();
            Intrinsics.checkNotNullExpressionValue(declaredClasses2, "");
            Class<?>[] clsArr2 = declaredClasses2;
            int length2 = clsArr2.length;
            boolean z = false;
            Class<?> cls4 = null;
            while (true) {
                if (i >= length2) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Class<?> cls5 = clsArr2[i];
                if (Intrinsics.areEqual(cls5.getSimpleName(), "$serializer")) {
                    if (!z) {
                        z = true;
                        cls4 = cls5;
                    }
                }
                i++;
                cls4 = null;
                break;
            }
            Class<?> cls6 = cls4;
            Object obj = (cls6 == null || (field = cls6.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof videoProfileHdrFormatsToDynamicRangeEncoding) {
                return (videoProfileHdrFormatsToDynamicRangeEncoding) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }
}
