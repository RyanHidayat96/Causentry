package com.google.gson.internal.bind;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.mlkit.common.MlKitException;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public final class TypeAdapters {
    public static final TypeAdapter<AtomicBoolean> ATOMIC_BOOLEAN;
    public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
    public static final TypeAdapter<AtomicInteger> ATOMIC_INTEGER;
    public static final TypeAdapter<AtomicIntegerArray> ATOMIC_INTEGER_ARRAY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
    public static final TypeAdapter<BigDecimal> BIG_DECIMAL;
    public static final TypeAdapter<BigInteger> BIG_INTEGER;
    public static final TypeAdapter<BitSet> BIT_SET;
    public static final TypeAdapterFactory BIT_SET_FACTORY;
    public static final TypeAdapter<Boolean> BOOLEAN;
    public static final TypeAdapter<Boolean> BOOLEAN_AS_STRING;
    public static final TypeAdapterFactory BOOLEAN_FACTORY;
    public static final TypeAdapter<Number> BYTE;
    public static final TypeAdapterFactory BYTE_FACTORY;
    public static final TypeAdapter<Calendar> CALENDAR;
    public static final TypeAdapterFactory CALENDAR_FACTORY;
    public static final TypeAdapter<Character> CHARACTER;
    public static final TypeAdapterFactory CHARACTER_FACTORY;
    public static final TypeAdapter<Class> CLASS;
    public static final TypeAdapterFactory CLASS_FACTORY;
    public static final TypeAdapter<Currency> CURRENCY;
    public static final TypeAdapterFactory CURRENCY_FACTORY;
    public static final TypeAdapter<Number> DOUBLE;
    public static final TypeAdapterFactory ENUM_FACTORY;
    public static final TypeAdapter<Number> FLOAT;
    public static final TypeAdapter<InetAddress> INET_ADDRESS;
    public static final TypeAdapterFactory INET_ADDRESS_FACTORY;
    public static final TypeAdapter<Number> INTEGER;
    public static final TypeAdapterFactory INTEGER_FACTORY;
    public static final TypeAdapter<JsonElement> JSON_ELEMENT;
    public static final TypeAdapterFactory JSON_ELEMENT_FACTORY;
    public static final TypeAdapter<LazilyParsedNumber> LAZILY_PARSED_NUMBER;
    public static final TypeAdapter<Locale> LOCALE;
    public static final TypeAdapterFactory LOCALE_FACTORY;
    public static final TypeAdapter<Number> LONG;
    public static final TypeAdapter<Number> SHORT;
    public static final TypeAdapterFactory SHORT_FACTORY;
    public static final TypeAdapter<String> STRING;
    public static final TypeAdapter<StringBuffer> STRING_BUFFER;
    public static final TypeAdapterFactory STRING_BUFFER_FACTORY;
    public static final TypeAdapter<StringBuilder> STRING_BUILDER;
    public static final TypeAdapterFactory STRING_BUILDER_FACTORY;
    public static final TypeAdapterFactory STRING_FACTORY;
    public static final TypeAdapter<URI> URI;
    public static final TypeAdapterFactory URI_FACTORY;
    public static final TypeAdapter<URL> URL;
    public static final TypeAdapterFactory URL_FACTORY;
    public static final TypeAdapter<UUID> UUID;
    public static final TypeAdapterFactory UUID_FACTORY;

    private TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    static {
        TypeAdapter<Class> typeAdapterNullSafe = new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Class cls) throws IOException {
                StringBuilder sb = new StringBuilder("Attempted to serialize java.lang.Class: ");
                sb.append(cls.getName());
                sb.append(". Forgot to register a type adapter?");
                throw new UnsupportedOperationException(sb.toString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public Class read(JsonReader jsonReader) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }
        }.nullSafe();
        CLASS = typeAdapterNullSafe;
        CLASS_FACTORY = newFactory(Class.class, typeAdapterNullSafe);
        TypeAdapter<BitSet> typeAdapterNullSafe2 = new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            @Override // com.google.gson.TypeAdapter
            public BitSet read(JsonReader jsonReader) throws IOException {
                BitSet bitSet = new BitSet();
                jsonReader.beginArray();
                JsonToken jsonTokenPeek = jsonReader.peek();
                int i = 0;
                while (jsonTokenPeek != JsonToken.END_ARRAY) {
                    int i2 = AnonymousClass35.$SwitchMap$com$google$gson$stream$JsonToken[jsonTokenPeek.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        int iNextInt = jsonReader.nextInt();
                        if (iNextInt != 0) {
                            if (iNextInt != 1) {
                                StringBuilder sb = new StringBuilder("Invalid bitset value ");
                                sb.append(iNextInt);
                                sb.append(", expected 0 or 1; at path ");
                                sb.append(jsonReader.getPreviousPath());
                                throw new JsonSyntaxException(sb.toString());
                            }
                            bitSet.set(i);
                        } else {
                            continue;
                        }
                    } else if (i2 == 3) {
                        if (jsonReader.nextBoolean()) {
                            bitSet.set(i);
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("Invalid bitset value type: ");
                        sb2.append(jsonTokenPeek);
                        sb2.append("; at path ");
                        sb2.append(jsonReader.getPath());
                        throw new JsonSyntaxException(sb2.toString());
                    }
                    i++;
                    jsonTokenPeek = jsonReader.peek();
                }
                jsonReader.endArray();
                return bitSet;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
                jsonWriter.beginArray();
                int length = bitSet.length();
                for (int i = 0; i < length; i++) {
                    jsonWriter.value(bitSet.get(i) ? 1L : 0L);
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        BIT_SET = typeAdapterNullSafe2;
        BIT_SET_FACTORY = newFactory(BitSet.class, typeAdapterNullSafe2);
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            private static final byte[] $$a = {31, 115, -100, -11};
            private static final int $$b = 89;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int asInterface = 0;
            private static int d = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722486;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 58243;
            private static char b = 50896;
            private static char TuitionPaymentFragmentbindingInflater1 = 17743;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 58864;

            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2;
                int i3 = 2 % 2;
                onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                char[] cArr2 = new char[cArr.length - 2];
                oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                char[] cArr3 = new char[2];
                while (true) {
                    int i4 = 0;
                    if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                        objArr[0] = new String(cArr2, 0, i);
                        return;
                    }
                    int i5 = $10 + 51;
                    $11 = i5 % 128;
                    if (i5 % 2 == 0) {
                        cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 0];
                        i2 = 1;
                    } else {
                        cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        i2 = 0;
                    }
                    int i6 = 58224;
                    while (i2 < 16) {
                        int i7 = $10 + 105;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        char c = cArr3[1];
                        char c2 = cArr3[i4];
                        int i9 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)));
                        int i10 = c2 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            objArr2[2] = Integer.valueOf(i10);
                            objArr2[1] = Integer.valueOf(i9);
                            objArr2[i4] = Integer.valueOf(c);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cRed = (char) (47773 - Color.red(i4));
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', i4, i4) + 469;
                                int i11 = (CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)) + 13;
                                Class[] clsArr = new Class[4];
                                clsArr[i4] = Integer.TYPE;
                                clsArr[1] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, iLastIndexOf, i11, -2007001706, false, "o", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            int i12 = i6;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 47773), 469 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i6 = i12 - 40503;
                            i2++;
                            i4 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                    Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 2323 - View.getDefaultSize(0, 0), 45 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1312321721, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
            }

            /* JADX WARN: Code duplicated, block: B:33:0x0176  */
            /* JADX WARN: Code duplicated, block: B:34:0x0177  */
            private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
                int i4;
                Throwable cause;
                int i5 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (true) {
                    i4 = 29209604;
                    if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                        break;
                    }
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.normalizeMetaState(0), 3292 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 31, 1199271174, false, $$c(b2, b3, (byte) (b3 | 12)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), 651 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 44 - (Process.myTid() >> 22), -450685997, false, $$c(b4, b4, (byte) (-$$a[3])), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                if (i3 > 0) {
                    int i7 = $11 + 119;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                }
                if (z) {
                    int i9 = $10 + 77;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    char[] cArr4 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 651, (ViewConfiguration.getLongPressTimeout() >> 16) + 44, -450685997, false, $$c(b5, b5, (byte) (-$$a[3])), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i11 = $10 + 69;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        i4 = 29209604;
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            @Override // com.google.gson.TypeAdapter
            public /* bridge */ /* synthetic */ Boolean read(JsonReader jsonReader) throws IOException {
                int i = 2 % 2;
                int i2 = d + 83;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                Boolean bool = read(jsonReader);
                int i4 = asInterface + 55;
                d = i4 % 128;
                int i5 = i4 % 2;
                return bool;
            }

            @Override // com.google.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
                int i = 2 % 2;
                int i2 = asInterface + 93;
                d = i2 % 128;
                int i3 = i2 % 2;
                write2(jsonWriter, bool);
                int i4 = d + 85;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 98 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public Boolean read(JsonReader jsonReader) throws IOException {
                int i = 2 % 2;
                int i2 = asInterface + 105;
                d = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    jsonReader.peek();
                    JsonToken jsonToken = JsonToken.NULL;
                    obj.hashCode();
                    throw null;
                }
                JsonToken jsonTokenPeek = jsonReader.peek();
                if (jsonTokenPeek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (jsonTokenPeek == JsonToken.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
                }
                Boolean boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                int i3 = d + 123;
                asInterface = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 58 / 0;
                }
                return boolValueOf;
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, Boolean bool) throws IOException {
                int i = 2 % 2;
                int i2 = d + 65;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                jsonWriter.value(bool);
                int i4 = asInterface + 109;
                d = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r25v0 */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v120 */
            /* JADX WARN: Type inference failed for: r2v189 */
            /* JADX WARN: Type inference failed for: r2v2 */
            /* JADX WARN: Type inference failed for: r2v210 */
            /* JADX WARN: Type inference failed for: r2v216, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v239 */
            /* JADX WARN: Type inference failed for: r2v24 */
            /* JADX WARN: Type inference failed for: r2v251 */
            /* JADX WARN: Type inference failed for: r2v252 */
            /* JADX WARN: Type inference failed for: r2v253 */
            /* JADX WARN: Type inference failed for: r2v254 */
            /* JADX WARN: Type inference failed for: r2v255 */
            /* JADX WARN: Type inference failed for: r2v256 */
            /* JADX WARN: Type inference failed for: r2v257 */
            /* JADX WARN: Type inference failed for: r2v71 */
            /* JADX WARN: Type inference failed for: r2v76 */
            /* JADX WARN: Type inference failed for: r2v87 */
            /* JADX WARN: Type inference failed for: r2v90, types: [int] */
            /* JADX WARN: Type inference failed for: r2v92, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r4v23 */
            /* JADX WARN: Type inference failed for: r4v4 */
            /* JADX WARN: Type inference failed for: r4v5 */
            /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2) {
                ?? r4;
                Object obj;
                char[] cArr;
                int i3;
                int i4;
                int iLastIndexOf;
                int iB;
                int i5;
                int i6;
                char[] cArr2;
                int i7;
                int i8;
                int i9;
                int i10;
                ?? Invoke = 2;
                Invoke = 2;
                Invoke = 2;
                Invoke = 2;
                Invoke = 2;
                int i11 = 2 % 2;
                int i12 = 1;
                if (context != null) {
                    try {
                        int iMyTid = Process.myTid() >> 22;
                        int i13 = 30 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16)));
                        int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                        Object[] objArr = new Object[1];
                        a(true, ((iMyTid | 189) << 1) - (iMyTid ^ 189), i13, ((edgeSlop | 14) << 1) - (edgeSlop ^ 14), new char[]{'\r', 16, 65519, 65483, 15, 20, 26, 29, 15, 25, 65516, 65512, 65529, 65518, 65534, 0, 65512, 65518, 65495, 15, 20, 26, 29, 15, 25, 65516, 65512, 65530, 65495, 18, ' '}, objArr);
                        try {
                            try {
                                Object[] objArr2 = {(String) objArr[0]};
                                int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                int i14 = 38 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i15 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                Object[] objArr3 = new Object[1];
                                a(true, ((keyRepeatTimeout | 195) << 1) - (keyRepeatTimeout ^ 195), i14, (i15 ^ 29) + ((i15 & 29) << 1), new char[]{65493, 65498, 65533, 65491, 65493, 65493, 65498, 29, 65491, '\r', 25, 26, 6, 65491, 30, 25, 14, 23, 26, '\b', '\n', 24, 65491, 29, 6, 27, 6, 15, 17, 6, 21, 14, '\b', 19, 14, 23, 65525, 65493}, objArr3);
                                ?? NewInstance = Class.forName((String) objArr3[0]).getDeclaredConstructor(String.class).newInstance(objArr2);
                                int mode = View.MeasureSpec.getMode(0);
                                int i16 = (mode & 31) + (mode | 31);
                                Object[] objArr4 = new Object[1];
                                c(new char[]{54950, 47402, 16986, 9009, 27783, 39071, 30617, 14610, 14278, 52592, 36137, 52516, 22415, 51992, 13484, 34187, 32070, 39347, 13966, 27866, 5918, 1417, 63149, 7476, 53339, 7494, 57051, 59689, 33222, 49506, 16189, 60886, 49167, 46930}, i16, objArr4);
                                String str = (String) objArr4[0];
                                int i17 = d + 29;
                                asInterface = i17 % 128;
                                int i18 = i17 % 2;
                                try {
                                    int i19 = -KeyEvent.normalizeMetaState(0);
                                    int iB2 = ModuleInstallRequest.b();
                                    int i20 = (i19 * (-559)) - (-109395);
                                    int i21 = ~iB2;
                                    int i22 = -(-((~((i21 ^ i19) | (i21 & i19))) * (-560)));
                                    int i23 = (i20 & i22) + (i22 | i20);
                                    int i24 = ((-196) & i19) | ((-196) ^ i19);
                                    int i25 = i23 + ((~((i24 & iB2) | (i24 ^ iB2))) * (-560));
                                    int i26 = ~i19;
                                    int i27 = ~((i26 & 195) | (i26 ^ 195));
                                    int i28 = ~iB2;
                                    int i29 = -(-((i27 | (~((i28 & 195) | (i28 ^ 195)))) * 560));
                                    int i30 = ((i25 | i29) << 1) - (i25 ^ i29);
                                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                                    int iB3 = ModuleInstallRequest.b();
                                    int i31 = packedPositionGroup * (-963);
                                    int i32 = (i31 & (-964)) + (i31 | (-964));
                                    int i33 = ~packedPositionGroup;
                                    int i34 = ~(((-39) ^ iB3) | ((-39) & iB3));
                                    int i35 = ((((i32 | 36670) << 1) - (36670 ^ i32)) - (~(-(-(((i33 ^ i34) | (i34 & i33)) * (-964)))))) - 1;
                                    int i36 = ~iB3;
                                    int i37 = ~((i36 & (-39)) | ((-39) ^ i36));
                                    int i38 = ~((packedPositionGroup & (-39)) | ((-39) ^ packedPositionGroup));
                                    int i39 = -(-(((i37 & i38) | (i37 ^ i38)) * (-964)));
                                    int i40 = (i35 ^ i39) + ((i35 & i39) << 1);
                                    int i41 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int iB4 = ModuleInstallRequest.b();
                                    int i42 = (i41 * (-209)) - 5852;
                                    int i43 = ~i41;
                                    int i44 = (~((i43 ^ (-29)) | (i43 & (-29)))) * 210;
                                    int i45 = (i42 & i44) + (i42 | i44);
                                    int i46 = ~iB4;
                                    int i47 = ~(((-29) ^ i46) | ((-29) & i46));
                                    int i48 = ~i41;
                                    int i49 = ((~((i48 ^ iB4) | (i48 & iB4))) | i47) * 210;
                                    int i50 = ((i45 | i49) << 1) - (i45 ^ i49);
                                    int i51 = (i48 ^ i46) | (i46 & i48);
                                    int i52 = ~((i51 & 28) | (i51 ^ 28));
                                    int i53 = ((-29) & i41) | ((-29) ^ i41);
                                    int i54 = ~((i53 & iB4) | (i53 ^ iB4));
                                    int i55 = ((i54 & i52) | (i52 ^ i54)) * 210;
                                    Object[] objArr5 = new Object[1];
                                    a(true, i30, i40, (i50 ^ i55) + ((i55 & i50) << 1), new char[]{65493, 65498, 65533, 65491, 65493, 65493, 65498, 29, 65491, '\r', 25, 26, 6, 65491, 30, 25, 14, 23, 26, '\b', '\n', 24, 65491, 29, 6, 27, 6, 15, 17, 6, 21, 14, '\b', 19, 14, 23, 65525, 65493}, objArr5);
                                    Object objNewInstance = Class.forName((String) objArr5[0]).getDeclaredConstructor(String.class).newInstance(str);
                                    try {
                                        int i56 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                                        int i57 = (i56 & MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) + (i56 | MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR);
                                        char mirror = AndroidCharacter.getMirror('0');
                                        int i58 = (mirror * 63571) - 24600;
                                        int i59 = ((mirror ^ 24) | (mirror & 24)) * 983;
                                        int i60 = (i58 & i59) + (i58 | i59);
                                        int i61 = ~mirror;
                                        int i62 = ~i;
                                        int i63 = i60 + (((~((24 & i62) | (24 ^ i62))) | i61) * (-983));
                                        int i64 = ~mirror;
                                        int i65 = -(-(((~((i64 & i62) | (i64 ^ i62))) | (~((i61 & (-25)) | (i61 ^ (-25))))) * 983));
                                        Object[] objArr6 = new Object[1];
                                        a(false, i57, (i63 & i65) + (i65 | i63), 21 - (~(-(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))), new char[]{'\t', 65535, '\r', '\n', 4, 65535, 65481, 65534, '\n', '\t', 15, 0, '\t', 15, 65481, 65502, '\n', '\t', 15, 0, 19, 15, 65532}, objArr6);
                                        Class<?> cls = Class.forName((String) objArr6[0]);
                                        int i66 = -TextUtils.getOffsetBefore("", 0);
                                        int i67 = i66 * (-183);
                                        int i68 = ((i67 | 37740) << 1) - (i67 ^ 37740);
                                        int i69 = ~i66;
                                        int i70 = ((i69 & 204) | (i69 ^ 204)) * (-368);
                                        int i71 = (((i68 & i70) + (i68 | i70)) - (~((((i66 & (-205)) | (i66 ^ (-205))) | i62) * 184))) - 1;
                                        int i72 = ~((i69 ^ (-205)) | (i69 & (-205)));
                                        int i73 = ~(i62 | i66);
                                        int i74 = (i71 - (~(-(-((((i72 & i73) | (i72 ^ i73)) | (~((i66 ^ 204) | (i66 & 204)))) * 184))))) - 1;
                                        int i75 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        int i76 = ~(((-19) ^ i62) | ((-19) & i62));
                                        int i77 = ~((-19) | i75);
                                        int i78 = (i76 ^ i77) | (i76 & i77);
                                        int i79 = ~i;
                                        int i80 = ~((i79 ^ i75) | (i79 & i75));
                                        int i81 = (i78 ^ i80) | (i78 & i80);
                                        int i82 = ~i75;
                                        int i83 = (i82 ^ 18) | (i82 & 18);
                                        int i84 = ~((i83 ^ i) | (i83 & i));
                                        int i85 = (i75 * (-589)) + 10638 + (((i81 ^ i84) | (i81 & i84)) * 590);
                                        int i86 = ~(((-19) & i79) | ((-19) ^ i79));
                                        int i87 = ~((i75 & (-19)) | ((-19) ^ i75));
                                        int i88 = (i87 & i86) | (i86 ^ i87);
                                        int i89 = ((i88 & i80) | (i88 ^ i80)) * (-1180);
                                        int i90 = ((i85 | i89) << 1) - (i89 ^ i85);
                                        int i91 = ~((i82 ^ i62) | (i82 & i62));
                                        int i92 = ~((i79 ^ 18) | (i79 & 18));
                                        int i93 = (i90 - (~(-(-(((i91 & i92) | (i91 ^ i92)) * 590))))) - 1;
                                        int i94 = -(-(KeyEvent.getMaxKeyCode() >> 16));
                                        Object[] objArr7 = new Object[1];
                                        a(true, i74, i93, (i94 ^ 13) + ((i94 & 13) << 1), new char[]{'\n', 65533, 65513, 1, 3, 65533, 7, 65535, 65533, 65516, 16, 1, 3, 14, 1, 3, 65533}, objArr7);
                                        Invoke = 0;
                                        Object objInvoke = cls.getMethod((String) objArr7[0], null).invoke(context, null);
                                        int i95 = asInterface;
                                        int i96 = (i95 & 79) + (i95 | 79);
                                        d = i96 % 128;
                                        int i97 = i96 % 2;
                                        Invoke = 0;
                                        try {
                                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                                            int i98 = (iNormalizeMetaState ^ MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) + ((iNormalizeMetaState & MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) << 1);
                                            int i99 = -(KeyEvent.getMaxKeyCode() >> 16);
                                            Object[] objArr8 = new Object[1];
                                            a(false, i98, (i99 & 23) + (i99 | 23), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, new char[]{'\t', 65535, '\r', '\n', 4, 65535, 65481, 65534, '\n', '\t', 15, 0, '\t', 15, 65481, 65502, '\n', '\t', 15, 0, 19, 15, 65532}, objArr8);
                                            Class<?> cls2 = Class.forName((String) objArr8[0]);
                                            Object[] objArr9 = new Object[1];
                                            c(new char[]{46284, 48491, 25909, 'B', 13037, 55936, 54586, 62803, 62580, 11898, 61501, 62773, 10348, 36287, 36618, 32221}, 13 - (~(-View.resolveSize(0, 0))), objArr9);
                                            Invoke = 0;
                                            Object objInvoke2 = cls2.getMethod((String) objArr9[0], null).invoke(context, null);
                                            int i100 = asInterface + 7;
                                            d = i100 % 128;
                                            Invoke = i100 % 2;
                                            try {
                                                Invoke = new Object[]{objInvoke2, 64};
                                                int i101 = 201 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0);
                                                int i102 = (iLastIndexOf2 ^ 34) + ((iLastIndexOf2 & 34) << 1);
                                                int i103 = -View.combineMeasuredStates(0, 0);
                                                int iB5 = ModuleInstallRequest.b();
                                                int i104 = i103 * (-183);
                                                int i105 = (i104 & 3885) + (i104 | 3885);
                                                int i106 = ~i103;
                                                int i107 = ~((i106 ^ 21) | (i106 & 21));
                                                int i108 = asInterface + 15;
                                                d = i108 % 128;
                                                int i109 = i108 % 2;
                                                int i110 = -(-(184 * (i107 | (~(((iB5 ^ (-1)) & 21) | (iB5 ^ (-22)))))));
                                                int i111 = ~((i103 & (-22)) | ((-22) ^ i103));
                                                int i112 = (((i105 ^ i110) + ((i105 & i110) << 1)) - (~(-(-(((i111 & iB5) | (iB5 ^ i111)) * (-184)))))) - 1;
                                                int i113 = ~iB5;
                                                Object[] objArr10 = new Object[1];
                                                a(false, i101, i102, i112 + ((~((i113 & i106) | (i106 ^ i113))) * 184), new char[]{3, '\f', 18, 65484, 14, 11, 65484, 65518, 65535, 1, '\t', 65535, 5, 3, 65515, 65535, '\f', 65535, 5, 3, 16, 65535, '\f', 2, 16, '\r', 7, 2, 65484, 1, '\r', '\f', 18}, objArr10);
                                                Class<?> cls3 = Class.forName((String) objArr10[0]);
                                                char[] cArr3 = {37614, 47299, 31070, 46874, 4057, 50951, 63939, 18206, 30434, 1732, 30803, 4939, 10377, 64396, 53789, 4892};
                                                int i114 = -ExpandableListView.getPackedPositionGroup(0L);
                                                int iB6 = ModuleInstallRequest.b();
                                                int i115 = i114 * 471;
                                                int i116 = (i115 & 6594) + (i115 | 6594);
                                                int i117 = d + 109;
                                                asInterface = i117 % 128;
                                                int i118 = i117 % 2;
                                                int i119 = ~i114;
                                                int i120 = ~((i119 & (-15)) | (i119 ^ (-15)));
                                                int i121 = ~((-15) | iB6);
                                                int i122 = ((i116 + ((-470) * (i114 | 14))) - (~((((i120 ^ i121) | (i120 & i121)) | (~(((~iB6) | i114) | 14))) * (-470)))) - 1;
                                                int i123 = ((-15) ^ i114) | ((-15) & i114);
                                                int i124 = ~((i123 & iB6) | (i123 ^ iB6));
                                                int i125 = ~iB6;
                                                int i126 = (i114 & i125) | (i125 ^ i114);
                                                int i127 = ~((i126 & 14) | (i126 ^ 14));
                                                int i128 = ((i127 & i124) | (i124 ^ i127)) * 470;
                                                int i129 = (i122 ^ i128) + ((i128 & i122) << 1);
                                                Object[] objArr11 = new Object[1];
                                                c(cArr3, i129, objArr11);
                                                String str2 = (String) objArr11[0];
                                                Class<?>[] clsArr = new Class[2];
                                                int i130 = d + 65;
                                                asInterface = i130 % 128;
                                                int i131 = i130 % 2;
                                                clsArr[0] = String.class;
                                                clsArr[1] = Integer.TYPE;
                                                Object objInvoke3 = cls3.getMethod(str2, clsArr).invoke(objInvoke, Invoke);
                                                int i132 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                                int i133 = (i132 ^ 201) + ((i132 & 201) << 1);
                                                int i134 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int i135 = (i134 ^ 30) + ((i134 & 30) << 1);
                                                int i136 = -((Process.getThreadPriority(0) + 20) >> 6);
                                                int iB7 = ModuleInstallRequest.b();
                                                int i137 = i136 * (-1939);
                                                int i138 = ((i137 | 1942) << 1) - (i137 ^ 1942);
                                                int i139 = ~(((-3) & i136) | ((-3) ^ i136));
                                                int i140 = ~iB7;
                                                int i141 = (i140 & 2) | (i140 ^ 2);
                                                int i142 = ~i141;
                                                int i143 = i138 + (((i139 ^ i142) | (i139 & i142)) * (-970));
                                                int i144 = (~((~i136) | 2)) * 1940;
                                                int i145 = (i143 & i144) + (i144 | i143);
                                                int i146 = ~i136;
                                                int i147 = ~((i146 & (-3)) | (i146 ^ (-3)));
                                                int i148 = ~i141;
                                                int i149 = i147 ^ i148;
                                                Object[] objArr12 = new Object[1];
                                                a(true, i133, i135, i145 + (((i147 & i148) | i149) * 970), new char[]{'\r', 0, 14, 5, '\r', 65512, 4, 6, 0, '\n', 2, 0, 65519, 65485, '\f', 15, 65485, 19, '\r', 4, 19, '\r', 14, 2, 65485, 3, '\b', 14, 17, 3}, objArr12);
                                                Class<?> cls4 = Class.forName((String) objArr12[0]);
                                                int i150 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                int i151 = (i150 ^ 213) + ((i150 & 213) << 1);
                                                int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                                int iB8 = ModuleInstallRequest.b();
                                                int i152 = d;
                                                int i153 = ((i152 | 11) << 1) - (i152 ^ 11);
                                                asInterface = i153 % 128;
                                                int i154 = i153 % 2;
                                                int i155 = scrollDefaultDelay * 50;
                                                int i156 = ((i155 | (-970)) << 1) - (i155 ^ (-970));
                                                int i157 = ~iB8;
                                                int i158 = ~(((-11) ^ i157) | ((-11) & i157));
                                                int i159 = ~(((-11) ^ scrollDefaultDelay) | ((-11) & scrollDefaultDelay));
                                                int i160 = ((i158 ^ i159) | (i159 & i158)) * 98;
                                                int i161 = ((i156 | i160) << 1) - (i160 ^ i156);
                                                int i162 = ~((~scrollDefaultDelay) | (~iB8));
                                                int i163 = ((-11) ^ i162) | (i162 & (-11));
                                                int i164 = ~((scrollDefaultDelay ^ iB8) | (scrollDefaultDelay & iB8));
                                                int i165 = -(-(((i163 ^ i164) | (i163 & i164)) * (-49)));
                                                int i166 = ((i161 | i165) << 1) - (i165 ^ i161);
                                                int i167 = ~((-11) | iB8);
                                                int i168 = ~((scrollDefaultDelay & 10) | (scrollDefaultDelay ^ 10));
                                                int i169 = (i166 - (~(-(-(((i167 & i168) | (i167 ^ i168)) * 49))))) - 1;
                                                int i170 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                int i171 = i170 * 141;
                                                int i172 = (i171 ^ (-139)) + ((i171 & (-139)) << 1);
                                                int i173 = ~i170;
                                                int i174 = ~(i173 | 1);
                                                int i175 = ~i170;
                                                int i176 = ~((i175 ^ i) | (i175 & i));
                                                int i177 = (i172 - (~(-(-(((i174 ^ i176) | (i174 & i176)) * (-280)))))) - 1;
                                                int i178 = ~((i175 ^ i) | (i175 & i));
                                                int i179 = (-2) & i;
                                                int i180 = ~(((-2) ^ i) | i179);
                                                int i181 = i177 + (((i178 ^ i180) | (i180 & i178)) * 140);
                                                int i182 = asInterface + 49;
                                                d = i182 % 128;
                                                int i183 = i182 % 2;
                                                int i184 = (i173 & (-2)) | (i173 ^ (-2));
                                                int i185 = ~((i184 & i) | (i184 ^ i));
                                                int i186 = ~((i175 & i79) | (i175 ^ i79) | 1);
                                                int i187 = (i185 & i186) | (i185 ^ i186);
                                                int i188 = ((-2) ^ i62) | ((-2) & i62);
                                                int i189 = i181 + (((~((i170 & i188) | (i188 ^ i170))) | i187) * 140);
                                                Object[] objArr13 = new Object[1];
                                                a(false, i151, i169, i189, new char[]{65528, 6, 6, 65532, 65530, 1, 65524, 7, '\b', 5}, objArr13);
                                                Object[] objArr14 = (Object[]) cls4.getField((String) objArr13[0]).get(objInvoke3);
                                                int i190 = 0;
                                                Invoke = objArr14.length;
                                                while (true) {
                                                    if (i190 < Invoke) {
                                                        int i191 = asInterface;
                                                        int i192 = (i191 & 37) + (i191 | 37);
                                                        d = i192 % 128;
                                                        if (i192 % 2 == 0) {
                                                            obj = objArr14[i190];
                                                            cArr = new char[]{22672, 63797, 5241, 45951, 51704, 7649, 38268, 36785};
                                                            i3 = 63;
                                                        } else {
                                                            obj = objArr14[i190];
                                                            cArr = new char[]{22672, 63797, 5241, 45951, 51704, 7649, 38268, 36785};
                                                            i3 = 6;
                                                        }
                                                        int i193 = ((i191 | 21) << i12) - (i191 ^ 21);
                                                        d = i193 % 128;
                                                        int i194 = i193 % 2;
                                                        Object[] objArr15 = new Object[i12];
                                                        c(cArr, i3 + ImageFormat.getBitsPerPixel(0), objArr15);
                                                        try {
                                                            Object[] objArr16 = {(String) objArr15[0]};
                                                            int i195 = -View.combineMeasuredStates(0, 0);
                                                            int i196 = (i195 & 37) + (i195 | 37);
                                                            Object[] objArr17 = new Object[i12];
                                                            c(new char[]{10350, 42014, 16487, 17012, 56711, 58362, 33685, 22724, 34797, 33484, 43119, 49698, 35663, 65427, 56421, 16946, 18704, 13401, 3714, 48088, 47947, 38687, 24598, 29012, 40331, 15598, 14066, 16117, 55072, 12320, 28586, 16586, 40475, 46669, 63153, 60622, 40082, 21788, 1429, 64486}, i196, objArr17);
                                                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                                                            byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
                                                            int i197 = (modifierMetaStateMask ^ 208) + ((modifierMetaStateMask & 208) << i12);
                                                            int i198 = -(Process.myTid() >> 22);
                                                            int i199 = (i198 & 11) + (i198 | 11);
                                                            int capsMode = TextUtils.getCapsMode("", 0, 0);
                                                            int iB9 = ModuleInstallRequest.b();
                                                            int i200 = capsMode * 141;
                                                            int i201 = (i200 & (-1116)) + (i200 | (-1116));
                                                            int i202 = -(-(((iB9 ^ 4) | (iB9 & 4)) * 140));
                                                            int i203 = (i201 ^ i202) + ((i201 & i202) << 1);
                                                            int i204 = ~capsMode;
                                                            int i205 = ~(i204 | 4);
                                                            Object[] objArr18 = objArr14;
                                                            int i206 = ~iB9;
                                                            int i207 = i203 + (((~((i206 ^ 4) | (i206 & 4))) | i205) * (-280));
                                                            int i208 = ~(((-5) & capsMode) | ((-5) ^ capsMode));
                                                            int i209 = ~iB9;
                                                            int i210 = i208 | (~((i209 ^ capsMode) | (capsMode & i209)));
                                                            int i211 = (i204 & 4) | (i204 ^ 4);
                                                            int i212 = ~((i211 & iB9) | (i211 ^ iB9));
                                                            int i213 = -(-(((i210 & i212) | (i210 ^ i212)) * 140));
                                                            Object[] objArr19 = new Object[1];
                                                            a(true, i197, i199, ((i207 & i213) << 1) + (i207 ^ i213), new char[]{65506, '\r', 65534, 0, 65534, 65532, 7, 65530, '\r', '\f', 7}, objArr19);
                                                            Object objInvoke4 = cls5.getMethod((String) objArr19[0], String.class).invoke(null, objArr16);
                                                            try {
                                                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0);
                                                                int iB10 = ModuleInstallRequest.b();
                                                                int i214 = iIndexOf * TypedValues.Custom.TYPE_DIMENSION;
                                                                int i215 = (i214 ^ (-185115)) + ((i214 & (-185115)) << 1);
                                                                int i216 = ~iIndexOf;
                                                                int i217 = ~((i216 ^ iB10) | (i216 & iB10));
                                                                int i218 = ~iB10;
                                                                ?? r25 = Invoke;
                                                                int i219 = i190;
                                                                int i220 = ~((i218 ^ MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) | (i218 & MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR));
                                                                int i221 = -(-(((i220 & i217) | (i217 ^ i220)) * (-1808)));
                                                                int i222 = (i215 ^ i221) + ((i221 & i215) << 1);
                                                                int i223 = (~iIndexOf) | (-206);
                                                                int i224 = ~((i223 & iB10) | (i223 ^ iB10));
                                                                int i225 = (iIndexOf & i218) | (i218 ^ iIndexOf);
                                                                int i226 = ~((i225 ^ MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) | (i225 & MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR));
                                                                int i227 = -(-(((i224 & i226) | (i224 ^ i226)) * TypedValues.Custom.TYPE_BOOLEAN));
                                                                int i228 = (i222 & i227) + (i227 | i222);
                                                                int i229 = ~((i216 ^ MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) | (i216 & MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR));
                                                                int i230 = ~((-206) | iB10);
                                                                int i231 = (i229 & i230) | (i229 ^ i230);
                                                                int i232 = ~i225;
                                                                int i233 = -(-(((i231 & i232) | (i231 ^ i232)) * TypedValues.Custom.TYPE_BOOLEAN));
                                                                int i234 = ((i228 | i233) << 1) - (i233 ^ i228);
                                                                int offsetBefore = TextUtils.getOffsetBefore("", 0);
                                                                int i235 = offsetBefore * (-743);
                                                                int i236 = (i235 & (-20804)) + (i235 | (-20804));
                                                                int i237 = (~((offsetBefore ^ 28) | (offsetBefore & 28))) | (~((offsetBefore ^ i) | (offsetBefore & i)));
                                                                int i238 = ~(i | 28);
                                                                int i239 = -(-(((i237 & i238) | (i237 ^ i238)) * (-744)));
                                                                int i240 = (i236 ^ i239) + ((i239 & i236) << 1);
                                                                int i241 = ~offsetBefore;
                                                                int i242 = ~((i241 & (-29)) | (i241 ^ (-29)));
                                                                int i243 = (i240 - (~(-(-(((i242 & i79) | (i79 ^ i242)) * 744))))) - 1;
                                                                int i244 = -(-((offsetBefore | 28 | i) * 744));
                                                                int i245 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                Object[] objArr20 = new Object[1];
                                                                a(false, i234, (i244 | i243) + (i243 & i244), (i245 ^ 4) + ((i245 & 4) << 1), new char[]{16, 17, 14, 1, 65533, '\n', 0, 14, 11, 5, 0, 65482, 65535, 11, '\n', 16, 1, '\n', 16, 65482, '\f', '\t', 65482, 65519, 5, 3, '\n', 65533}, objArr20);
                                                                Class<?> cls6 = Class.forName((String) objArr20[0]);
                                                                int i246 = -(-KeyEvent.getDeadChar(0, 0));
                                                                int i247 = (i246 ^ 207) + ((i246 & 207) << 1);
                                                                int i248 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                int i249 = i248 * (-665);
                                                                int i250 = (i249 ^ 3674) + ((i249 & 3674) << 1);
                                                                int i251 = ~i248;
                                                                int i252 = i251 * (-333);
                                                                int i253 = (i250 & i252) + (i250 | i252);
                                                                int i254 = ~i248;
                                                                int i255 = ~((i254 & i62) | (i254 ^ i62));
                                                                int i256 = ~((i ^ 11) | (i & 11));
                                                                int i257 = -(-(((i255 & i256) | (i255 ^ i256)) * 333));
                                                                int i258 = (i253 ^ i257) + ((i257 & i253) << 1);
                                                                int i259 = ~(i251 | i);
                                                                int i260 = ~((i79 ^ 11) | (i79 & 11));
                                                                int i261 = ((i259 & i260) | (i259 ^ i260)) * 333;
                                                                int i262 = (i258 & i261) + (i261 | i258);
                                                                int i263 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                                                int i264 = (i263 & 6) + (i263 | 6);
                                                                Invoke = 11;
                                                                Invoke = 11;
                                                                Invoke = 11;
                                                                Object[] objArr21 = new Object[1];
                                                                a(false, i247, i262, i264, new char[]{65534, 65498, 11, 11, 65530, 18, '\r', '\b', 65499, 18, '\r'}, objArr21);
                                                                try {
                                                                    Object[] objArr22 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr21[0], null).invoke(obj, null))};
                                                                    char[] cArr4 = {10350, 42014, 16487, 17012, 56711, 58362, 33685, 22724, 34797, 33484, 43119, 49698, 35663, 65427, 56421, 16946, 18704, 13401, 3714, 48088, 47947, 38687, 24598, 29012, 40331, 15598, 14066, 16117, 55072, 12320, 28586, 16586, 40475, 46669, 63153, 60622, 40082, 21788, 1429, 64486};
                                                                    int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0);
                                                                    int i265 = iLastIndexOf3 * 221;
                                                                    int i266 = ((i265 | (-8322)) << 1) - (i265 ^ (-8322));
                                                                    int i267 = ~iLastIndexOf3;
                                                                    int i268 = ~((i267 & (-39)) | (i267 ^ (-39)));
                                                                    int i269 = d + 117;
                                                                    int i270 = i269 % 128;
                                                                    asInterface = i270;
                                                                    if (i269 % 2 != 0) {
                                                                        int i271 = (i62 ^ iLastIndexOf3) | (i62 & iLastIndexOf3);
                                                                        int i272 = ~((i271 ^ 38) | (i271 & 38));
                                                                        int i273 = ~((i79 ^ 38) | (i79 & 38));
                                                                        i4 = (i266 * (220 / ((i268 ^ i272) | (i268 & i272)))) >>> (((i273 & iLastIndexOf3) | (iLastIndexOf3 ^ i273)) * (-440));
                                                                    } else {
                                                                        int i274 = ~((i79 ^ iLastIndexOf3) | (i79 & iLastIndexOf3) | 38);
                                                                        int i275 = -(-(((i268 ^ i274) | (i268 & i274)) * 220));
                                                                        int i276 = (i266 & i275) + (i275 | i266);
                                                                        int i277 = ~((i62 ^ 38) | (i62 & 38));
                                                                        int i278 = ((i277 & iLastIndexOf3) | (iLastIndexOf3 ^ i277)) * (-440);
                                                                        i4 = ((i276 | i278) << 1) - (i278 ^ i276);
                                                                    }
                                                                    int i279 = i270 + 45;
                                                                    d = i279 % 128;
                                                                    int i280 = i279 % 2;
                                                                    int i281 = (iLastIndexOf3 & 38) | (iLastIndexOf3 ^ 38);
                                                                    int i282 = -(-(220 * ((i281 & i) | (i281 ^ i))));
                                                                    int i283 = ((i4 | i282) << 1) - (i4 ^ i282);
                                                                    Object[] objArr23 = new Object[1];
                                                                    c(cArr4, i283, objArr23);
                                                                    Class<?> cls7 = Class.forName((String) objArr23[0]);
                                                                    int maximumFlingVelocity = 207 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                    int i284 = asInterface;
                                                                    int i285 = (i284 & 57) + (i284 | 57);
                                                                    d = i285 % 128;
                                                                    if (i285 % 2 == 0) {
                                                                        iLastIndexOf = TextUtils.lastIndexOf("", ']', 1, 1);
                                                                        iB = ModuleInstallRequest.b();
                                                                        int i286 = -iLastIndexOf;
                                                                        i5 = ((i286 & 221) + (i286 | 221)) / (-19);
                                                                    } else {
                                                                        iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                                                                        iB = ModuleInstallRequest.b();
                                                                        int i287 = iLastIndexOf * 221;
                                                                        i5 = ((i287 | (-4380)) << 1) - (i287 ^ (-4380));
                                                                    }
                                                                    int i288 = ~iLastIndexOf;
                                                                    int i289 = ~((i288 & (-21)) | (i288 ^ (-21)));
                                                                    int i290 = ~iB;
                                                                    int i291 = ~(i290 | iLastIndexOf | 20);
                                                                    int i292 = i5 + (220 * ((i289 ^ i291) | (i291 & i289)));
                                                                    int i293 = ~(i290 | 20);
                                                                    int i294 = ((i293 & iLastIndexOf) | (iLastIndexOf ^ i293)) * (-440);
                                                                    int i295 = ((i292 | i294) << 1) - (i294 ^ i292);
                                                                    int i296 = (iLastIndexOf & 20) | (iLastIndexOf ^ 20);
                                                                    Object[] objArr24 = new Object[1];
                                                                    a(true, maximumFlingVelocity, (i295 - (~(((i296 & iB) | (i296 ^ iB)) * 220))) - 1, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16, new char[]{65530, 65532, 2, 65535, 2, '\r', 11, 65534, 65500, 65534, '\r', 65530, 11, 65534, 7, 65534, 0, 65534, '\r'}, objArr24);
                                                                    Object objInvoke5 = cls7.getMethod((String) objArr24[0], InputStream.class).invoke(objInvoke4, objArr22);
                                                                    Invoke = 36;
                                                                    try {
                                                                        char[] cArr5 = {61644, 47267, 38170, 27119, 20208, 30696, 23895, 58296, 41783, 35256, 16492, 43475, 62006, 20758, 28449, 59034, 2777, 15089, 38990, 4713, 7512, 6317, 5983, 17271, 7171, 29737, 48635, 17766, 3406, 41290, 16434, 10684, 44228, 26092, 39745, 35097};
                                                                        int i297 = -Color.rgb(0, 0, 0);
                                                                        int i298 = i297 * (-419);
                                                                        int i299 = asInterface;
                                                                        int i300 = (i299 ^ 111) + ((i299 & 111) << 1);
                                                                        d = i300 % 128;
                                                                        int i301 = i300 % 2;
                                                                        int i302 = (i298 ^ 1526740970) + ((i298 & 1526740970) << 1) + ((~(((-16777182) ^ i) | ((-16777182) & i))) * TypedValues.CycleType.TYPE_EASING);
                                                                        int i303 = ~i297;
                                                                        int i304 = ((i303 ^ (-16777182)) | (i303 & (-16777182))) * (-420);
                                                                        int i305 = ~((i303 & 16777181) | (i303 ^ 16777181));
                                                                        int i306 = ~(((-16777182) & i62) | (i62 ^ (-16777182)));
                                                                        int i307 = ((((i302 | i304) << 1) - (i304 ^ i302)) - (~(((i305 & i306) | (i305 ^ i306)) * TypedValues.CycleType.TYPE_EASING))) - 1;
                                                                        Object[] objArr25 = new Object[1];
                                                                        c(cArr5, i307, objArr25);
                                                                        Class<?> cls8 = Class.forName((String) objArr25[0]);
                                                                        char[] cArr6 = {21391, 17532, 27311, 4150, 63619, 22973, 47213, 39760, 23717, 7728, 60944, 27682, 31723, 6237, 2268, 19112, 62883, 61613, 15797, 48967, 25408, 20481, 4519, 10317, 28879, 15115};
                                                                        int i308 = d + 47;
                                                                        asInterface = i308 % 128;
                                                                        int i309 = i308 % 2;
                                                                        int i310 = -View.resolveSize(0, 0);
                                                                        int i311 = (i310 ^ 23) + ((i310 & 23) << 1);
                                                                        Object[] objArr26 = new Object[1];
                                                                        c(cArr6, i311, objArr26);
                                                                        Invoke = cls8.getMethod((String) objArr26[0], null).invoke(objInvoke5, null);
                                                                        if (NewInstance.equals(Invoke)) {
                                                                            i6 = 1;
                                                                        } else {
                                                                            int i312 = asInterface;
                                                                            int i313 = (i312 & 87) + (i312 | 87);
                                                                            d = i313 % 128;
                                                                            int i314 = i313 % 2;
                                                                            int i315 = i312 + 19;
                                                                            int i316 = i315 % 128;
                                                                            d = i316;
                                                                            int i317 = i315 % 2;
                                                                            int i318 = ((i316 | 105) << 1) - (i316 ^ 105);
                                                                            asInterface = i318 % 128;
                                                                            if (i318 % 2 != 0) {
                                                                                try {
                                                                                    cArr2 = new char[]{61644, 47267, 38170, 27119, 20208, 30696, 23895, 58296, 41783, 35256, 16492, 43475, 62006, 20758, 28449, 59034, 2777, 15089, 38990, 4713, 7512, 6317, 5983, 17271, 7171, 29737, 48635, 17766, 3406, 41290, 16434, 10684, 44228, 26092, 39745, 35097};
                                                                                    i7 = -Drawable.resolveOpacity(1, 1);
                                                                                    i8 = 52;
                                                                                } catch (Throwable th) {
                                                                                    Throwable cause = th.getCause();
                                                                                    if (cause != null) {
                                                                                        throw cause;
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            } else {
                                                                                cArr2 = new char[]{61644, 47267, 38170, 27119, 20208, 30696, 23895, 58296, 41783, 35256, 16492, 43475, 62006, 20758, 28449, 59034, 2777, 15089, 38990, 4713, 7512, 6317, 5983, 17271, 7171, 29737, 48635, 17766, 3406, 41290, 16434, 10684, 44228, 26092, 39745, 35097};
                                                                                i7 = -Drawable.resolveOpacity(0, 0);
                                                                                i8 = 34;
                                                                            }
                                                                            int i319 = asInterface;
                                                                            int i320 = (i319 ^ 93) + ((i319 & 93) << 1);
                                                                            int i321 = i320 % 128;
                                                                            d = i321;
                                                                            int i322 = (i320 % 2 == 0 ? (-381) << i7 : i7 * (-381)) + (DerHeader.TAG_CLASS_PRIVATE * i8);
                                                                            int i323 = ~i7;
                                                                            int i324 = i323 * (-191);
                                                                            int i325 = (i322 & i324) + (i322 | i324);
                                                                            int i326 = ~(i8 | i);
                                                                            int i327 = -(-(((i326 & i7) | (i7 ^ i326)) * 191));
                                                                            int i328 = (i325 ^ i327) + ((i327 & i325) << 1);
                                                                            int i329 = (i321 & 39) + (i321 | 39);
                                                                            asInterface = i329 % 128;
                                                                            if (i329 % 2 != 0) {
                                                                                i9 = ~((~i7) | i8);
                                                                                int i330 = 38 / 0;
                                                                                i10 = i62;
                                                                            } else {
                                                                                i9 = ~(i323 | i8);
                                                                                i10 = i79;
                                                                            }
                                                                            int i331 = (i328 - (~(-(-(191 * (i9 | (~(i8 | i10)))))))) - 1;
                                                                            Object[] objArr27 = new Object[1];
                                                                            c(cArr2, i331, objArr27);
                                                                            Class<?> cls9 = Class.forName((String) objArr27[0]);
                                                                            Object[] objArr28 = new Object[1];
                                                                            c(new char[]{21391, 17532, 27311, 4150, 63619, 22973, 47213, 39760, 23717, 7728, 60944, 27682, 31723, 6237, 2268, 19112, 62883, 61613, 15797, 48967, 25408, 20481, 4519, 10317, 28879, 15115}, View.MeasureSpec.makeMeasureSpec(0, 0) + 23, objArr28);
                                                                            i6 = 1;
                                                                            if (!objNewInstance.equals(cls9.getMethod((String) objArr28[0], null).invoke(objInvoke5, null))) {
                                                                                i190 = i219 + 1;
                                                                                int i332 = d;
                                                                                int i333 = (i332 & 3) + (i332 | 3);
                                                                                asInterface = i333 % 128;
                                                                                int i334 = i333 % 2;
                                                                                objArr14 = objArr18;
                                                                                Invoke = r25 == true ? 1 : 0;
                                                                                i12 = 1;
                                                                            }
                                                                        }
                                                                        Object[] objArr29 = new Object[4];
                                                                        int[] iArr = new int[i6];
                                                                        objArr29[0] = iArr;
                                                                        objArr29[i6] = new int[i6];
                                                                        int[] iArr2 = new int[i6];
                                                                        objArr29[2] = iArr2;
                                                                        iArr[0] = i;
                                                                        iArr2[0] = i179 | (i62 & 1);
                                                                        objArr29[3] = null;
                                                                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                                                        int i335 = (-1476696048) + (((~(498976408 | elapsedCpuTime)) | 496566928) * (-502)) + ((~((~elapsedCpuTime) | 1035853565)) * (-502)) + (((~(elapsedCpuTime | (-539286638))) | 498976408) * TypedValues.PositionType.TYPE_DRAWPATH);
                                                                        int i336 = i2 + (i335 ^ 16) + ((16 & i335) << 1);
                                                                        int i337 = i336 << 13;
                                                                        int i338 = ((~i336) & i337) | ((~i337) & i336);
                                                                        int i339 = i338 >>> 17;
                                                                        int i340 = (i338 | i339) & (~(i338 & i339));
                                                                        int i341 = i340 << 5;
                                                                        ((int[]) objArr29[1])[0] = (i340 | i341) & (~(i340 & i341));
                                                                        return objArr29;
                                                                    } catch (Throwable th2) {
                                                                        Throwable cause2 = th2.getCause();
                                                                        if (cause2 != null) {
                                                                            throw cause2;
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    Throwable cause3 = th3.getCause();
                                                                    if (cause3 != null) {
                                                                        throw cause3;
                                                                    }
                                                                    throw th3;
                                                                }
                                                            } catch (Throwable th4) {
                                                                Throwable cause4 = th4.getCause();
                                                                if (cause4 != null) {
                                                                    throw cause4;
                                                                }
                                                                throw th4;
                                                            }
                                                        } catch (Throwable th5) {
                                                            Throwable cause5 = th5.getCause();
                                                            if (cause5 != null) {
                                                                throw cause5;
                                                            }
                                                            throw th5;
                                                        }
                                                    }
                                                    Invoke = 3;
                                                }
                                            } catch (Throwable th6) {
                                                Throwable cause6 = th6.getCause();
                                                if (cause6 != null) {
                                                    throw cause6;
                                                }
                                                throw th6;
                                            }
                                        } catch (Throwable th7) {
                                            Throwable cause7 = th7.getCause();
                                            if (cause7 != null) {
                                                throw cause7;
                                            }
                                            throw th7;
                                        }
                                    } catch (Throwable th8) {
                                        Throwable cause8 = th8.getCause();
                                        if (cause8 != null) {
                                            throw cause8;
                                        }
                                        throw th8;
                                    }
                                } catch (Throwable th9) {
                                    Throwable cause9 = th9.getCause();
                                    if (cause9 != null) {
                                        throw cause9;
                                    }
                                    throw th9;
                                }
                            } catch (Throwable th10) {
                                Throwable cause10 = th10.getCause();
                                if (cause10 != null) {
                                    throw cause10;
                                }
                                throw th10;
                            }
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                    }
                } else {
                    Invoke = 3;
                }
                Object[] objArr30 = new Object[4];
                int[] iArr3 = new int[1];
                objArr30[0] = iArr3;
                int i342 = asInterface + 59;
                int i343 = i342 % 128;
                d = i343;
                if (i342 % 2 == 0) {
                    objArr30[1] = new int[0];
                    objArr30[2] = new int[0];
                } else {
                    objArr30[1] = new int[1];
                    objArr30[2] = new int[1];
                }
                iArr3[0] = i;
                int i344 = i343 + 99;
                int i345 = i344 % 128;
                asInterface = i345;
                if (i344 % 2 != 0) {
                    ((int[]) objArr30[5])[1] = i;
                    r4 = 2;
                } else {
                    ((int[]) objArr30[2])[0] = i;
                    r4 = Invoke;
                }
                objArr30[r4] = null;
                int i346 = ~i;
                int i347 = -(-((-1986665164) + ((~(39777742 | i346)) * 52) + (((~(39645262 | i346)) | (~((-664967) | i346)) | 132480) * (-52)) + (((~(i346 | (-39645263))) | 39112776) * 52)));
                int i348 = ((i2 | i347) << 1) - (i2 ^ i347);
                int i349 = i348 << 13;
                int i350 = (i349 & (~i348)) | ((~i349) & i348);
                int i351 = i350 >>> 17;
                int i352 = (i350 | i351) & (~(i350 & i351));
                int i353 = i352 << 5;
                int i354 = (i345 ^ 69) + ((i345 & 69) << 1);
                d = i354 % 128;
                int i355 = i354 % 2;
                ((int[]) objArr30[1])[0] = ((~i352) & i353) | ((~i353) & i352);
                return objArr30;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0021  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(byte r6, int r7, byte r8) {
                /*
                    int r6 = r6 * 4
                    int r0 = r6 + 1
                    int r8 = r8 + 108
                    int r7 = r7 * 4
                    int r7 = 4 - r7
                    byte[] r1 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass3.$$a
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L15
                    r3 = r8
                    r4 = r2
                    r8 = r7
                    goto L2a
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    if (r3 != r6) goto L21
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L21:
                    int r3 = r3 + 1
                    r4 = r1[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r4
                    r4 = r3
                    r3 = r5
                L2a:
                    int r7 = r7 + r3
                    int r8 = r8 + 1
                    r3 = r4
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.AnonymousClass3.$$c(byte, int, byte):java.lang.String");
            }
        };
        BOOLEAN = typeAdapter;
        BOOLEAN_AS_STRING = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public Boolean read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Boolean.valueOf(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.value(bool == null ? "null" : bool.toString());
            }
        };
        BOOLEAN_FACTORY = newFactory(Boolean.TYPE, Boolean.class, typeAdapter);
        TypeAdapter<Number> typeAdapter2 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int iNextInt = jsonReader.nextInt();
                    if (iNextInt > 255 || iNextInt < -128) {
                        StringBuilder sb = new StringBuilder("Lossy conversion from ");
                        sb.append(iNextInt);
                        sb.append(" to byte; at path ");
                        sb.append(jsonReader.getPreviousPath());
                        throw new JsonSyntaxException(sb.toString());
                    }
                    return Byte.valueOf((byte) iNextInt);
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.byteValue());
                }
            }
        };
        BYTE = typeAdapter2;
        BYTE_FACTORY = newFactory(Byte.TYPE, Byte.class, typeAdapter2);
        TypeAdapter<Number> typeAdapter3 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int iNextInt = jsonReader.nextInt();
                    if (iNextInt > 65535 || iNextInt < -32768) {
                        StringBuilder sb = new StringBuilder("Lossy conversion from ");
                        sb.append(iNextInt);
                        sb.append(" to short; at path ");
                        sb.append(jsonReader.getPreviousPath());
                        throw new JsonSyntaxException(sb.toString());
                    }
                    return Short.valueOf((short) iNextInt);
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.shortValue());
                }
            }
        };
        SHORT = typeAdapter3;
        SHORT_FACTORY = newFactory(Short.TYPE, Short.class, typeAdapter3);
        TypeAdapter<Number> typeAdapter4 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.intValue());
                }
            }
        };
        INTEGER = typeAdapter4;
        INTEGER_FACTORY = newFactory(Integer.TYPE, Integer.class, typeAdapter4);
        TypeAdapter<AtomicInteger> typeAdapterNullSafe3 = new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            public AtomicInteger read(JsonReader jsonReader) throws IOException {
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
                jsonWriter.value(atomicInteger.get());
            }
        }.nullSafe();
        ATOMIC_INTEGER = typeAdapterNullSafe3;
        ATOMIC_INTEGER_FACTORY = newFactory(AtomicInteger.class, typeAdapterNullSafe3);
        TypeAdapter<AtomicBoolean> typeAdapterNullSafe4 = new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            public AtomicBoolean read(JsonReader jsonReader) throws IOException {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
                jsonWriter.value(atomicBoolean.get());
            }
        }.nullSafe();
        ATOMIC_BOOLEAN = typeAdapterNullSafe4;
        ATOMIC_BOOLEAN_FACTORY = newFactory(AtomicBoolean.class, typeAdapterNullSafe4);
        TypeAdapter<AtomicIntegerArray> typeAdapterNullSafe5 = new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            public AtomicIntegerArray read(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e2) {
                        throw new JsonSyntaxException(e2);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
                jsonWriter.beginArray();
                int length = atomicIntegerArray.length();
                for (int i = 0; i < length; i++) {
                    jsonWriter.value(atomicIntegerArray.get(i));
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        ATOMIC_INTEGER_ARRAY = typeAdapterNullSafe5;
        ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(AtomicIntegerArray.class, typeAdapterNullSafe5);
        LONG = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.nextLong());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.longValue());
                }
            }
        };
        FLOAT = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Float.valueOf((float) jsonReader.nextDouble());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                jsonWriter.value(number);
            }
        };
        DOUBLE = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Double.valueOf(jsonReader.nextDouble());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.doubleValue());
                }
            }
        };
        TypeAdapter<Character> typeAdapter5 = new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public Character read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                if (strNextString.length() != 1) {
                    StringBuilder sb = new StringBuilder("Expecting character, got: ");
                    sb.append(strNextString);
                    sb.append("; at ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(sb.toString());
                }
                return Character.valueOf(strNextString.charAt(0));
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Character ch) throws IOException {
                jsonWriter.value(ch == null ? null : String.valueOf(ch));
            }
        };
        CHARACTER = typeAdapter5;
        CHARACTER_FACTORY = newFactory(Character.TYPE, Character.class, typeAdapter5);
        TypeAdapter<String> typeAdapter6 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            public String read(JsonReader jsonReader) throws IOException {
                JsonToken jsonTokenPeek = jsonReader.peek();
                if (jsonTokenPeek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (jsonTokenPeek == JsonToken.BOOLEAN) {
                    return Boolean.toString(jsonReader.nextBoolean());
                }
                return jsonReader.nextString();
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, String str) throws IOException {
                jsonWriter.value(str);
            }
        };
        STRING = typeAdapter6;
        BIG_DECIMAL = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            public BigDecimal read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                try {
                    return new BigDecimal(strNextString);
                } catch (NumberFormatException e2) {
                    StringBuilder sb = new StringBuilder("Failed parsing '");
                    sb.append(strNextString);
                    sb.append("' as BigDecimal; at path ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(sb.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
                jsonWriter.value(bigDecimal);
            }
        };
        BIG_INTEGER = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            public BigInteger read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                try {
                    return new BigInteger(strNextString);
                } catch (NumberFormatException e2) {
                    StringBuilder sb = new StringBuilder("Failed parsing '");
                    sb.append(strNextString);
                    sb.append("' as BigInteger; at path ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(sb.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
                jsonWriter.value(bigInteger);
            }
        };
        LAZILY_PARSED_NUMBER = new AnonymousClass18();
        STRING_FACTORY = newFactory(String.class, typeAdapter6);
        TypeAdapter<StringBuilder> typeAdapter7 = new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            public StringBuilder read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new StringBuilder(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
                jsonWriter.value(sb == null ? null : sb.toString());
            }
        };
        STRING_BUILDER = typeAdapter7;
        STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, typeAdapter7);
        TypeAdapter<StringBuffer> typeAdapter8 = new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            public StringBuffer read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new StringBuffer(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
                jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        STRING_BUFFER = typeAdapter8;
        STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, typeAdapter8);
        TypeAdapter<URL> typeAdapter9 = new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            public URL read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                if ("null".equals(strNextString)) {
                    return null;
                }
                return new URL(strNextString);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, URL url) throws IOException {
                jsonWriter.value(url == null ? null : url.toExternalForm());
            }
        };
        URL = typeAdapter9;
        URL_FACTORY = newFactory(URL.class, typeAdapter9);
        TypeAdapter<URI> typeAdapter10 = new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            public URI read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String strNextString = jsonReader.nextString();
                    if ("null".equals(strNextString)) {
                        return null;
                    }
                    return new URI(strNextString);
                } catch (URISyntaxException e2) {
                    throw new JsonIOException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, URI uri) throws IOException {
                jsonWriter.value(uri == null ? null : uri.toASCIIString());
            }
        };
        URI = typeAdapter10;
        URI_FACTORY = newFactory(URI.class, typeAdapter10);
        TypeAdapter<InetAddress> typeAdapter11 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            public InetAddress read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return InetAddress.getByName(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
                jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        INET_ADDRESS = typeAdapter11;
        INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, typeAdapter11);
        TypeAdapter<UUID> typeAdapter12 = new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            public UUID read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                try {
                    return UUID.fromString(strNextString);
                } catch (IllegalArgumentException e2) {
                    StringBuilder sb = new StringBuilder("Failed parsing '");
                    sb.append(strNextString);
                    sb.append("' as UUID; at path ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(sb.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, UUID uuid) throws IOException {
                jsonWriter.value(uuid == null ? null : uuid.toString());
            }
        };
        UUID = typeAdapter12;
        UUID_FACTORY = newFactory(UUID.class, typeAdapter12);
        TypeAdapter<Currency> typeAdapterNullSafe6 = new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            public Currency read(JsonReader jsonReader) throws IOException {
                String strNextString = jsonReader.nextString();
                try {
                    return Currency.getInstance(strNextString);
                } catch (IllegalArgumentException e2) {
                    StringBuilder sb = new StringBuilder("Failed parsing '");
                    sb.append(strNextString);
                    sb.append("' as Currency; at path ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(sb.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Currency currency) throws IOException {
                jsonWriter.value(currency.getCurrencyCode());
            }
        }.nullSafe();
        CURRENCY = typeAdapterNullSafe6;
        CURRENCY_FACTORY = newFactory(Currency.class, typeAdapterNullSafe6);
        TypeAdapter<Calendar> typeAdapter13 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            private static final String DAY_OF_MONTH = "dayOfMonth";
            private static final String HOUR_OF_DAY = "hourOfDay";
            private static final String MINUTE = "minute";
            private static final String MONTH = "month";
            private static final String SECOND = "second";
            private static final String YEAR = "year";

            @Override // com.google.gson.TypeAdapter
            public Calendar read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String strNextName = jsonReader.nextName();
                    int iNextInt = jsonReader.nextInt();
                    if (YEAR.equals(strNextName)) {
                        i = iNextInt;
                    } else if (MONTH.equals(strNextName)) {
                        i2 = iNextInt;
                    } else if (DAY_OF_MONTH.equals(strNextName)) {
                        i3 = iNextInt;
                    } else if (HOUR_OF_DAY.equals(strNextName)) {
                        i4 = iNextInt;
                    } else if (MINUTE.equals(strNextName)) {
                        i5 = iNextInt;
                    } else if (SECOND.equals(strNextName)) {
                        i6 = iNextInt;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Calendar calendar) throws IOException {
                if (calendar == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name(YEAR);
                jsonWriter.value(calendar.get(1));
                jsonWriter.name(MONTH);
                jsonWriter.value(calendar.get(2));
                jsonWriter.name(DAY_OF_MONTH);
                jsonWriter.value(calendar.get(5));
                jsonWriter.name(HOUR_OF_DAY);
                jsonWriter.value(calendar.get(11));
                jsonWriter.name(MINUTE);
                jsonWriter.value(calendar.get(12));
                jsonWriter.name(SECOND);
                jsonWriter.value(calendar.get(13));
                jsonWriter.endObject();
            }
        };
        CALENDAR = typeAdapter13;
        CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, typeAdapter13);
        AnonymousClass27 anonymousClass27 = new AnonymousClass27();
        LOCALE = anonymousClass27;
        LOCALE_FACTORY = newFactory(Locale.class, anonymousClass27);
        TypeAdapter<JsonElement> typeAdapter14 = new TypeAdapter<JsonElement>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            private JsonElement tryBeginNesting(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
                int i = AnonymousClass35.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
                if (i == 4) {
                    jsonReader.beginArray();
                    return new JsonArray();
                }
                if (i != 5) {
                    return null;
                }
                jsonReader.beginObject();
                return new JsonObject();
            }

            private JsonElement readTerminal(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
                int i = AnonymousClass35.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
                if (i == 1) {
                    return new JsonPrimitive(new LazilyParsedNumber(jsonReader.nextString()));
                }
                if (i == 2) {
                    return new JsonPrimitive(jsonReader.nextString());
                }
                if (i == 3) {
                    return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
                }
                if (i == 6) {
                    jsonReader.nextNull();
                    return JsonNull.INSTANCE;
                }
                throw new IllegalStateException("Unexpected token: ".concat(String.valueOf(jsonToken)));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public JsonElement read(JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof JsonTreeReader) {
                    return ((JsonTreeReader) jsonReader).nextJsonElement();
                }
                JsonToken jsonTokenPeek = jsonReader.peek();
                JsonElement jsonElementTryBeginNesting = tryBeginNesting(jsonReader, jsonTokenPeek);
                if (jsonElementTryBeginNesting == null) {
                    return readTerminal(jsonReader, jsonTokenPeek);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (jsonReader.hasNext()) {
                        String strNextName = jsonElementTryBeginNesting instanceof JsonObject ? jsonReader.nextName() : null;
                        JsonToken jsonTokenPeek2 = jsonReader.peek();
                        JsonElement jsonElementTryBeginNesting2 = tryBeginNesting(jsonReader, jsonTokenPeek2);
                        boolean z = jsonElementTryBeginNesting2 != null;
                        JsonElement terminal = jsonElementTryBeginNesting2 == null ? readTerminal(jsonReader, jsonTokenPeek2) : jsonElementTryBeginNesting2;
                        if (jsonElementTryBeginNesting instanceof JsonArray) {
                            ((JsonArray) jsonElementTryBeginNesting).add(terminal);
                        } else {
                            ((JsonObject) jsonElementTryBeginNesting).add(strNextName, terminal);
                        }
                        if (z) {
                            arrayDeque.addLast(jsonElementTryBeginNesting);
                            jsonElementTryBeginNesting = terminal;
                        }
                    } else {
                        if (jsonElementTryBeginNesting instanceof JsonArray) {
                            jsonReader.endArray();
                        } else {
                            jsonReader.endObject();
                        }
                        if (arrayDeque.isEmpty()) {
                            return jsonElementTryBeginNesting;
                        }
                        jsonElementTryBeginNesting = (JsonElement) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, JsonElement jsonElement) throws IOException {
                if (jsonElement == null || jsonElement.isJsonNull()) {
                    jsonWriter.nullValue();
                    return;
                }
                if (jsonElement.isJsonPrimitive()) {
                    JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                    if (asJsonPrimitive.isNumber()) {
                        jsonWriter.value(asJsonPrimitive.getAsNumber());
                        return;
                    } else if (asJsonPrimitive.isBoolean()) {
                        jsonWriter.value(asJsonPrimitive.getAsBoolean());
                        return;
                    } else {
                        jsonWriter.value(asJsonPrimitive.getAsString());
                        return;
                    }
                }
                if (jsonElement.isJsonArray()) {
                    jsonWriter.beginArray();
                    Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
                    while (it.hasNext()) {
                        write(jsonWriter, it.next());
                    }
                    jsonWriter.endArray();
                    return;
                }
                if (jsonElement.isJsonObject()) {
                    jsonWriter.beginObject();
                    for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                        jsonWriter.name(entry.getKey());
                        write(jsonWriter, entry.getValue());
                    }
                    jsonWriter.endObject();
                    return;
                }
                StringBuilder sb = new StringBuilder("Couldn't write ");
                sb.append(jsonElement.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        };
        JSON_ELEMENT = typeAdapter14;
        JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(JsonElement.class, typeAdapter14);
        ENUM_FACTORY = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new EnumTypeAdapter(rawType);
            }
        };
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$35, reason: invalid class name */
    static /* synthetic */ class AnonymousClass35 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$18, reason: invalid class name */
    public class AnonymousClass18 extends TypeAdapter<LazilyParsedNumber> {
        public static int TuitionPaymentFragmentbindingInflater1;
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        AnonymousClass18() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public LazilyParsedNumber read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return new LazilyParsedNumber(jsonReader.nextString());
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, LazilyParsedNumber lazilyParsedNumber) throws IOException {
            jsonWriter.value(lazilyParsedNumber);
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i2 = i % 7729639;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentbindingInflater1;
            }
            int iMyUid = Process.myUid();
            TuitionPaymentFragmentbindingInflater1 = iMyUid;
            return iMyUid;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$27, reason: invalid class name */
    public class AnonymousClass27 extends TypeAdapter<Locale> {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public static int b;

        AnonymousClass27() {
        }

        @Override // com.google.gson.TypeAdapter
        public Locale read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (strNextToken2 == null && strNextToken3 == null) {
                return new Locale(strNextToken);
            }
            if (strNextToken3 == null) {
                return new Locale(strNextToken, strNextToken2);
            }
            return new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Locale locale) throws IOException {
            jsonWriter.value(locale == null ? null : locale.toString());
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            int i = b;
            int i2 = i % 9138945;
            b = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = startElapsedRealtime;
            return startElapsedRealtime;
        }
    }

    static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {
        private final Map<String, T> nameToConstant = new HashMap();
        private final Map<String, T> stringToConstant = new HashMap();
        private final Map<T, String> constantToName = new HashMap();

        public EnumTypeAdapter(final Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new PrivilegedAction<Field[]>() { // from class: com.google.gson.internal.bind.TypeAdapters.EnumTypeAdapter.1
                    @Override // java.security.PrivilegedAction
                    public Field[] run() {
                        Field[] declaredFields = cls.getDeclaredFields();
                        ArrayList arrayList = new ArrayList(declaredFields.length);
                        for (Field field2 : declaredFields) {
                            if (field2.isEnumConstant()) {
                                arrayList.add(field2);
                            }
                        }
                        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                        AccessibleObject.setAccessible(fieldArr, true);
                        return fieldArr;
                    }
                })) {
                    Enum r4 = (Enum) field.get(null);
                    String strName = r4.name();
                    String string = r4.toString();
                    SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                        strName = serializedName.value();
                        for (String str : serializedName.alternate()) {
                            this.nameToConstant.put(str, (T) r4);
                        }
                    }
                    this.nameToConstant.put(strName, (T) r4);
                    this.stringToConstant.put(string, (T) r4);
                    this.constantToName.put((T) r4, strName);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            T t = this.nameToConstant.get(strNextString);
            return t == null ? this.stringToConstant.get(strNextString) : t;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, T t) throws IOException {
            jsonWriter.value(t == null ? null : this.constantToName.get(t));
        }
    }

    public static <TT> TypeAdapterFactory newFactory(final TypeToken<TT> typeToken, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken2) {
                if (typeToken2.equals(typeToken)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> TypeAdapterFactory newFactory(final Class<TT> cls, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(typeAdapter);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    public static <TT> TypeAdapterFactory newFactory(final Class<TT> cls, final Class<TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls2.getName());
                sb.append("+");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(typeAdapter);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    public static <TT> TypeAdapterFactory newFactoryForMultipleTypes(final Class<TT> cls, final Class<? extends TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls.getName());
                sb.append("+");
                sb.append(cls2.getName());
                sb.append(",adapter=");
                sb.append(typeAdapter);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    public static <T1> TypeAdapterFactory newTypeHierarchyFactory(final Class<T1> cls, final TypeAdapter<T1> typeAdapter) {
        return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.TypeAdapterFactory
            public <T2> TypeAdapter<T2> create(Gson gson, TypeToken<T2> typeToken) {
                final Class<? super T2> rawType = typeToken.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return (TypeAdapter<T2>) new TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1
                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, T1 t1) throws IOException {
                            typeAdapter.write(jsonWriter, t1);
                        }

                        @Override // com.google.gson.TypeAdapter
                        public T1 read(JsonReader jsonReader) throws IOException {
                            T1 t1 = (T1) typeAdapter.read(jsonReader);
                            if (t1 == null || rawType.isInstance(t1)) {
                                return t1;
                            }
                            StringBuilder sb = new StringBuilder("Expected a ");
                            sb.append(rawType.getName());
                            sb.append(" but was ");
                            sb.append(t1.getClass().getName());
                            sb.append("; at path ");
                            sb.append(jsonReader.getPreviousPath());
                            throw new JsonSyntaxException(sb.toString());
                        }
                    };
                }
                return null;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Factory[typeHierarchy=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(typeAdapter);
                sb.append("]");
                return sb.toString();
            }
        };
    }
}
