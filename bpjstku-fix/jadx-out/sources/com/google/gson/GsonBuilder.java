package com.google.gson;

import android.content.Context;
import android.content.ContextWrapper;
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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class GsonBuilder {
    private boolean complexMapKeySerialization;
    private String datePattern;
    private int dateStyle;
    private boolean escapeHtmlChars;
    private Excluder excluder;
    private final List<TypeAdapterFactory> factories;
    private FieldNamingStrategy fieldNamingPolicy;
    private boolean generateNonExecutableJson;
    private final List<TypeAdapterFactory> hierarchyFactories;
    private final Map<Type, InstanceCreator<?>> instanceCreators;
    private boolean lenient;
    private LongSerializationPolicy longSerializationPolicy;
    private ToNumberStrategy numberToNumberStrategy;
    private ToNumberStrategy objectToNumberStrategy;
    private boolean prettyPrinting;
    private final LinkedList<ReflectionAccessFilter> reflectionFilters;
    private boolean serializeNulls;
    private boolean serializeSpecialFloatingPointValues;
    private int timeStyle;
    private boolean useJdkUnsafe;
    private static final byte[] $$c = {94, -56, 58, -24};
    private static final int $$f = 183;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {29, -5, -24, -13, 24, 10, -51, 73, 16, 18, 10, 1, 13, 14, 5, 29, 11, 12, -7, -39, 63, 30, 18, 1, 1, -41, 31, 62, 18, 1, 1, -4, 30, 25, 16, -5, 25, -66, 25, 45, 0, 23, 1, 18, 11, -18, 29, 36, 0, 4, 21, 18, -34, 56, -5, 18, 18, 4, 21, 18, 11, 9, 1, 10, 18, 4, 23, 9, 17, 10, 9, 17, 3, 11, 30, -1, 8, 30, -30, 46, 1, 13, 19, 4, 13, 13, 7, 32, 3, 20, -54, -1, 27, 10, 9, 3, 15, 23, -54, 8, 45, 40, -23, 56, 12, 8, -33, 42, 23, 12, -60, 45, 63, -9, 14, 23, 16, 1, 18, 11, -31, 42, 31, -5, 17, 13, 17, 5, -9, 31, 26, 9, 11, 11, 17, -2, -23, 57, 1, 33, -73, 25, 45, 0, 23, 1, 18, 11, -18, 29, 36, 0, 4, 21, 18, -34, 56, -5, 18, 18, 4, 21, 18, -6, 19, 17, 2, 17, 17, 5, -18, 49, 4, 18, 1, 31, -3, 25, -53};
    private static final int $$e = 110;
    private static final byte[] $$a = {33, -59, 107, -108, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 123;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long b = 6964375139853134297L;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -981105359;
    private static char TuitionPaymentFragmentbindingInflater1 = 34097;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.gson.GsonBuilder.$$a
            int r1 = 53 - r5
            int r6 = r6 + 4
            int r7 = 103 - r7
            byte[] r1 = new byte[r1]
            int r5 = 52 - r5
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r5
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r0[r6]
        L26:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.GsonBuilder.a(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r0 = 53 - r8
            byte[] r1 = com.google.gson.GsonBuilder.$$d
            int r7 = r7 * 15
            int r7 = 114 - r7
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            int r6 = r6 + (-12)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.GsonBuilder.d(int, int, short, java.lang.Object[]):void");
    }

    public GsonBuilder() {
        this.excluder = Excluder.DEFAULT;
        this.longSerializationPolicy = LongSerializationPolicy.DEFAULT;
        this.fieldNamingPolicy = FieldNamingPolicy.IDENTITY;
        this.instanceCreators = new HashMap();
        this.factories = new ArrayList();
        this.hierarchyFactories = new ArrayList();
        this.serializeNulls = false;
        this.datePattern = Gson.DEFAULT_DATE_PATTERN;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
        this.useJdkUnsafe = true;
        this.objectToNumberStrategy = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        this.reflectionFilters = new LinkedList<>();
    }

    GsonBuilder(Gson gson) {
        this.excluder = Excluder.DEFAULT;
        this.longSerializationPolicy = LongSerializationPolicy.DEFAULT;
        this.fieldNamingPolicy = FieldNamingPolicy.IDENTITY;
        HashMap map = new HashMap();
        this.instanceCreators = map;
        ArrayList arrayList = new ArrayList();
        this.factories = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.hierarchyFactories = arrayList2;
        this.serializeNulls = false;
        this.datePattern = Gson.DEFAULT_DATE_PATTERN;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
        this.useJdkUnsafe = true;
        this.objectToNumberStrategy = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        LinkedList<ReflectionAccessFilter> linkedList = new LinkedList<>();
        this.reflectionFilters = linkedList;
        this.excluder = gson.excluder;
        this.fieldNamingPolicy = gson.fieldNamingStrategy;
        map.putAll(gson.instanceCreators);
        this.serializeNulls = gson.serializeNulls;
        this.complexMapKeySerialization = gson.complexMapKeySerialization;
        this.generateNonExecutableJson = gson.generateNonExecutableJson;
        this.escapeHtmlChars = gson.htmlSafe;
        this.prettyPrinting = gson.prettyPrinting;
        this.lenient = gson.lenient;
        this.serializeSpecialFloatingPointValues = gson.serializeSpecialFloatingPointValues;
        this.longSerializationPolicy = gson.longSerializationPolicy;
        this.datePattern = gson.datePattern;
        this.dateStyle = gson.dateStyle;
        this.timeStyle = gson.timeStyle;
        arrayList.addAll(gson.builderFactories);
        arrayList2.addAll(gson.builderHierarchyFactories);
        this.useJdkUnsafe = gson.useJdkUnsafe;
        this.objectToNumberStrategy = gson.objectToNumberStrategy;
        this.numberToNumberStrategy = gson.numberToNumberStrategy;
        linkedList.addAll(gson.reflectionFilters);
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i3 = $11 + 11;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char keyRepeatDelay = (char) (8328 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1235;
                    int mode = 35 - View.MeasureSpec.getMode(0);
                    byte b2 = (byte) ($$f & 10);
                    byte b3 = (byte) (b2 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, maximumFlingVelocity, mode, -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.red(0), 2764 - Color.blue(0), 14 - (ViewConfiguration.getLongPressTimeout() >> 16), 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43324), TextUtils.indexOf("", "") + 253, ImageFormat.getBitsPerPixel(0) + 23, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 65200);
                    int i5 = 2892 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int mirror = AndroidCharacter.getMirror('0') - 31;
                    byte b6 = (byte) ($$f & 1);
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, i5, mirror, 2012627446, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $10 + 75;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public final GsonBuilder setVersion(double d) {
        int i = 2 % 2;
        if (!Double.isNaN(d)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            if (d >= 0.0d) {
                this.excluder = this.excluder.withVersion(d);
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 82 / 0;
                }
                return this;
            }
        }
        throw new IllegalArgumentException("Invalid version: ".concat(String.valueOf(d)));
    }

    public final GsonBuilder excludeFieldsWithModifiers(int... iArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Objects.requireNonNull(iArr);
        this.excluder = this.excluder.withModifiers(iArr);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public final GsonBuilder generateNonExecutableJson() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.generateNonExecutableJson = true;
        int i5 = i3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.excluder = this.excluder.excludeFieldsWithoutExposeAnnotation();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public final GsonBuilder serializeNulls() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.serializeNulls = true;
        return this;
    }

    public final GsonBuilder enableComplexMapKeySerialization() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.complexMapKeySerialization = true;
        int i5 = i3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public final GsonBuilder disableInnerClassSerialization() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            this.excluder = this.excluder.disableInnerClassSerialization();
            int i3 = 33 / 0;
        } else {
            this.excluder = this.excluder.disableInnerClassSerialization();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public final GsonBuilder setLongSerializationPolicy(LongSerializationPolicy longSerializationPolicy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        LongSerializationPolicy longSerializationPolicy2 = (LongSerializationPolicy) Objects.requireNonNull(longSerializationPolicy);
        if (i3 == 0) {
            this.longSerializationPolicy = longSerializationPolicy2;
            return this;
        }
        this.longSerializationPolicy = longSerializationPolicy2;
        throw null;
    }

    public final GsonBuilder setFieldNamingPolicy(FieldNamingPolicy fieldNamingPolicy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return setFieldNamingStrategy(fieldNamingPolicy);
        }
        setFieldNamingStrategy(fieldNamingPolicy);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.fieldNamingPolicy = (FieldNamingStrategy) Objects.requireNonNull(fieldNamingStrategy);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public final GsonBuilder setObjectToNumberStrategy(ToNumberStrategy toNumberStrategy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.objectToNumberStrategy = (ToNumberStrategy) Objects.requireNonNull(toNumberStrategy);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public final GsonBuilder setNumberToNumberStrategy(ToNumberStrategy toNumberStrategy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ToNumberStrategy toNumberStrategy2 = (ToNumberStrategy) Objects.requireNonNull(toNumberStrategy);
        if (i3 != 0) {
            this.numberToNumberStrategy = toNumberStrategy2;
            return this;
        }
        this.numberToNumberStrategy = toNumberStrategy2;
        throw null;
    }

    public final GsonBuilder setExclusionStrategies(ExclusionStrategy... exclusionStrategyArr) {
        int i = 2 % 2;
        Objects.requireNonNull(exclusionStrategyArr);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        for (ExclusionStrategy exclusionStrategy : exclusionStrategyArr) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, true, true);
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public final GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy exclusionStrategy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Objects.requireNonNull(exclusionStrategy);
        this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, true, false);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public final GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy exclusionStrategy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Objects.requireNonNull(exclusionStrategy);
        this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, false, true);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final GsonBuilder setPrettyPrinting() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        this.prettyPrinting = true;
        int i5 = i2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0284  */
    /* JADX WARN: Code duplicated, block: B:26:0x028e  */
    /* JADX WARN: Type inference failed for: r3v132, types: [boolean, int] */
    public final GsonBuilder setLenient() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char gidForName = (char) (31532 - Process.getGidForName(""));
            int threadPriority = 921 - ((Process.getThreadPriority(0) + 20) >> 6);
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
            short s = $$a[80];
            Object[] objArr4 = new Object[1];
            a((byte) 52, s, (byte) (s & 5), objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, threadPriority, iResolveOpacity, -1048449946, false, (String) objArr4[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr5 = new Object[1];
        c(new char[]{27880, 45060, 33593, 51160}, new char[]{4815, 23021, 25541, 64948}, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.red(0), new char[]{3238, 63426, 21045, 32550, 16524, 58290, 4138, 30689, 46566, 38736, 60331, 55668, 45325, 53315, 47767, 1354, 47710, 59378, 1724, 13277, 44661, 36312}, objArr5);
        Class<?> cls = Class.forName((String) objArr5[0]);
        Object[] objArr6 = new Object[1];
        c(new char[]{27880, 45060, 33593, 51160}, new char[]{7667, 29188, 63798, 18263}, (char) (Process.getGidForName("") + 22522), 913441820 - Process.getGidForName(""), new char[]{23252, 31558, 39005, 23092, 35064, 44921, 5379, 48211, 23546, 7246, 4122, 28607, 30013, 28553, 29061}, objArr6);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr6[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mirror = (char) (31581 - AndroidCharacter.getMirror('0'));
            int mode = 921 - View.MeasureSpec.getMode(0);
            int maximumFlingVelocity = 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte[] bArr = $$a;
            Object[] objArr7 = new Object[1];
            a(bArr[7], bArr[80], bArr[10], objArr7);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror, mode, maximumFlingVelocity, -778300370, false, (String) objArr7[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 31533);
                int iMyPid = 921 - (Process.myPid() >> 22);
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
                Object[] objArr8 = new Object[1];
                a((byte) 15, (short) ($$b & 183), $$a[10], objArr8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, iMyPid, keyRepeatDelay, -1142834547, false, (String) objArr8[0], null);
            }
            Object[] objArr9 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr9[1])[0]}, (Object[]) objArr9[2], new int[]{((int[]) objArr9[3])[0]}, (String[]) objArr9[4]};
            int i4 = ~((int) SystemClock.elapsedRealtime());
            int i5 = (((2073659519 + ((~(1744717823 | i4)) * 52)) + (((~(99501759 | i4)) | ((~((-1674577885) | i4)) | 1645216064)) * (-52))) + (((~(i4 | (-99501760))) | 70139939) * 52)) - 2086022354;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr10 = new Object[1];
            c(new char[]{27880, 45060, 33593, 51160}, new char[]{10521, 16399, 51575, 7698}, (char) (TextUtils.indexOf("", "", 0) + 4809), TextUtils.indexOf((CharSequence) "", '0', 0) + 1, new char[]{40700, 16534, 50622, 53942, 46068, 44353, 15572, 62294, 33954, 35554, 60123, 44888, 53836, 37202, 62273, 46363, 41116, 39283, 2006, 45524, 45716, 51829, 23901, 11300, 51582, 8809}, objArr10);
            Class<?> cls2 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{27880, 45060, 33593, 51160}, new char[]{43284, 60708, 63163, 24320}, (char) (245 - TextUtils.indexOf((CharSequence) "", '0', 0)), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{50542, 14423, 29666, 28902, 31362, 21406, 50376, 10082, 47007, 4668, 39723, 5765, 50563, 25690, 52167, 41211, 25755, 5292}, objArr11);
            Context applicationContext = (Context) cls2.getMethod((String) objArr11[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 61 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (!(!(applicationContext instanceof ContextWrapper))) {
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            Object[] objArr12 = new Object[1];
            c(new char[]{27880, 45060, 33593, 51160}, new char[]{44134, 2914, 55622, 47104}, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 217), ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{61611, 17646, 16277, 16170, 28737, 54209, 1183, 18899, 49483, 33070, 52029, 63230, 32386, 40618, 30399, 16207}, objArr12);
            Class<?> cls3 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            c(new char[]{27880, 45060, 33593, 51160}, new char[]{56029, 59521, 37655, 21277}, (char) (7571 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Process.getGidForName("") + 1, new char[]{38396, 55507, 7932, 55985, 33905, 46879, 62171, 50096, 36704, 13817, 31802, 10681, 24734, 54792, 9880, 16518}, objArr13);
            try {
                Object[] objArr14 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr13[0], Object.class).invoke(null, this)).intValue()), 0, -2086022354};
                byte[] bArr2 = $$d;
                Object[] objArr15 = new Object[1];
                d(bArr2[75], bArr2[11], bArr2[68], objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                Object[] objArr16 = new Object[1];
                d((short) (-bArr2[52]), bArr2[166], bArr2[40], objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31532);
                    int iRgb = Color.rgb(0, 0, 0) + 16778137;
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 28;
                    Object[] objArr17 = new Object[1];
                    a((byte) 15, (short) ($$b & 183), $$a[10], objArr17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iRgb, iResolveSizeAndState, -1142834547, false, (String) objArr17[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr18 = new Object[1];
                    c(new char[]{27880, 45060, 33593, 51160}, new char[]{4815, 23021, 25541, 64948}, (char) (Process.myTid() >> 22), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{3238, 63426, 21045, 32550, 16524, 58290, 4138, 30689, 46566, 38736, 60331, 55668, 45325, 53315, 47767, 1354, 47710, 59378, 1724, 13277, 44661, 36312}, objArr18);
                    Class<?> cls5 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    c(new char[]{27880, 45060, 33593, 51160}, new char[]{7667, 29188, 63798, 18263}, (char) (22521 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), ImageFormat.getBitsPerPixel(0) + 913441822, new char[]{23252, 31558, 39005, 23092, 35064, 44921, 5379, 48211, 23546, 7246, 4122, 28607, 30013, 28553, 29061}, objArr19);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31533);
                        int defaultSize = 921 - View.getDefaultSize(0, 0);
                        int maximumDrawingCacheSize2 = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte[] bArr3 = $$a;
                        Object[] objArr20 = new Object[1];
                        a(bArr3[7], bArr3[80], bArr3[10], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumDrawingCacheSize, defaultSize, maximumDrawingCacheSize2, -778300370, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 31533);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 921;
                        int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 28;
                        short s2 = $$a[80];
                        Object[] objArr21 = new Object[1];
                        a((byte) 52, s2, (byte) (s2 & 5), objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(absoluteGravity, doubleTapTimeout, iResolveSizeAndState2, -1048449946, false, (String) objArr21[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                    int i11 = i10 % 2;
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
        int i13 = i12 % 2;
        int i14 = ((int[]) objArr[0])[0];
        Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i15 = ~iIdentityHashCode;
        int i16 = i14 + ((((~((-1129870759) | i15)) | (~(iIdentityHashCode | 644208885))) * 959) - 119187637) + (((~(iIdentityHashCode | (-1129870759))) | (~(i15 | 644208885))) * 959);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr22[0])[0] = i18 ^ (i18 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int iGreen = Color.green(0) + 876;
            int gidForName2 = Process.getGidForName("") + 11;
            short s3 = $$a[80];
            Object[] objArr23 = new Object[1];
            a((byte) 52, s3, (byte) (s3 & 5), objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(threadPriority2, iGreen, gidForName2, 252381699, false, (String) objArr23[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr24 = new Object[1];
        c(new char[]{27880, 45060, 33593, 51160}, new char[]{4815, 23021, 25541, 64948}, (char) Color.alpha(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{3238, 63426, 21045, 32550, 16524, 58290, 4138, 30689, 46566, 38736, 60331, 55668, 45325, 53315, 47767, 1354, 47710, 59378, 1724, 13277, 44661, 36312}, objArr24);
        Class<?> cls6 = Class.forName((String) objArr24[0]);
        Object[] objArr25 = new Object[1];
        c(new char[]{27880, 45060, 33593, 51160}, new char[]{7667, 29188, 63798, 18263}, (char) (22522 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 913441821 - TextUtils.indexOf("", "", 0, 0), new char[]{23252, 31558, 39005, 23092, 35064, 44921, 5379, 48211, 23546, 7246, 4122, 28607, 30013, 28553, 29061}, objArr25);
        long jLongValue3 = ((Long) cls6.getDeclaredMethod((String) objArr25[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cGreen = (char) Color.green(0);
            int i19 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 10;
            byte[] bArr4 = $$a;
            byte b2 = bArr4[7];
            Object[] objArr26 = new Object[1];
            a(b2, (short) (b2 | 88), bArr4[10], objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cGreen, i19, maxKeyCode, 2009631821, false, (String) objArr26[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                int i20 = 876 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
                Object[] objArr27 = new Object[1];
                a((byte) 52, (short) 140, $$a[7], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionType, i20, longPressTimeout, 256017550, false, (String) objArr27[0], null);
            }
            Object[] objArr28 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr28[0])[0]}, new int[1], new int[]{((int[]) objArr28[2])[0]}, (String[]) objArr28[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i21 = ((((~((~iIdentityHashCode2) | 666893949)) * 130) - 513495744) + (((~(iIdentityHashCode2 | 666893949)) | 605077576) * 130)) - 875240065;
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr2[1])[0] = i23 ^ (i23 << 5);
        } else {
            Object[] objArr29 = new Object[1];
            c(new char[]{27880, 45060, 33593, 51160}, new char[]{10521, 16399, 51575, 7698}, (char) (Color.green(0) + 4809), ViewConfiguration.getMaximumFlingVelocity() >> 16, new char[]{40700, 16534, 50622, 53942, 46068, 44353, 15572, 62294, 33954, 35554, 60123, 44888, 53836, 37202, 62273, 46363, 41116, 39283, 2006, 45524, 45716, 51829, 23901, 11300, 51582, 8809}, objArr29);
            Class<?> cls7 = Class.forName((String) objArr29[0]);
            Object[] objArr30 = new Object[1];
            c(new char[]{27880, 45060, 33593, 51160}, new char[]{43284, 60708, 63163, 24320}, (char) (246 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), KeyEvent.keyCodeFromString(""), new char[]{50542, 14423, 29666, 28902, 31362, 21406, 50376, 10082, 47007, 4668, 39723, 5765, 50563, 25690, 52167, 41211, 25755, 5292}, objArr30);
            Context applicationContext2 = (Context) cls7.getMethod((String) objArr30[0], new Class[0]).invoke(null, null);
            if (applicationContext2 != null) {
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : applicationContext2.getApplicationContext();
            }
            Object[] objArr31 = new Object[1];
            c(new char[]{27880, 45060, 33593, 51160}, new char[]{44134, 2914, 55622, 47104}, (char) (Process.getGidForName("") + 218), Gravity.getAbsoluteGravity(0, 0), new char[]{61611, 17646, 16277, 16170, 28737, 54209, 1183, 18899, 49483, 33070, 52029, 63230, 32386, 40618, 30399, 16207}, objArr31);
            Class<?> cls8 = Class.forName((String) objArr31[0]);
            Object[] objArr32 = new Object[1];
            c(new char[]{27880, 45060, 33593, 51160}, new char[]{56029, 59521, 37655, 21277}, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7570), TextUtils.getOffsetAfter("", 0), new char[]{38396, 55507, 7932, 55985, 33905, 46879, 62171, 50096, 36704, 13817, 31802, 10681, 24734, 54792, 9880, 16518}, objArr32);
            Object[] objArr33 = {applicationContext2, Integer.valueOf(((Integer) cls8.getMethod((String) objArr32[0], Object.class).invoke(null, this)).intValue()), -875240065};
            byte[] bArr5 = $$d;
            Object[] objArr34 = new Object[1];
            d((short) 86, bArr5[40], bArr5[11], objArr34);
            Class<?> cls9 = Class.forName((String) objArr34[0]);
            Object[] objArr35 = new Object[1];
            d((short) 137, bArr5[166], bArr5[96], objArr35);
            objArr2 = (Object[]) cls9.getMethod((String) objArr35[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr33);
            if (applicationContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 877;
                    int i24 = 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    Object[] objArr36 = new Object[1];
                    a((byte) 52, (short) 140, $$a[7], objArr36);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c2, bitsPerPixel, i24, 256017550, false, (String) objArr36[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr2);
                try {
                    Object[] objArr37 = new Object[1];
                    c(new char[]{27880, 45060, 33593, 51160}, new char[]{4815, 23021, 25541, 64948}, (char) TextUtils.indexOf("", "", 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, new char[]{3238, 63426, 21045, 32550, 16524, 58290, 4138, 30689, 46566, 38736, 60331, 55668, 45325, 53315, 47767, 1354, 47710, 59378, 1724, 13277, 44661, 36312}, objArr37);
                    Class<?> cls10 = Class.forName((String) objArr37[0]);
                    Object[] objArr38 = new Object[1];
                    c(new char[]{27880, 45060, 33593, 51160}, new char[]{7667, 29188, 63798, 18263}, (char) (View.resolveSize(0, 0) + 22521), 913441821 - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{23252, 31558, 39005, 23092, 35064, 44921, 5379, 48211, 23546, 7246, 4122, 28607, 30013, 28553, 29061}, objArr38);
                    long jLongValue4 = ((Long) cls10.getDeclaredMethod((String) objArr38[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char cGreen2 = (char) Color.green(0);
                        int i25 = 877 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int mode2 = 10 - View.MeasureSpec.getMode(0);
                        byte[] bArr6 = $$a;
                        byte b3 = bArr6[7];
                        Object[] objArr39 = new Object[1];
                        a(b3, (short) (b3 | 88), bArr6[10], objArr39);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cGreen2, i25, mode2, 2009631821, false, (String) objArr39[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                        char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int packedPositionChild = 875 - ExpandableListView.getPackedPositionChild(0L);
                        int i26 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11;
                        short s4 = $$a[80];
                        Object[] objArr40 = new Object[1];
                        a((byte) 52, s4, (byte) (s4 & 5), objArr40);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(maxKeyCode2, packedPositionChild, i26, 252381699, false, (String) objArr40[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf4);
                    int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i27 % 128;
                    int i28 = i27 % 2;
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            }
        }
        int i29 = ((int[]) objArr2[2])[0];
        int i30 = ((int[]) objArr2[0])[0];
        if (i30 == i29) {
            int i31 = ((int[]) objArr2[1])[0];
            objArr3 = new Object[]{new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int iMyPid2 = Process.myPid();
            int i32 = i31 + (-511204044) + ((~((-13172870) | iMyPid2)) * (-301)) + (((~(415965349 | iMyPid2)) | (~((~iMyPid2) | 456275578))) * (-301)) + (((~(iMyPid2 | (-456275579))) | 415965349) * 301);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr3[1])[0] = i34 ^ (i34 << 5);
        } else {
            Toast.makeText((Context) null, i30 / (((i30 - 1) * i30) % 2), 0).show();
            int i35 = ((int[]) objArr2[1])[0];
            objArr3 = new Object[]{new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i36 = i35 + (-208210156) + (((~((-288101340) | iIdentityHashCode3)) | 287834585) * 1504) + ((~(iIdentityHashCode3 | (-266755))) * (-1504)) + 1137001440;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr3[1])[0] = i38 ^ (i38 << 5);
        }
        int i39 = ((int[]) objArr22[0])[0];
        int i40 = i39 * i39;
        int i41 = -(1608287157 * i39);
        int i42 = (((i40 ^ i41) + ((i40 & i41) << 1)) - (~(-(i39 * 1126360647)))) - 805688317;
        int i43 = i42 >> 26;
        int i44 = (((i43 | ComposerKt.defaultsKey) << 1) - (i43 ^ ComposerKt.defaultsKey)) / 64;
        int i45 = (i44 ^ 1) + ((i44 & 1) << 1);
        int i46 = ((i42 | i45) << 1) - (i45 ^ i42);
        int i47 = i42 >> 22;
        int i48 = (((i47 | (-2047)) << 1) - (i47 ^ (-2047))) / 1024;
        int i49 = -((((i48 | 1) << 1) - (i48 ^ 1)) ^ i46);
        int i50 = (i49 ^ 1) + ((i49 & 1) << 1);
        int i51 = ((i50 >> 29) - 15) / 8;
        int i52 = 18348 / (((-(((i51 ^ 1) + ((i51 & 1) << 1)) + 1)) & i50) * 1668);
        int i53 = ((int[]) objArr3[1])[0];
        int i54 = i53 * i53;
        int i55 = -(243866621 * i53);
        int i56 = (i54 & i55) + (i54 | i55);
        int i57 = -(i53 * (-639799547));
        int i58 = (((i56 | i57) << 1) - (i57 ^ i56)) - 1404777727;
        int i59 = i58 >> 26;
        int i60 = ((i59 & ComposerKt.defaultsKey) + (i59 | ComposerKt.defaultsKey)) / 64;
        int i61 = (i60 & 1) + (i60 | 1);
        int i62 = (i58 ^ i61) + ((i61 & i58) << 1);
        int i63 = i58 >> 15;
        int i64 = (((-262143) & i63) + (i63 | (-262143))) / 131072;
        int i65 = (-((((i64 | 1) << 1) - (i64 ^ 1)) ^ i62)) + 9;
        int i66 = i65 >> 18;
        int i67 = ((i66 & (-32767)) + (i66 | (-32767))) / 16384;
        int i68 = ((i67 | 1) << 1) - (i67 ^ 1);
        this.lenient = i52 + ((-148770) / ((i65 & (-(((i68 | 1) << 1) - (i68 ^ 1)))) * 1653));
        return this;
    }

    public final GsonBuilder disableHtmlEscaping() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        this.escapeHtmlChars = false;
        int i5 = i3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public final GsonBuilder setDateFormat(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        this.datePattern = str;
        int i5 = i2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final GsonBuilder setDateFormat(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = i3 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        this.dateStyle = i;
        this.datePattern = null;
        int i6 = i3 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public final GsonBuilder setDateFormat(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        int i5 = i4 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5;
        if (i4 % 2 != 0) {
            this.dateStyle = i;
            this.timeStyle = i2;
            this.datePattern = null;
            int i6 = 36 / 0;
        } else {
            this.dateStyle = i;
            this.timeStyle = i2;
            this.datePattern = null;
        }
        int i7 = i5 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        int i8 = i7 % 2;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    public final GsonBuilder registerTypeAdapter(Type type, Object obj) {
        boolean z;
        int i = 2 % 2;
        Objects.requireNonNull(type);
        boolean z2 = obj instanceof JsonSerializer;
        Object obj2 = null;
        if (z2 || (obj instanceof JsonDeserializer) || (obj instanceof InstanceCreator)) {
            z = true;
        } else {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z3 = obj instanceof TypeAdapter;
                obj2.hashCode();
                throw null;
            }
            if (obj instanceof TypeAdapter) {
                z = true;
            } else {
                z = false;
            }
        }
        C$Gson$Preconditions.checkArgument(z);
        if (obj instanceof InstanceCreator) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            this.instanceCreators.put(type, (InstanceCreator) obj);
        }
        if (z2 || (obj instanceof JsonDeserializer)) {
            this.factories.add(TreeTypeAdapter.newFactoryWithMatchRawType(TypeToken.get(type), obj));
        }
        if (obj instanceof TypeAdapter) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 == 0) {
                this.factories.add(TypeAdapters.newFactory(TypeToken.get(type), (TypeAdapter) obj));
                throw null;
            }
            this.factories.add(TypeAdapters.newFactory(TypeToken.get(type), (TypeAdapter) obj));
        }
        return this;
    }

    public final GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory typeAdapterFactory) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            Objects.requireNonNull(typeAdapterFactory);
            this.factories.add(typeAdapterFactory);
            return this;
        }
        Objects.requireNonNull(typeAdapterFactory);
        this.factories.add(typeAdapterFactory);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    public final GsonBuilder registerTypeHierarchyAdapter(Class<?> cls, Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Objects.requireNonNull(cls);
            boolean z2 = obj instanceof JsonSerializer;
            throw null;
        }
        Objects.requireNonNull(cls);
        boolean z3 = obj instanceof JsonSerializer;
        if (z3 || !(!(obj instanceof JsonDeserializer)) || (obj instanceof TypeAdapter)) {
            z = true;
        } else {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
            int i4 = i3 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        C$Gson$Preconditions.checkArgument(z);
        if (!(obj instanceof JsonDeserializer)) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            int i9 = i8 % 2;
            if (z3) {
                this.hierarchyFactories.add(TreeTypeAdapter.newTypeHierarchyFactory(cls, obj));
            }
        } else {
            this.hierarchyFactories.add(TreeTypeAdapter.newTypeHierarchyFactory(cls, obj));
        }
        if (!(!(obj instanceof TypeAdapter))) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            if (i10 % 2 != 0) {
                this.factories.add(TypeAdapters.newTypeHierarchyFactory(cls, (TypeAdapter) obj));
                throw null;
            }
            this.factories.add(TypeAdapters.newTypeHierarchyFactory(cls, (TypeAdapter) obj));
        }
        return this;
    }

    public final GsonBuilder serializeSpecialFloatingPointValues() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.serializeSpecialFloatingPointValues = true;
        int i5 = i2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public final GsonBuilder disableJdkUnsafe() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            this.useJdkUnsafe = true;
        } else {
            this.useJdkUnsafe = false;
        }
        int i4 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return this;
    }

    public final GsonBuilder addReflectionAccessFilter(ReflectionAccessFilter reflectionAccessFilter) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Objects.requireNonNull(reflectionAccessFilter);
            this.reflectionFilters.addFirst(reflectionAccessFilter);
            return this;
        }
        Objects.requireNonNull(reflectionAccessFilter);
        this.reflectionFilters.addFirst(reflectionAccessFilter);
        throw null;
    }

    public final Gson create() {
        int i = 2 % 2;
        List<TypeAdapterFactory> arrayList = new ArrayList<>(this.factories.size() + this.hierarchyFactories.size() + 3);
        arrayList.addAll(this.factories);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.hierarchyFactories);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, arrayList);
        Gson gson = new Gson(this.excluder, this.fieldNamingPolicy, new HashMap(this.instanceCreators), this.serializeNulls, this.complexMapKeySerialization, this.generateNonExecutableJson, this.escapeHtmlChars, this.prettyPrinting, this.lenient, this.serializeSpecialFloatingPointValues, this.useJdkUnsafe, this.longSerializationPolicy, this.datePattern, this.dateStyle, this.timeStyle, new ArrayList(this.factories), new ArrayList(this.hierarchyFactories), arrayList, this.objectToNumberStrategy, this.numberToNumberStrategy, new ArrayList(this.reflectionFilters));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return gson;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void addTypeAdaptersForDate(String str, int i, int i2, List<TypeAdapterFactory> list) {
        TypeAdapterFactory typeAdapterFactoryCreateAdapterFactory;
        TypeAdapterFactory typeAdapterFactoryCreateAdapterFactory2;
        TypeAdapterFactory typeAdapterFactoryCreateAdapterFactory3;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            boolean z = SqlTypesSupport.SUPPORTS_SQL_TYPES;
            obj.hashCode();
            throw null;
        }
        boolean z2 = SqlTypesSupport.SUPPORTS_SQL_TYPES;
        if (str != null && !str.trim().isEmpty()) {
            typeAdapterFactoryCreateAdapterFactory = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(str);
            if (z2) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                typeAdapterFactoryCreateAdapterFactory2 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(str);
                typeAdapterFactoryCreateAdapterFactory3 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(str);
            } else {
                typeAdapterFactoryCreateAdapterFactory3 = null;
                typeAdapterFactoryCreateAdapterFactory2 = null;
            }
        } else {
            if (i == 2 || i2 == 2) {
                return;
            }
            TypeAdapterFactory typeAdapterFactoryCreateAdapterFactory4 = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(i, i2);
            if (z2) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                int i8 = i7 % 2;
                TypeAdapterFactory typeAdapterFactoryCreateAdapterFactory5 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(i, i2);
                TypeAdapterFactory typeAdapterFactoryCreateAdapterFactory6 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(i, i2);
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                int i10 = i9 % 2;
                typeAdapterFactoryCreateAdapterFactory2 = typeAdapterFactoryCreateAdapterFactory5;
                typeAdapterFactoryCreateAdapterFactory = typeAdapterFactoryCreateAdapterFactory4;
                typeAdapterFactoryCreateAdapterFactory3 = typeAdapterFactoryCreateAdapterFactory6;
            } else {
                typeAdapterFactoryCreateAdapterFactory = typeAdapterFactoryCreateAdapterFactory4;
                typeAdapterFactoryCreateAdapterFactory3 = null;
                typeAdapterFactoryCreateAdapterFactory2 = null;
            }
        }
        list.add(typeAdapterFactoryCreateAdapterFactory);
        if (z2) {
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
            if (i11 % 2 != 0) {
                list.add(typeAdapterFactoryCreateAdapterFactory2);
                list.add(typeAdapterFactoryCreateAdapterFactory3);
            } else {
                list.add(typeAdapterFactoryCreateAdapterFactory2);
                list.add(typeAdapterFactoryCreateAdapterFactory3);
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, int r8) {
        /*
            int r6 = 104 - r6
            byte[] r0 = com.google.gson.GsonBuilder.$$c
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.GsonBuilder.$$g(byte, short, int):java.lang.String");
    }
}
