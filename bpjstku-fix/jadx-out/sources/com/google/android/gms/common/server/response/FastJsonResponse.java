package com.google.android.gms.common.server.response;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class FastJsonResponse {

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static int b;
        protected final int zaa;
        protected final boolean zab;
        protected final int zac;
        protected final boolean zad;
        protected final String zae;
        protected final int zaf;
        protected final Class zag;
        protected final String zah;
        private final int zai;
        private zan zaj;
        private final FieldConverter zak;
        private static final byte[] $$c = {65, -122, -65, 2};
        private static final int $$f = 96;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {68, 83, 49, -116, 14, 31, -35, 50, 33, 5, 22, 15, -28, 47, 33, -26, 49, 11, 17, -6, 39, 16, 29, 2, 31, -64, 64, 49, 4, 27, 5, 22, 15, -14, 33, 40, 4, 8, 25, 22, -30, 60, -1, 22, 22, 8, 25, 22, 15, 13, 5, 14, 22, 8, 27, 13, 21, 14, 13, 21, 7, 15, 34, 3, 12, 34, -26, 50, 5, 17, 23, 8, 17, 17, 11, 36, 7, 24, -49, 49, 4, 27, 5, 22, 15, -14, 33, 40, 4, 8, 25, 22, -30, 60, -1, 22, 22, 8, 25, 22, -2, 23, 21, 6, 21, 21, 9, -14, 53, 8, 22, 5, 35, 1, 29, -49};
        private static final int $$e = 157;
        private static final byte[] $$a = {86, -48, ByteCompanionObject.MIN_VALUE, 88, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
        private static final int $$b = 158;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

        /* JADX WARN: Code duplicated, block: B:11:0x0043  */
        /* JADX WARN: Code duplicated, block: B:13:0x0046  */
        /* JADX WARN: Code duplicated, block: B:15:0x0049  */
        /* JADX WARN: Code duplicated, block: B:9:0x0038  */
        Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, com.google.android.gms.common.server.converter.zaa zaaVar) {
            int i5;
            this.zai = i;
            this.zaa = i2;
            this.zab = z;
            this.zac = i3;
            this.zad = z2;
            this.zae = str;
            this.zaf = i4;
            if (str2 != null) {
                this.zag = SafeParcelResponse.class;
                this.zah = str2;
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
                TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                if (i6 % 2 == 0) {
                }
                if (zaaVar == null) {
                    this.zak = zaaVar.zab();
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
                    TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                    int i8 = i7 % 2;
                    return;
                }
                i5 = TuitionPaymentFragmentbindingInflater1 + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                if (i5 % 2 != 0) {
                    this.zak = null;
                } else {
                    this.zak = null;
                    throw null;
                }
            }
            this.zag = null;
            this.zah = null;
            int i9 = TuitionPaymentFragmentbindingInflater1 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            if (zaaVar == null) {
                this.zak = zaaVar.zab();
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
                TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                int i13 = i12 % 2;
                return;
            }
            i5 = TuitionPaymentFragmentbindingInflater1 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                this.zak = null;
            } else {
                this.zak = null;
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.$$a
                int r7 = r7 + 4
                int r8 = 11 - r8
                int r6 = r6 * 3
                int r6 = 100 - r6
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r7
                r4 = r2
                goto L2a
            L12:
                r3 = r2
            L13:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L22:
                int r7 = r7 + 1
                r4 = r0[r7]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L2a:
                int r6 = r6 + r7
                int r6 = r6 + (-5)
                r7 = r3
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastJsonResponse.Field.a(short, byte, short, java.lang.Object[]):void");
        }

        private static void d(short s, int i, byte b2, Object[] objArr) {
            byte[] bArr = $$d;
            int i2 = i * 38;
            int i3 = 103 - (s * 19);
            int i4 = (b2 * 75) + 4;
            byte[] bArr2 = new byte[i2 + 38];
            int i5 = i2 + 37;
            int i6 = -1;
            if (bArr == null) {
                i4++;
                i3 = (i3 + i5) - 16;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i3;
                if (i6 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    int i7 = bArr[i4];
                    i4++;
                    i3 = (i3 + i7) - 16;
                }
            }
        }

        public static Field<byte[], byte[]> forBase64(String str, int i) {
            int i2 = 2 % 2;
            Field<byte[], byte[]> field = new Field<>(8, false, 8, false, str, i, null, null);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            return field;
        }

        public static Field<Boolean, Boolean> forBoolean(String str, int i) {
            int i2 = 2 % 2;
            Field<Boolean, Boolean> field = new Field<>(6, false, 6, false, str, i, null, null);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 60 / 0;
            }
            return field;
        }

        public static <T extends FastJsonResponse> Field<T, T> forConcreteType(String str, int i, Class<T> cls) {
            int i2 = 2 % 2;
            Field<T, T> field = new Field<>(11, false, 11, false, str, i, cls, null);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 21 / 0;
            }
            return field;
        }

        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(String str, int i, Class<T> cls) {
            int i2 = 2 % 2;
            Field<ArrayList<T>, ArrayList<T>> field = new Field<>(11, true, 11, true, str, i, cls, null);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 != 0) {
                return field;
            }
            throw null;
        }

        public static Field<Double, Double> forDouble(String str, int i) {
            int i2 = 2 % 2;
            Field<Double, Double> field = new Field<>(4, false, 4, false, str, i, null, null);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 34 / 0;
            }
            return field;
        }

        public static Field<Float, Float> forFloat(String str, int i) {
            int i2 = 2 % 2;
            Field<Float, Float> field = new Field<>(3, false, 3, false, str, i, null, null);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            return field;
        }

        public static Field<Integer, Integer> forInteger(String str, int i) {
            int i2 = 2 % 2;
            Field<Integer, Integer> field = new Field<>(0, false, 0, false, str, i, null, null);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 == 0) {
                return field;
            }
            throw null;
        }

        public static Field<Long, Long> forLong(String str, int i) {
            int i2 = 2 % 2;
            Field<Long, Long> field = new Field<>(2, false, 2, false, str, i, null, null);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 != 0) {
                return field;
            }
            throw null;
        }

        public static Field<String, String> forString(String str, int i) {
            int i2 = 2 % 2;
            Field<String, String> field = new Field<>(7, false, 7, false, str, i, null, null);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            return field;
        }

        public static Field<HashMap<String, String>, HashMap<String, String>> forStringMap(String str, int i) {
            int i2 = 2 % 2;
            Field<HashMap<String, String>, HashMap<String, String>> field = new Field<>(10, false, 10, false, str, i, null, null);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 84 / 0;
            }
            return field;
        }

        public static Field<ArrayList<String>, ArrayList<String>> forStrings(String str, int i) {
            int i2 = 2 % 2;
            Field<ArrayList<String>, ArrayList<String>> field = new Field<>(7, true, 7, true, str, i, null, null);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            return field;
        }

        final com.google.android.gms.common.server.converter.zaa zaa() {
            int i = 2 % 2;
            FieldConverter fieldConverter = this.zak;
            if (fieldConverter != null) {
                com.google.android.gms.common.server.converter.zaa zaaVarZaa = com.google.android.gms.common.server.converter.zaa.zaa(fieldConverter);
                int i2 = TuitionPaymentFragmentbindingInflater1 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 85 / 0;
                }
                return zaaVarZaa;
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        public final Field zab() {
            int i = 2 % 2;
            Field field = new Field(this.zai, this.zaa, this.zab, this.zac, this.zad, this.zae, this.zaf, this.zah, zaa());
            int i2 = TuitionPaymentFragmentbindingInflater1 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                return field;
            }
            throw null;
        }

        public static Field withConverter(String str, int i, FieldConverter<?, ?> fieldConverter, boolean z) {
            int i2 = 2 % 2;
            fieldConverter.zaa();
            fieldConverter.zab();
            Field field = new Field(7, z, 0, false, str, i, null, fieldConverter);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            return field;
        }

        public final Object zae(Object obj) {
            Object objCheckNotNull;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                Preconditions.checkNotNull(this.zak);
                objCheckNotNull = Preconditions.checkNotNull(this.zak.zac(obj));
                int i3 = 76 / 0;
            } else {
                Preconditions.checkNotNull(this.zak);
                objCheckNotNull = Preconditions.checkNotNull(this.zak.zac(obj));
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 == 0) {
                return objCheckNotNull;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object zaf(Object obj) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Preconditions.checkNotNull(this.zak);
            Object objZad = this.zak.zad(obj);
            int i4 = TuitionPaymentFragmentbindingInflater1 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 != 0) {
                return objZad;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        protected Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls, FieldConverter fieldConverter) {
            this.zai = 1;
            this.zaa = i;
            this.zab = z;
            this.zac = i2;
            this.zad = z2;
            this.zae = str;
            this.zaf = i3;
            this.zag = cls;
            if (cls == null) {
                this.zah = null;
                int i4 = TuitionPaymentFragmentbindingInflater1 + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } else {
                this.zah = cls.getCanonicalName();
            }
            this.zak = fieldConverter;
            int i7 = TuitionPaymentFragmentbindingInflater1 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }

        public final Map zah() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 == 0) {
                Preconditions.checkNotNull(this.zah);
                Preconditions.checkNotNull(this.zaj);
                return (Map) Preconditions.checkNotNull(this.zaj.zab(this.zah));
            }
            Preconditions.checkNotNull(this.zah);
            Preconditions.checkNotNull(this.zaj);
            throw null;
        }

        public final FastJsonResponse zad() throws IllegalAccessException, InstantiationException {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                Preconditions.checkNotNull(this.zag);
                throw null;
            }
            Preconditions.checkNotNull(this.zag);
            Class cls = this.zag;
            if (cls != SafeParcelResponse.class) {
                return (FastJsonResponse) cls.newInstance();
            }
            Preconditions.checkNotNull(this.zah);
            Preconditions.checkNotNull(this.zaj, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            SafeParcelResponse safeParcelResponse = new SafeParcelResponse(this.zaj, this.zah);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            return safeParcelResponse;
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("versionCode", Integer.valueOf(this.zai)).add("typeIn", Integer.valueOf(this.zaa)).add("typeInArray", Boolean.valueOf(this.zab)).add("typeOut", Integer.valueOf(this.zac)).add("typeOutArray", Boolean.valueOf(this.zad)).add("outputFieldName", this.zae).add("safeParcelFieldId", Integer.valueOf(this.zaf)).add("concreteTypeName", zag());
            Class cls = this.zag;
            if (cls != null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
                toStringHelperAdd.add("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter fieldConverter = this.zak;
            if (fieldConverter != null) {
                int i6 = TuitionPaymentFragmentbindingInflater1 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                if (i6 % 2 == 0) {
                    toStringHelperAdd.add("converterName", fieldConverter.getClass().getCanonicalName());
                    throw null;
                }
                toStringHelperAdd.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return toStringHelperAdd.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.zai;
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, i5);
            SafeParcelWriter.writeInt(parcel, 2, this.zaa);
            SafeParcelWriter.writeBoolean(parcel, 3, this.zab);
            SafeParcelWriter.writeInt(parcel, 4, this.zac);
            SafeParcelWriter.writeBoolean(parcel, 5, this.zad);
            SafeParcelWriter.writeString(parcel, 6, this.zae, false);
            SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            SafeParcelWriter.writeString(parcel, 8, zag(), false);
            SafeParcelWriter.writeParcelable(parcel, 9, zaa(), i, false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
        }

        private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i4 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr3 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 3291, 31 - View.resolveSize(0, 0), 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.resolveSize(0, 0), ExpandableListView.getPackedPositionChild(0L) + 652, 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -450685997, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (i3 > 0) {
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr4 = new char[i2];
                System.arraycopy(cArr3, 0, cArr4, 0, i2);
                System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            }
            if (z) {
                int i6 = $11 + 113;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr2 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                } else {
                    cArr2 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                }
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.resolveSize(0, 0), (Process.myTid() >> 22) + 651, 44 - TextUtils.indexOf("", "", 0), -450685997, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i7 = $11 + 59;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                }
                cArr3 = cArr2;
            }
            objArr[0] = new String(cArr3);
            int i9 = $11 + 29;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
        }

        public final void zai(zan zanVar) throws Throwable {
            int i;
            Object[] objArr;
            int i2 = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int i3 = 876 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int maximumDrawingCacheSize = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte b2 = $$a[11];
                byte b3 = (byte) (b2 + 1);
                Object[] objArr2 = new Object[1];
                a(b3, (byte) (-b3), b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, i3, maximumDrawingCacheSize, -1199417970, false, (String) objArr2[0], null);
            }
            long j = ((java.lang.reflect.Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(true, 252 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 23, 21 - TextUtils.indexOf("", "", 0), new char[]{0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b'}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(true, 256 - (ViewConfiguration.getTapTimeout() >> 16), 14 - TextUtils.indexOf((CharSequence) "", '0'), ExpandableListView.getPackedPositionGroup(0L) + 9, new char[]{65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                int iResolveSize = 10 - View.resolveSize(0, 0);
                byte[] bArr = $$a;
                byte b4 = bArr[11];
                Object[] objArr5 = new Object[1];
                a(b4, (byte) (b4 | 9), bArr[17], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, keyRepeatTimeout, iResolveSize, 254769921, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((java.lang.reflect.Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
                    int size = 10 - View.MeasureSpec.getSize(0);
                    byte b5 = (byte) ($$a[11] + 1);
                    Object[] objArr6 = new Object[1];
                    a(b5, (byte) (b5 | 8), (byte) 3, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, maximumFlingVelocity, size, 1324201839, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((java.lang.reflect.Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i4 = ~iIdentityHashCode;
                int i5 = (((628903370 + ((~(140274510 | i4)) * 979)) + ((iIdentityHashCode | 180584739) * (-979))) + (((~(iIdentityHashCode | 140274510)) | (~(i4 | 180584739))) * 979)) - 980424398;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(true, 251 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 11 - Color.alpha(0), new char[]{65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(true, TextUtils.indexOf((CharSequence) "", '0') + 256, View.MeasureSpec.getSize(0) + 16, 6 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3}, objArr9);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr10 = {Integer.valueOf(iIntValue), -980424398};
                    byte[] bArr2 = $$d;
                    byte b6 = bArr2[113];
                    byte b7 = (byte) (b6 - 1);
                    byte b8 = b6;
                    Object[] objArr11 = new Object[1];
                    d(b7, b8, (byte) (b8 - 1), objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    byte b9 = bArr2[113];
                    byte b10 = b9;
                    Object[] objArr12 = new Object[1];
                    d(b10, (byte) (b10 - 1), b9, objArr12);
                    Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int pressedStateDuration = 876 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        i = 22;
                        int iMyTid = (Process.myTid() >> 22) + 10;
                        byte b11 = (byte) ($$a[11] + 1);
                        Object[] objArr14 = new Object[1];
                        a(b11, (byte) (b11 | 8), (byte) 3, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, pressedStateDuration, iMyTid, 1324201839, false, (String) objArr14[0], null);
                    } else {
                        i = 22;
                    }
                    ((java.lang.reflect.Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        char[] cArr = new char[i];
                        // fill-array-data instruction
                        cArr[0] = 0;
                        cArr[1] = '\f';
                        cArr[2] = '\t';
                        cArr[3] = 65504;
                        cArr[4] = '\n';
                        cArr[5] = 2;
                        cArr[6] = 17;
                        cArr[7] = 16;
                        cArr[8] = 22;
                        cArr[9] = 65520;
                        cArr[10] = 65483;
                        cArr[11] = 16;
                        cArr[12] = '\f';
                        cArr[13] = 65483;
                        cArr[14] = 1;
                        cArr[15] = 6;
                        cArr[16] = '\f';
                        cArr[17] = 15;
                        cArr[18] = 1;
                        cArr[19] = 11;
                        cArr[20] = 65534;
                        cArr[21] = '\b';
                        Object[] objArr15 = new Object[1];
                        c(true, (ViewConfiguration.getWindowTouchSlop() >> 8) + 252, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22, 21 - Color.red(0), cArr, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        c(true, TextUtils.indexOf((CharSequence) "", '0') + 257, KeyEvent.keyCodeFromString("") + 15, 9 - Color.red(0), new char[]{65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530}, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                            int absoluteGravity = 876 - Gravity.getAbsoluteGravity(0, 0);
                            int trimmedLength = TextUtils.getTrimmedLength("") + 10;
                            byte[] bArr3 = $$a;
                            byte b12 = bArr3[11];
                            Object[] objArr17 = new Object[1];
                            a(b12, (byte) (b12 | 9), bArr3[17], objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, absoluteGravity, trimmedLength, 254769921, false, (String) objArr17[0], null);
                        }
                        ((java.lang.reflect.Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "");
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 877;
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 10;
                            byte b13 = $$a[11];
                            byte b14 = (byte) (b13 + 1);
                            Object[] objArr18 = new Object[1];
                            a(b14, (byte) (-b14), b13, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iIndexOf, packedPositionGroup, -1199417970, false, (String) objArr18[0], null);
                        }
                        ((java.lang.reflect.Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr13;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = ((int[]) objArr[2])[0];
            int i11 = ((int[]) objArr[0])[0];
            if (i11 != i10) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[3];
                if (strArr != null) {
                    for (String str : strArr) {
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
                        TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                        int i13 = i12 % 2;
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i11));
            }
            int i14 = TuitionPaymentFragmentbindingInflater1 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i17 = i16 + (-1943533784) + (((~(iFreeMemory | 965675913)) | 925365684) * (-668)) + ((965675913 | (~(925365684 | iFreeMemory))) * 1336) + ((iFreeMemory | 1068498877) * 668);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr19[1])[0] = i19 ^ (i19 << 5);
            this.zaj = zanVar;
        }

        static {
            b = 0;
            TuitionPaymentFragmentbindingInflater1();
            CREATOR = new zaj();
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            b = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ FieldConverter zac(Field field) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 59;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            FieldConverter fieldConverter = field.zak;
            int i5 = i3 + 97;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 86 / 0;
            }
            return fieldConverter;
        }

        public int getSafeParcelableFieldId() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1;
            int i3 = i2 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.zaf;
            int i6 = i2 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        final String zag() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            int i3 = i2 % 128;
            TuitionPaymentFragmentbindingInflater1 = i3;
            String str = null;
            if (i2 % 2 != 0) {
                str.hashCode();
                throw null;
            }
            String str2 = this.zah;
            str = str2 != null ? str2 : null;
            int i4 = i3 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        
            r3 = r3 + 89;
            com.google.android.gms.common.server.response.FastJsonResponse.Field.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        
            if ((r3 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        
            r0 = null;
            r0.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r6.zak != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r6.zak != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            r1 = r1 + 75;
            com.google.android.gms.common.server.response.FastJsonResponse.Field.TuitionPaymentFragmentbindingInflater1 = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean zaj() {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.google.android.gms.common.server.response.FastJsonResponse.Field.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                int r2 = r1 + 115
                int r3 = r2 % 128
                com.google.android.gms.common.server.response.FastJsonResponse.Field.TuitionPaymentFragmentbindingInflater1 = r3
                int r2 = r2 % r0
                r4 = 0
                if (r2 == 0) goto L17
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r2 = r6.zak
                r5 = 82
                int r5 = r5 / r4
                if (r2 == 0) goto L24
                goto L1b
            L17:
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r2 = r6.zak
                if (r2 == 0) goto L24
            L1b:
                int r1 = r1 + 75
                int r2 = r1 % 128
                com.google.android.gms.common.server.response.FastJsonResponse.Field.TuitionPaymentFragmentbindingInflater1 = r2
                int r1 = r1 % r0
                r0 = 1
                return r0
            L24:
                int r3 = r3 + 89
                int r1 = r3 % 128
                com.google.android.gms.common.server.response.FastJsonResponse.Field.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1
                int r3 = r3 % r0
                if (r3 == 0) goto L2e
                return r4
            L2e:
                r0 = 0
                r0.hashCode()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastJsonResponse.Field.zaj():boolean");
        }

        static void TuitionPaymentFragmentbindingInflater1() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -83722245;
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
        private static java.lang.String $$g(int r6, int r7, byte r8) {
            /*
                int r6 = r6 * 2
                int r0 = r6 + 1
                int r7 = 120 - r7
                int r8 = r8 * 3
                int r8 = 3 - r8
                byte[] r1 = com.google.android.gms.common.server.response.FastJsonResponse.Field.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r3 = r6
                r7 = r8
                r4 = r2
                goto L2a
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                int r8 = r8 + 1
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                r3 = r1[r8]
                r5 = r8
                r8 = r7
                r7 = r5
            L2a:
                int r3 = -r3
                int r8 = r8 + r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastJsonResponse.Field.$$g(int, int, byte):java.lang.String");
        }
    }

    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        Object zac(Object obj);

        Object zad(Object obj);
    }

    protected static final Object zaD(Field field, Object obj) {
        return Field.zac(field) != null ? field.zaf(obj) : obj;
    }

    private final void zaE(Field field, Object obj) {
        int i = field.zac;
        Object objZae = field.zae(obj);
        String str = field.zae;
        switch (i) {
            case 0:
                if (objZae != null) {
                    setIntegerInternal(field, str, ((Integer) objZae).intValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 1:
                zaf(field, str, (BigInteger) objZae);
                return;
            case 2:
                if (objZae != null) {
                    setLongInternal(field, str, ((Long) objZae).longValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 3:
            default:
                throw new IllegalStateException("Unsupported type for conversion: " + i);
            case 4:
                if (objZae != null) {
                    zan(field, str, ((Double) objZae).doubleValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 5:
                zab(field, str, (BigDecimal) objZae);
                return;
            case 6:
                if (objZae != null) {
                    setBooleanInternal(field, str, ((Boolean) objZae).booleanValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 7:
                setStringInternal(field, str, (String) objZae);
                return;
            case 8:
            case 9:
                if (objZae != null) {
                    setDecodedBytesInternal(field, str, (byte[]) objZae);
                    return;
                } else {
                    zaG(str);
                    return;
                }
        }
    }

    private static final void zaF(StringBuilder sb, Field field, Object obj) {
        int i = field.zaa;
        if (i == 11) {
            Class cls = field.zag;
            Preconditions.checkNotNull(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(JsonUtils.escapeString((String) obj));
            sb.append("\"");
        }
    }

    private static final void zaG(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            Log.e("FastJsonResponse", "Output field (" + str + ") has a null value, but expected a primitive");
        }
    }

    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(Field field, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends FastJsonResponse> void addConcreteTypeInternal(Field field, String str, T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, Field<?, ?>> getFieldMappings();

    protected abstract Object getValueObject(String str);

    protected abstract boolean isPrimitiveFieldSet(String str);

    protected void setBooleanInternal(Field<?, ?> field, String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    protected void setDecodedBytesInternal(Field<?, ?> field, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    protected void setIntegerInternal(Field<?, ?> field, String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    protected void setLongInternal(Field<?, ?> field, String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    protected void setStringInternal(Field<?, ?> field, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    protected void setStringMapInternal(Field<?, ?> field, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    protected void setStringsInternal(Field<?, ?> field, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            Field<?, ?> field = fieldMappings.get(str);
            if (isFieldSet(field)) {
                Object objZaD = zaD(field, getFieldValue(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (objZaD != null) {
                    switch (field.zac) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64Utils.encode((byte[]) objZaD));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64Utils.encodeUrlSafe((byte[]) objZaD));
                            sb.append("\"");
                            break;
                        case 10:
                            MapUtils.writeStringMapToJson(sb, (HashMap) objZaD);
                            break;
                        default:
                            if (field.zab) {
                                ArrayList arrayList = (ArrayList) objZaD;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        zaF(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                            } else {
                                zaF(sb, field, objZaD);
                            }
                            break;
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public final void zaA(Field field, String str) {
        if (Field.zac(field) != null) {
            zaE(field, str);
        } else {
            setStringInternal(field, field.zae, str);
        }
    }

    public final void zaB(Field field, Map map) {
        if (Field.zac(field) != null) {
            zaE(field, map);
        } else {
            setStringMapInternal(field, field.zae, map);
        }
    }

    public final void zaC(Field field, ArrayList arrayList) {
        if (Field.zac(field) != null) {
            zaE(field, arrayList);
        } else {
            setStringsInternal(field, field.zae, arrayList);
        }
    }

    public final void zaa(Field field, BigDecimal bigDecimal) {
        if (Field.zac(field) != null) {
            zaE(field, bigDecimal);
        } else {
            zab(field, field.zae, bigDecimal);
        }
    }

    protected void zab(Field field, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(Field field, ArrayList arrayList) {
        if (Field.zac(field) != null) {
            zaE(field, arrayList);
        } else {
            zad(field, field.zae, arrayList);
        }
    }

    protected void zad(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(Field field, BigInteger bigInteger) {
        if (Field.zac(field) != null) {
            zaE(field, bigInteger);
        } else {
            zaf(field, field.zae, bigInteger);
        }
    }

    protected void zaf(Field field, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(Field field, ArrayList arrayList) {
        if (Field.zac(field) != null) {
            zaE(field, arrayList);
        } else {
            zah(field, field.zae, arrayList);
        }
    }

    protected void zah(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(Field field, boolean z) {
        if (Field.zac(field) != null) {
            zaE(field, Boolean.valueOf(z));
        } else {
            setBooleanInternal(field, field.zae, z);
        }
    }

    public final void zaj(Field field, ArrayList arrayList) {
        if (Field.zac(field) != null) {
            zaE(field, arrayList);
        } else {
            zak(field, field.zae, arrayList);
        }
    }

    protected void zak(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(Field field, byte[] bArr) {
        if (Field.zac(field) != null) {
            zaE(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.zae, bArr);
        }
    }

    public final void zam(Field field, double d) {
        if (Field.zac(field) != null) {
            zaE(field, Double.valueOf(d));
        } else {
            zan(field, field.zae, d);
        }
    }

    protected void zan(Field field, String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(Field field, ArrayList arrayList) {
        if (Field.zac(field) != null) {
            zaE(field, arrayList);
        } else {
            zap(field, field.zae, arrayList);
        }
    }

    protected void zap(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(Field field, float f) {
        if (Field.zac(field) != null) {
            zaE(field, Float.valueOf(f));
        } else {
            zar(field, field.zae, f);
        }
    }

    protected void zar(Field field, String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(Field field, ArrayList arrayList) {
        if (Field.zac(field) != null) {
            zaE(field, arrayList);
        } else {
            zat(field, field.zae, arrayList);
        }
    }

    protected void zat(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(Field field, int i) {
        if (Field.zac(field) != null) {
            zaE(field, Integer.valueOf(i));
        } else {
            setIntegerInternal(field, field.zae, i);
        }
    }

    public final void zav(Field field, ArrayList arrayList) {
        if (Field.zac(field) != null) {
            zaE(field, arrayList);
        } else {
            zaw(field, field.zae, arrayList);
        }
    }

    protected void zaw(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(Field field, long j) {
        if (Field.zac(field) != null) {
            zaE(field, Long.valueOf(j));
        } else {
            setLongInternal(field, field.zae, j);
        }
    }

    public final void zay(Field field, ArrayList arrayList) {
        if (Field.zac(field) != null) {
            zaE(field, arrayList);
        } else {
            zaz(field, field.zae, arrayList);
        }
    }

    protected void zaz(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    protected Object getFieldValue(Field field) {
        String str = field.zae;
        if (field.zag == null) {
            return getValueObject(str);
        }
        Preconditions.checkState(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", field.zae);
        boolean z = field.zad;
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    protected boolean isFieldSet(Field field) {
        if (field.zac != 11) {
            return isPrimitiveFieldSet(field.zae);
        }
        boolean z = field.zad;
        String str = field.zae;
        if (z) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }
}
