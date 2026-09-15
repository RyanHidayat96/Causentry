package com.google.gson.internal.bind;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import defpackage.createExtraImageCapture;
import defpackage.getConfigs;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {
    private final TreeTypeAdapter<T>.GsonContextImpl context;
    private volatile TypeAdapter<T> delegate;
    private final JsonDeserializer<T> deserializer;
    final Gson gson;
    private final boolean nullSafe;
    private final JsonSerializer<T> serializer;
    private final TypeAdapterFactory skipPast;
    private final TypeToken<T> typeToken;
    private static final byte[] $$c = {31, 115, -100, -11};
    private static final int $$f = 72;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {90, 46, 113, 8, -39, 36, -39, -10, -16, 19, -42, 5, -22, -8, 6, -7, 25, -38, -19, -8, 2, -7, -10, -16, 20, -39, 36, -39, -10, -16, 19, -42, 5, -22, -8, 6, -7, 23, -57, 9, -17, -14, 36, -33, -21, 2, -16, -1, -21, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, 10, -15, -13, 2, -13, -13, -1, 22, -45, 0, -14, 3, -27, 7, -21, 57};
    private static final int $$e = 226;
    private static final byte[] $$a = {83, ByteCompanionObject.MIN_VALUE, -37, -48, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 8;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int asInterface = 1;
    private static char b = 60718;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 50098;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 39137;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 49928;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r8 = r8 + 84
            byte[] r0 = com.google.gson.internal.bind.TreeTypeAdapter.$$a
            int r7 = r7 * 15
            int r1 = r7 + 38
            byte[] r1 = new byte[r1]
            int r7 = r7 + 37
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r8 = -r8
            int r3 = r3 + r8
            int r6 = r6 + 1
            int r8 = r3 + (-11)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TreeTypeAdapter.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 5
            int r7 = 84 - r7
            byte[] r0 = com.google.gson.internal.bind.TreeTypeAdapter.$$d
            int r6 = r6 * 45
            int r6 = 49 - r6
            int r5 = r5 * 8
            int r1 = r5 + 38
            byte[] r1 = new byte[r1]
            int r5 = r5 + 37
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2a:
            int r4 = -r4
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-8)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TreeTypeAdapter.d(int, byte, short, java.lang.Object[]):void");
    }

    public TreeTypeAdapter(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory typeAdapterFactory, boolean z) {
        this.context = new GsonContextImpl();
        this.serializer = jsonSerializer;
        this.deserializer = jsonDeserializer;
        this.gson = gson;
        this.typeToken = typeToken;
        this.skipPast = typeAdapterFactory;
        this.nullSafe = z;
    }

    public TreeTypeAdapter(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory typeAdapterFactory) {
        this(jsonSerializer, jsonDeserializer, gson, typeToken, typeAdapterFactory, true);
    }

    @Override // com.google.gson.TypeAdapter
    public final T read(JsonReader jsonReader) throws IOException {
        int i = 2 % 2;
        if (this.deserializer == null) {
            return delegate().read(jsonReader);
        }
        JsonElement jsonElement = Streams.parse(jsonReader);
        if (this.nullSafe) {
            int i2 = asInterface + 111;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            if (jsonElement.isJsonNull()) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 107;
                asInterface = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
        }
        return this.deserializer.deserialize(jsonElement, this.typeToken.getType(), this.context);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, T t) throws IOException {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        JsonSerializer<T> jsonSerializer = this.serializer;
        if (jsonSerializer == null) {
            delegate().write(jsonWriter, t);
            return;
        }
        if (this.nullSafe && t == null) {
            jsonWriter.nullValue();
            int i4 = TuitionPaymentFragmentbindingInflater1 + 69;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Streams.write(jsonSerializer.serialize(t, this.typeToken.getType(), this.context), jsonWriter);
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        CharSequence charSequence;
        int i3 = 2;
        int i4 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i5 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i6 = $10 + 83;
            $11 = i6 % 128;
            int i7 = 58224;
            if (i6 % i3 == 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 << 1];
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            }
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $11 + 81;
                $10 = i9 % 128;
                int i10 = i9 % i3;
                char c = cArr3[1];
                char c2 = cArr3[i5];
                int i11 = (c2 + i7) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    objArr2[i3] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i5] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        charSequence = "";
                        char capsMode = (char) (47773 - TextUtils.getCapsMode(charSequence, i5, i5));
                        int i13 = 469 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int iLastIndexOf = 12 - TextUtils.lastIndexOf(charSequence, '0');
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i3] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, i13, iLastIndexOf, -2007001706, false, "o", clsArr);
                    } else {
                        charSequence = "";
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    onCaptureSessionEnd oncapturesessionend2 = oncapturesessionend;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), ImageFormat.getBitsPerPixel(0) + 469, 13 - TextUtils.getOffsetBefore(charSequence, 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    int i14 = $10 + 11;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    oncapturesessionend = oncapturesessionend2;
                    i3 = 2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            onCaptureSessionEnd oncapturesessionend3 = oncapturesessionend;
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend3, oncapturesessionend3};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int packedPositionChild = 2322 - ExpandableListView.getPackedPositionChild(0L);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 44;
                byte b2 = (byte) 0;
                byte b3 = b2;
                String str$$g = $$g(b2, b3, (byte) (b3 - 1));
                i2 = 2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, packedPositionChild, offsetAfter, -1312321721, false, str$$g, new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            oncapturesessionend = oncapturesessionend3;
            i3 = i2;
        }
    }

    public static final class SingleTypeFactory implements TypeAdapterFactory {
        private final JsonDeserializer<?> deserializer;
        private final TypeToken<?> exactType;
        private final Class<?> hierarchyType;
        private final boolean matchRawType;
        private final JsonSerializer<?> serializer;

        SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z, Class<?> cls) {
            JsonSerializer<?> jsonSerializer = obj instanceof JsonSerializer ? (JsonSerializer) obj : null;
            this.serializer = jsonSerializer;
            JsonDeserializer<?> jsonDeserializer = obj instanceof JsonDeserializer ? (JsonDeserializer) obj : null;
            this.deserializer = jsonDeserializer;
            C$Gson$Preconditions.checkArgument((jsonSerializer == null && jsonDeserializer == null) ? false : true);
            this.exactType = typeToken;
            this.matchRawType = z;
            this.hierarchyType = cls;
        }

        @Override // com.google.gson.TypeAdapterFactory
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            TypeToken<?> typeToken2 = this.exactType;
            if (typeToken2 != null) {
                if (!typeToken2.equals(typeToken) && (!this.matchRawType || this.exactType.getType() != typeToken.getRawType())) {
                    return null;
                }
            } else if (!this.hierarchyType.isAssignableFrom(typeToken.getRawType())) {
                return null;
            }
            return new TreeTypeAdapter(this.serializer, this.deserializer, gson, typeToken, this);
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0] = createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0];
        }
    }

    final class GsonContextImpl implements JsonSerializationContext, JsonDeserializationContext {
        private GsonContextImpl() {
        }

        @Override // com.google.gson.JsonSerializationContext
        public final JsonElement serialize(Object obj) {
            return TreeTypeAdapter.this.gson.toJsonTree(obj);
        }

        @Override // com.google.gson.JsonSerializationContext
        public final JsonElement serialize(Object obj, Type type) {
            return TreeTypeAdapter.this.gson.toJsonTree(obj, type);
        }

        @Override // com.google.gson.JsonDeserializationContext
        public final <R> R deserialize(JsonElement jsonElement, Type type) throws JsonParseException {
            return (R) TreeTypeAdapter.this.gson.fromJson(jsonElement, type);
        }
    }

    private TypeAdapter<T> delegate() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (43043 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int edgeSlop = 3111 - (ViewConfiguration.getEdgeSlop() >> 16);
            int mirror = 'F' - AndroidCharacter.getMirror('0');
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[5], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, edgeSlop, mirror, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{56472, 10018, 33941, 34694, 26491, 49248, 58018, 28017, 6433, 50304, 15728, 56600, 43448, 20688, 37567, 9124, 33017, 52155, 29573, 41510, 51021, 2576, 21162, 39078}, 22 - (Process.myPid() >> 22), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{52859, 41505, 38359, 56695, 56229, 46153, 27362, 27407, 191, 30050, 7830, 51797, 65045, 26613, 61901, 58099, 13065, 45473}, 15 - KeyEvent.normalizeMetaState(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 43043);
            int minimumFlingVelocity = 3111 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iResolveSize = View.resolveSize(0, 0) + 22;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b3, b3, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel, minimumFlingVelocity, iResolveSize, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 97;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumDrawingCacheSize = (char) (43042 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int iRgb = (-16774105) - Color.rgb(0, 0, 0);
                int capsMode = 22 - TextUtils.getCapsMode("", 0, 0);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[40];
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumDrawingCacheSize, iRgb, capsMode, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i5};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = 544184178 + ((~(iIdentityHashCode | 919422960)) * 216);
            int i7 = ~iIdentityHashCode;
            int i8 = ((i6 + (((-135407619) | i7) * (-216))) + (((~(i7 | 919422960)) | 785608498) * 216)) - 1142459225;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i4}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{43858, 21247, 7631, 35707, 36416, 36180, 42668, 35953, 10243, 53936, 30056, 28189, 57567, 53956, 45536, 32177, 6589, 31818}, 17 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{26455, 17224, 53589, 63605, 44801, 16130, 48008, 28039, 39197, 34085, 21592, 63149, 56705, 53976, 2682, 32451, 47404, 60591}, 16 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i11 = TuitionPaymentFragmentbindingInflater1 + 73;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, -1142459225};
                byte[] bArr4 = $$d;
                byte b6 = (byte) (-bArr4[47]);
                byte b7 = b6;
                Object[] objArr11 = new Object[1];
                d(b6, b7, b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr4[59];
                byte b9 = b8;
                Object[] objArr12 = new Object[1];
                d(b8, b9, b9, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (43042 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 3111;
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 22;
                    byte[] bArr5 = $$a;
                    byte b10 = bArr5[40];
                    byte b11 = bArr5[7];
                    Object[] objArr14 = new Object[1];
                    a(b10, b11, b11, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, maxKeyCode, iCombineMeasuredStates, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{56472, 10018, 33941, 34694, 26491, 49248, 58018, 28017, 6433, 50304, 15728, 56600, 43448, 20688, 37567, 9124, 33017, 52155, 29573, 41510, 51021, 2576, 21162, 39078}, 21 - TextUtils.lastIndexOf("", '0', 0, 0), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{52859, 41505, 38359, 56695, 56229, 46153, 27362, 27407, 191, 30050, 7830, 51797, 65045, 26613, 61901, 58099, 13065, 45473}, AndroidCharacter.getMirror('0') - '!', objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char longPressTimeout = (char) (43042 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 3111;
                        int iMakeMeasureSpec = 22 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte[] bArr6 = $$a;
                        byte b12 = bArr6[5];
                        Object[] objArr17 = new Object[1];
                        a(b12, b12, bArr6[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(longPressTimeout, iIndexOf, iMakeMeasureSpec, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 43042);
                        int defaultSize = View.getDefaultSize(0, 0) + 3111;
                        int i13 = 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte[] bArr7 = $$a;
                        byte b13 = bArr7[7];
                        Object[] objArr18 = new Object[1];
                        a(b13, bArr7[5], b13, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, defaultSize, i13, -1272852037, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[2])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArr[0])[0];
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int i19 = (int) Runtime.getRuntime().totalMemory();
            int i20 = i16 + (((~(i19 | 1160486704)) * TypedValues.CycleType.TYPE_EASING) - 1427646266) + (((~((~i19) | 1160486704)) | 2168624) * TypedValues.CycleType.TYPE_EASING);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr[0])[0] = i22 ^ (i22 << 5);
            Object[] objArr19 = {new int[1], new int[]{i18}, new int[]{i17}, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            int i23 = ((int[]) objArr[0])[0];
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i26 = (~((-434107950) | iMaxMemory)) | 163627045;
            int i27 = i23 + 2117985602 + (i26 * 992) + ((i26 | (~((~iMaxMemory) | 1541404413))) * (-496)) + ((iMaxMemory | 1270923509) * 496);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr[0])[0] = i29 ^ (i29 << 5);
            Object[] objArr20 = {new int[1], new int[]{i25}, new int[]{i24}, strArr4};
        }
        TypeAdapter<T> typeAdapter = this.delegate;
        if (typeAdapter != null) {
            int i30 = TuitionPaymentFragmentbindingInflater1 + 9;
            asInterface = i30 % 128;
            int i31 = i30 % 2;
            return typeAdapter;
        }
        TypeAdapter<T> delegateAdapter = this.gson.getDelegateAdapter(this.skipPast, this.typeToken);
        this.delegate = delegateAdapter;
        int i32 = asInterface + 111;
        TuitionPaymentFragmentbindingInflater1 = i32 % 128;
        if (i32 % 2 != 0) {
            int i33 = 36 / 0;
        }
        return delegateAdapter;
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final TypeAdapter<T> getSerializationDelegate() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 103;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.serializer == null) {
            return delegate();
        }
        int i4 = i2 + 45;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return this;
    }

    public static TypeAdapterFactory newFactory(TypeToken<?> typeToken, Object obj) {
        int i = 2 % 2;
        SingleTypeFactory singleTypeFactory = new SingleTypeFactory(obj, typeToken, false, null);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 67 / 0;
        }
        return singleTypeFactory;
    }

    public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken<?> typeToken, Object obj) {
        boolean z;
        int i = 2 % 2;
        if (typeToken.getType() == typeToken.getRawType()) {
            int i2 = asInterface + 109;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        SingleTypeFactory singleTypeFactory = new SingleTypeFactory(obj, typeToken, z, null);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 53;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return singleTypeFactory;
        }
        throw null;
    }

    public static TypeAdapterFactory newTypeHierarchyFactory(Class<?> cls, Object obj) {
        int i = 2 % 2;
        SingleTypeFactory singleTypeFactory = new SingleTypeFactory(obj, null, false, cls);
        int i2 = asInterface + 35;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return singleTypeFactory;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, int r8) {
        /*
            int r6 = r6 * 4
            int r6 = 108 - r6
            int r8 = r8 + 4
            byte[] r0 = com.google.gson.internal.bind.TreeTypeAdapter.$$c
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2a:
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TreeTypeAdapter.$$g(int, short, int):java.lang.String");
    }
}
