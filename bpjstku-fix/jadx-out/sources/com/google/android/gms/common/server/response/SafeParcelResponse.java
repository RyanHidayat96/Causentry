package com.google.android.gms.common.server.response;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR;
    private static int[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final int zaa;
    private final Parcel zab;
    private final int zac;
    private final zan zad;
    private final String zae;
    private int zaf;
    private int zag;
    private static final byte[] $$c = {30, 17, -35, 104};
    private static final int $$f = 61;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {64, 73, -26, 82, -5, 18, -5, 8, 3, 10, 25, -13, 4, 24, 5, -9, -15, 40, -7, -28, 36, 21, 10, 7, 3, -7, -46, 54, 19, -4, 20, 3, 0, 1, 26, -15, 4, 18, -2, 19, -11, 8, 4, 18, -2, 19, -11, -41, Base64.padSymbol, 11, 12, -9, 19, 2, -7, 17, -35, 36, 18, -2, 19, -11, -41, 23, 36, 21, 10, 7, 3, -7, -15, 31, 13, -5, 13, 3, 11, -3, -15, 31, 13, -5, 13, 3, 11, -3, -59, 54, 39, -6, 17, -5, 12, 5, -24, 23, 30, -6, -2, 15, 12, -40, 50, -11, 12, 12, -2, 15, 12, -12, 13, 11, -4, 11, 11, -1, -24, 43, -2, 12, -5, 25, -9, 19, -59, 39, -6, 17, -5, 12, 5, -24, 23, 30, -6, -2, 15, 12, -40, 50, -11, 12, 12, -2, 15, 12, 5, 3, -5, 4, 12, -2, 17, 3, 11, 4, 3, 11, -3, 5, 24, -7, 2, 24, -36, 40, -5, 7, 13, -2, 7, 7, 1, 26, -3, 14, -61};
    private static final int $$e = 169;
    private static final byte[] $$a = {57, -50, -56, -93, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 58;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

    SafeParcelResponse(int i, Parcel parcel, zan zanVar) {
        String strZaa;
        this.zaa = i;
        this.zab = (Parcel) Preconditions.checkNotNull(parcel);
        this.zac = 2;
        this.zad = zanVar;
        if (zanVar == null) {
            strZaa = null;
        } else {
            strZaa = zanVar.zaa();
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        this.zae = strZaa;
        this.zaf = 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = r8 + 84
            int r6 = r6 * 15
            int r0 = r6 + 38
            byte[] r1 = com.google.android.gms.common.server.response.SafeParcelResponse.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 37
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L19:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1d:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r1[r8]
        L2e:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            int r8 = r8 + 1
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.a(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 69
            int r0 = r5 + 53
            byte[] r1 = com.google.android.gms.common.server.response.SafeParcelResponse.$$d
            int r6 = r6 * 121
            int r6 = r6 + 4
            int r7 = r7 * 24
            int r7 = r7 + 84
            byte[] r0 = new byte[r0]
            int r5 = r5 + 52
            r2 = 0
            if (r1 != 0) goto L19
            r7 = r5
            r4 = r6
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2b:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-6)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.d(byte, int, short, java.lang.Object[]):void");
    }

    private final void zaG(FastJsonResponse.Field field) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (field.zaf == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.zab;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i4 = b + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = this.zaf;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.zag = SafeParcelWriter.beginObjectHeader(parcel);
            this.zaf = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r1 = com.google.android.gms.common.server.response.SafeParcelResponse.b + 97;
        com.google.android.gms.common.server.response.SafeParcelResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1 % 128;
        r1 = r1 % 2;
        r7 = (java.util.ArrayList) r7;
        r5.append("[");
        r1 = r7.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r2 >= r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r3 = com.google.android.gms.common.server.response.SafeParcelResponse.b + 45;
        com.google.android.gms.common.server.response.SafeParcelResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r2 == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r5.append(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        zaI(r5, r6.zaa, r7.get(r2));
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        r5.append("]");
        r5 = com.google.android.gms.common.server.response.SafeParcelResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        com.google.android.gms.common.server.response.SafeParcelResponse.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if ((r5 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r6.zab != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((!r6.zab) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        zaI(r5, r6.zaa, r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zaJ(java.lang.StringBuilder r5, com.google.android.gms.common.server.response.FastJsonResponse.Field r6, java.lang.Object r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.common.server.response.SafeParcelResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.google.android.gms.common.server.response.SafeParcelResponse.b = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L17
            boolean r1 = r6.zab
            r3 = 72
            int r3 = r3 / r2
            if (r1 == 0) goto L1d
            goto L23
        L17:
            boolean r1 = r6.zab
            r1 = r1 ^ 1
            if (r1 == 0) goto L23
        L1d:
            int r6 = r6.zaa
            zaI(r5, r6, r7)
            return
        L23:
            int r1 = com.google.android.gms.common.server.response.SafeParcelResponse.b
            int r1 = r1 + 97
            int r3 = r1 % 128
            com.google.android.gms.common.server.response.SafeParcelResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r3
            int r1 = r1 % r0
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.String r1 = "["
            r5.append(r1)
            int r1 = r7.size()
        L37:
            if (r2 >= r1) goto L55
            int r3 = com.google.android.gms.common.server.response.SafeParcelResponse.b
            int r3 = r3 + 45
            int r4 = r3 % 128
            com.google.android.gms.common.server.response.SafeParcelResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r4
            int r3 = r3 % r0
            if (r2 == 0) goto L49
            java.lang.String r3 = ","
            r5.append(r3)
        L49:
            int r3 = r6.zaa
            java.lang.Object r4 = r7.get(r2)
            zaI(r5, r3, r4)
            int r2 = r2 + 1
            goto L37
        L55:
            java.lang.String r6 = "]"
            r5.append(r6)
            int r5 = com.google.android.gms.common.server.response.SafeParcelResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r5 = r5 + 49
            int r6 = r5 % 128
            com.google.android.gms.common.server.response.SafeParcelResponse.b = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L66
            return
        L66:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.zaJ(java.lang.StringBuilder, com.google.android.gms.common.server.response.FastJsonResponse$Field, java.lang.Object):void");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 89;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        zan zanVar = this.zad;
        if (zanVar == null) {
            int i4 = i2 + 19;
            b = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        Map<String, FastJsonResponse.Field<?, ?>> mapZab = zanVar.zab((String) Preconditions.checkNotNull(this.zae));
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return mapZab;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field field, String str, T t) {
        Parcel parcelZaE;
        Parcel parcel;
        int safeParcelableFieldId;
        boolean z;
        int i = 2 % 2;
        int i2 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            zaG(field);
            parcelZaE = ((SafeParcelResponse) t).zaE();
            parcel = this.zab;
            safeParcelableFieldId = field.getSafeParcelableFieldId();
            z = false;
        } else {
            zaG(field);
            parcelZaE = ((SafeParcelResponse) t).zaE();
            parcel = this.zab;
            safeParcelableFieldId = field.getSafeParcelableFieldId();
            z = true;
        }
        SafeParcelWriter.writeParcel(parcel, safeParcelableFieldId, parcelZaE, z);
        int i3 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
    }

    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse from(T t) throws Throwable {
        int i = 2 % 2;
        String str = (String) Preconditions.checkNotNull(t.getClass().getCanonicalName());
        zan zanVar = new zan(t.getClass());
        zaF(zanVar, t);
        zanVar.zac();
        zanVar.zad();
        SafeParcelResponse safeParcelResponse = new SafeParcelResponse(t, zanVar, str);
        int i2 = b + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return safeParcelResponse;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String str, ArrayList<T> arrayList) {
        int i = 2 % 2;
        zaG(field);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int size = arrayList.size();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        b = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.add(((SafeParcelResponse) arrayList.get(i4)).zaE());
        }
        SafeParcelWriter.writeParcelList(this.zab, field.getSafeParcelableFieldId(), arrayList2, true);
        int i5 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void zaI(StringBuilder sb, int i, Object obj) {
        int i2 = 2 % 2;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(JsonUtils.escapeString(Preconditions.checkNotNull(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(Base64Utils.encode((byte[]) obj));
                sb.append("\"");
                int i3 = b + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
                return;
            case 9:
                sb.append("\"");
                sb.append(Base64Utils.encodeUrlSafe((byte[]) obj));
                sb.append("\"");
                int i5 = b + 3;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
                return;
            case 10:
                MapUtils.writeStringMapToJson(sb, (HashMap) Preconditions.checkNotNull(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static void zaF(zan zanVar, FastJsonResponse fastJsonResponse) {
        int i = 2 % 2;
        Class<?> cls = fastJsonResponse.getClass();
        if (!zanVar.zaf(cls)) {
            Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
            zanVar.zae(cls, fieldMappings);
            Iterator<String> it = fieldMappings.keySet().iterator();
            int i2 = b + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            while (it.hasNext()) {
                FastJsonResponse.Field<?, ?> field = fieldMappings.get(it.next());
                Class cls2 = field.zag;
                if (cls2 != null) {
                    try {
                        zaF(zanVar, (FastJsonResponse) cls2.newInstance());
                    } catch (IllegalAccessException e2) {
                        throw new IllegalStateException("Could not access object of type ".concat(String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName())), e2);
                    } catch (InstantiationException e3) {
                        throw new IllegalStateException("Could not instantiate an object of type ".concat(String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName())), e3);
                    }
                }
            }
        }
        int i4 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void zaH(StringBuilder sb, Map map, Parcel parcel) {
        int i = 2 % 2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).getSafeParcelableFieldId(), entry);
        }
        sb.append('{');
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(SafeParcelReader.getFieldId(header));
            if (entry2 != null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (field.zaj()) {
                    int i3 = field.zac;
                    switch (i3) {
                        case 0:
                            zaJ(sb, field, zaD(field, Integer.valueOf(SafeParcelReader.readInt(parcel, header))));
                            break;
                        case 1:
                            zaJ(sb, field, zaD(field, SafeParcelReader.createBigInteger(parcel, header)));
                            break;
                        case 2:
                            zaJ(sb, field, zaD(field, Long.valueOf(SafeParcelReader.readLong(parcel, header))));
                            break;
                        case 3:
                            zaJ(sb, field, zaD(field, Float.valueOf(SafeParcelReader.readFloat(parcel, header))));
                            break;
                        case 4:
                            zaJ(sb, field, zaD(field, Double.valueOf(SafeParcelReader.readDouble(parcel, header))));
                            break;
                        case 5:
                            zaJ(sb, field, zaD(field, SafeParcelReader.createBigDecimal(parcel, header)));
                            break;
                        case 6:
                            zaJ(sb, field, zaD(field, Boolean.valueOf(SafeParcelReader.readBoolean(parcel, header))));
                            break;
                        case 7:
                            zaJ(sb, field, zaD(field, SafeParcelReader.createString(parcel, header)));
                            break;
                        case 8:
                        case 9:
                            zaJ(sb, field, zaD(field, SafeParcelReader.createByteArray(parcel, header)));
                            break;
                        case 10:
                            Bundle bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                            HashMap map2 = new HashMap();
                            for (String str2 : bundleCreateBundle.keySet()) {
                                int i4 = b + 59;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                                int i5 = i4 % 2;
                                map2.put(str2, (String) Preconditions.checkNotNull(bundleCreateBundle.getString(str2)));
                            }
                            zaJ(sb, field, zaD(field, map2));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb2 = new StringBuilder("Unknown field out type = ");
                            sb2.append(i3);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.zad) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
                    b = i6 % 128;
                    int i7 = i6 % 2;
                    sb.append("[");
                    switch (field.zac) {
                        case 0:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createIntArray(parcel, header));
                            break;
                        case 1:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createBigIntegerArray(parcel, header));
                            break;
                        case 2:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createLongArray(parcel, header));
                            break;
                        case 3:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createFloatArray(parcel, header));
                            break;
                        case 4:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createDoubleArray(parcel, header));
                            break;
                        case 5:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createBigDecimalArray(parcel, header));
                            break;
                        case 6:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createBooleanArray(parcel, header));
                            break;
                        case 7:
                            ArrayUtils.writeStringArray(sb, SafeParcelReader.createStringArray(parcel, header));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] parcelArrCreateParcelArray = SafeParcelReader.createParcelArray(parcel, header);
                            int length = parcelArrCreateParcelArray.length;
                            for (int i8 = 0; i8 < length; i8++) {
                                if (i8 > 0) {
                                    sb.append(",");
                                }
                                parcelArrCreateParcelArray[i8].setDataPosition(0);
                                zaH(sb, field.zah(), parcelArrCreateParcelArray[i8]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.zac) {
                        case 0:
                            sb.append(SafeParcelReader.readInt(parcel, header));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.createBigInteger(parcel, header));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.readLong(parcel, header));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.readFloat(parcel, header));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.readDouble(parcel, header));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.createBigDecimal(parcel, header));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.readBoolean(parcel, header));
                            break;
                        case 7:
                            String strCreateString = SafeParcelReader.createString(parcel, header);
                            sb.append("\"");
                            sb.append(JsonUtils.escapeString(strCreateString));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                            sb.append("\"");
                            sb.append(Base64Utils.encode(bArrCreateByteArray));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                            sb.append("\"");
                            sb.append(Base64Utils.encodeUrlSafe(bArrCreateByteArray2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle bundleCreateBundle2 = SafeParcelReader.createBundle(parcel, header);
                            Set<String> setKeySet = bundleCreateBundle2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str3 : setKeySet) {
                                if (!z2) {
                                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
                                    b = i9 % 128;
                                    int i10 = i9 % 2;
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str3);
                                sb.append("\":\"");
                                sb.append(JsonUtils.escapeString(bundleCreateBundle2.getString(str3)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel parcelCreateParcel = SafeParcelReader.createParcel(parcel, header);
                            parcelCreateParcel.setDataPosition(0);
                            zaH(sb, field.zah(), parcelCreateParcel);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() != iValidateObjectHeader) {
            StringBuilder sb3 = new StringBuilder("Overread allowed size end=");
            sb3.append(iValidateObjectHeader);
            throw new SafeParcelReader.ParseException(sb3.toString(), parcel);
        }
        sb.append('}');
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentbindingInflater1;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $11 + 11;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 87;
                $10 = i10 % 128;
                if (i10 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i6] = Integer.valueOf(iArr2[i9]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i6;
                            byte b3 = (byte) (b2 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", ""), (ViewConfiguration.getLongPressTimeout() >> 16) + 3291, (TypedValue.complexToFloat(i6) > 0.0f ? 1 : (TypedValue.complexToFloat(i6) == 0.0f ? 0 : -1)) + 31, 1948206109, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i9--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i9])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.green(0), Color.green(0) + 3291, 31 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1948206109, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i9++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
                i4 = -1870535734;
                i6 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
        if (iArr5 != null) {
            int i11 = $11 + 45;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $10 + 59;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    try {
                        Object[] objArr4 = new Object[i5];
                        objArr4[0] = Integer.valueOf(iArr5[i13]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + i5), 3292 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30, 1948206109, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i13] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    length3 = length3;
                    try {
                        Object[] objArr5 = {Integer.valueOf(iArr5[i13])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.resolveSize(0, 0), View.MeasureSpec.getSize(0) + 3291, 31 - Color.alpha(0), 1948206109, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i13] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        i13++;
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                }
                length3 = length3;
                i5 = 1;
            }
            iArr5 = iArr6;
        }
        char c = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[c] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i15 = 17;
            for (int i16 = 1; i15 > i16; i16 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                Object[] objArr6 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.getOffsetBefore("", 0) + 2559, TextUtils.getOffsetAfter("", 0) + 29, 683220507, false, $$g(b10, b11, b11), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i15--;
                int i17 = $11 + 43;
                $10 = i17 % 128;
                int i18 = i17 % 2;
            }
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr7 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 28878), 348 - TextUtils.getTrimmedLength(""), 25 - View.MeasureSpec.makeMeasureSpec(0, 0), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            c = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getValueObject(String str) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = b + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 43042);
            int modifierMetaStateMask = 3110 - ((byte) KeyEvent.getModifierMetaStateMask());
            int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21;
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            byte b3 = bArr[7];
            Object[] objArr3 = new Object[1];
            a(b2, b3, b3, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, modifierMetaStateMask, i4, -1272852037, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new int[]{217418991, -1904323558, 2010010868, -1818214566, -37326538, -901874184, 17750028, -2068398528, 871001235, -582835760, -851337253, 1613369605, 1565966087, 136266087}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new int[]{-715273818, -428922900, -586905746, -1129105058, -1793261218, 1790473944, -776097554, 1295000073, 1824469471, 1330030635}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyPid = (char) (43042 - (Process.myPid() >> 22));
            int i5 = 3111 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 22;
            byte[] bArr2 = $$a;
            byte b4 = bArr2[5];
            Object[] objArr6 = new Object[1];
            a(b4, b4, bArr2[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, i5, packedPositionGroup, -1269618118, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char defaultSize = (char) (43042 - View.getDefaultSize(0, 0));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 3112;
                int maxKeyCode = 22 - (KeyEvent.getMaxKeyCode() >> 16);
                byte[] bArr3 = $$a;
                byte b5 = bArr3[7];
                Object[] objArr7 = new Object[1];
                a(b5, bArr3[40], b5, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, iLastIndexOf, maxKeyCode, 154975793, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr8[2])[0];
            int i7 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[3];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i8 = (((((~((-605094593) | iFreeMemory)) | 1099838466) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 2062905992) + ((~((~iFreeMemory) | (-605094593))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) - 688153050;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{new int[1], new int[]{i7}, new int[]{i6}, strArr};
        } else {
            int length = str != null ? str.length() : 0;
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
            b = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr9 = {null, Integer.valueOf(length), 0, -688153050};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[33];
                Object[] objArr10 = new Object[1];
                d(b6, bArr4[32], b6, objArr10);
                Class<?> cls2 = Class.forName((String) objArr10[0]);
                byte b7 = bArr4[32];
                Object[] objArr11 = new Object[1];
                d(b7, bArr4[33], b7, objArr11);
                Object[] objArr12 = (Object[]) cls2.getMethod((String) objArr11[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char windowTouchSlop = (char) (43042 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    int i13 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3111;
                    int i14 = 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte[] bArr5 = $$a;
                    byte b8 = bArr5[7];
                    Object[] objArr13 = new Object[1];
                    a(b8, bArr5[40], b8, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, i13, i14, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr12);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new int[]{217418991, -1904323558, 2010010868, -1818214566, -37326538, -901874184, 17750028, -2068398528, 871001235, -582835760, -851337253, 1613369605, 1565966087, 136266087}, TextUtils.getOffsetBefore("", 0) + 22, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new int[]{-715273818, -428922900, -586905746, -1129105058, -1793261218, 1790473944, -776097554, 1295000073, 1824469471, 1330030635}, TextUtils.indexOf((CharSequence) "", '0', 0) + 16, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cGreen = (char) (43042 - Color.green(0));
                        int iAlpha = 3111 - Color.alpha(0);
                        int offsetBefore = 22 - TextUtils.getOffsetBefore("", 0);
                        byte[] bArr6 = $$a;
                        byte b9 = bArr6[5];
                        Object[] objArr16 = new Object[1];
                        a(b9, b9, bArr6[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cGreen, iAlpha, offsetBefore, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mode = (char) (43042 - View.MeasureSpec.getMode(0));
                        int scrollBarFadeDuration = 3111 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iGreen = 22 - Color.green(0);
                        byte[] bArr7 = $$a;
                        byte b10 = bArr7[5];
                        byte b11 = bArr7[7];
                        Object[] objArr17 = new Object[1];
                        a(b10, b11, b11, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, scrollBarFadeDuration, iGreen, -1272852037, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr12;
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                int i17 = b + 87;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
                int i18 = 2;
                int i19 = i17 % 2;
                int i20 = 0;
                while (i20 < strArr2.length) {
                    int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
                    b = i21 % 128;
                    int i22 = i21 % i18;
                    arrayList.add(strArr2[i20]);
                    i20++;
                    i18 = 2;
                }
            }
            int[] iArr = new int[i16];
            int i23 = i16 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i16 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArr[0])[0];
            int i25 = ((int[]) objArr[2])[0];
            int i26 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[3];
            int[] iArr2 = {i26};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i27 = ~iMaxMemory;
            int i28 = 2077969654 + (((~(1312884760 | i27)) | 287221506) * (-1188));
            int i29 = (~(iMaxMemory | (-1312884761))) | 287221506;
            int i30 = ~(392146698 | i27);
            int i31 = i24 + i28 + ((i29 | i30) * 594) + (((~((-1312884761) | i27)) | 1207959568 | i30) * 594);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr2[0])[0] = i33 ^ (i33 << 5);
            objArr2 = new Object[]{new int[1], iArr2, new int[]{i25}, strArr3};
        } else {
            int i34 = ((int[]) objArr[0])[0];
            int i35 = ((int[]) objArr[2])[0];
            int i36 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int iNextInt = new Random().nextInt();
            int i37 = ~iNextInt;
            int i38 = i34 + (-1562880412) + (((~((-136381221) | i37)) | (~((-71733457) | iNextInt)) | (~((-1360535563) | iNextInt))) * 765) + (((~((-208114677) | i37)) | 136381220) * 1530) + (((~(iNextInt | (-208114677))) | (~(i37 | (-1360535563)))) * 765);
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr2[0])[0] = i40 ^ (i40 << 5);
            objArr2 = new Object[]{new int[1], new int[]{i36}, new int[]{i35}, strArr4};
        }
        int i41 = ((int[]) objArr2[0])[0];
        int i42 = i41 * i41;
        int i43 = -(464046512 * i41);
        int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
        int i45 = -(i41 * (-1968333110));
        int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
        int i47 = (i46 ^ 623302281) + ((623302281 & i46) << 1);
        int i48 = ((i47 >> 20) - 8191) / 4096;
        int i49 = ((i47 >> 27) - 63) / 32;
        int i50 = -(((i47 - (~((i48 ^ 1) + ((i48 & 1) << 1)))) - 1) ^ ((i49 & 1) + (i49 | 1)));
        int i51 = (i50 ^ 3) + ((i50 & 3) << 1);
        int i52 = i51 >> 25;
        int i53 = ((i52 & (-255)) + (i52 | (-255))) / 128;
        int i54 = (i53 ^ 1) + ((i53 & 1) << 1);
        throw new UnsupportedOperationException("31\\4\\12\\5\\29\\Converting to JSON does not require this method.".substring(4212 / (((-((i54 ^ 1) + ((i54 & 1) << 1))) & i51) * 108)));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isPrimitiveFieldSet(String str) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    private SafeParcelResponse(SafeParcelable safeParcelable, zan zanVar, String str) {
        this.zaa = 1;
        Parcel parcelObtain = Parcel.obtain();
        this.zab = parcelObtain;
        safeParcelable.writeToParcel(parcelObtain, 0);
        this.zac = 1;
        this.zad = (zan) Preconditions.checkNotNull(zanVar);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 2;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setBooleanInternal(FastJsonResponse.Field<?, ?> field, String str, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
        zaG(field);
        SafeParcelWriter.writeBoolean(this.zab, field.getSafeParcelableFieldId(), z);
        int i4 = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setDecodedBytesInternal(FastJsonResponse.Field<?, ?> field, String str, byte[] bArr) {
        int i = 2 % 2;
        int i2 = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zaG(field);
        SafeParcelWriter.writeByteArray(this.zab, field.getSafeParcelableFieldId(), bArr, true);
        int i4 = b + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setIntegerInternal(FastJsonResponse.Field<?, ?> field, String str, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        b = i3 % 128;
        int i4 = i3 % 2;
        zaG(field);
        SafeParcelWriter.writeInt(this.zab, field.getSafeParcelableFieldId(), i);
        int i5 = b + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setLongInternal(FastJsonResponse.Field<?, ?> field, String str, long j) {
        int i = 2 % 2;
        int i2 = b + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zaG(field);
        SafeParcelWriter.writeLong(this.zab, field.getSafeParcelableFieldId(), j);
        int i4 = b + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setStringInternal(FastJsonResponse.Field<?, ?> field, String str, String str2) {
        Parcel parcel;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            zaG(field);
            parcel = this.zab;
        } else {
            zaG(field);
            parcel = this.zab;
        }
        SafeParcelWriter.writeString(parcel, field.getSafeParcelableFieldId(), str2, true);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zab(FastJsonResponse.Field field, String str, BigDecimal bigDecimal) {
        Parcel parcel;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            zaG(field);
            parcel = this.zab;
        } else {
            zaG(field);
            parcel = this.zab;
        }
        SafeParcelWriter.writeBigDecimal(parcel, field.getSafeParcelableFieldId(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaf(FastJsonResponse.Field field, String str, BigInteger bigInteger) {
        Parcel parcel;
        int i = 2 % 2;
        int i2 = b + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            zaG(field);
            parcel = this.zab;
        } else {
            zaG(field);
            parcel = this.zab;
        }
        SafeParcelWriter.writeBigInteger(parcel, field.getSafeParcelableFieldId(), bigInteger, true);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 65 / 0;
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zan(FastJsonResponse.Field field, String str, double d) {
        int i = 2 % 2;
        int i2 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zaG(field);
        SafeParcelWriter.writeDouble(this.zab, field.getSafeParcelableFieldId(), d);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zar(FastJsonResponse.Field field, String str, float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            zaG(field);
            SafeParcelWriter.writeFloat(this.zab, field.getSafeParcelableFieldId(), f);
        } else {
            zaG(field);
            SafeParcelWriter.writeFloat(this.zab, field.getSafeParcelableFieldId(), f);
            int i3 = 62 / 0;
        }
    }

    public final Parcel zaE() {
        int i = 2 % 2;
        int i2 = this.zaf;
        if (i2 != 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            b = i3 % 128;
            if (i3 % 2 != 0 ? i2 == 1 : i2 == 1) {
                SafeParcelWriter.finishObjectHeader(this.zab, this.zag);
                this.zaf = 2;
                int i4 = b + 11;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(this.zab);
            this.zag = iBeginObjectHeader;
            SafeParcelWriter.finishObjectHeader(this.zab, iBeginObjectHeader);
            this.zaf = 2;
        }
        return this.zab;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setStringMapInternal(FastJsonResponse.Field<?, ?> field, String str, Map<String, String> map) {
        int i = 2 % 2;
        zaG(field);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) Preconditions.checkNotNull(map)).keySet()) {
            int i2 = b + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            bundle.putString(str2, map.get(str2));
        }
        SafeParcelWriter.writeBundle(this.zab, field.getSafeParcelableFieldId(), bundle, true);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setStringsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<String> arrayList) {
        int size;
        String[] strArr;
        int i = 2 % 2;
        int i2 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            zaG(field);
            size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
            strArr = new String[size];
        } else {
            zaG(field);
            size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
            strArr = new String[size];
        }
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                strArr[i3] = arrayList.get(i3);
            } else {
                strArr[i3] = arrayList.get(i3);
            }
        }
        SafeParcelWriter.writeStringArray(this.zab, field.getSafeParcelableFieldId(), strArr, true);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zad(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int size;
        BigDecimal[] bigDecimalArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            zaG(field);
            size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
            bigDecimalArr = new BigDecimal[size];
        } else {
            zaG(field);
            size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
            bigDecimalArr = new BigDecimal[size];
        }
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
            b = i4 % 128;
            int i5 = i4 % 2;
            bigDecimalArr[i3] = (BigDecimal) arrayList.get(i3);
        }
        SafeParcelWriter.writeBigDecimalArray(this.zab, field.getSafeParcelableFieldId(), bigDecimalArr, true);
        int i6 = b + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zah(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int size;
        BigInteger[] bigIntegerArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            zaG(field);
            size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
            bigIntegerArr = new BigInteger[size];
        } else {
            zaG(field);
            size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
            bigIntegerArr = new BigInteger[size];
        }
        int i3 = b + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 5 % 2;
        }
        int i5 = 0;
        while (i5 < size) {
            int i6 = b + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            if (i6 % 2 != 0) {
                bigIntegerArr[i5] = (BigInteger) arrayList.get(i5);
                i5 += 115;
            } else {
                bigIntegerArr[i5] = (BigInteger) arrayList.get(i5);
                i5++;
            }
        }
        SafeParcelWriter.writeBigIntegerArray(this.zab, field.getSafeParcelableFieldId(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zak(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int i = 2 % 2;
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        boolean[] zArr = new boolean[size];
        int i2 = b + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < size) {
            int i5 = b + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 != 0) {
                zArr[i4] = ((Boolean) arrayList.get(i4)).booleanValue();
                i4 += 81;
            } else {
                zArr[i4] = ((Boolean) arrayList.get(i4)).booleanValue();
                i4++;
            }
        }
        SafeParcelWriter.writeBooleanArray(this.zab, field.getSafeParcelableFieldId(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zap(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int i = 2 % 2;
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        double[] dArr = new double[size];
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        b = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < size) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                dArr[i4] = ((Double) arrayList.get(i4)).doubleValue();
                i4 += 79;
            } else {
                dArr[i4] = ((Double) arrayList.get(i4)).doubleValue();
                i4++;
            }
            int i6 = b + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
        }
        SafeParcelWriter.writeDoubleArray(this.zab, field.getSafeParcelableFieldId(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zat(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int i = 2 % 2;
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        float[] fArr = new float[size];
        int i2 = 0;
        while (i2 < size) {
            int i3 = b + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            fArr[i2] = ((Float) arrayList.get(i2)).floatValue();
            i2++;
            int i5 = b + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
        }
        SafeParcelWriter.writeFloatArray(this.zab, field.getSafeParcelableFieldId(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaw(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int size;
        int[] iArr;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            zaG(field);
            size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
            iArr = new int[size];
            i = 1;
        } else {
            zaG(field);
            size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
            iArr = new int[size];
            i = 0;
        }
        while (i < size) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
            b = i4 % 128;
            int i5 = i4 % 2;
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
            i++;
        }
        SafeParcelWriter.writeIntArray(this.zab, field.getSafeParcelableFieldId(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaz(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int size;
        long[] jArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            zaG(field);
            size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
            jArr = new long[size];
        } else {
            zaG(field);
            size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
            jArr = new long[size];
        }
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = b + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            jArr[i3] = ((Long) arrayList.get(i3)).longValue();
        }
        SafeParcelWriter.writeLongArray(this.zab, field.getSafeParcelableFieldId(), jArr, true);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SafeParcelResponse(zan zanVar, String str) {
        this.zaa = 1;
        this.zab = Parcel.obtain();
        this.zac = 0;
        this.zad = (zan) Preconditions.checkNotNull(zanVar);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 0;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        int i = 2 % 2;
        Preconditions.checkNotNull(this.zad, "Cannot convert to JSON on client side.");
        Parcel parcelZaE = zaE();
        parcelZaE.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        zaH(sb, (Map) Preconditions.checkNotNull(this.zad.zab((String) Preconditions.checkNotNull(this.zae))), parcelZaE);
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        b = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zan zanVar;
        int i2 = 2 % 2;
        int i3 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i3);
        SafeParcelWriter.writeParcel(parcel, 2, zaE(), false);
        int i4 = this.zac;
        if (i4 != 0) {
            int i5 = b + 29;
            int i6 = i5 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6;
            if (i5 % 2 == 0 ? i4 == 1 : i4 == 0) {
                zanVar = this.zad;
            } else {
                zanVar = this.zad;
                int i7 = i6 + 43;
                b = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            zanVar = null;
        }
        SafeParcelWriter.writeParcelable(parcel, 3, zanVar, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        b();
        CREATOR = new zaq();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        int i2 = i % 2;
    }

    static void b() {
        TuitionPaymentFragmentbindingInflater1 = new int[]{361348627, 1124179639, -1855680705, 1407088927, -1450798578, -1432176489, -541678700, 1797333414, 991824290, -216387186, 938830734, -1592298888, -1764781118, -82890211, 166498071, -1999996069, 1339094971, 1883918462};
    }

    private static String $$g(byte b2, byte b3, byte b4) {
        int i = 122 - (b3 * 56);
        byte[] bArr = $$c;
        int i2 = (b4 * 4) + 4;
        int i3 = b2 * 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i2++;
            i += i2;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i3) {
                return new String(bArr2, 0);
            }
            byte b5 = bArr[i2];
            i2++;
            i += b5;
        }
    }
}
