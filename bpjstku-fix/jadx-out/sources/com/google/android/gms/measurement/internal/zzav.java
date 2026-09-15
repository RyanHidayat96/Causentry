package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.collection.SieveCacheKt;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpr;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* JADX INFO: loaded from: classes5.dex */
final class zzav extends zzos {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    static final String[] zza;
    private static final String[] zzb;
    private static final String[] zzc;
    private static final String[] zzd;
    private static final String[] zze;
    private static final String[] zzf;
    private static final String[] zzh;
    private static final String[] zzi;
    private static final String[] zzj;
    private static final String[] zzk;
    private static final String[] zzl;
    private final zzau zzm;
    private final zzog zzn;
    private static final byte[] $$d = {89, 92, -72, 43, 41, 9, 7, 21, 8, -9, 9, 18, 1, -10, 42, 5, -4, 3, 10, 10, 22, -38, 59, 4, -7, 21, 4, -5, 19, -17, 46, -3, 14, -4, 5, 23, -3, 2, -15, 29, 20, -3, 10, 5, -41, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -59};
    private static final int $$e = 248;
    private static final byte[] $$a = {48, -119, -71, 110, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 158;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    zzav(zzpg zzpgVar) {
        super(zzpgVar);
        this.zzn = new zzog(this.zzu.zzaZ());
        this.zzu.zzc();
        this.zzm = new zzau(this, this.zzu.zzaY(), "google_app_measurement.db");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r0 = 53 - r5
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r1 = com.google.android.gms.measurement.internal.zzav.$$a
            byte[] r0 = new byte[r0]
            int r5 = 52 - r5
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r5
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
        L29:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-10)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 11
            int r0 = 53 - r8
            byte[] r1 = com.google.android.gms.measurement.internal.zzav.$$d
            int r6 = r6 * 16
            int r6 = r6 + 68
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2f:
            int r6 = r6 + r7
            int r6 = r6 + (-8)
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.d(short, int, byte, java.lang.Object[]):void");
    }

    public final boolean zzG() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (zzay("select count(1) > 0 from queue where has_realtime = 1", null) == 0) {
            return false;
        }
        int i4 = b;
        int i5 = i4 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public final long zzM() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        b = i2 % 128;
        int i3 = i2 % 2;
        long jZzaz = zzaz("select max(bundle_end_timestamp) from queue", null, 0L);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        b = i4 % 128;
        int i5 = i4 % 2;
        return jZzaz;
    }

    public final long zzO() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        b = i2 % 128;
        int i3 = i2 % 2;
        long jZzaz = zzaz("select max(timestamp) from raw_events", null, 0L);
        int i4 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return jZzaz;
    }

    public final boolean zzP() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            if (zzay("select count(1) > 0 from raw_events", null) == 1) {
                return false;
            }
        } else if (zzay("select count(1) > 0 from raw_events", null) == 0) {
            return false;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        r5 = com.google.android.gms.measurement.internal.zzav.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        com.google.android.gms.measurement.internal.zzav.b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        if ((r5 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (zzay("select count(1) from raw_events where app_id = ? and name = ?", r1) > 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (zzay("select count(1) from raw_events where app_id = ? and name = ?", new java.lang.String[]{r5, r6}) > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        r5 = com.google.android.gms.measurement.internal.zzav.b + 89;
        r6 = r5 % 128;
        com.google.android.gms.measurement.internal.zzav.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r6;
        r5 = r5 % 2;
        r6 = r6 + 43;
        com.google.android.gms.measurement.internal.zzav.b = r6 % 128;
        r6 = r6 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzQ(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.measurement.internal.zzav.b
            int r1 = r1 + 121
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zzav.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r2
            int r1 = r1 % r0
            java.lang.String r2 = "select count(1) from raw_events where app_id = ? and name = ?"
            r3 = 0
            if (r1 == 0) goto L23
            r1 = 3
            java.lang.String[] r1 = new java.lang.String[r1]
            r1[r3] = r5
            r1[r3] = r6
            long r5 = r4.zzay(r2, r1)
            r1 = 1
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 <= 0) goto L43
            goto L31
        L23:
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            long r5 = r4.zzay(r2, r5)
            r1 = 0
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 <= 0) goto L43
        L31:
            int r5 = com.google.android.gms.measurement.internal.zzav.b
            int r5 = r5 + 89
            int r6 = r5 % 128
            com.google.android.gms.measurement.internal.zzav.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r6
            int r5 = r5 % r0
            int r6 = r6 + 43
            int r5 = r6 % 128
            com.google.android.gms.measurement.internal.zzav.b = r5
            int r6 = r6 % r0
            r5 = 1
            return r5
        L43:
            int r5 = com.google.android.gms.measurement.internal.zzav.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r5 = r5 + 47
            int r6 = r5 % 128
            com.google.android.gms.measurement.internal.zzav.b = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L4f
            return r3
        L4f:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzQ(java.lang.String, java.lang.String):boolean");
    }

    public final boolean zzR() {
        int i = 2 % 2;
        if (zzay("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
            b = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return false;
    }

    private static final String zzaH(List list) {
        int i = 2 % 2;
        if (list.isEmpty()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
            b = i2 % 128;
            int i3 = i2 % 2;
            return "";
        }
        String str = String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final long zzS(String str) throws Throwable {
        long jZzaz;
        int i = 2 % 2;
        int i2 = b + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Preconditions.checkNotEmpty(str);
            String[] strArr = new String[1];
            strArr[1] = str;
            jZzaz = zzaz("select count(1) from events where app_id=? and name not like '!_%' escape '!'", strArr, 0L);
        } else {
            Preconditions.checkNotEmpty(str);
            jZzaz = zzaz("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return jZzaz;
        }
        throw null;
    }

    public final void zzb() {
        int i = 2 % 2;
        int i2 = b + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            zzaw();
            zze().beginTransaction();
        } else {
            zzaw();
            zze().beginTransaction();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void zzc() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzaw();
        zze().setTransactionSuccessful();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void zzd() {
        int i = 2 % 2;
        int i2 = b + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zzaw();
        zze().endTransaction();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    protected final boolean zzag() {
        int i = 2 % 2;
        int i2 = b + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            zzic zzicVar = this.zzu;
            Context contextZzaY = zzicVar.zzaY();
            zzicVar.zzc();
            return contextZzaY.getDatabasePath("google_app_measurement.db").exists();
        }
        zzic zzicVar2 = this.zzu;
        Context contextZzaY2 = zzicVar2.zzaY();
        zzicVar2.zzc();
        contextZzaY2.getDatabasePath("google_app_measurement.db").exists();
        throw null;
    }

    public final boolean zzD(String str) throws IllegalAccessException {
        int i = 2 % 2;
        zzls[] zzlsVarArr = {zzls.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(zzlsVarArr[0].zza()));
        String strZzaH = zzaH(arrayList);
        String strZzaG = zzaG();
        StringBuilder sb = new StringBuilder(String.valueOf(strZzaH).length() + 61 + strZzaG.length());
        sb.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb.append(strZzaH);
        sb.append(" AND NOT ");
        sb.append(strZzaG);
        if (zzay(sb.toString(), new String[]{str}) == 0) {
            return false;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final Object zzL(Cursor cursor, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            cursor.getType(i);
            obj.hashCode();
            throw null;
        }
        int type = cursor.getType(i);
        if (type == 0) {
            this.zzu.zzaV().zzb().zza("Loaded invalid null value from database");
            return null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i5 = i4 + 67;
        b = i5 % 128;
        if (i5 % 2 != 0 ? type == 1 : type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            Double dValueOf = Double.valueOf(cursor.getDouble(i));
            int i6 = b + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            if (i6 % 2 == 0) {
                return dValueOf;
            }
            throw null;
        }
        if (type == 3) {
            String string = cursor.getString(i);
            int i7 = b + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            if (i7 % 2 == 0) {
                return string;
            }
            obj.hashCode();
            throw null;
        }
        int i8 = i4 + 47;
        b = i8 % 128;
        if (i8 % 2 != 0 ? type == 4 : type == 4) {
            this.zzu.zzaV().zzb().zza("Loaded invalid blob type value, ignoring it");
            return null;
        }
        this.zzu.zzaV().zzb().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
        int i9 = b + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
        int i10 = i9 % 2;
        return null;
    }

    public final zzaz zzaa(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        b = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkNotNull(str);
        zzg();
        zzaw();
        zzaz zzazVarZzg = zzaz.zzg(zzaA("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return zzazVarZzg;
    }

    public final zzjl zzad(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        b = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkNotNull(str);
        zzg();
        zzaw();
        zzjl zzjlVarZzf = zzjl.zzf(zzaA("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""), 100);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return zzjlVarZzf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final SQLiteDatabase zze() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        b = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                zzg();
                return this.zzm.getWritableDatabase();
            }
            zzg();
            this.zzm.getWritableDatabase();
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zze().zzb("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (zzaz("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new java.lang.String[]{r10, java.lang.String.valueOf(r11)}, 0) > 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean zzV(java.lang.String r10, long r11) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.measurement.internal.zzav.b
            int r1 = r1 + 53
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zzav.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r2
            int r1 = r1 % r0
            java.lang.String r2 = "select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;"
            r3 = 0
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L2c
            r1 = 3
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: android.database.sqlite.SQLiteException -> L2a
            r1[r6] = r10     // Catch: android.database.sqlite.SQLiteException -> L2a
            java.lang.String r7 = java.lang.String.valueOf(r11)     // Catch: android.database.sqlite.SQLiteException -> L2a
            r1[r5] = r7     // Catch: android.database.sqlite.SQLiteException -> L2a
            r7 = 1
            long r1 = r9.zzaz(r2, r1, r7)     // Catch: android.database.sqlite.SQLiteException -> L2a
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto L3f
            goto L3e
        L2a:
            r10 = move-exception
            goto L61
        L2c:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch: android.database.sqlite.SQLiteException -> L2a
            r1[r6] = r10     // Catch: android.database.sqlite.SQLiteException -> L2a
            java.lang.String r7 = java.lang.String.valueOf(r11)     // Catch: android.database.sqlite.SQLiteException -> L2a
            r1[r5] = r7     // Catch: android.database.sqlite.SQLiteException -> L2a
            long r1 = r9.zzaz(r2, r1, r3)     // Catch: android.database.sqlite.SQLiteException -> L2a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L3f
        L3e:
            return r6
        L3f:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch: android.database.sqlite.SQLiteException -> L2a
            r1[r6] = r10     // Catch: android.database.sqlite.SQLiteException -> L2a
            java.lang.String r10 = java.lang.String.valueOf(r11)     // Catch: android.database.sqlite.SQLiteException -> L2a
            r1[r5] = r10     // Catch: android.database.sqlite.SQLiteException -> L2a
            java.lang.String r10 = "select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;"
            long r10 = r9.zzaz(r10, r1, r3)     // Catch: android.database.sqlite.SQLiteException -> L2a
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 <= 0) goto L60
            int r10 = com.google.android.gms.measurement.internal.zzav.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r10 = r10 + 111
            int r11 = r10 % 128
            com.google.android.gms.measurement.internal.zzav.b = r11
            int r10 = r10 % r0
            if (r10 != 0) goto L5f
            r5 = r6
        L5f:
            return r5
        L60:
            return r6
        L61:
            com.google.android.gms.measurement.internal.zzic r11 = r9.zzu
            com.google.android.gms.measurement.internal.zzgu r11 = r11.zzaV()
            com.google.android.gms.measurement.internal.zzgs r11 = r11.zzb()
            java.lang.String r12 = "Error checking backfill conditions"
            r11.zzb(r12, r10)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzV(java.lang.String, long):boolean");
    }

    private final void zzaE(String str, String str2) {
        int i = 2 % 2;
        int i2 = b + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzaw();
        try {
            zze().delete(str, "app_id=?", new String[]{str2});
            int i4 = b + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzc("Error deleting snapshot. appId", zzgu.zzl(str2), e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.database.Cursor] */
    public final String zzF() throws Throwable {
        Throwable th;
        SQLiteException e2;
        Cursor cursorRawQuery;
        int i;
        String string;
        int i2 = 2 % 2;
        int i3 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        ?? Zze = zze();
        try {
            try {
                cursorRawQuery = Zze.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!(!cursorRawQuery.moveToFirst())) {
                        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
                        b = i5 % 128;
                        if (i5 % 2 == 0) {
                            string = cursorRawQuery.getString(1);
                            if (cursorRawQuery != null) {
                                int i6 = b + 7;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                                int i7 = i6 % 2;
                                cursorRawQuery.close();
                            }
                        } else {
                            string = cursorRawQuery.getString(0);
                            if (cursorRawQuery != null) {
                                int i8 = b + 7;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                                int i9 = i8 % 2;
                                cursorRawQuery.close();
                            }
                        }
                        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                        b = i10 % 128;
                        int i11 = i10 % 2;
                        return string;
                    }
                } catch (SQLiteException e3) {
                    e2 = e3;
                    this.zzu.zzaV().zzb().zzb("Database error getting next bundle app id", e2);
                }
            } catch (Throwable th2) {
                th = th2;
                if (Zze != 0) {
                    i = b + 53;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                    if (i % 2 != 0) {
                        Zze.close();
                        throw null;
                    }
                    Zze.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e2 = e4;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            Zze = 0;
            if (Zze != 0) {
                i = b + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                if (i % 2 != 0) {
                    Zze.close();
                    throw null;
                }
                Zze.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    private final String zzaA(String str, String[] strArr, String str2) {
        int i = 2 % 2;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zze().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    if (cursorRawQuery == null) {
                        return "";
                    }
                    cursorRawQuery.close();
                    int i2 = b + 99;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                    int i3 = i2 % 2;
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                if (cursorRawQuery != null) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        cursorRawQuery.close();
                        int i5 = 72 / 0;
                    } else {
                        cursorRawQuery.close();
                    }
                }
                return string;
            } catch (SQLiteException e2) {
                this.zzu.zzaV().zzb().zzc("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    static final void zzau(ContentValues contentValues, String str, Object obj) {
        int i = 2 % 2;
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            int i2 = b + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                contentValues.put("value", (String) obj);
                return;
            } else {
                contentValues.put("value", (String) obj);
                int i3 = 19 / 0;
                return;
            }
        }
        if (obj instanceof Long) {
            int i4 = b + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            contentValues.put("value", (Long) obj);
            return;
        }
        if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("Invalid value type");
        }
        contentValues.put("value", (Double) obj);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 90 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003a A[Catch: all -> 0x0022, SQLiteException -> 0x0024, PHI: r7
  0x003a: PHI (r7v5 android.database.Cursor) = (r7v4 android.database.Cursor), (r7v7 android.database.Cursor) binds: [B:20:0x0038, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:6:0x0018, B:21:0x003a, B:25:0x0044, B:26:0x0053, B:19:0x0034), top: B:34:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.database.Cursor] */
    private final long zzaz(String str, String[] strArr, long j) throws Throwable {
        int i;
        Cursor cursorRawQuery;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        b = i3 % 128;
        Object obj = null;
        try {
            try {
                try {
                    if (i3 % 2 == 0) {
                        cursorRawQuery = zze().rawQuery(str, strArr);
                        int i4 = 26 / 0;
                        if (cursorRawQuery.moveToFirst()) {
                            j = cursorRawQuery.getLong(0);
                        }
                    } else {
                        cursorRawQuery = zze().rawQuery(str, strArr);
                        if (cursorRawQuery.moveToFirst()) {
                            j = cursorRawQuery.getLong(0);
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return j;
                } catch (Throwable th) {
                    th = th;
                    if (strArr != 0) {
                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
                        b = i % 128;
                        if (i % 2 == 0) {
                            strArr.close();
                            obj.hashCode();
                            throw null;
                        }
                        strArr.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                this.zzu.zzaV().zzb().zzc("Database error", str, e);
                throw e;
            }
        } catch (SQLiteException e3) {
            e = e3;
            this.zzu.zzaV().zzb().zzc("Database error", str, e);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            strArr = 0;
            if (strArr != 0) {
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
                b = i % 128;
                if (i % 2 == 0) {
                    strArr.close();
                    obj.hashCode();
                    throw null;
                }
                strArr.close();
            }
            throw th;
        }
    }

    public final void zzH(long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        zzaw();
        try {
            if (zze().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) != 1) {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 25 / 0;
            }
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzb("Failed to delete a bundle in a queue table", e2);
            throw e2;
        }
    }

    public final void zzZ(String str, zzjl zzjlVar) {
        int i = 2 % 2;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjlVar);
        zzg();
        zzaw();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzjlVar.zzl());
        contentValues.put("consent_source", Integer.valueOf(zzjlVar.zzb()));
        zzaB("consent_settings", "app_id", contentValues);
        int i2 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void zzac(String str, zzjl zzjlVar) {
        int i = 2 % 2;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjlVar);
        zzg();
        zzaw();
        zzZ(str, zzX(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzjlVar.zzl());
        zzaB("consent_settings", "app_id", contentValues);
        int i2 = b + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final long zzay(String str, String[] strArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        b = i2 % 128;
        int i3 = i2 % 2;
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = zze().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j;
            } catch (SQLiteException e2) {
                this.zzu.zzaV().zzb().zzc("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
                b = i4 % 128;
                int i5 = i4 % 2;
            }
            throw th;
        }
    }

    final zzbc zzaf(String str, com.google.android.gms.internal.measurement.zzhs zzhsVar, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = b + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zzbc zzbcVarZzaC = zzaC("events", str, zzhsVar.zzd());
        if (zzbcVarZzaC == null) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaV().zze().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzgu.zzl(str), zzicVar.zzl().zza(str2));
            return new zzbc(str, zzhsVar.zzd(), 1L, 1L, 1L, zzhsVar.zzf(), 0L, null, null, null, null);
        }
        long j = zzbcVarZzaC.zze;
        long j2 = zzbcVarZzaC.zzd;
        zzbc zzbcVar = new zzbc(zzbcVarZzaC.zza, zzbcVarZzaC.zzb, zzbcVarZzaC.zzc + 1, j2 + 1, j + 1, zzbcVarZzaC.zzf, zzbcVarZzaC.zzg, zzbcVarZzaC.zzh, zzbcVarZzaC.zzi, zzbcVarZzaC.zzj, zzbcVarZzaC.zzk);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return zzbcVar;
        }
        throw null;
    }

    public final void zzab(String str, zzaz zzazVar) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(zzazVar);
            zzg();
            zzaw();
            zzX(str);
            zzjl zzjlVar = zzjl.zza;
            throw null;
        }
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzazVar);
        zzg();
        zzaw();
        zzjl zzjlVarZzX = zzX(str);
        zzjl zzjlVar2 = zzjl.zza;
        if (zzjlVarZzX == zzjlVar2) {
            int i3 = b + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            zzZ(str, zzjlVar2);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzazVar.zze());
        zzaB("consent_settings", "app_id", contentValues);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void zzE(Long l) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        zzaw();
        Preconditions.checkNotNull(l);
        try {
            if (zze().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                int i4 = b + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
                this.zzu.zzaV().zze().zza("Deleted fewer rows from upload_queue than expected");
            }
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
            b = i6 % 128;
            int i7 = i6 % 2;
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzb("Failed to delete a MeasurementBatch in a upload_queue table", e2);
            throw e2;
        }
    }

    private final void zzaB(String str, String str2, ContentValues contentValues) {
        int i = 2 % 2;
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                this.zzu.zzaV().zzd().zzb("Value of the primary key is not set.", zzgu.zzl("app_id"));
                int i2 = b + 45;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 11 / 0;
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            long jUpdate = sQLiteDatabaseZze.update("consent_settings", contentValues, sb.toString(), new String[]{asString});
            Object obj = null;
            if (jUpdate == 0) {
                int i4 = b + 87;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
                if (sQLiteDatabaseZze.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
                    b = i6 % 128;
                    if (i6 % 2 == 0) {
                        this.zzu.zzaV().zzb().zzc("Failed to insert/update table (got -1). key", zzgu.zzl("consent_settings"), zzgu.zzl("app_id"));
                        try {
                            obj.hashCode();
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    this.zzu.zzaV().zzb().zzc("Failed to insert/update table (got -1). key", zzgu.zzl("consent_settings"), zzgu.zzl("app_id"));
                }
            }
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
            b = i7 % 128;
            if (i7 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzd("Error storing into table. key", zzgu.zzl("consent_settings"), zzgu.zzl("app_id"), e2);
        }
    }

    private final String zzaG() throws IllegalAccessException {
        int i = 2 % 2;
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzaZ().currentTimeMillis();
        Locale locale = Locale.US;
        zzls zzlsVar = zzls.GOOGLE_SIGNAL;
        int iZza = zzlsVar.zza();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        zzicVar.zzc();
        String str = String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", Integer.valueOf(iZza), lValueOf, Long.valueOf(((Long) zzfy.zzS.zzb(null)).longValue()));
        Locale locale2 = Locale.US;
        int iZza2 = zzlsVar.zza();
        zzicVar.zzc();
        String str2 = String.format(locale2, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", Integer.valueOf(iZza2), lValueOf, Long.valueOf(zzal.zzI()));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length() + 1);
        sb.append("(");
        sb.append(str);
        sb.append(" OR ");
        sb.append(str2);
        sb.append(")");
        String string = sb.toString();
        int i2 = b + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
        return string;
    }

    final void zzJ(List list) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            zzg();
            zzaw();
            Preconditions.checkNotNull(list);
            Preconditions.checkNotZero(list.size());
            zzag();
            obj.hashCode();
            throw null;
        }
        zzg();
        zzaw();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzag()) {
            String strJoin = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 80);
            sb2.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb2.append(string);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zzay(sb2.toString(), null) > 0) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                b = i3 % 128;
                int i4 = i3 % 2;
                this.zzu.zzaV().zze().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
                b = i5 % 128;
                int i6 = i5 % 2;
            }
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                StringBuilder sb3 = new StringBuilder(string.length() + 127);
                sb3.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb3.append(string);
                sb3.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseZze.execSQL(sb3.toString());
            } catch (SQLiteException e2) {
                this.zzu.zzaV().zzb().zzb("Error incrementing retry count. error", e2);
            }
        }
    }

    final void zzK(Long l) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        zzaw();
        Preconditions.checkNotNull(l);
        if (zzag()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zzay(sb.toString(), null) > 0) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                b = i4 % 128;
                int i5 = i4 % 2;
                this.zzu.zzaV().zze().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                long jCurrentTimeMillis = this.zzu.zzaZ().currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseZze.execSQL(sb3.toString());
            } catch (SQLiteException e2) {
                this.zzu.zzaV().zzb().zzb("Error incrementing retry count. error", e2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final zzjl zzX(String str) throws Throwable {
        SQLiteException e2;
        Cursor cursorRawQuery;
        zzjl zzjlVarZzf;
        zzjl zzjlVar;
        int i;
        int i2 = 2 % 2;
        Preconditions.checkNotNull(str);
        zzg();
        zzaw();
        String[] strArr = {str};
        ?? r1 = 0;
        ?? r2 = 0;
        try {
            try {
                cursorRawQuery = zze().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", strArr);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        zzjlVarZzf = zzjl.zzf(cursorRawQuery.getString(0), cursorRawQuery.getInt(1));
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    } else {
                        int i3 = b + 35;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                        int i4 = i3 % 2;
                        this.zzu.zzaV().zzk().zza("No data found");
                        if (cursorRawQuery != null) {
                            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
                            b = i5 % 128;
                            int i6 = i5 % 2;
                            zzjlVarZzf = null;
                            cursorRawQuery.close();
                        } else {
                            zzjlVarZzf = null;
                        }
                    }
                } catch (SQLiteException e3) {
                    e2 = e3;
                    this.zzu.zzaV().zzb().zzb("Error querying database.", e2);
                    if (cursorRawQuery == null) {
                        zzjlVarZzf = null;
                    }
                    if (zzjlVarZzf == null) {
                        return zzjlVarZzf;
                    }
                    zzjlVar = zzjl.zza;
                    i = b + 59;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                    if (i % 2 == 0) {
                        return zzjlVar;
                    }
                    (r2 == true ? 1 : 0).hashCode();
                    throw null;
                }
            } catch (Throwable th) {
                r1 = strArr;
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e2 = e4;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
        if (zzjlVarZzf == null) {
            return zzjlVarZzf;
        }
        zzjlVar = zzjl.zza;
        i = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 == 0) {
            return zzjlVar;
        }
        (r2 == true ? 1 : 0).hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0097: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:31:0x0097 */
    public final Bundle zzU(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        int i = 2 % 2;
        zzg();
        zzaw();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = zze().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            com.google.android.gms.internal.measurement.zzhs zzhsVar = (com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursorRawQuery.getBlob(0))).zzbc();
                            this.zzg.zzp();
                            Bundle bundleZzE = zzpk.zzE(zzhsVar.zza());
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            return bundleZzE;
                        } catch (IOException e2) {
                            this.zzu.zzaV().zzb().zzc("Failed to retrieve default event parameters. appId", zzgu.zzl(str), e2);
                        }
                    } else {
                        this.zzu.zzaV().zzk().zza("Default event parameters not found");
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    this.zzu.zzaV().zzb().zzb("Error selecting default event parameters", e);
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    int i2 = b + 117;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                    int i3 = i2 % 2;
                    cursor2.close();
                    int i4 = b + 5;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                    int i5 = i4 % 2;
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                int i6 = b + 117;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                int i7 = i6 % 2;
                cursor2.close();
                int i8 = b + 5;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                int i9 = i8 % 2;
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            int i10 = b + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
            if (i10 % 2 != 0) {
                cursorRawQuery.close();
                throw null;
            }
            cursorRawQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0103  */
    public final zzpj zzB(long j) throws Throwable {
        Cursor cursorQuery;
        int i = 2 % 2;
        int i2 = b + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        zzaw();
        try {
            cursorQuery = zze().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j)}, null, null, null, "1");
            try {
                if (cursorQuery.moveToFirst()) {
                    zzpj zzpjVarZzaF = zzaF((String) Preconditions.checkNotNull(cursorQuery.getString(1)), j, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                    if (cursorQuery != null) {
                        int i4 = b + 65;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                        int i5 = i4 % 2;
                        cursorQuery.close();
                    }
                    return zzpjVarZzaF;
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    this.zzu.zzaV().zzb().zzc("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j), e);
                } catch (Throwable th) {
                    th = th;
                    if (cursorQuery != null) {
                        int i6 = b + 35;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                        int i7 = i6 % 2;
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursorQuery != null) {
                    int i8 = b + 35;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                    int i9 = i8 % 2;
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
        if (cursorQuery == null) {
            return null;
        }
        int i10 = b + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
        if (i10 % 2 == 0) {
            cursorQuery.close();
            return null;
        }
        cursorQuery.close();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final void zzI() {
        int i = 2 % 2;
        zzg();
        zzaw();
        if (!zzag()) {
            int i2 = b + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        zzpg zzpgVar = this.zzg;
        long jZza = zzpgVar.zzq().zza.zza();
        zzic zzicVar = this.zzu;
        long jElapsedRealtime = zzicVar.zzaZ().elapsedRealtime();
        long jAbs = Math.abs(jElapsedRealtime - jZza);
        zzicVar.zzc();
        if (jAbs > zzal.zzJ()) {
            zzpgVar.zzq().zza.zzb(jElapsedRealtime);
            zzg();
            zzaw();
            if (zzag()) {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                String strValueOf = String.valueOf(zzicVar.zzaZ().currentTimeMillis());
                zzicVar.zzc();
                int iDelete = sQLiteDatabaseZze.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(zzal.zzI())});
                if (iDelete > 0) {
                    int i4 = b + 119;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        zzicVar.zzaV().zzk().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                        return;
                    }
                    zzicVar.zzaV().zzk().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x008f  */
    private final void zzaD(String str, zzbc zzbcVar) {
        Long l;
        int i = 2 % 2;
        Preconditions.checkNotNull(zzbcVar);
        zzg();
        zzaw();
        ContentValues contentValues = new ContentValues();
        String str2 = zzbcVar.zza;
        contentValues.put("app_id", str2);
        contentValues.put("name", zzbcVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzbcVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzbcVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbcVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbcVar.zzg));
        contentValues.put("last_bundled_day", zzbcVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzbcVar.zzi);
        contentValues.put("last_sampling_rate", zzbcVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzbcVar.zze));
        Boolean bool = zzbcVar.zzk;
        Object obj = null;
        if (bool != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                bool.booleanValue();
                obj.hashCode();
                throw null;
            }
            if (bool.booleanValue()) {
                l = 1L;
            } else {
                l = null;
            }
        } else {
            l = null;
        }
        contentValues.put("last_exempt_from_sampling", l);
        try {
            if (zze().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.zzu.zzaV().zzb().zzb("Failed to insert/update event aggregates (got -1). appId", zzgu.zzl(str2));
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
                b = i3 % 128;
                int i4 = i3 % 2;
            }
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzc("Error storing event aggregates. appId", zzgu.zzl(zzbcVar.zza), e2);
        }
    }

    public final boolean zzT(String str, Long l, long j, com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        int i = 2 % 2;
        zzg();
        zzaw();
        Preconditions.checkNotNull(zzhsVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        zzic zzicVar = this.zzu;
        byte[] bArrZzcc = zzhsVar.zzcc();
        zzicVar.zzaV().zzk().zzc("Saving complex main event, appId, data size", zzicVar.zzl().zza(str), Integer.valueOf(bArrZzcc.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrZzcc);
        try {
            if (zze().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
                b = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
            b = i4 % 128;
            int i5 = i4 % 2;
            zzicVar.zzaV().zzb().zzb("Failed to insert complex main event (got -1). appId", zzgu.zzl(str));
            return false;
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzc("Error storing complex main event. appId", zzgu.zzl(str), e2);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x015d  */
    public final List zzC(String str, zzoo zzooVar, int i) throws Throwable {
        Cursor cursorQuery;
        List listEmptyList;
        int i2 = 2 % 2;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzaw();
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id", "last_upload_timestamp"};
            String strZzaH = zzaH(zzooVar.zza);
            String strZzaG = zzaG();
            StringBuilder sb = new StringBuilder(String.valueOf(strZzaH).length() + 17 + strZzaG.length());
            sb.append("app_id=?");
            sb.append(strZzaH);
            sb.append(" AND NOT ");
            sb.append(strZzaG);
            cursorQuery = sQLiteDatabaseZze.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
            try {
                listEmptyList = new ArrayList();
                while (!(!cursorQuery.moveToNext())) {
                    int i3 = b + 107;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                    int i4 = i3 % 2;
                    zzpj zzpjVarZzaF = zzaF(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                    if (zzpjVarZzaF != null) {
                        int i5 = b + 65;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                        if (i5 % 2 != 0) {
                            listEmptyList.add(zzpjVarZzaF);
                            int i6 = 63 / 0;
                        } else {
                            listEmptyList.add(zzpjVarZzaF);
                        }
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    this.zzu.zzaV().zzb().zzc("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                    listEmptyList = Collections.emptyList();
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
                    b = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 2 % 4;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                int i9 = b + 17;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                int i10 = i9 % 2;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
        if (cursorQuery != null) {
            int i11 = b + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
            if (i11 % 2 != 0) {
                cursorQuery.close();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            cursorQuery.close();
        }
        return listEmptyList;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0095  */
    /* JADX WARN: Code duplicated, block: B:16:0x00a2 A[Catch: SQLiteException -> 0x00da, all -> 0x00dd, TRY_ENTER, TryCatch #0 {SQLiteException -> 0x00da, blocks: (B:11:0x0074, B:16:0x00a2, B:18:0x00b6, B:20:0x00c8), top: B:36:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x00b6 A[Catch: SQLiteException -> 0x00da, all -> 0x00dd, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00da, blocks: (B:11:0x0074, B:16:0x00a2, B:18:0x00b6, B:20:0x00c8), top: B:36:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00c8 A[Catch: SQLiteException -> 0x00da, all -> 0x00dd, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00da, blocks: (B:11:0x0074, B:16:0x00a2, B:18:0x00b6, B:20:0x00c8), top: B:36:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00d6  */
    protected final long zzN(String str, String str2) {
        long j;
        ContentValues contentValues;
        int i;
        int i2;
        int i3 = 2 % 2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzaw();
        SQLiteDatabase sQLiteDatabaseZze = zze();
        sQLiteDatabaseZze.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                long jZzaz = zzaz(sb.toString(), new String[]{str}, -1L);
                if (jZzaz == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseZze.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.zzu.zzaV().zzb().zzc("Failed to insert column (got -1). appId", zzgu.zzl(str), "first_open_count");
                    } else {
                        jZzaz = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jZzaz));
                            if (sQLiteDatabaseZze.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                                b = i2 % 128;
                                if (i2 % 2 != 0) {
                                    this.zzu.zzaV().zzb().zzc("Failed to update column (got 0). appId", zzgu.zzl(str), "first_open_count");
                                    throw null;
                                }
                                this.zzu.zzaV().zzb().zzc("Failed to update column (got 0). appId", zzgu.zzl(str), "first_open_count");
                            } else {
                                sQLiteDatabaseZze.setTransactionSuccessful();
                                i = b + 49;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                                if (i % 2 != 0) {
                                    int i4 = 5 / 3;
                                }
                                j = jZzaz;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            j2 = jZzaz;
                            this.zzu.zzaV().zzb().zzd("Error inserting column. appId", zzgu.zzl(str), "first_open_count", e);
                            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
                            b = i5 % 128;
                            int i6 = i5 % 2;
                            j = j2;
                        }
                    }
                    j = -1;
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jZzaz));
                    if (sQLiteDatabaseZze.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                        b = i2 % 128;
                        if (i2 % 2 != 0) {
                            this.zzu.zzaV().zzb().zzc("Failed to update column (got 0). appId", zzgu.zzl(str), "first_open_count");
                            throw null;
                        }
                        this.zzu.zzaV().zzb().zzc("Failed to update column (got 0). appId", zzgu.zzl(str), "first_open_count");
                        j = -1;
                    } else {
                        sQLiteDatabaseZze.setTransactionSuccessful();
                        i = b + 49;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                        if (i % 2 != 0) {
                            int i7 = 5 / 3;
                        }
                        j = jZzaz;
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
            }
            sQLiteDatabaseZze.endTransaction();
            return j;
        } catch (Throwable th) {
            sQLiteDatabaseZze.endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0046  */
    public final boolean zzY(String str, zzoh zzohVar) {
        int i = 2 % 2;
        zzg();
        zzaw();
        Preconditions.checkNotNull(zzohVar);
        Preconditions.checkNotEmpty(str);
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzaZ().currentTimeMillis();
        zzfx zzfxVar = zzfy.zzav;
        long jLongValue = ((Long) zzfxVar.zzb(null)).longValue();
        long j = zzohVar.zzb;
        if (j >= jCurrentTimeMillis - jLongValue) {
            int i2 = b + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            if (j > ((Long) zzfxVar.zzb(null)).longValue() + jCurrentTimeMillis) {
                zzicVar.zzaV().zze().zzd("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgu.zzl(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
                b = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            zzicVar.zzaV().zze().zzd("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgu.zzl(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        zzicVar.zzaV().zzk().zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzohVar.zza);
        contentValues.put("source", Integer.valueOf(zzohVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (zze().insert("trigger_uris", null, contentValues) == -1) {
                zzicVar.zzaV().zzb().zzb("Failed to insert trigger URI (got -1). appId", zzgu.zzl(str));
                return false;
            }
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 93 / 0;
            }
            return true;
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzc("Error storing trigger URI. appId", zzgu.zzl(str), e2);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x015d  */
    private final zzbc zzaC(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        Long lValueOf;
        Boolean boolValueOf;
        int i = 2 % 2;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        zzg();
        zzaw();
        Cursor cursor = null;
        try {
            boolean z = false;
            cursorQuery = zze().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(1);
                        long j3 = cursorQuery.getLong(2);
                        long j4 = 0;
                        long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf2 = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        if (cursorQuery.isNull(5)) {
                            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
                            b = i2 % 128;
                            int i3 = i2 % 2;
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(cursorQuery.getLong(5));
                        }
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            int i4 = b + 43;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                            int i5 = i4 % 2;
                            boolValueOf = null;
                        } else {
                            if (cursorQuery.getLong(7) == 1) {
                                int i6 = b + 43;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                                int i7 = i6 % 2;
                                z = true;
                            }
                            boolValueOf = Boolean.valueOf(z);
                        }
                        if (!cursorQuery.isNull(8)) {
                            j4 = cursorQuery.getLong(8);
                        }
                        zzbc zzbcVar = new zzbc(str2, str3, j, j2, j4, j3, j5, lValueOf2, lValueOf, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            int i8 = b + 79;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                            int i9 = i8 % 2;
                            this.zzu.zzaV().zzb().zzb("Got multiple records for event aggregates, expected one. appId", zzgu.zzl(str2));
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return zzbcVar;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzic zzicVar = this.zzu;
                    zzicVar.zzaV().zzb().zzd("Error querying events. appId", zzgu.zzl(str2), zzicVar.zzl().zza(str3), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    int i10 = b + 89;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                    int i11 = i10 % 2;
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                int i12 = b + 89;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
                int i13 = i12 % 2;
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            int i14 = b + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
            int i15 = i14 % 2;
            cursorQuery.close();
        }
        return null;
    }

    private final zzpj zzaF(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        int i3 = 2 % 2;
        if (TextUtils.isEmpty(str2)) {
            this.zzu.zzaV().zzj().zza("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzpk.zzw(com.google.android.gms.internal.measurement.zzib.zzh(), bArr);
            zzls zzlsVarZzb = zzls.zzb(i);
            if (zzlsVarZzb != zzls.GOOGLE_SIGNAL) {
                int i4 = b + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
                if (zzlsVarZzb != zzls.GOOGLE_SIGNAL_PENDING && i2 > 0) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = zzhzVar.zza().iterator();
                    while (!(!it.hasNext())) {
                        int i6 = b + 51;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                        if (i6 % 2 != 0) {
                            com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) it.next()).zzcl();
                            zzicVar.zzao(i2);
                            arrayList.add((com.google.android.gms.internal.measurement.zzid) zzicVar.zzbc());
                            int i7 = 55 / 0;
                        } else {
                            com.google.android.gms.internal.measurement.zzic zzicVar2 = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) it.next()).zzcl();
                            zzicVar2.zzao(i2);
                            arrayList.add((com.google.android.gms.internal.measurement.zzid) zzicVar2.zzbc());
                        }
                    }
                    zzhzVar.zzg();
                    zzhzVar.zzf(arrayList);
                }
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        int i8 = b + 65;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                        if (i8 % 2 == 0) {
                            this.zzu.zzaV().zzb().zzb("Invalid upload header: ", str4);
                            break;
                        }
                        this.zzu.zzaV().zzb().zzb("Invalid upload header: ", str4);
                        throw null;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            zzpi zzpiVar = new zzpi();
            zzpiVar.zzb(j);
            zzpiVar.zzc((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc());
            zzpiVar.zzd(str2);
            zzpiVar.zze(map);
            zzpiVar.zzf(zzlsVarZzb);
            zzpiVar.zzg(j2);
            zzpiVar.zzh(j3);
            zzpiVar.zzi(j4);
            zzpiVar.zzj(i2);
            zzpj zzpjVarZza = zzpiVar.zza();
            int i9 = b + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
            int i10 = i9 % 2;
            return zzpjVarZza;
        } catch (IOException e2) {
            this.zzu.zzaV().zzb().zzc("Failed to queued MeasurementBatch from upload_queue. appId", str, e2);
            return null;
        }
    }

    public final long zzA(String str, com.google.android.gms.internal.measurement.zzib zzibVar, String str2, Map map, zzls zzlsVar, Long l) {
        int iDelete;
        int i = 2 % 2;
        zzg();
        zzaw();
        Preconditions.checkNotNull(zzibVar);
        Preconditions.checkNotEmpty(str);
        zzg();
        zzaw();
        Object obj = null;
        if (zzag()) {
            zzpg zzpgVar = this.zzg;
            long jZza = zzpgVar.zzq().zzb.zza();
            zzic zzicVar = this.zzu;
            long jElapsedRealtime = zzicVar.zzaZ().elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - jZza);
            zzicVar.zzc();
            if (jAbs > zzal.zzJ()) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    zzpgVar.zzq().zzb.zzb(jElapsedRealtime);
                    zzg();
                    zzaw();
                    zzag();
                    obj.hashCode();
                    throw null;
                }
                zzpgVar.zzq().zzb.zzb(jElapsedRealtime);
                zzg();
                zzaw();
                if (zzag() && (iDelete = zze().delete("upload_queue", zzaG(), new String[0])) > 0) {
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
                    b = i3 % 128;
                    int i4 = i3 % 2;
                    zzicVar.zzaV().zzk().zzb("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
                Preconditions.checkNotEmpty(str);
                zzg();
                zzaw();
                try {
                    int iZzm = zzicVar.zzc().zzm(str, zzfy.zzz);
                    if (iZzm > 0) {
                        zze().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iZzm)});
                    }
                } catch (SQLiteException e2) {
                    this.zzu.zzaV().zzb().zzc("Error deleting over the limit queued batches. appId", zzgu.zzl(str), e2);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrZzcc = zzibVar.zzcc();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrZzcc);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", UByte$$ExternalSyntheticBackport0.m((CharSequence) "\r\n", (Iterable) arrayList));
        contentValues.put("upload_type", Integer.valueOf(zzlsVar.zza()));
        zzic zzicVar2 = this.zzu;
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzicVar2.zzaZ().currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long jInsert = zze().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            zzicVar2.zzaV().zzb().zzb("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (SQLiteException e3) {
            this.zzu.zzaV().zzb().zzc("Error storing MeasurementBatch to upload_queue. appId", str, e3);
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025e A[Catch: all -> 0x02bd, SQLiteException -> 0x02c1, LOOP:0: B:101:0x025e->B:181:?, LOOP_START, TRY_LEAVE, TryCatch #17 {SQLiteException -> 0x02c1, all -> 0x02bd, blocks: (B:99:0x0258, B:101:0x025e, B:102:0x0266, B:104:0x0271, B:109:0x02a2, B:108:0x028e, B:112:0x02aa), top: B:178:0x0258 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02a2 A[Catch: all -> 0x02bd, SQLiteException -> 0x02c1, TryCatch #17 {SQLiteException -> 0x02c1, all -> 0x02bd, blocks: (B:99:0x0258, B:101:0x025e, B:102:0x0266, B:104:0x0271, B:109:0x02a2, B:108:0x028e, B:112:0x02aa), top: B:178:0x0258 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x02aa A[Catch: all -> 0x02bd, SQLiteException -> 0x02c1, TRY_LEAVE, TryCatch #17 {SQLiteException -> 0x02c1, all -> 0x02bd, blocks: (B:99:0x0258, B:101:0x025e, B:102:0x0266, B:104:0x0271, B:109:0x02a2, B:108:0x028e, B:112:0x02aa), top: B:178:0x0258 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0339  */
    /* JADX WARN: Code duplicated, block: B:158:0x0341  */
    /* JADX WARN: Code duplicated, block: B:179:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:? A[LOOP:0: B:101:0x025e->B:181:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x011c A[Catch: all -> 0x02eb, SQLiteException -> 0x02f0, TryCatch #4 {all -> 0x02eb, blocks: (B:44:0x0116, B:46:0x011c, B:47:0x0132, B:48:0x0136, B:49:0x0146, B:51:0x014c, B:52:0x015f, B:56:0x0179, B:70:0x01b2, B:80:0x01d3, B:71:0x01ba, B:61:0x0193, B:89:0x0201, B:90:0x0210, B:92:0x0221), top: B:162:0x0116 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0132 A[Catch: all -> 0x02eb, SQLiteException -> 0x02f0, TRY_LEAVE, TryCatch #4 {all -> 0x02eb, blocks: (B:44:0x0116, B:46:0x011c, B:47:0x0132, B:48:0x0136, B:49:0x0146, B:51:0x014c, B:52:0x015f, B:56:0x0179, B:70:0x01b2, B:80:0x01d3, B:71:0x01ba, B:61:0x0193, B:89:0x0201, B:90:0x0210, B:92:0x0221), top: B:162:0x0116 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x014c A[Catch: all -> 0x02eb, SQLiteException -> 0x02f0, TryCatch #4 {all -> 0x02eb, blocks: (B:44:0x0116, B:46:0x011c, B:47:0x0132, B:48:0x0136, B:49:0x0146, B:51:0x014c, B:52:0x015f, B:56:0x0179, B:70:0x01b2, B:80:0x01d3, B:71:0x01ba, B:61:0x0193, B:89:0x0201, B:90:0x0210, B:92:0x0221), top: B:162:0x0116 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0177  */
    /* JADX WARN: Code duplicated, block: B:58:0x018b  */
    /* JADX WARN: Code duplicated, block: B:60:0x018f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0193 A[Catch: SQLiteException -> 0x01e4, all -> 0x02eb, TRY_LEAVE, TryCatch #4 {all -> 0x02eb, blocks: (B:44:0x0116, B:46:0x011c, B:47:0x0132, B:48:0x0136, B:49:0x0146, B:51:0x014c, B:52:0x015f, B:56:0x0179, B:70:0x01b2, B:80:0x01d3, B:71:0x01ba, B:61:0x0193, B:89:0x0201, B:90:0x0210, B:92:0x0221), top: B:162:0x0116 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x019b  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x0200  */
    /* JADX WARN: Code duplicated, block: B:90:0x0210 A[Catch: SQLiteException -> 0x01e4, all -> 0x02eb, TryCatch #4 {all -> 0x02eb, blocks: (B:44:0x0116, B:46:0x011c, B:47:0x0132, B:48:0x0136, B:49:0x0146, B:51:0x014c, B:52:0x015f, B:56:0x0179, B:70:0x01b2, B:80:0x01d3, B:71:0x01ba, B:61:0x0193, B:89:0x0201, B:90:0x0210, B:92:0x0221), top: B:162:0x0116 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0221 A[Catch: SQLiteException -> 0x01e4, all -> 0x02eb, TRY_LEAVE, TryCatch #4 {all -> 0x02eb, blocks: (B:44:0x0116, B:46:0x011c, B:47:0x0132, B:48:0x0136, B:49:0x0146, B:51:0x014c, B:52:0x015f, B:56:0x0179, B:70:0x01b2, B:80:0x01d3, B:71:0x01ba, B:61:0x0193, B:89:0x0201, B:90:0x0210, B:92:0x0221), top: B:162:0x0116 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final void zzat(String str, long j, long j2, zzpc zzpcVar) throws Throwable {
        String str2;
        ?? r16;
        String str3;
        ?? r5;
        String str4;
        ?? RawQuery;
        Cursor cursorRawQuery;
        String string;
        String str5;
        String str6;
        String str7;
        Cursor cursorQuery;
        zzic zzicVar;
        String str8;
        String[] strArr;
        int i;
        String[] strArr2;
        String str9;
        String[] strArr3;
        String str10;
        zzic zzicVar2;
        Cursor cursorQuery2;
        long j3;
        com.google.android.gms.internal.measurement.zzhr zzhrVar;
        long jZzaz;
        long j4;
        int i2;
        String[] strArr4;
        int i3 = 2 % 2;
        Preconditions.checkNotNull(zzpcVar);
        zzg();
        zzaw();
        ?? r4 = 0;
        ?? r6 = 0;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                ?? IsEmpty = TextUtils.isEmpty(str);
                String str11 = "";
                try {
                    try {
                        if (IsEmpty != 0) {
                            if (j2 != -1) {
                                int i4 = b + 5;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                                int i5 = i4 % 2;
                                strArr4 = new String[]{String.valueOf(j2), String.valueOf(j)};
                            } else {
                                strArr4 = new String[]{String.valueOf(j)};
                            }
                            if (j2 != -1) {
                                int i6 = b + 93;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                                int i7 = i6 % 2;
                                str11 = "rowid <= ? and ";
                            }
                            StringBuilder sb = new StringBuilder(str11.length() + 148);
                            sb.append("select app_id, metadata_fingerprint from raw_events where ");
                            sb.append(str11);
                            sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                            RawQuery = sQLiteDatabaseZze.rawQuery(sb.toString(), strArr4);
                            if (RawQuery.moveToFirst()) {
                                String string2 = RawQuery.getString(0);
                                try {
                                    string = RawQuery.getString(1);
                                    RawQuery.close();
                                    r16 = RawQuery;
                                    str5 = string2;
                                    IsEmpty = RawQuery;
                                    String str12 = string;
                                    try {
                                        try {
                                            str4 = null;
                                            str6 = str12;
                                            str7 = str5;
                                            try {
                                                cursorQuery = sQLiteDatabaseZze.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str5, str12}, null, null, "rowid", ExifInterface.GPS_MEASUREMENT_2D);
                                                try {
                                                    try {
                                                        if (cursorQuery.moveToFirst()) {
                                                            try {
                                                                try {
                                                                    com.google.android.gms.internal.measurement.zzid zzidVar = (com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) zzpk.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), cursorQuery.getBlob(0))).zzbc();
                                                                    if (cursorQuery.moveToNext()) {
                                                                        this.zzu.zzaV().zze().zzb("Get multiple raw event metadata records, expected one. appId", zzgu.zzl(str7));
                                                                    }
                                                                    cursorQuery.close();
                                                                    Preconditions.checkNotNull(zzidVar);
                                                                    zzpcVar.zza = zzidVar;
                                                                    zzicVar = this.zzu;
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (zzicVar.zzc().zzp(null, zzfy.zzbk)) {
                                                                                    str8 = str7;
                                                                                    jZzaz = zzaz("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{str8, str6}, -1L);
                                                                                    if (j2 == -1) {
                                                                                        j4 = j2;
                                                                                    } else if (jZzaz != -1) {
                                                                                        j4 = -1;
                                                                                    } else {
                                                                                        strArr = new String[]{str8, str6};
                                                                                        zzicVar = zzicVar;
                                                                                    }
                                                                                    if (j4 == -1 && jZzaz != -1) {
                                                                                        int i8 = b + 85;
                                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                                                                                        if (i8 % 2 != 0) {
                                                                                            jZzaz = Math.min(j4, jZzaz);
                                                                                            int i9 = 14 / 0;
                                                                                        } else {
                                                                                            jZzaz = Math.min(j4, jZzaz);
                                                                                        }
                                                                                    } else if (j4 != -1) {
                                                                                        i2 = b + 43;
                                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                                                                                        if (i2 % 2 != 0) {
                                                                                            r4.hashCode();
                                                                                            throw null;
                                                                                        }
                                                                                        jZzaz = j4;
                                                                                    }
                                                                                    String[] strArr5 = {str8, str6, String.valueOf(jZzaz)};
                                                                                    str10 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                                                                    strArr3 = strArr5;
                                                                                    str2 = str8;
                                                                                    zzicVar2 = zzicVar;
                                                                                    cursorQuery2 = sQLiteDatabaseZze.query("raw_events", new String[]{"rowid", "name", "timestamp", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, str10, strArr3, null, null, "rowid", null);
                                                                                    if (cursorQuery2.moveToFirst()) {
                                                                                        while (true) {
                                                                                            j3 = cursorQuery2.getLong(0);
                                                                                            try {
                                                                                                zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursorQuery2.getBlob(3));
                                                                                                zzhrVar.zzl(cursorQuery2.getString(1));
                                                                                                zzhrVar.zzo(cursorQuery2.getLong(2));
                                                                                                if (!zzpcVar.zza(j3, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc())) {
                                                                                                    r5 = cursorQuery2;
                                                                                                    break;
                                                                                                } else if (!cursorQuery2.moveToNext()) {
                                                                                                    r5 = cursorQuery2;
                                                                                                    break;
                                                                                                }
                                                                                            } catch (IOException e2) {
                                                                                                this.zzu.zzaV().zzb().zzc("Data loss. Failed to merge raw event. appId", zzgu.zzl(str2), e2);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        zzicVar2.zzaV().zze().zzb("Raw event data disappeared while in transaction. appId", zzgu.zzl(str2));
                                                                                    }
                                                                                } else {
                                                                                    str8 = str7;
                                                                                    zzicVar = zzicVar;
                                                                                    if (j2 != -1) {
                                                                                        i = b + 69;
                                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                                                                                        if (i % 2 != 0) {
                                                                                            strArr2 = new String[4];
                                                                                            strArr2[0] = str8;
                                                                                            strArr2[1] = str6;
                                                                                            strArr2[5] = String.valueOf(j2);
                                                                                        } else {
                                                                                            strArr2 = new String[]{str8, str6, String.valueOf(j2)};
                                                                                        }
                                                                                        str9 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                                                                    } else {
                                                                                        strArr = new String[]{str8, str6};
                                                                                    }
                                                                                    strArr3 = strArr2;
                                                                                    str10 = str9;
                                                                                    str2 = str8;
                                                                                    zzicVar2 = zzicVar;
                                                                                    cursorQuery2 = sQLiteDatabaseZze.query("raw_events", new String[]{"rowid", "name", "timestamp", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, str10, strArr3, null, null, "rowid", null);
                                                                                    if (cursorQuery2.moveToFirst()) {
                                                                                        while (true) {
                                                                                            j3 = cursorQuery2.getLong(0);
                                                                                            zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursorQuery2.getBlob(3));
                                                                                            zzhrVar.zzl(cursorQuery2.getString(1));
                                                                                            zzhrVar.zzo(cursorQuery2.getLong(2));
                                                                                            if (!zzpcVar.zza(j3, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc())) {
                                                                                                r5 = cursorQuery2;
                                                                                                break;
                                                                                            } else if (!cursorQuery2.moveToNext()) {
                                                                                                r5 = cursorQuery2;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        zzicVar2.zzaV().zze().zzb("Raw event data disappeared while in transaction. appId", zzgu.zzl(str2));
                                                                                    }
                                                                                }
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    while (true) {
                                                                                        j3 = cursorQuery2.getLong(0);
                                                                                        zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursorQuery2.getBlob(3));
                                                                                        zzhrVar.zzl(cursorQuery2.getString(1));
                                                                                        zzhrVar.zzo(cursorQuery2.getLong(2));
                                                                                        if (!zzpcVar.zza(j3, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc())) {
                                                                                            r5 = cursorQuery2;
                                                                                            break;
                                                                                        } else if (!cursorQuery2.moveToNext()) {
                                                                                            r5 = cursorQuery2;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    zzicVar2.zzaV().zze().zzb("Raw event data disappeared while in transaction. appId", zzgu.zzl(str2));
                                                                                }
                                                                            } catch (SQLiteException e3) {
                                                                                e = e3;
                                                                                r6 = cursorQuery2;
                                                                                str3 = str2;
                                                                                r4 = r6;
                                                                                this.zzu.zzaV().zzb().zzc("Data loss. Error selecting raw event. appId", zzgu.zzl(str3), e);
                                                                                r5 = r4;
                                                                            } catch (Throwable th) {
                                                                                th = th;
                                                                                r4 = cursorQuery2;
                                                                                r16 = r4;
                                                                                if (r16 != 0) {
                                                                                    r16.close();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                            str2 = str8;
                                                                            zzicVar2 = zzicVar;
                                                                            cursorQuery2 = sQLiteDatabaseZze.query("raw_events", new String[]{"rowid", "name", "timestamp", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, str10, strArr3, null, null, "rowid", null);
                                                                        } catch (SQLiteException e4) {
                                                                            e = e4;
                                                                            str4 = str8;
                                                                            str6 = cursorQuery;
                                                                            RawQuery = str6;
                                                                            string2 = str4;
                                                                            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                                                                            b = i10 % 128;
                                                                            int i11 = i10 % 2;
                                                                            r4 = RawQuery;
                                                                            str3 = string2;
                                                                            this.zzu.zzaV().zzb().zzc("Data loss. Error selecting raw event. appId", zzgu.zzl(str3), e);
                                                                            r5 = r4;
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            str6 = cursorQuery;
                                                                            IsEmpty = str6;
                                                                            r16 = IsEmpty;
                                                                            if (r16 != 0) {
                                                                                r16.close();
                                                                            }
                                                                            throw th;
                                                                        }
                                                                        str9 = "app_id = ? and metadata_fingerprint = ?";
                                                                        strArr2 = strArr;
                                                                        strArr3 = strArr2;
                                                                        str10 = str9;
                                                                    } catch (SQLiteException e5) {
                                                                        e = e5;
                                                                        str4 = null;
                                                                        str6 = cursorQuery;
                                                                        RawQuery = str6;
                                                                        string2 = str4;
                                                                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                                                                        b = i12 % 128;
                                                                        int i13 = i12 % 2;
                                                                        r4 = RawQuery;
                                                                        str3 = string2;
                                                                        this.zzu.zzaV().zzb().zzc("Data loss. Error selecting raw event. appId", zzgu.zzl(str3), e);
                                                                        r5 = r4;
                                                                        if (r5 == 0) {
                                                                            r5 = cursorRawQuery;
                                                                            r5 = cursorQuery2;
                                                                            r5 = RawQuery;
                                                                            return;
                                                                        } else {
                                                                            r5 = cursorRawQuery;
                                                                            r5 = cursorQuery2;
                                                                            r5 = RawQuery;
                                                                            r5.close();
                                                                        }
                                                                    }
                                                                } catch (IOException e6) {
                                                                    this.zzu.zzaV().zzb().zzc("Data loss. Failed to merge raw event metadata. appId", zzgu.zzl(str7), e6);
                                                                    r5 = cursorQuery;
                                                                }
                                                            } catch (SQLiteException e7) {
                                                                e = e7;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                            }
                                                        } else {
                                                            this.zzu.zzaV().zzb().zzb("Raw event metadata record is missing. appId", zzgu.zzl(str7));
                                                        }
                                                        r5 = cursorQuery;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        r16 = cursorQuery;
                                                        if (r16 != 0) {
                                                            r16.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (SQLiteException e8) {
                                                    e = e8;
                                                    str4 = str7;
                                                }
                                            } catch (SQLiteException e9) {
                                                e = e9;
                                                str2 = str7;
                                                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
                                                b = i14 % 128;
                                                int i15 = i14 % 2;
                                                r6 = r16;
                                                str3 = str2;
                                                r4 = r6;
                                                this.zzu.zzaV().zzb().zzc("Data loss. Error selecting raw event. appId", zzgu.zzl(str3), e);
                                                r5 = r4;
                                                if (r5 == 0) {
                                                    r5 = cursorRawQuery;
                                                    r5 = cursorQuery2;
                                                    r5 = RawQuery;
                                                    return;
                                                } else {
                                                    r5 = cursorRawQuery;
                                                    r5 = cursorQuery2;
                                                    r5 = RawQuery;
                                                    r5.close();
                                                }
                                            }
                                        } catch (SQLiteException e10) {
                                            e = e10;
                                            str2 = str5;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    r4 = RawQuery;
                                    str3 = string2;
                                    this.zzu.zzaV().zzb().zzc("Data loss. Error selecting raw event. appId", zzgu.zzl(str3), e);
                                    r5 = r4;
                                }
                            }
                        } else {
                            String[] strArr6 = j2 != -1 ? new String[]{str, String.valueOf(j2)} : new String[]{str};
                            if (j2 != -1) {
                                int i16 = b + 7;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                                str11 = " and rowid <= ?";
                                if (i16 % 2 != 0) {
                                    int i17 = 88 / 0;
                                }
                            }
                            StringBuilder sb2 = new StringBuilder(str11.length() + 84);
                            sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                            sb2.append(str11);
                            sb2.append(" order by rowid limit 1;");
                            cursorRawQuery = sQLiteDatabaseZze.rawQuery(sb2.toString(), strArr6);
                            if (cursorRawQuery.moveToFirst()) {
                                string = cursorRawQuery.getString(0);
                                cursorRawQuery.close();
                                str5 = str;
                                r16 = cursorRawQuery;
                                IsEmpty = cursorRawQuery;
                                String str13 = string;
                                str4 = null;
                                str6 = str13;
                                str7 = str5;
                                cursorQuery = sQLiteDatabaseZze.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str5, str13}, null, null, "rowid", ExifInterface.GPS_MEASUREMENT_2D);
                                if (cursorQuery.moveToFirst()) {
                                    this.zzu.zzaV().zzb().zzb("Raw event metadata record is missing. appId", zzgu.zzl(str7));
                                } else {
                                    com.google.android.gms.internal.measurement.zzid zzidVar2 = (com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) zzpk.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), cursorQuery.getBlob(0))).zzbc();
                                    if (cursorQuery.moveToNext()) {
                                        this.zzu.zzaV().zze().zzb("Get multiple raw event metadata records, expected one. appId", zzgu.zzl(str7));
                                    }
                                    cursorQuery.close();
                                    Preconditions.checkNotNull(zzidVar2);
                                    zzpcVar.zza = zzidVar2;
                                    zzicVar = this.zzu;
                                    if (zzicVar.zzc().zzp(null, zzfy.zzbk)) {
                                        str8 = str7;
                                        jZzaz = zzaz("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{str8, str6}, -1L);
                                        if (j2 == -1) {
                                            j4 = j2;
                                        } else if (jZzaz != -1) {
                                            j4 = -1;
                                        } else {
                                            strArr = new String[]{str8, str6};
                                            zzicVar = zzicVar;
                                        }
                                        if (j4 == -1) {
                                            if (j4 != -1) {
                                                i2 = b + 43;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                                                if (i2 % 2 != 0) {
                                                    r4.hashCode();
                                                    throw null;
                                                }
                                                jZzaz = j4;
                                            }
                                        } else if (j4 != -1) {
                                            i2 = b + 43;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                                            if (i2 % 2 != 0) {
                                                r4.hashCode();
                                                throw null;
                                            }
                                            jZzaz = j4;
                                        }
                                        String[] strArr7 = {str8, str6, String.valueOf(jZzaz)};
                                        str10 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr3 = strArr7;
                                        str2 = str8;
                                        zzicVar2 = zzicVar;
                                        cursorQuery2 = sQLiteDatabaseZze.query("raw_events", new String[]{"rowid", "name", "timestamp", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, str10, strArr3, null, null, "rowid", null);
                                        if (cursorQuery2.moveToFirst()) {
                                            while (true) {
                                                j3 = cursorQuery2.getLong(0);
                                                zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursorQuery2.getBlob(3));
                                                zzhrVar.zzl(cursorQuery2.getString(1));
                                                zzhrVar.zzo(cursorQuery2.getLong(2));
                                                if (!zzpcVar.zza(j3, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc())) {
                                                    r5 = cursorQuery2;
                                                    break;
                                                } else if (!cursorQuery2.moveToNext()) {
                                                    r5 = cursorQuery2;
                                                    break;
                                                }
                                            }
                                        } else {
                                            zzicVar2.zzaV().zze().zzb("Raw event data disappeared while in transaction. appId", zzgu.zzl(str2));
                                        }
                                    } else {
                                        str8 = str7;
                                        zzicVar = zzicVar;
                                        if (j2 != -1) {
                                            i = b + 69;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                                            if (i % 2 != 0) {
                                                strArr2 = new String[4];
                                                strArr2[0] = str8;
                                                strArr2[1] = str6;
                                                strArr2[5] = String.valueOf(j2);
                                            } else {
                                                strArr2 = new String[]{str8, str6, String.valueOf(j2)};
                                            }
                                            str9 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        } else {
                                            strArr = new String[]{str8, str6};
                                        }
                                        strArr3 = strArr2;
                                        str10 = str9;
                                        str2 = str8;
                                        zzicVar2 = zzicVar;
                                        cursorQuery2 = sQLiteDatabaseZze.query("raw_events", new String[]{"rowid", "name", "timestamp", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, str10, strArr3, null, null, "rowid", null);
                                        if (cursorQuery2.moveToFirst()) {
                                            while (true) {
                                                j3 = cursorQuery2.getLong(0);
                                                zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursorQuery2.getBlob(3));
                                                zzhrVar.zzl(cursorQuery2.getString(1));
                                                zzhrVar.zzo(cursorQuery2.getLong(2));
                                                if (!zzpcVar.zza(j3, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc())) {
                                                    r5 = cursorQuery2;
                                                    break;
                                                } else if (!cursorQuery2.moveToNext()) {
                                                    r5 = cursorQuery2;
                                                    break;
                                                }
                                            }
                                        } else {
                                            zzicVar2.zzaV().zze().zzb("Raw event data disappeared while in transaction. appId", zzgu.zzl(str2));
                                        }
                                    }
                                    str9 = "app_id = ? and metadata_fingerprint = ?";
                                    strArr2 = strArr;
                                    strArr3 = strArr2;
                                    str10 = str9;
                                    str2 = str8;
                                    zzicVar2 = zzicVar;
                                    cursorQuery2 = sQLiteDatabaseZze.query("raw_events", new String[]{"rowid", "name", "timestamp", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, str10, strArr3, null, null, "rowid", null);
                                    if (cursorQuery2.moveToFirst()) {
                                        while (true) {
                                            j3 = cursorQuery2.getLong(0);
                                            zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursorQuery2.getBlob(3));
                                            zzhrVar.zzl(cursorQuery2.getString(1));
                                            zzhrVar.zzo(cursorQuery2.getLong(2));
                                            if (!zzpcVar.zza(j3, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc())) {
                                                r5 = cursorQuery2;
                                                break;
                                            } else if (!cursorQuery2.moveToNext()) {
                                                r5 = cursorQuery2;
                                                break;
                                            }
                                        }
                                    } else {
                                        zzicVar2.zzaV().zze().zzb("Raw event data disappeared while in transaction. appId", zzgu.zzl(str2));
                                    }
                                }
                                r5 = cursorQuery;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    str4 = str;
                    RawQuery = IsEmpty;
                }
            } catch (SQLiteException e13) {
                e = e13;
                str2 = str;
            }
            if (r5 == 0) {
                r5 = cursorRawQuery;
                r5 = cursorQuery2;
                r5 = RawQuery;
                return;
            } else {
                r5 = cursorRawQuery;
                r5 = cursorQuery2;
                r5 = RawQuery;
                r5.close();
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0243  */
    /* JADX WARN: Code duplicated, block: B:58:0x0244  */
    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (true) {
            obj = null;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i3 = $10 + 45;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 2625 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() | (TuitionPaymentFragmentspecialinlinedviewModeldefault3 & 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (MotionEvent.axisFromString("") + 39423), 481 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getPressedStateDuration() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 19472), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2623, 13 - View.MeasureSpec.getMode(0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "") + 39422), 480 - Process.getGidForName(""), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $10 + 57;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                try {
                    Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39422 - (ViewConfiguration.getScrollBarSize() >> 8)), KeyEvent.normalizeMetaState(0) + 481, 37 - ExpandableListView.getPackedPositionGroup(0L), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    obj.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (39422 - View.resolveSize(0, 0)), Drawable.resolveOpacity(0, 0) + 481, View.MeasureSpec.getMode(0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0272  */
    /* JADX WARN: Code duplicated, block: B:101:0x0276  */
    /* JADX WARN: Code duplicated, block: B:104:0x028b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0298  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:116:0x035d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0381 A[Catch: SQLiteException -> 0x037f, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x037f, blocks: (B:118:0x036b, B:121:0x0381, B:123:0x0395), top: B:144:0x036b }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0399  */
    /* JADX WARN: Code duplicated, block: B:144:0x036b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f3 A[PHI: r2 r3
  0x00f3: PHI (r2v29 ??) = (r2v38 ??), (r2v39 ??) binds: [B:50:0x0132, B:32:0x00f1] A[DONT_GENERATE, DONT_INLINE]
  0x00f3: PHI (r3v11 ??) = (r3v25 ??), (r3v26 ??) binds: [B:50:0x0132, B:32:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0172  */
    /* JADX WARN: Code duplicated, block: B:69:0x018f  */
    /* JADX WARN: Code duplicated, block: B:71:0x019a  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01df  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x0203  */
    /* JADX WARN: Code duplicated, block: B:89:0x020d  */
    /* JADX WARN: Code duplicated, block: B:90:0x021d  */
    /* JADX WARN: Code duplicated, block: B:96:0x024c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0251  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v36, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [com.google.android.gms.internal.measurement.zzid] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19, types: [com.google.android.gms.internal.measurement.zzid] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final void zzW(String str, Long l, String str2, Bundle bundle) throws Throwable {
        zzpk zzpkVarZzp;
        Bundle bundle2;
        Iterator it;
        String string;
        String str3;
        zzic zzicVar;
        String str4;
        Bundle bundle3;
        Iterator<String> it2;
        int i;
        String next;
        zzbb zzbbVar;
        String str5;
        int i2;
        long jUpdate;
        int i3;
        int i4;
        com.google.android.gms.internal.measurement.zzhw zzhwVar;
        int i5;
        ?? Query;
        ?? r3;
        ?? r4;
        ?? r2;
        ?? r5;
        int i6 = 2;
        int i7 = 2 % 2;
        Preconditions.checkNotNull(bundle);
        zzg();
        zzaw();
        zzat zzatVar = l != null ? new zzat(this, str, l.longValue()) : new zzat(this, str);
        for (List<zzas> listZza = zzatVar.zza(); !listZza.isEmpty(); listZza = zzatVar.zza()) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
            b = i8 % 128;
            Throwable th = null;
            if (i8 % i6 == 0) {
                listZza.iterator();
                throw null;
            }
            for (zzas zzasVar : listZza) {
                if (TextUtils.isEmpty(str2)) {
                    zzpg zzpgVar = this.zzg;
                    zzpkVarZzp = zzpgVar.zzp();
                    com.google.android.gms.internal.measurement.zzhs zzhsVar = zzasVar.zzd;
                    bundle2 = new Bundle();
                    it = zzhsVar.zza().iterator();
                    while (it.hasNext()) {
                        i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                        b = i4 % 128;
                        if (i4 % i6 == 0) {
                            ((com.google.android.gms.internal.measurement.zzhw) it.next()).zzi();
                            th.hashCode();
                            throw th;
                        }
                        zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
                        if (zzhwVar.zzi()) {
                            bundle2.putDouble(zzhwVar.zzb(), zzhwVar.zzj());
                        } else if (zzhwVar.zzg()) {
                            i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                            b = i5 % 128;
                            if (i5 % i6 == 0) {
                                bundle2.putFloat(zzhwVar.zzb(), zzhwVar.zzh());
                                th.hashCode();
                                throw th;
                            }
                            bundle2.putFloat(zzhwVar.zzb(), zzhwVar.zzh());
                        } else if (zzhwVar.zze()) {
                            bundle2.putLong(zzhwVar.zzb(), zzhwVar.zzf());
                        } else if (zzhwVar.zzc()) {
                            bundle2.putString(zzhwVar.zzb(), zzhwVar.zzd());
                        } else if (zzhwVar.zzk().isEmpty()) {
                            zzpkVarZzp.zzu.zzaV().zzb().zzb("Unexpected parameter type for parameter", zzhwVar);
                        } else {
                            bundle2.putParcelableArray(zzhwVar.zzb(), zzpk.zzy(zzhwVar.zzk()));
                        }
                    }
                    string = bundle2.getString("_o");
                    bundle2.remove("_o");
                    String strZzd = zzhsVar.zzd();
                    if (string == null) {
                        str3 = "";
                    } else {
                        str3 = string;
                    }
                    zzgv zzgvVar = new zzgv(strZzd, str3, bundle2, zzhsVar.zzf());
                    zzicVar = this.zzu;
                    Bundle bundle4 = zzgvVar.zzd;
                    str4 = zzgvVar.zza;
                    zzpp zzppVarZzk = zzicVar.zzk();
                    if (str4.equals("_cmp")) {
                        bundle3 = new Bundle(bundle);
                        it2 = bundle.keySet().iterator();
                        while (it2.hasNext()) {
                            i = b + 57;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                            if (i % i6 != 0) {
                                it2.next().startsWith("gad_");
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            next = it2.next();
                            if (next.startsWith("gad_")) {
                                bundle3.remove(next);
                                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
                                b = i9 % 128;
                                int i10 = i9 % i6;
                            }
                        }
                    } else {
                        bundle3 = bundle;
                    }
                    zzppVarZzk.zzI(bundle4, bundle3);
                    zzbbVar = new zzbb(this.zzu, zzgvVar.zzb, str, zzhsVar.zzd(), zzhsVar.zzf(), zzhsVar.zzh(), bundle4);
                    long j = zzasVar.zza;
                    long j2 = zzasVar.zzb;
                    boolean z = zzasVar.zzc;
                    zzg();
                    zzaw();
                    Preconditions.checkNotNull(zzbbVar);
                    str5 = zzbbVar.zza;
                    Preconditions.checkNotEmpty(str5);
                    byte[] bArrZzcc = zzpgVar.zzp().zzh(zzbbVar).zzcc();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str5);
                    contentValues.put("name", zzbbVar.zzb);
                    contentValues.put("timestamp", Long.valueOf(zzbbVar.zzd));
                    contentValues.put("metadata_fingerprint", Long.valueOf(j2));
                    contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArrZzcc);
                    contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
                    jUpdate = zze().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                    if (jUpdate != 1) {
                        i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                        b = i3 % 128;
                        i2 = 2;
                        if (i3 % 2 == 0) {
                            zzicVar.zzaV().zzb().zzc("Failed to update raw event. appId, updatedRows", zzgu.zzl(str5), Long.valueOf(jUpdate));
                            throw null;
                        }
                        zzicVar.zzaV().zzb().zzc("Failed to update raw event. appId, updatedRows", zzgu.zzl(str5), Long.valueOf(jUpdate));
                        e = e;
                        this.zzu.zzaV().zzb().zzc("Error updating raw event. appId", zzgu.zzl(zzbbVar.zza), e);
                    } else {
                        i2 = 2;
                    }
                } else {
                    int i11 = b + 113;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                    int i12 = i11 % i6;
                    long j3 = zzasVar.zzb;
                    try {
                        String[] strArr = new String[i6];
                        strArr[0] = str;
                        strArr[1] = Long.toString(j3);
                        Query = zze().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", strArr, null, null, "rowid", ExifInterface.GPS_MEASUREMENT_2D);
                        try {
                            try {
                                if (Query.moveToFirst()) {
                                    try {
                                        r3 = (com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) zzpk.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), Query.getBlob(0))).zzbc();
                                        try {
                                            if (Query.moveToNext()) {
                                                int i13 = b + 87;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                                                if (i13 % i6 != 0) {
                                                    this.zzu.zzaV().zze().zzb("Get multiple raw event metadata records, expected one. appId", zzgu.zzl(str));
                                                    int i14 = 81 / 0;
                                                } else {
                                                    this.zzu.zzaV().zze().zzb("Get multiple raw event metadata records, expected one. appId", zzgu.zzl(str));
                                                }
                                            }
                                            Query.close();
                                            r5 = r3;
                                            r2 = Query;
                                            r4 = r3;
                                            if (Query != 0) {
                                                r2.close();
                                                r5 = r4;
                                            }
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            this.zzu.zzaV().zzb().zzc("Data loss. Error selecting raw event. appId", zzgu.zzl(str), e);
                                            r5 = r3;
                                            r2 = Query;
                                            r4 = r3;
                                            if (Query != 0) {
                                                r2.close();
                                                r5 = r4;
                                            }
                                        }
                                    } catch (IOException e3) {
                                        this.zzu.zzaV().zzb().zzc("Data loss. Failed to merge raw event metadata. appId", zzgu.zzl(str), e3);
                                        if (Query != 0) {
                                            Query.close();
                                        }
                                        r5 = th;
                                    }
                                } else {
                                    this.zzu.zzaV().zzb().zzb("Raw event metadata record is missing. appId", zzgu.zzl(str));
                                    if (Query != 0) {
                                        Query.close();
                                    }
                                    r5 = th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (Query != 0) {
                                    int i15 = b + 109;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                                    if (i15 % i6 != 0) {
                                        Query.close();
                                        th.hashCode();
                                        throw th;
                                    }
                                    Query.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            r3 = th;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        Query = th;
                        r3 = Query;
                    } catch (Throwable th3) {
                        th = th3;
                        Query = th;
                    }
                    if (r5 != 0) {
                        Iterator it3 = r5.zzf().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                zzpg zzpgVar2 = this.zzg;
                                zzpkVarZzp = zzpgVar2.zzp();
                                com.google.android.gms.internal.measurement.zzhs zzhsVar2 = zzasVar.zzd;
                                bundle2 = new Bundle();
                                it = zzhsVar2.zza().iterator();
                                while (it.hasNext()) {
                                    i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                                    b = i4 % 128;
                                    if (i4 % i6 == 0) {
                                        ((com.google.android.gms.internal.measurement.zzhw) it.next()).zzi();
                                        th.hashCode();
                                        throw th;
                                    }
                                    zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
                                    if (zzhwVar.zzi()) {
                                        bundle2.putDouble(zzhwVar.zzb(), zzhwVar.zzj());
                                    } else if (zzhwVar.zzg()) {
                                        i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                                        b = i5 % 128;
                                        if (i5 % i6 == 0) {
                                            bundle2.putFloat(zzhwVar.zzb(), zzhwVar.zzh());
                                            th.hashCode();
                                            throw th;
                                        }
                                        bundle2.putFloat(zzhwVar.zzb(), zzhwVar.zzh());
                                    } else if (zzhwVar.zze()) {
                                        bundle2.putLong(zzhwVar.zzb(), zzhwVar.zzf());
                                    } else if (zzhwVar.zzc()) {
                                        bundle2.putString(zzhwVar.zzb(), zzhwVar.zzd());
                                    } else if (zzhwVar.zzk().isEmpty()) {
                                        bundle2.putParcelableArray(zzhwVar.zzb(), zzpk.zzy(zzhwVar.zzk()));
                                    } else {
                                        zzpkVarZzp.zzu.zzaV().zzb().zzb("Unexpected parameter type for parameter", zzhwVar);
                                    }
                                }
                                string = bundle2.getString("_o");
                                bundle2.remove("_o");
                                String strZzd2 = zzhsVar2.zzd();
                                if (string == null) {
                                    str3 = "";
                                } else {
                                    str3 = string;
                                }
                                zzgv zzgvVar2 = new zzgv(strZzd2, str3, bundle2, zzhsVar2.zzf());
                                zzicVar = this.zzu;
                                Bundle bundle5 = zzgvVar2.zzd;
                                str4 = zzgvVar2.zza;
                                zzpp zzppVarZzk2 = zzicVar.zzk();
                                if (str4.equals("_cmp")) {
                                    bundle3 = bundle;
                                } else {
                                    bundle3 = new Bundle(bundle);
                                    it2 = bundle.keySet().iterator();
                                    while (it2.hasNext()) {
                                        i = b + 57;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                                        if (i % i6 != 0) {
                                            it2.next().startsWith("gad_");
                                            Object obj2 = null;
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        next = it2.next();
                                        if (next.startsWith("gad_")) {
                                            bundle3.remove(next);
                                            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
                                            b = i16 % 128;
                                            int i17 = i16 % i6;
                                        }
                                    }
                                }
                                zzppVarZzk2.zzI(bundle5, bundle3);
                                zzbbVar = new zzbb(this.zzu, zzgvVar2.zzb, str, zzhsVar2.zzd(), zzhsVar2.zzf(), zzhsVar2.zzh(), bundle5);
                                long j4 = zzasVar.zza;
                                long j5 = zzasVar.zzb;
                                boolean z2 = zzasVar.zzc;
                                zzg();
                                zzaw();
                                Preconditions.checkNotNull(zzbbVar);
                                str5 = zzbbVar.zza;
                                Preconditions.checkNotEmpty(str5);
                                byte[] bArrZzcc2 = zzpgVar2.zzp().zzh(zzbbVar).zzcc();
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("app_id", str5);
                                contentValues2.put("name", zzbbVar.zzb);
                                contentValues2.put("timestamp", Long.valueOf(zzbbVar.zzd));
                                contentValues2.put("metadata_fingerprint", Long.valueOf(j5));
                                contentValues2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArrZzcc2);
                                contentValues2.put("realtime", Integer.valueOf(z2 ? 1 : 0));
                                try {
                                    jUpdate = zze().update("raw_events", contentValues2, "rowid = ?", new String[]{String.valueOf(j4)});
                                    if (jUpdate != 1) {
                                        i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                                        b = i3 % 128;
                                        i2 = 2;
                                        if (i3 % 2 == 0) {
                                            zzicVar.zzaV().zzb().zzc("Failed to update raw event. appId, updatedRows", zzgu.zzl(str5), Long.valueOf(jUpdate));
                                            throw null;
                                        }
                                        try {
                                            zzicVar.zzaV().zzb().zzc("Failed to update raw event. appId, updatedRows", zzgu.zzl(str5), Long.valueOf(jUpdate));
                                        } catch (SQLiteException e6) {
                                            e = e6;
                                            this.zzu.zzaV().zzb().zzc("Error updating raw event. appId", zzgu.zzl(zzbbVar.zza), e);
                                        }
                                        e = e6;
                                        this.zzu.zzaV().zzb().zzc("Error updating raw event. appId", zzgu.zzl(zzbbVar.zza), e);
                                    } else {
                                        i2 = 2;
                                    }
                                } catch (SQLiteException e7) {
                                    e = e7;
                                    i2 = 2;
                                }
                            } else if (((com.google.android.gms.internal.measurement.zziu) it3.next()).zzc().equals(str2)) {
                                i2 = i6;
                            }
                        }
                    } else {
                        zzpg zzpgVar3 = this.zzg;
                        zzpkVarZzp = zzpgVar3.zzp();
                        com.google.android.gms.internal.measurement.zzhs zzhsVar3 = zzasVar.zzd;
                        bundle2 = new Bundle();
                        it = zzhsVar3.zza().iterator();
                        while (it.hasNext()) {
                            i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                            b = i4 % 128;
                            if (i4 % i6 == 0) {
                                ((com.google.android.gms.internal.measurement.zzhw) it.next()).zzi();
                                th.hashCode();
                                throw th;
                            }
                            zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
                            if (zzhwVar.zzi()) {
                                bundle2.putDouble(zzhwVar.zzb(), zzhwVar.zzj());
                            } else if (zzhwVar.zzg()) {
                                i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                                b = i5 % 128;
                                if (i5 % i6 == 0) {
                                    bundle2.putFloat(zzhwVar.zzb(), zzhwVar.zzh());
                                    th.hashCode();
                                    throw th;
                                }
                                bundle2.putFloat(zzhwVar.zzb(), zzhwVar.zzh());
                            } else if (zzhwVar.zze()) {
                                bundle2.putLong(zzhwVar.zzb(), zzhwVar.zzf());
                            } else if (zzhwVar.zzc()) {
                                bundle2.putString(zzhwVar.zzb(), zzhwVar.zzd());
                            } else if (zzhwVar.zzk().isEmpty()) {
                                bundle2.putParcelableArray(zzhwVar.zzb(), zzpk.zzy(zzhwVar.zzk()));
                            } else {
                                zzpkVarZzp.zzu.zzaV().zzb().zzb("Unexpected parameter type for parameter", zzhwVar);
                            }
                        }
                        string = bundle2.getString("_o");
                        bundle2.remove("_o");
                        String strZzd3 = zzhsVar3.zzd();
                        if (string == null) {
                            str3 = "";
                        } else {
                            str3 = string;
                        }
                        zzgv zzgvVar3 = new zzgv(strZzd3, str3, bundle2, zzhsVar3.zzf());
                        zzicVar = this.zzu;
                        Bundle bundle6 = zzgvVar3.zzd;
                        str4 = zzgvVar3.zza;
                        zzpp zzppVarZzk3 = zzicVar.zzk();
                        if (str4.equals("_cmp")) {
                            bundle3 = bundle;
                        } else {
                            bundle3 = new Bundle(bundle);
                            it2 = bundle.keySet().iterator();
                            while (it2.hasNext()) {
                                i = b + 57;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                                if (i % i6 != 0) {
                                    it2.next().startsWith("gad_");
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                next = it2.next();
                                if (next.startsWith("gad_")) {
                                    bundle3.remove(next);
                                    int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
                                    b = i18 % 128;
                                    int i19 = i18 % i6;
                                }
                            }
                        }
                        zzppVarZzk3.zzI(bundle6, bundle3);
                        zzbbVar = new zzbb(this.zzu, zzgvVar3.zzb, str, zzhsVar3.zzd(), zzhsVar3.zzf(), zzhsVar3.zzh(), bundle6);
                        long j6 = zzasVar.zza;
                        long j7 = zzasVar.zzb;
                        boolean z3 = zzasVar.zzc;
                        zzg();
                        zzaw();
                        Preconditions.checkNotNull(zzbbVar);
                        str5 = zzbbVar.zza;
                        Preconditions.checkNotEmpty(str5);
                        byte[] bArrZzcc3 = zzpgVar3.zzp().zzh(zzbbVar).zzcc();
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("app_id", str5);
                        contentValues3.put("name", zzbbVar.zzb);
                        contentValues3.put("timestamp", Long.valueOf(zzbbVar.zzd));
                        contentValues3.put("metadata_fingerprint", Long.valueOf(j7));
                        contentValues3.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArrZzcc3);
                        contentValues3.put("realtime", Integer.valueOf(z3 ? 1 : 0));
                        jUpdate = zze().update("raw_events", contentValues3, "rowid = ?", new String[]{String.valueOf(j6)});
                        if (jUpdate != 1) {
                            i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                            b = i3 % 128;
                            i2 = 2;
                            if (i3 % 2 == 0) {
                                zzicVar.zzaV().zzb().zzc("Failed to update raw event. appId, updatedRows", zzgu.zzl(str5), Long.valueOf(jUpdate));
                                throw null;
                            }
                            zzicVar.zzaV().zzb().zzc("Failed to update raw event. appId, updatedRows", zzgu.zzl(str5), Long.valueOf(jUpdate));
                            e = e6;
                            this.zzu.zzaV().zzb().zzc("Error updating raw event. appId", zzgu.zzl(zzbbVar.zza), e);
                        } else {
                            i2 = 2;
                        }
                    }
                }
                i6 = i2;
                th = null;
            }
        }
    }

    final void zzae(String str, List list) {
        Integer numValueOf;
        Iterator it;
        String str2;
        boolean z;
        String str3 = "app_id=? and audience_id=?";
        int i = 2;
        int i2 = 2 % 2;
        Preconditions.checkNotNull(list);
        int i3 = 0;
        while (i3 < list.size()) {
            com.google.android.gms.internal.measurement.zzfc zzfcVar = (com.google.android.gms.internal.measurement.zzfc) ((com.google.android.gms.internal.measurement.zzfd) list.get(i3)).zzcl();
            if (zzfcVar.zzd() != 0) {
                int i4 = 0;
                while (i4 < zzfcVar.zzd()) {
                    com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) zzfcVar.zze(i4).zzcl();
                    com.google.android.gms.internal.measurement.zzfe zzfeVar2 = (com.google.android.gms.internal.measurement.zzfe) zzfeVar.clone();
                    String strZzb = zzjm.zzb(zzfeVar.zza());
                    if (strZzb != null) {
                        zzfeVar2.zzb(strZzb);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i5 = 0;
                    while (i5 < zzfeVar.zzc()) {
                        int i6 = b + 113;
                        String str4 = str3;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                        int i7 = i6 % i;
                        com.google.android.gms.internal.measurement.zzfh zzfhVarZzd = zzfeVar.zzd(i5);
                        com.google.android.gms.internal.measurement.zzfe zzfeVar3 = zzfeVar;
                        String strZzc = zzlt.zzc(zzfhVarZzd.zzh(), zzjn.zza, zzjn.zzb);
                        if (strZzc != null) {
                            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) zzfhVarZzd.zzcl();
                            zzfgVar.zza(strZzc);
                            zzfeVar2.zze(i5, (com.google.android.gms.internal.measurement.zzfh) zzfgVar.zzbc());
                            z = true;
                        }
                        i5++;
                        str3 = str4;
                        zzfeVar = zzfeVar3;
                        i = 2;
                    }
                    String str5 = str3;
                    if (!(!z)) {
                        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                        b = i8 % 128;
                        int i9 = i8 % 2;
                        zzfcVar.zzf(i4, zzfeVar2);
                        list.set(i3, (com.google.android.gms.internal.measurement.zzfd) zzfcVar.zzbc());
                    }
                    i4++;
                    str3 = str5;
                    i = 2;
                }
            }
            String str6 = str3;
            if (zzfcVar.zza() != 0) {
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
                b = i10 % 128;
                for (int i11 = i10 % 2 == 0 ? 1 : 0; i11 < zzfcVar.zza(); i11++) {
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
                    b = i12 % 128;
                    if (i12 % 2 == 0) {
                        zzlt.zzc(zzfcVar.zzb(i11).zzc(), zzjo.zza, zzjo.zzb);
                        throw null;
                    }
                    com.google.android.gms.internal.measurement.zzfn zzfnVarZzb = zzfcVar.zzb(i11);
                    String strZzc2 = zzlt.zzc(zzfnVarZzb.zzc(), zzjo.zza, zzjo.zzb);
                    if (strZzc2 != null) {
                        com.google.android.gms.internal.measurement.zzfm zzfmVar = (com.google.android.gms.internal.measurement.zzfm) zzfnVarZzb.zzcl();
                        zzfmVar.zza(strZzc2);
                        zzfcVar.zzc(i11, zzfmVar);
                        list.set(i3, (com.google.android.gms.internal.measurement.zzfd) zzfcVar.zzbc());
                    }
                }
            }
            i3++;
            str3 = str6;
            i = 2;
        }
        String str7 = str3;
        zzaw();
        zzg();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase sQLiteDatabaseZze = zze();
        sQLiteDatabaseZze.beginTransaction();
        try {
            zzaw();
            zzg();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase sQLiteDatabaseZze2 = zze();
            sQLiteDatabaseZze2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseZze2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                com.google.android.gms.internal.measurement.zzfd zzfdVar = (com.google.android.gms.internal.measurement.zzfd) it2.next();
                zzaw();
                zzg();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzfdVar);
                if (zzfdVar.zza()) {
                    int iZzb = zzfdVar.zzb();
                    Iterator it3 = zzfdVar.zzf().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.zzff) it3.next()).zza()) {
                                this.zzu.zzaV().zze().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", zzgu.zzl(str), Integer.valueOf(iZzb));
                                break;
                            }
                        } else {
                            Iterator it4 = zzfdVar.zzc().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    Iterator it5 = zzfdVar.zzf().iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            it = it2;
                                            Iterator it6 = zzfdVar.zzc().iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                                                    b = i13 % 128;
                                                    int i14 = i13 % 2;
                                                    com.google.android.gms.internal.measurement.zzfn zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it6.next();
                                                    zzaw();
                                                    zzg();
                                                    Preconditions.checkNotEmpty(str);
                                                    Preconditions.checkNotNull(zzfnVar);
                                                    if (zzfnVar.zzc().isEmpty()) {
                                                        this.zzu.zzaV().zze().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzgu.zzl(str), Integer.valueOf(iZzb), String.valueOf(zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null));
                                                    } else {
                                                        byte[] bArrZzcc = zzfnVar.zzcc();
                                                        ContentValues contentValues = new ContentValues();
                                                        contentValues.put("app_id", str);
                                                        contentValues.put("audience_id", Integer.valueOf(iZzb));
                                                        contentValues.put("filter_id", zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null);
                                                        Iterator it7 = it6;
                                                        contentValues.put("property_name", zzfnVar.zzc());
                                                        contentValues.put("session_scoped", zzfnVar.zzg() ? Boolean.valueOf(zzfnVar.zzh()) : null);
                                                        contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArrZzcc);
                                                        try {
                                                            try {
                                                                if (zze().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                                    this.zzu.zzaV().zzb().zzb("Failed to insert property filter (got -1). appId", zzgu.zzl(str));
                                                                } else {
                                                                    it6 = it7;
                                                                }
                                                            } catch (SQLiteException e2) {
                                                                e = e2;
                                                                this.zzu.zzaV().zzb().zzc("Error storing property filter. appId", zzgu.zzl(str), e);
                                                            }
                                                        } catch (SQLiteException e3) {
                                                            e = e3;
                                                        }
                                                    }
                                                    zzaw();
                                                    zzg();
                                                    Preconditions.checkNotEmpty(str);
                                                    SQLiteDatabase sQLiteDatabaseZze3 = zze();
                                                    str2 = str7;
                                                    sQLiteDatabaseZze3.delete("property_filters", str2, new String[]{str, String.valueOf(iZzb)});
                                                    sQLiteDatabaseZze3.delete("event_filters", str2, new String[]{str, String.valueOf(iZzb)});
                                                } else {
                                                    str2 = str7;
                                                }
                                                str7 = str2;
                                                it2 = it;
                                                break;
                                            }
                                        }
                                        com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) it5.next();
                                        zzaw();
                                        zzg();
                                        Preconditions.checkNotEmpty(str);
                                        Preconditions.checkNotNull(zzffVar);
                                        if (!zzffVar.zzc().isEmpty()) {
                                            byte[] bArrZzcc2 = zzffVar.zzcc();
                                            it = it2;
                                            ContentValues contentValues2 = new ContentValues();
                                            contentValues2.put("app_id", str);
                                            contentValues2.put("audience_id", Integer.valueOf(iZzb));
                                            contentValues2.put("filter_id", zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null);
                                            contentValues2.put("event_name", zzffVar.zzc());
                                            contentValues2.put("session_scoped", zzffVar.zzk() ? Boolean.valueOf(zzffVar.zzm()) : null);
                                            contentValues2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArrZzcc2);
                                            try {
                                                if (zze().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                    int i15 = b + 15;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                                                    int i16 = i15 % 2;
                                                    this.zzu.zzaV().zzb().zzb("Failed to insert event filter (got -1). appId", zzgu.zzl(str));
                                                }
                                                it2 = it;
                                            } catch (SQLiteException e4) {
                                                this.zzu.zzaV().zzb().zzc("Error storing event filter. appId", zzgu.zzl(str), e4);
                                                zzaw();
                                                zzg();
                                                Preconditions.checkNotEmpty(str);
                                                SQLiteDatabase sQLiteDatabaseZze4 = zze();
                                                str2 = str7;
                                                sQLiteDatabaseZze4.delete("property_filters", str2, new String[]{str, String.valueOf(iZzb)});
                                                sQLiteDatabaseZze4.delete("event_filters", str2, new String[]{str, String.valueOf(iZzb)});
                                                str7 = str2;
                                                it2 = it;
                                                break;
                                            }
                                        } else {
                                            this.zzu.zzaV().zze().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzgu.zzl(str), Integer.valueOf(iZzb), String.valueOf(zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null));
                                            it = it2;
                                        }
                                        zzaw();
                                        zzg();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase sQLiteDatabaseZze5 = zze();
                                        str2 = str7;
                                        sQLiteDatabaseZze5.delete("property_filters", str2, new String[]{str, String.valueOf(iZzb)});
                                        sQLiteDatabaseZze5.delete("event_filters", str2, new String[]{str, String.valueOf(iZzb)});
                                        str7 = str2;
                                        it2 = it;
                                        break;
                                        break;
                                    }
                                }
                                int i17 = b + 81;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
                                if (i17 % 2 != 0) {
                                    ((com.google.android.gms.internal.measurement.zzfn) it4.next()).zza();
                                    throw null;
                                }
                                if (!((com.google.android.gms.internal.measurement.zzfn) it4.next()).zza()) {
                                    this.zzu.zzaV().zze().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", zzgu.zzl(str), Integer.valueOf(iZzb));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    this.zzu.zzaV().zze().zzb("Audience with no ID. appId", zzgu.zzl(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                com.google.android.gms.internal.measurement.zzfd zzfdVar2 = (com.google.android.gms.internal.measurement.zzfd) it8.next();
                if (!zzfdVar2.zza()) {
                    numValueOf = null;
                } else {
                    int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    numValueOf = Integer.valueOf(zzfdVar2.zzb());
                }
                arrayList.add(numValueOf);
            }
            Preconditions.checkNotEmpty(str);
            zzaw();
            zzg();
            SQLiteDatabase sQLiteDatabaseZze6 = zze();
            try {
                long jZzay = zzay("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, this.zzu.zzc().zzm(str, zzfy.zzU)));
                if (jZzay > iMax) {
                    ArrayList arrayList2 = new ArrayList();
                    int i20 = 0;
                    while (true) {
                        if (i20 >= arrayList.size()) {
                            String strJoin = TextUtils.join(",", arrayList2);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseZze6.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i20);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i20++;
                    }
                }
            } catch (SQLiteException e5) {
                this.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str), e5);
            }
            sQLiteDatabaseZze.setTransactionSuccessful();
            sQLiteDatabaseZze.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabaseZze.endTransaction();
            throw th;
        }
    }

    public final zzbc zzf(String str, String str2) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0, 0));
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 921;
            int i4 = 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((byte) 52, bArr[80], bArr[37], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iMakeMeasureSpec, i4, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{22162, 3676, 59157, 23746, 13720, 60767, 16913, 15258, 37012, 18505, 8535, 34539, 32646, 55117, 35849, 26073, 55950, 45665, 27405, 49359, 47492, 4429}, 22720 - TextUtils.indexOf((CharSequence) "", '0'), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{22166, 47080, 38012, 62182, 54108, 12741, 7773, 31968, 23854, 48061, 38969, 59034, 50958, 9621, 532}, ((byte) KeyEvent.getModifierMetaStateMask()) + 57720, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
            int iIndexOf = TextUtils.indexOf("", "", 0) + 921;
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 28;
            byte b2 = $$a[80];
            byte b3 = b2;
            Object[] objArr6 = new Object[1];
            a(b2, b3, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, iIndexOf, tapTimeout, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 31534);
                int iAlpha = 921 - Color.alpha(0);
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
                byte[] bArr2 = $$a;
                Object[] objArr7 = new Object[1];
                a(bArr2[33], bArr2[37], bArr2[80], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask, iAlpha, pressedStateDuration, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = (-403930261) + (((~((-170860361) | iIdentityHashCode)) | 168759104 | (~((-1603219284) | iIdentityHashCode))) * (-880));
            int i6 = (~((-170860361) | (~iIdentityHashCode))) | 1603219283;
            int i7 = ~(iIdentityHashCode | 170860360);
            int i8 = ((i5 + ((i6 | i7) * (-880))) + (i7 * 880)) - 962831317;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{22162, 33576, 65021, 55198, 'H', 31251, 21673, 33070, 64314, 54750, 3985, 30746, 21198, 36001, 63841, 54017, 3541, 26527, 20541, 35557, 58499, 53570, 2831, 26069, 24170, 34874}, 54708 - TextUtils.lastIndexOf("", '0', 0, 0), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{22160, 15533, 33495, 26624, 65082, 17482, 11141, 45471, 2011, 60672, 29489, 55619, 44180, 12989, 39133, 28191, 62508, 23110}, 27180 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(str != null ? str.length() : 0), 0, -962831317};
                byte[] bArr3 = $$d;
                Object[] objArr12 = new Object[1];
                d(bArr3[55], bArr3[78], bArr3[12], objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                d(bArr3[12], (byte) ($$e & 46), bArr3[55], objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char fadingEdgeLength = (char) (31533 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 28;
                    byte[] bArr4 = $$a;
                    Object[] objArr14 = new Object[1];
                    a(bArr4[33], bArr4[37], bArr4[80], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, iResolveOpacity, packedPositionType, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{22162, 3676, 59157, 23746, 13720, 60767, 16913, 15258, 37012, 18505, 8535, 34539, 32646, 55117, 35849, 26073, 55950, 45665, 27405, 49359, 47492, 4429}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22720, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{22166, 47080, 38012, 62182, 54108, 12741, 7773, 31968, 23854, 48061, 38969, 59034, 50958, 9621, 532}, 57719 - (Process.myTid() >> 22), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarSize2 = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
                        int i11 = 920 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int i12 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                        byte b4 = $$a[80];
                        byte b5 = b4;
                        Object[] objArr17 = new Object[1];
                        a(b4, b5, b5, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize2, i11, i12, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char bitsPerPixel = (char) (31532 - ImageFormat.getBitsPerPixel(0));
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 921;
                        int i13 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27;
                        byte[] bArr5 = $$a;
                        Object[] objArr18 = new Object[1];
                        a((byte) 52, bArr5[80], bArr5[37], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel, iKeyCodeFromString, i13, -1048449946, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i17 = ~(System.identityHashCode(this) | 991905563);
            int i18 = i16 + ((285229083 | i17) * (-196)) + 774768455 + ((i17 | 706676480) * 196);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr2[0])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str3 : strArr) {
                    arrayList.add(str3);
                }
            }
            Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            int i21 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i22 = ~iIdentityHashCode2;
            int i23 = i21 + (-1029829080) + ((~((-1515826623) | i22)) * 979) + ((iIdentityHashCode2 | 258253021) * (-979)) + (((~(iIdentityHashCode2 | (-1515826623))) | (~(i22 | 258253021))) * 979);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr2[0])[0] = i25 ^ (i25 << 5);
            int i26 = b + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
            int i27 = i26 % 2;
        }
        String strConcat = "21,24,3,15,".concat("events");
        int i28 = ((int[]) objArr2[0])[0];
        int i29 = i28 * i28;
        int i30 = -(1960666731 * i28);
        int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
        int i32 = -(i28 * 223725759);
        int i33 = (i31 & i32) + (i32 | i31);
        int i34 = (i33 & (-1629807431)) + ((-1629807431) | i33);
        int i35 = i34 >> 25;
        int i36 = (((i35 | (-255)) << 1) - (i35 ^ (-255))) / 128;
        int i37 = (i36 & 1) + (i36 | 1);
        int i38 = ((i34 | i37) << 1) - (i37 ^ i34);
        int i39 = i34 >> 16;
        int i40 = ((i39 & (-131071)) + (i39 | (-131071))) / 65536;
        int i41 = (-(((i40 & 1) + (i40 | 1)) ^ i38)) + 1;
        int i42 = i41 >> 21;
        int i43 = ((i42 & (-4095)) + (i42 | (-4095))) / 2048;
        int i44 = ((i43 | 1) << 1) - (i43 ^ 1);
        return zzaC(strConcat.substring(17336 / ((i41 & (-(((i44 | 1) << 1) - (i44 ^ 1)))) * 1576)), str, str2);
    }

    public final void zzh(zzbc zzbcVar) {
        int i = 2 % 2;
        int i2 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zzaD("events", zzbcVar);
        int i4 = b + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void zzk(String str, String str2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        b = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzaw();
        try {
            zze().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
            int i4 = b + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
        } catch (SQLiteException e2) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaV().zzb().zzd("Error deleting user property. appId", zzgu.zzl(str), zzicVar.zzl().zzc(str2), e2);
        }
    }

    public final void zzi(String str) {
        zzbc zzbcVarZzaC;
        int i = 2 % 2;
        zzaE("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = zze().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (zzbcVarZzaC = zzaC("events", str, string)) != null) {
                            zzaD("events_snapshot", zzbcVarZzaC);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e2) {
                this.zzu.zzaV().zzb().zzc("Error creating snapshot. appId", zzgu.zzl(str), e2);
            }
            if (cursorQuery != null) {
                int i2 = b + 21;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                int i3 = i2 % 2;
                cursorQuery.close();
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
                b = i4 % 128;
                int i5 = i4 % 2;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x0114  */
    /* JADX WARN: Code duplicated, block: B:72:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0122 A[ADDED_TO_REGION] */
    public final void zzj(String str) throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        boolean z;
        boolean z2;
        int i;
        zzbc zzbcVarZzaC;
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        zzbc zzbcVarZzaC2 = zzaC("events", str, "_f");
        zzbc zzbcVarZzaC3 = zzaC("events", str, "_v");
        zzaE("events", str);
        int i3 = 1;
        boolean z3 = false;
        try {
            cursorQuery = zze().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            try {
                if (!(!cursorQuery.moveToFirst())) {
                    z2 = false;
                    z = false;
                    while (true) {
                        try {
                            String string = cursorQuery.getString(0);
                            if (cursorQuery.getLong(i3) >= 1) {
                                int i4 = b + 19;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                                int i5 = i4 % 2;
                                if ("_f".equals(string)) {
                                    z2 = true;
                                } else if ("_v".equals(string)) {
                                    z = true;
                                }
                            }
                            if (string != null && (zzbcVarZzaC = zzaC("events_snapshot", str, string)) != null) {
                                int i6 = b + 35;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                                if (i6 % 2 != 0) {
                                    zzaD("events", zzbcVarZzaC);
                                    int i7 = 90 / 0;
                                } else {
                                    zzaD("events", zzbcVarZzaC);
                                }
                            }
                            if (!cursorQuery.moveToNext()) {
                                break;
                            } else {
                                i3 = 1;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            z3 = z;
                            try {
                                this.zzu.zzaV().zzb().zzc("Error querying snapshot. appId", zzgu.zzl(str), e);
                                z = z3;
                            } catch (Throwable th) {
                                th = th;
                                z = z3;
                                z3 = z2;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (z3 && zzbcVarZzaC2 != null) {
                                    zzaD("events", zzbcVarZzaC2);
                                } else if (!z && zzbcVarZzaC3 != null) {
                                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                                    b = i8 % 128;
                                    int i9 = i8 % 2;
                                    zzaD("events", zzbcVarZzaC3);
                                }
                                zzaE("events_snapshot", str);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z3 = z2;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z3) {
                                if (!z) {
                                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                                    b = i10 % 128;
                                    int i11 = i10 % 2;
                                    zzaD("events", zzbcVarZzaC3);
                                }
                            } else if (!z) {
                                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                                b = i12 % 128;
                                int i13 = i12 % 2;
                                zzaD("events", zzbcVarZzaC3);
                            }
                            zzaE("events_snapshot", str);
                            throw th;
                        }
                    }
                    int i14 = b + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                    int i15 = i14 % 2;
                    if (cursorQuery != null) {
                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
                        b = i % 128;
                        if (i % 2 != 0) {
                            cursorQuery.close();
                            throw null;
                        }
                        cursorQuery.close();
                    }
                    if (z2 && zzbcVarZzaC2 != null) {
                        zzaD("events", zzbcVarZzaC2);
                    } else if (!z && zzbcVarZzaC3 != null) {
                        zzaD("events", zzbcVarZzaC3);
                    }
                } else {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (zzbcVarZzaC2 != null) {
                        zzaD("events", zzbcVarZzaC2);
                    } else if (zzbcVarZzaC3 != null) {
                        zzaD("events", zzbcVarZzaC3);
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                z2 = false;
                this.zzu.zzaV().zzb().zzc("Error querying snapshot. appId", zzgu.zzl(str), e);
                z = z3;
                if (cursorQuery != null) {
                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
                    b = i % 128;
                    if (i % 2 != 0) {
                        cursorQuery.close();
                        throw null;
                    }
                    cursorQuery.close();
                }
                if (z2) {
                }
                if (!z) {
                    zzaD("events", zzbcVarZzaC3);
                }
                zzaE("events_snapshot", str);
                int i16 = b + 123;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                int i17 = i16 % 2;
            } catch (Throwable th3) {
                th = th3;
                cursor = cursorQuery;
                cursorQuery = cursor;
                z = false;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (z3) {
                    if (!z) {
                        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                        b = i18 % 128;
                        int i19 = i18 % 2;
                        zzaD("events", zzbcVarZzaC3);
                    }
                } else if (!z) {
                    int i110 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                    b = i110 % 128;
                    int i111 = i110 % 2;
                    zzaD("events", zzbcVarZzaC3);
                }
                zzaE("events_snapshot", str);
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursorQuery = null;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
        zzaE("events_snapshot", str);
        int i112 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i112 % 128;
        int i113 = i112 % 2;
    }

    public final zzar zzw(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) throws Throwable {
        long j2;
        boolean z8;
        int i = 2 % 2;
        int i2 = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            j2 = 0;
            z8 = true;
        } else {
            j2 = 1;
            z8 = false;
        }
        zzar zzarVarZzx = zzx(j, str, j2, z8, false, z3, false, z5, z6, z7);
        int i3 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return zzarVarZzx;
    }

    public final int zzr(String str, String str2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        b = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzaw();
        try {
            int iDelete = zze().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
            b = i4 % 128;
            int i5 = i4 % 2;
            return iDelete;
        } catch (SQLiteException e2) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaV().zzb().zzd("Error deleting conditional property", zzgu.zzl(str), zzicVar.zzl().zzc(str2), e2);
            return 0;
        }
    }

    public final List zzs(String str, String str2, String str3) throws Throwable {
        int i = 2 % 2;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzaw();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
            b = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            String.valueOf(str3);
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        List listZzt = zzt(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        b = i4 % 128;
        int i5 = i4 % 2;
        return listZzt;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00c0: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:34:0x00c0 */
    public final zzaq zzy(String str) throws Throwable {
        SQLiteException e2;
        Cursor cursorQuery;
        Cursor cursor;
        int i = 2 % 2;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzaw();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zze().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            int i2 = b + 107;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                            if (i2 % 2 != 0) {
                                this.zzu.zzaV().zzb().zzb("Got multiple records for app config, expected one. appId", zzgu.zzl(str));
                                throw null;
                            }
                            this.zzu.zzaV().zzb().zzb("Got multiple records for app config, expected one. appId", zzgu.zzl(str));
                        }
                        if (blob != null) {
                            zzaq zzaqVar = new zzaq(blob, string, string2);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
                                b = i3 % 128;
                                if (i3 % 2 == 0) {
                                    int i4 = 2 / 3;
                                }
                            }
                            return zzaqVar;
                        }
                    }
                } catch (SQLiteException e3) {
                    e2 = e3;
                    this.zzu.zzaV().zzb().zzc("Error querying remote config. appId", zzgu.zzl(str), e2);
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
                    b = i5 % 128;
                    int i6 = i5 % 2;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e2 = e4;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    public final zzpn zzm(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        int i = 2 % 2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzaw();
        Cursor cursor = null;
        try {
            cursorQuery = zze().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        Object objZzL = zzL(cursorQuery, 1);
                        if (objZzL != null) {
                            zzpn zzpnVar = new zzpn(str, cursorQuery.getString(2), str2, j, objZzL);
                            if (cursorQuery.moveToNext()) {
                                int i2 = b + 83;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                                int i3 = i2 % 2;
                                this.zzu.zzaV().zzb().zzb("Got multiple records for user property, expected one. appId", zzgu.zzl(str));
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            int i4 = b + 1;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                            int i5 = i4 % 2;
                            return zzpnVar;
                        }
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
                    b = i6 % 128;
                    int i7 = i6 % 2;
                    zzic zzicVar = this.zzu;
                    zzicVar.zzaV().zzb().zzd("Error querying user property. appId", zzgu.zzl(str), zzicVar.zzl().zzc(str2), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                cursorQuery.close();
                int i9 = 14 / 0;
            } else {
                cursorQuery.close();
            }
        }
        return null;
    }

    public final List zzn(String str) {
        String str2;
        int i = 2 % 2;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzaw();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                zzic zzicVar = this.zzu;
                zzicVar.zzc();
                cursorQuery = zze().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!(!cursorQuery.moveToFirst())) {
                    do {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            int i2 = b;
                            int i3 = i2 + 43;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                            int i4 = i3 % 2;
                            int i5 = i2 + 101;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                            int i6 = i5 % 2;
                            str2 = "";
                        } else {
                            str2 = string2;
                        }
                        long j = cursorQuery.getLong(2);
                        Object objZzL = zzL(cursorQuery, 3);
                        if (objZzL == null) {
                            zzicVar.zzaV().zzb().zzb("Read invalid user property value, ignoring it. appId", zzgu.zzl(str));
                            int i7 = b + 31;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                            int i8 = i7 % 2;
                        } else {
                            arrayList.add(new zzpn(str, str2, string, j, objZzL));
                        }
                    } while (cursorQuery.moveToNext());
                    int i9 = b + 47;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                    int i10 = i9 % 2;
                }
            } catch (SQLiteException e2) {
                this.zzu.zzaV().zzb().zzc("Error querying user properties. appId", zzgu.zzl(str), e2);
                arrayList = Collections.emptyList();
            }
            if (cursorQuery != null) {
                cursorQuery.close();
                int i11 = b + 71;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                int i12 = i11 % 2;
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final boolean zzl(zzpn zzpnVar) throws IllegalAccessException {
        int i = 2 % 2;
        Preconditions.checkNotNull(zzpnVar);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 46400), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 40, 19 - (Process.myPid() >> 22), 1513912262, false, "b", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37837 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59, TextUtils.indexOf((CharSequence) "", '0', 0) + 19, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.rgb(0, 0, 0) + 16815052), 59 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = 569;
        long j3 = -1;
        long j4 = j3 ^ 3601307969255534205L;
        long j5 = j3 ^ 1917945527904252034L;
        long j6 = j4 | j5;
        long jIdentityHashCode = System.identityHashCode(this);
        long j7 = jIdentityHashCode ^ j3;
        long j8 = (j2 * 3601307969255534205L) + (j2 * 1917945527904252034L) + (((long) (-1136)) * ((j6 ^ j3) | ((j4 | j7) ^ j3) | ((j5 | j7) ^ j3))) + (((long) (-568)) * (((j4 | jIdentityHashCode) ^ j3) | ((j5 | jIdentityHashCode) ^ j3) | ((j7 | 4323433445805686527L) ^ j3))) + (((long) 568) * ((j3 ^ (j6 | jIdentityHashCode)) | ((j7 | 3601307969255534205L) ^ j3) | ((j7 | 1917945527904252034L) ^ j3)));
        long j9 = j;
        int i4 = 0;
        while (true) {
            int i5 = 0;
            while (i5 != 8) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i7 = i6 + 33;
                b = i7 % 128;
                int i8 = i7 % 2;
                i3 = (((((int) (j9 >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
                i5++;
                int i9 = i6 + 7;
                b = i9 % 128;
                int i10 = i9 % 2;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j9 = j8;
        }
        if (i3 != i2) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 46400), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            throw null;
        }
        zzg();
        zzaw();
        String str = zzpnVar.zza;
        String str2 = zzpnVar.zzc;
        if (zzm(str, str2) == null) {
            if (zzpp.zzh(str2)) {
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                b = i11 % 128;
                int i12 = i11 % 2;
                if (zzay("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.zzu.zzc().zzn(str, zzfy.zzV, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jZzay = zzay("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, zzpnVar.zzb});
                this.zzu.zzc();
                if (jZzay >= 25) {
                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                    b = i13 % 128;
                    if (i13 % 2 != 0) {
                        return false;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzpnVar.zzb);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(zzpnVar.zzd));
        zzau(contentValues, "value", zzpnVar.zze);
        try {
            if (zze().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzu.zzaV().zzb().zzb("Failed to insert/update user property (got -1). appId", zzgu.zzl(str));
            int i14 = b + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
            if (i14 % 2 == 0) {
                return true;
            }
            int i15 = 3 % 2;
            return true;
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzc("Error storing user property. appId", zzgu.zzl(zzpnVar.zza), e2);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0051  */
    public final boolean zzz(com.google.android.gms.internal.measurement.zzid zzidVar, boolean z) {
        int i = 2 % 2;
        int i2 = b + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        zzaw();
        Preconditions.checkNotNull(zzidVar);
        Preconditions.checkNotEmpty(zzidVar.zzA());
        Preconditions.checkState(zzidVar.zzn());
        zzI();
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzaZ().currentTimeMillis();
        long jZzo = zzidVar.zzo();
        zzicVar.zzc();
        if (jZzo >= jCurrentTimeMillis - zzal.zzI()) {
            long jZzo2 = zzidVar.zzo();
            zzicVar.zzc();
            if (jZzo2 > zzal.zzI() + jCurrentTimeMillis) {
                zzicVar.zzaV().zze().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzgu.zzl(zzidVar.zzA()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzidVar.zzo()));
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
                b = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            zzicVar.zzaV().zze().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzgu.zzl(zzidVar.zzA()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzidVar.zzo()));
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        try {
            byte[] bArrZzv = this.zzg.zzp().zzv(zzidVar.zzcc());
            zzic zzicVar2 = this.zzu;
            zzicVar2.zzaV().zzk().zzb("Saving bundle, size", Integer.valueOf(bArrZzv.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzidVar.zzA());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzidVar.zzo()));
            contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArrZzv);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (!(!zzidVar.zzaa())) {
                contentValues.put("retry_count", Integer.valueOf(zzidVar.zzab()));
            }
            try {
                if (zze().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzicVar2.zzaV().zzb().zzb("Failed to insert bundle (got -1). appId", zzgu.zzl(zzidVar.zzA()));
                return false;
            } catch (SQLiteException e2) {
                this.zzu.zzaV().zzb().zzc("Error storing bundle. appId", zzgu.zzl(zzidVar.zzA()), e2);
                return false;
            }
        } catch (IOException e3) {
            this.zzu.zzaV().zzb().zzc("Data loss. Failed to serialize bundle. appId", zzgu.zzl(zzidVar.zzA()), e3);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0196  */
    public final zzar zzx(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        int i = 2 % 2;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzaw();
        String[] strArr = {str};
        zzar zzarVar = new zzar();
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            cursorQuery = sQLiteDatabaseZze.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j) {
                        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
                        b = i2 % 128;
                        int i3 = i2 % 2;
                        zzarVar.zzb = cursorQuery.getLong(1);
                        zzarVar.zza = cursorQuery.getLong(2);
                        zzarVar.zzc = cursorQuery.getLong(3);
                        zzarVar.zzd = cursorQuery.getLong(4);
                        zzarVar.zze = cursorQuery.getLong(5);
                        zzarVar.zzf = cursorQuery.getLong(6);
                        zzarVar.zzg = cursorQuery.getLong(7);
                    }
                    if (z) {
                        zzarVar.zzb += j2;
                    }
                    if (z2) {
                        zzarVar.zza += j2;
                        int i4 = b + 27;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    if (z3) {
                        zzarVar.zzc += j2;
                    }
                    if (z4) {
                        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                        b = i6 % 128;
                        if (i6 % 2 == 0) {
                            zzarVar.zzd %= j2;
                        } else {
                            zzarVar.zzd += j2;
                        }
                    }
                    if (z5) {
                        zzarVar.zze += j2;
                    }
                    if (z6) {
                        zzarVar.zzf += j2;
                    }
                    if (z7) {
                        zzarVar.zzg += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(zzarVar.zza));
                    contentValues.put("daily_events_count", Long.valueOf(zzarVar.zzb));
                    contentValues.put("daily_conversions_count", Long.valueOf(zzarVar.zzc));
                    contentValues.put("daily_error_events_count", Long.valueOf(zzarVar.zzd));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(zzarVar.zze));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(zzarVar.zzf));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(zzarVar.zzg));
                    sQLiteDatabaseZze.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.zzu.zzaV().zze().zzb("Not updating daily counts, app is not known. appId", zzgu.zzl(str));
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor = cursorQuery;
                try {
                    this.zzu.zzaV().zzb().zzc("Error updating daily counts. appId", zzgu.zzl(str), e);
                    cursorQuery = cursor;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return zzarVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (r7 < 1000) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        r10 = com.google.android.gms.measurement.internal.zzav.b + 55;
        com.google.android.gms.measurement.internal.zzav.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        if (r7 < 1000) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzp(com.google.android.gms.measurement.internal.zzah r10) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzav.zzp(com.google.android.gms.measurement.internal.zzah):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0173  */
    public final zzah zzq(String str, String str2) throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        boolean z;
        int i = 2 % 2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzaw();
        try {
            cursorQuery = zze().query("conditional_properties", new String[]{"origin", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        String str3 = string;
                        Object objZzL = zzL(cursorQuery, 1);
                        if (cursorQuery.getInt(2) != 0) {
                            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                            b = i2 % 128;
                            int i3 = i2 % 2;
                            z = true;
                        } else {
                            int i4 = b + 83;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                            int i5 = i4 % 2;
                            z = false;
                        }
                        String string2 = cursorQuery.getString(3);
                        long j = cursorQuery.getLong(4);
                        zzpg zzpgVar = this.zzg;
                        zzah zzahVar = new zzah(str, str3, new zzpl(str2, cursorQuery.getLong(8), objZzL, str3), cursorQuery.getLong(6), z, string2, (zzbg) zzpgVar.zzp().zzl(cursorQuery.getBlob(5), zzbg.CREATOR), j, (zzbg) zzpgVar.zzp().zzl(cursorQuery.getBlob(7), zzbg.CREATOR), cursorQuery.getLong(9), (zzbg) zzpgVar.zzp().zzl(cursorQuery.getBlob(10), zzbg.CREATOR));
                        if (cursorQuery.moveToNext()) {
                            zzic zzicVar = this.zzu;
                            zzicVar.zzaV().zzb().zzc("Got multiple records for conditional property, expected one", zzgu.zzl(str), zzicVar.zzl().zzc(str2));
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return zzahVar;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzic zzicVar2 = this.zzu;
                    zzicVar2.zzaV().zzb().zzd("Error querying conditional property", zzgu.zzl(str), zzicVar2.zzl().zzc(str2), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                    b = i6 % 128;
                    int i7 = i6 % 2;
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
            b = i8 % 128;
            int i9 = i8 % 2;
            cursor = null;
            if (cursor != null) {
                cursor.close();
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                b = i10 % 128;
                int i11 = i10 % 2;
            }
            throw th;
        }
        if (cursorQuery == null) {
            return null;
        }
        cursorQuery.close();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x019b  */
    public final List zzt(String str, String[] strArr) throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        int i = 2 % 2;
        zzg();
        zzaw();
        List arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            String[] strArr2 = {"app_id", "origin", "name", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
            zzic zzicVar = this.zzu;
            zzicVar.zzc();
            int i2 = 4;
            cursorQuery = sQLiteDatabaseZze.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
            try {
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        int size = arrayList.size();
                        zzicVar.zzc();
                        if (size < 1000) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            String string3 = cursorQuery.getString(2);
                            Object objZzL = zzL(cursorQuery, 3);
                            boolean z = cursorQuery.getInt(i2) != 0;
                            String string4 = cursorQuery.getString(5);
                            long j = cursorQuery.getLong(6);
                            zzpg zzpgVar = this.zzg;
                            arrayList.add(new zzah(string, string2, new zzpl(string3, cursorQuery.getLong(10), objZzL, string2), cursorQuery.getLong(8), z, string4, (zzbg) zzpgVar.zzp().zzl(cursorQuery.getBlob(7), zzbg.CREATOR), j, (zzbg) zzpgVar.zzp().zzl(cursorQuery.getBlob(9), zzbg.CREATOR), cursorQuery.getLong(11), (zzbg) zzpgVar.zzp().zzl(cursorQuery.getBlob(12), zzbg.CREATOR)));
                            if (!cursorQuery.moveToNext()) {
                                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
                                b = i3 % 128;
                                int i4 = i3 % 2;
                                break;
                            }
                            i2 = 4;
                        } else {
                            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
                            b = i5 % 128;
                            if (i5 % 2 != 0) {
                                zzgs zzgsVarZzb = zzicVar.zzaV().zzb();
                                zzicVar.zzc();
                                zzgsVarZzb.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
                                break;
                            }
                            zzgs zzgsVarZzb2 = zzicVar.zzaV().zzb();
                            zzicVar.zzc();
                            zzgsVarZzb2.zzb("Read more than the max allowed conditional properties, ignoring extra", 21809);
                            break;
                        }
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor = cursorQuery;
                try {
                    this.zzu.zzaV().zzb().zzb("Error querying conditional user property value", e);
                    arrayList = Collections.emptyList();
                    cursorQuery = cursor;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public final List zzo(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        String string = str2;
        int i = 2 % 2;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzaw();
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                int i2 = 3;
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb = new StringBuilder("app_id=?");
                    if (!TextUtils.isEmpty(str2)) {
                        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
                        b = i3 % 128;
                        if (i3 % 2 == 0) {
                            arrayList2.add(string);
                            sb.append(" and origin=?");
                            cursor.hashCode();
                            throw null;
                        }
                        arrayList2.add(string);
                        sb.append(" and origin=?");
                        int i4 = b + 79;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    int i6 = 1;
                    if (!TextUtils.isEmpty(str3)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                        sb2.append(str3);
                        sb2.append("*");
                        arrayList2.add(sb2.toString());
                        sb.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    int i7 = 0;
                    String string2 = sb.toString();
                    zzic zzicVar = this.zzu;
                    zzicVar.zzc();
                    cursorQuery = zze().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string2, strArr, null, null, "rowid", "1001");
                    try {
                        if (cursorQuery.moveToFirst()) {
                            while (true) {
                                int size = arrayList.size();
                                zzicVar.zzc();
                                if (size >= 1000) {
                                    zzgs zzgsVarZzb = zzicVar.zzaV().zzb();
                                    zzicVar.zzc();
                                    zzgsVarZzb.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
                                    break;
                                }
                                String string3 = cursorQuery.getString(i7);
                                long j = cursorQuery.getLong(i6);
                                Object objZzL = zzL(cursorQuery, 2);
                                string = cursorQuery.getString(i2);
                                if (objZzL == null) {
                                    zzicVar.zzaV().zzb().zzd("(2)Read invalid user property value, ignoring it", zzgu.zzl(str), string, str3);
                                } else {
                                    arrayList.add(new zzpn(str, string, string3, j, objZzL));
                                }
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                }
                                i6 = i6;
                                zzicVar = zzicVar;
                                i7 = i7;
                                i2 = 3;
                            }
                        } else {
                            int i8 = b + 23;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                            if (i8 % 2 != 0) {
                                cursor.hashCode();
                                throw null;
                            }
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursor = cursorQuery;
                        this.zzu.zzaV().zzb().zzd("(2)Error querying user properties", zzgu.zzl(str), string, e);
                        arrayList = Collections.emptyList();
                        cursorQuery = cursor;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                }
            } catch (SQLiteException e4) {
                e = e4;
            }
            if (cursorQuery != null) {
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
                b = i9 % 128;
                int i10 = i9 % 2;
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0436  */
    /* JADX WARN: Code duplicated, block: B:55:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:70:0x0357  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    public final zzh zzu(String str) throws Throwable {
        ?? r3;
        Cursor cursorQuery;
        long j;
        boolean z;
        boolean z2;
        Boolean boolValueOf;
        String str2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        ?? r5 = i2 % 128;
        b = r5;
        int i3 = i2 % 2;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzaw();
        try {
            try {
                cursorQuery = zze().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        zzpg zzpgVar = this.zzg;
                        zzh zzhVar = new zzh(zzpgVar.zzag(), str);
                        zzjl zzjlVarZzB = zzpgVar.zzB(str);
                        zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
                        if (zzjlVarZzB.zzo(zzjkVar)) {
                            zzhVar.zze(cursorQuery.getString(0));
                        }
                        zzhVar.zzg(cursorQuery.getString(1));
                        if (!(!zzpgVar.zzB(str).zzo(zzjk.AD_STORAGE))) {
                            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                            b = i4 % 128;
                            int i5 = i4 % 2;
                            zzhVar.zzk(cursorQuery.getString(2));
                        }
                        zzhVar.zzF(cursorQuery.getLong(3));
                        zzhVar.zzo(cursorQuery.getLong(4));
                        zzhVar.zzq(cursorQuery.getLong(5));
                        zzhVar.zzs(cursorQuery.getString(6));
                        zzhVar.zzw(cursorQuery.getString(7));
                        zzhVar.zzy(cursorQuery.getLong(8));
                        zzhVar.zzA(cursorQuery.getLong(9));
                        zzhVar.zzE(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        zzhVar.zzO(cursorQuery.getLong(11));
                        zzhVar.zzQ(cursorQuery.getLong(12));
                        zzhVar.zzS(cursorQuery.getLong(13));
                        zzhVar.zzU(cursorQuery.getLong(14));
                        zzhVar.zzI(cursorQuery.getLong(15));
                        zzhVar.zzK(cursorQuery.getLong(16));
                        zzhVar.zzu(cursorQuery.isNull(17) ? SieveCacheKt.NodeMetaAndPreviousMask : cursorQuery.getInt(17));
                        zzhVar.zzm(cursorQuery.getString(18));
                        zzhVar.zzY(cursorQuery.getLong(19));
                        zzhVar.zzW(cursorQuery.getLong(20));
                        zzhVar.zzab(cursorQuery.getString(21));
                        zzhVar.zzad(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                        if (cursorQuery.isNull(25)) {
                            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                            b = i6 % 128;
                            int i7 = i6 % 2;
                            j = 0;
                        } else {
                            j = cursorQuery.getLong(25);
                        }
                        zzhVar.zzC(j);
                        if (!cursorQuery.isNull(26)) {
                            zzhVar.zzah(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (!(!zzpgVar.zzB(str).zzo(zzjkVar))) {
                            int i8 = b + 93;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                            if (i8 % 2 != 0) {
                                zzhVar.zzi(cursorQuery.getString(13));
                            } else {
                                zzhVar.zzi(cursorQuery.getString(28));
                            }
                        }
                        if (cursorQuery.isNull(29)) {
                            z = false;
                        } else {
                            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
                            b = i9 % 128;
                            int i10 = i9 % 2;
                            if (cursorQuery.getInt(29) != 0) {
                                int i11 = b + 39;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                                int i12 = i11 % 2;
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        zzhVar.zzaj(z);
                        zzhVar.zzaE(cursorQuery.getLong(39));
                        zzhVar.zzaz(cursorQuery.getString(36));
                        zzhVar.zzal(cursorQuery.getLong(30));
                        zzhVar.zzan(cursorQuery.getLong(31));
                        zzqp.zza();
                        zzic zzicVar = this.zzu;
                        if (zzicVar.zzc().zzp(str, zzfy.zzaP)) {
                            zzhVar.zzap(cursorQuery.getInt(32));
                            zzhVar.zzax(cursorQuery.getLong(35));
                        }
                        if (cursorQuery.isNull(33)) {
                            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                            b = i13 % 128;
                            int i14 = i13 % 2;
                            z2 = false;
                        } else {
                            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
                            b = i15 % 128;
                            if (i15 % 2 == 0) {
                                if (cursorQuery.getInt(23) != 0) {
                                    z2 = true;
                                } else {
                                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                                    b = i16 % 128;
                                    int i17 = i16 % 2;
                                    z2 = false;
                                }
                            } else if (cursorQuery.getInt(33) != 0) {
                                z2 = true;
                            } else {
                                int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                                b = i18 % 128;
                                int i19 = i18 % 2;
                                z2 = false;
                            }
                        }
                        zzhVar.zzar(z2);
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        zzhVar.zzaf(boolValueOf);
                        zzhVar.zzaB(cursorQuery.getInt(37));
                        zzhVar.zzaD(cursorQuery.getInt(38));
                        if (!cursorQuery.isNull(40)) {
                            str2 = (String) Preconditions.checkNotNull(cursorQuery.getString(40));
                        } else {
                            int i20 = b + 13;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i20 % 128;
                            int i21 = i20 % 2;
                            str2 = "";
                        }
                        zzhVar.zzaG(str2);
                        if (!cursorQuery.isNull(41)) {
                            zzhVar.zzat(Long.valueOf(cursorQuery.getLong(41)));
                        }
                        if (!cursorQuery.isNull(42)) {
                            zzhVar.zzav(Long.valueOf(cursorQuery.getLong(42)));
                        }
                        zzhVar.zzaI(cursorQuery.getBlob(43));
                        if (!cursorQuery.isNull(44)) {
                            zzhVar.zzaK(cursorQuery.getInt(44));
                        }
                        zzhVar.zzb();
                        if (cursorQuery.moveToNext()) {
                            zzicVar.zzaV().zzb().zzb("Got multiple records for app, expected one. appId", zzgu.zzl(str));
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return zzhVar;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzu.zzaV().zzb().zzc("Error querying app. appId", zzgu.zzl(str), e);
                }
            } catch (Throwable th) {
                th = th;
                r3 = r5;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            r3 = 0;
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
        if (cursorQuery == null) {
            return null;
        }
        cursorQuery.close();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x029f  */
    public final void zzv(zzh zzhVar, boolean z, boolean z2) {
        int i = 2 % 2;
        Preconditions.checkNotNull(zzhVar);
        zzg();
        zzaw();
        String strZzc = zzhVar.zzc();
        Preconditions.checkNotNull(strZzc);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strZzc);
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.zzg.zzB(strZzc).zzo(zzjk.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", zzhVar.zzd());
        }
        contentValues.put("gmp_app_id", zzhVar.zzf());
        zzpg zzpgVar = this.zzg;
        if (zzpgVar.zzB(strZzc).zzo(zzjk.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", zzhVar.zzj());
        }
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzG()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzn()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("app_version", zzhVar.zzr());
        contentValues.put("app_store", zzhVar.zzv());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzx()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzz()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzD()));
        contentValues.put("day", Long.valueOf(zzhVar.zzN()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzP()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzR()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzT()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzH()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzJ()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzt()));
        contentValues.put("firebase_instance_id", zzhVar.zzl());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zzX()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzV()));
        contentValues.put("health_monitor_sample", zzhVar.zzZ());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzac()));
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzB()));
        if (zzpgVar.zzB(strZzc).zzo(zzjk.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", zzhVar.zzh());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.zzai()));
        contentValues.put("target_os_version", Long.valueOf(zzhVar.zzak()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzhVar.zzam()));
        zzqp.zza();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzc().zzp(strZzc, zzfy.zzaP)) {
            contentValues.put("ad_services_version", Integer.valueOf(zzhVar.zzao()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(zzhVar.zzaw()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzhVar.zzaq()));
        contentValues.put("npa_metadata_value", zzhVar.zzae());
        contentValues.put("bundle_delivery_index", Long.valueOf(zzhVar.zzaF()));
        contentValues.put("sgtm_preview_key", zzhVar.zzay());
        contentValues.put("dma_consent_state", Integer.valueOf(zzhVar.zzaA()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(zzhVar.zzaC()));
        contentValues.put("serialized_npa_metadata", zzhVar.zzaH());
        contentValues.put("client_upload_eligibility", Integer.valueOf(zzhVar.zzaL()));
        List listZzag = zzhVar.zzag();
        if (listZzag != null) {
            if (listZzag.isEmpty()) {
                int i2 = b + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                if (i2 % 2 != 0) {
                    zzicVar.zzaV().zze().zzb("Safelisted events should not be an empty list. appId", strZzc);
                    int i3 = 96 / 0;
                } else {
                    zzicVar.zzaV().zze().zzb("Safelisted events should not be an empty list. appId", strZzc);
                }
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listZzag));
            }
        }
        zzpr.zza();
        if (zzicVar.zzc().zzp(null, zzfy.zzaK)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 20 / 0;
                if (!contentValues.containsKey("safelisted_events")) {
                    contentValues.put("safelisted_events", (String) null);
                }
            } else if (!contentValues.containsKey("safelisted_events")) {
                contentValues.put("safelisted_events", (String) null);
            }
        }
        contentValues.put("unmatched_pfo", zzhVar.zzas());
        contentValues.put("unmatched_uwa", zzhVar.zzau());
        contentValues.put("ad_campaign_info", zzhVar.zzaJ());
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            if (sQLiteDatabaseZze.update("apps", contentValues, "app_id = ?", new String[]{strZzc}) == 0 && sQLiteDatabaseZze.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                int i6 = b + 103;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                if (i6 % 2 == 0) {
                    zzicVar.zzaV().zzb().zzb("Failed to insert/update app (got -1). appId", zzgu.zzl(strZzc));
                } else {
                    zzicVar.zzaV().zzb().zzb("Failed to insert/update app (got -1). appId", zzgu.zzl(strZzc));
                    int i7 = 23 / 0;
                }
            }
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzc("Error storing app. appId", zzgu.zzl(strZzc), e2);
        }
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        b();
        zzb = new String[]{"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
        zza = new String[]{"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
        zzc = new String[]{"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
        zzd = new String[]{"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
        zze = new String[]{"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
        zzf = new String[]{"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
        zzh = new String[]{"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
        zzi = new String[]{"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
        zzj = new String[]{"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
        zzk = new String[]{"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
        zzl = new String[]{"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
        int i = TuitionPaymentFragmentbindingInflater1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    static /* synthetic */ String[] zzai() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String[] strArr = zzb;
        int i5 = i2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return strArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ String[] zzaj() {
        int i = 2 % 2;
        int i2 = b + 51;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String[] strArr = zzc;
        int i4 = i3 + 65;
        b = i4 % 128;
        int i5 = i4 % 2;
        return strArr;
    }

    static /* synthetic */ String[] zzak() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String[] strArr = zzd;
        int i5 = i3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return strArr;
        }
        throw null;
    }

    static /* synthetic */ String[] zzal() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        b = i2 % 128;
        int i3 = i2 % 2;
        String[] strArr = zze;
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return strArr;
    }

    static /* synthetic */ String[] zzam() {
        int i = 2 % 2;
        int i2 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return zzf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ String[] zzan() {
        int i = 2 % 2;
        int i2 = b + 105;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String[] strArr = zzh;
        int i5 = i3 + 91;
        b = i5 % 128;
        int i6 = i5 % 2;
        return strArr;
    }

    static /* synthetic */ String[] zzao() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String[] strArr = zzi;
        int i5 = i2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return strArr;
    }

    static /* synthetic */ String[] zzap() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        b = i2 % 128;
        int i3 = i2 % 2;
        String[] strArr = zzj;
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return strArr;
    }

    static /* synthetic */ String[] zzaq() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return zzk;
        }
        throw null;
    }

    static /* synthetic */ String[] zzar() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 97;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String[] strArr = zzl;
        int i4 = i2 + 61;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return strArr;
    }

    final /* synthetic */ long zzah(String str, String[] strArr, long j) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return zzaz("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
        }
        zzaz("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
        throw null;
    }

    final /* synthetic */ zzog zzas() {
        zzog zzogVar;
        int i = 2 % 2;
        int i2 = b + 115;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            zzogVar = this.zzn;
            int i4 = 7 / 0;
        } else {
            zzogVar = this.zzn;
        }
        int i5 = i3 + 93;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
        return zzogVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    protected final boolean zzbb() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return false;
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 5772485330732711912L;
    }
}
