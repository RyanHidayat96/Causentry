package defpackage;

import android.os.Process;
import androidx.work.WorkInfo;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.Typography;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public final class setAspectRatio {
    public static final AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: setAspectRatio.5
        @Override // AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final AutoValue_RecordingStats<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Type type, Set<? extends Annotation> set, CapabilitiesByQuality capabilitiesByQuality) {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return setAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            if (type == Byte.TYPE) {
                return setAspectRatio.TuitionPaymentFragmentbindingInflater1;
            }
            if (type == Character.TYPE) {
                return setAspectRatio.b;
            }
            if (type == Double.TYPE) {
                return setAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            if (type == Float.TYPE) {
                return setAspectRatio.g;
            }
            if (type == Integer.TYPE) {
                return setAspectRatio.d;
            }
            if (type == Long.TYPE) {
                return setAspectRatio.asInterface;
            }
            if (type == Short.TYPE) {
                return setAspectRatio.asBinder;
            }
            if (type != Boolean.class) {
                if (type != Byte.class) {
                    if (type != Character.class) {
                        if (type != Double.class) {
                            if (type != Float.class) {
                                if (type != Integer.class) {
                                    if (type != Long.class) {
                                        if (type != Short.class) {
                                            if (type != String.class) {
                                                if (type != Object.class) {
                                                    Class<?> clsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = toValidatedProfiles.TuitionPaymentFragmentspecialinlinedviewModeldefault2(type);
                                                    AutoValue_RecordingStats<?> autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(capabilitiesByQuality, type, clsTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                                    if (autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                                        return autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                    }
                                                    if (clsTuitionPaymentFragmentspecialinlinedviewModeldefault2.isEnum()) {
                                                        return new getEncoderProfiles(new TuitionPaymentFragmentbindingInflater1(clsTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                                    }
                                                    return null;
                                                }
                                                return new getEncoderProfiles(new b(capabilitiesByQuality));
                                            }
                                            return new getEncoderProfiles(setAspectRatio.f1358a);
                                        }
                                        return new getEncoderProfiles(setAspectRatio.asBinder);
                                    }
                                    return new getEncoderProfiles(setAspectRatio.asInterface);
                                }
                                return new getEncoderProfiles(setAspectRatio.d);
                            }
                            return new getEncoderProfiles(setAspectRatio.g);
                        }
                        return new getEncoderProfiles(setAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                    return new getEncoderProfiles(setAspectRatio.b);
                }
                return new getEncoderProfiles(setAspectRatio.TuitionPaymentFragmentbindingInflater1);
            }
            return new getEncoderProfiles(setAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    };
    static final AutoValue_RecordingStats<Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AutoValue_RecordingStats<Boolean>() { // from class: setAspectRatio.2
        @Override // defpackage.AutoValue_RecordingStats
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, Boolean bool) throws IOException {
            setqualityselector.b(bool.booleanValue());
        }

        public final String toString() {
            return "JsonAdapter(Boolean)";
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final /* synthetic */ Boolean b(JsonReader jsonReader) throws IOException {
            return Boolean.valueOf(jsonReader.asInterface());
        }
    };
    static final AutoValue_RecordingStats<Byte> TuitionPaymentFragmentbindingInflater1 = new AutoValue_RecordingStats<Byte>() { // from class: setAspectRatio.1
        @Override // defpackage.AutoValue_RecordingStats
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, Byte b2) throws IOException {
            setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault2(b2.intValue() & 255);
        }

        public final String toString() {
            return "JsonAdapter(Byte)";
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final /* synthetic */ Byte b(JsonReader jsonReader) throws IOException {
            return Byte.valueOf((byte) setAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jsonReader, "a byte", WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT, 255));
        }
    };
    static final AutoValue_RecordingStats<Character> b = new AutoValue_RecordingStats<Character>() { // from class: setAspectRatio.10
        @Override // defpackage.AutoValue_RecordingStats
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, Character ch) throws IOException {
            setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ch.toString());
        }

        public final String toString() {
            return "JsonAdapter(Character)";
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final /* synthetic */ Character b(JsonReader jsonReader) throws IOException {
            String strCancel = jsonReader.cancel();
            if (strCancel.length() > 1) {
                StringBuilder sb = new StringBuilder("\"");
                sb.append(strCancel);
                sb.append(Typography.quote);
                throw new JsonDataException(String.format("Expected %s but was %s at path %s", "a char", sb.toString(), getStreamState.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader.g, jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1, jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2, jsonReader.TuitionPaymentFragmentbindingInflater1)));
            }
            return Character.valueOf(strCancel.charAt(0));
        }
    };
    static final AutoValue_RecordingStats<Double> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AnonymousClass6();
    static final AutoValue_RecordingStats<Float> g = new AutoValue_RecordingStats<Float>() { // from class: setAspectRatio.8
        @Override // defpackage.AutoValue_RecordingStats
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, Float f) throws IOException {
            setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(f);
        }

        public final String toString() {
            return "JsonAdapter(Float)";
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final /* synthetic */ Float b(JsonReader jsonReader) throws IOException {
            float fAsBinder = (float) jsonReader.asBinder();
            if (!jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Float.isInfinite(fAsBinder)) {
                StringBuilder sb = new StringBuilder("JSON forbids NaN and infinities: ");
                sb.append(fAsBinder);
                sb.append(" at path ");
                sb.append(jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                throw new JsonDataException(sb.toString());
            }
            return Float.valueOf(fAsBinder);
        }
    };
    static final AutoValue_RecordingStats<Integer> d = new AutoValue_RecordingStats<Integer>() { // from class: setAspectRatio.7
        @Override // defpackage.AutoValue_RecordingStats
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, Integer num) throws IOException {
            setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault2(num.intValue());
        }

        public final String toString() {
            return "JsonAdapter(Integer)";
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final /* synthetic */ Integer b(JsonReader jsonReader) throws IOException {
            return Integer.valueOf(jsonReader.g());
        }
    };
    static final AutoValue_RecordingStats<Long> asInterface = new AutoValue_RecordingStats<Long>() { // from class: setAspectRatio.9
        @Override // defpackage.AutoValue_RecordingStats
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, Long l) throws IOException {
            setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault2(l.longValue());
        }

        public final String toString() {
            return "JsonAdapter(Long)";
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final /* synthetic */ Long b(JsonReader jsonReader) throws IOException {
            return Long.valueOf(jsonReader.d());
        }
    };
    static final AutoValue_RecordingStats<Short> asBinder = new AutoValue_RecordingStats<Short>() { // from class: setAspectRatio.15
        @Override // defpackage.AutoValue_RecordingStats
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, Short sh) throws IOException {
            setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sh.intValue());
        }

        public final String toString() {
            return "JsonAdapter(Short)";
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final /* synthetic */ Short b(JsonReader jsonReader) throws IOException {
            return Short.valueOf((short) setAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jsonReader, "a short", -32768, 32767));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final AutoValue_RecordingStats<String> f1358a = new AutoValue_RecordingStats<String>() { // from class: setAspectRatio.4
        @Override // defpackage.AutoValue_RecordingStats
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, String str) throws IOException {
            setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
        }

        public final String toString() {
            return "JsonAdapter(String)";
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final /* synthetic */ String b(JsonReader jsonReader) throws IOException {
            return jsonReader.cancel();
        }
    };

    static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonReader jsonReader, String str, int i, int i2) throws IOException {
        int iG = jsonReader.g();
        if (iG >= i && iG <= i2) {
            return iG;
        }
        throw new JsonDataException(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(iG), getStreamState.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader.g, jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1, jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2, jsonReader.TuitionPaymentFragmentbindingInflater1)));
    }

    /* JADX INFO: renamed from: setAspectRatio$6, reason: invalid class name */
    public class AnonymousClass6 extends AutoValue_RecordingStats<Double> {
        public static int TuitionPaymentFragmentbindingInflater1;
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        AnonymousClass6() {
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, Double d) throws IOException {
            setqualityselector.TuitionPaymentFragmentbindingInflater1(d.doubleValue());
        }

        public final String toString() {
            return "JsonAdapter(Double)";
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final /* synthetic */ Double b(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.asBinder());
        }

        public static int b() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i2 = i % 7365755;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentbindingInflater1;
            }
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            TuitionPaymentFragmentbindingInflater1 = startUptimeMillis;
            return startUptimeMillis;
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1<T extends Enum<T>> extends AutoValue_RecordingStats<T> {
        private final JsonReader.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1;
        private final T[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final Class<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private final String[] b;

        @Override // defpackage.AutoValue_RecordingStats
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, Object obj) throws IOException {
            setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b[((Enum) obj).ordinal()]);
        }

        TuitionPaymentFragmentbindingInflater1(Class<T> cls) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = enumConstants;
                this.b = new String[enumConstants.length];
                int i = 0;
                while (true) {
                    T[] tArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (i < tArr.length) {
                        T t = tArr[i];
                        AutoValue_StreamInfo autoValue_StreamInfo = (AutoValue_StreamInfo) cls.getField(t.name()).getAnnotation(AutoValue_StreamInfo.class);
                        this.b[i] = autoValue_StreamInfo != null ? autoValue_StreamInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3() : t.name();
                        i++;
                    } else {
                        this.TuitionPaymentFragmentbindingInflater1 = JsonReader.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e2) {
                StringBuilder sb = new StringBuilder("Missing field in ");
                sb.append(cls.getName());
                throw new AssertionError(sb.toString(), e2);
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("JsonAdapter(");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getName());
            sb.append(")");
            return sb.toString();
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final /* synthetic */ Object b(JsonReader jsonReader) throws IOException {
            int iTuitionPaymentFragmentbindingInflater1 = jsonReader.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
            if (iTuitionPaymentFragmentbindingInflater1 != -1) {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[iTuitionPaymentFragmentbindingInflater1];
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getStreamState.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader.g, jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1, jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2, jsonReader.TuitionPaymentFragmentbindingInflater1);
            String strCancel = jsonReader.cancel();
            StringBuilder sb = new StringBuilder("Expected one of ");
            sb.append(Arrays.asList(this.b));
            sb.append(" but was ");
            sb.append(strCancel);
            sb.append(" at path ");
            sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            throw new JsonDataException(sb.toString());
        }
    }

    static final class b extends AutoValue_RecordingStats<Object> {
        private final AutoValue_RecordingStats<Map> TuitionPaymentFragmentbindingInflater1;
        private final AutoValue_RecordingStats<List> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final CapabilitiesByQuality TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final AutoValue_RecordingStats<Double> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private final AutoValue_RecordingStats<String> asInterface;
        private final AutoValue_RecordingStats<Boolean> b;

        b(CapabilitiesByQuality capabilitiesByQuality) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = capabilitiesByQuality;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = capabilitiesByQuality.TuitionPaymentFragmentspecialinlinedviewModeldefault2(List.class, checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
            this.TuitionPaymentFragmentbindingInflater1 = capabilitiesByQuality.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Map.class, checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
            this.asInterface = capabilitiesByQuality.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.class, checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = capabilitiesByQuality.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Double.class, checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
            this.b = capabilitiesByQuality.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Boolean.class, checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final Object b(JsonReader jsonReader) throws IOException {
            switch (AnonymousClass3.TuitionPaymentFragmentspecialinlinedviewModeldefault2[jsonReader.cancelAll().ordinal()]) {
                case 1:
                    return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(jsonReader);
                case 2:
                    return this.TuitionPaymentFragmentbindingInflater1.b(jsonReader);
                case 3:
                    return this.asInterface.b(jsonReader);
                case 4:
                    return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(jsonReader);
                case 5:
                    return this.b.b(jsonReader);
                case 6:
                    return jsonReader.INotificationSideChannel();
                default:
                    StringBuilder sb = new StringBuilder("Expected a value but was ");
                    sb.append(jsonReader.cancelAll());
                    sb.append(" at path ");
                    sb.append(jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    throw new IllegalStateException(sb.toString());
            }
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                setqualityselector.b();
                setqualityselector.TuitionPaymentFragmentbindingInflater1();
                return;
            }
            CapabilitiesByQuality capabilitiesByQuality = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (Map.class.isAssignableFrom(cls)) {
                cls = Map.class;
            } else if (Collection.class.isAssignableFrom(cls)) {
                cls = Collection.class;
            }
            capabilitiesByQuality.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cls, checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null).TuitionPaymentFragmentspecialinlinedviewModeldefault2(setqualityselector, obj);
        }

        public final String toString() {
            return "JsonAdapter(Object)";
        }
    }

    /* JADX INFO: renamed from: setAspectRatio$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr;
            try {
                iArr[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[JsonReader.Token.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[JsonReader.Token.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[JsonReader.Token.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[JsonReader.Token.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
