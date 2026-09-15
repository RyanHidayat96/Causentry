package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class zzad extends zzos {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzad(zzpg zzpgVar) {
        super(zzpgVar);
    }

    private final zzy zzc(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzy) this.zzc.get(num);
        }
        zzy zzyVar = new zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzd(int i, int i2) {
        zzy zzyVar = (zzy) this.zzc.get(Integer.valueOf(i));
        if (zzyVar == null) {
            return false;
        }
        return zzyVar.zzc().get(i2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x028f A[Catch: SQLiteException -> 0x02c4, all -> 0x03fa, LOOP:11: B:101:0x028f->B:514:?, LOOP_START, TryCatch #16 {all -> 0x03fa, blocks: (B:99:0x0289, B:101:0x028f, B:103:0x02a0, B:104:0x02a8, B:108:0x02bd, B:117:0x02cc), top: B:450:0x027f }] */
    /* JADX WARN: Code duplicated, block: B:103:0x02a0 A[Catch: SQLiteException -> 0x02c4, all -> 0x03fa, TryCatch #16 {all -> 0x03fa, blocks: (B:99:0x0289, B:101:0x028f, B:103:0x02a0, B:104:0x02a8, B:108:0x02bd, B:117:0x02cc), top: B:450:0x027f }] */
    /* JADX WARN: Code duplicated, block: B:107:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:108:0x02bd A[Catch: SQLiteException -> 0x02c4, all -> 0x03fa, TRY_LEAVE, TryCatch #16 {all -> 0x03fa, blocks: (B:99:0x0289, B:101:0x028f, B:103:0x02a0, B:104:0x02a8, B:108:0x02bd, B:117:0x02cc), top: B:450:0x027f }] */
    /* JADX WARN: Code duplicated, block: B:119:0x02e5 A[PHI: r0 r5
  0x02e5: PHI (r0v57 java.util.Map) = (r0v43 java.util.Map), (r0v59 java.util.Map), (r0v37 java.util.Map) binds: [B:118:0x02e3, B:109:0x02c1, B:107:0x02bc] A[DONT_GENERATE, DONT_INLINE]
  0x02e5: PHI (r5v21 android.database.Cursor) = (r5v9 android.database.Cursor), (r5v22 android.database.Cursor), (r5v22 android.database.Cursor) binds: [B:118:0x02e3, B:109:0x02c1, B:107:0x02bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:126:0x030b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0327  */
    /* JADX WARN: Code duplicated, block: B:153:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:155:0x0401  */
    /* JADX WARN: Code duplicated, block: B:159:0x040e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0433  */
    /* JADX WARN: Code duplicated, block: B:167:0x0448  */
    /* JADX WARN: Code duplicated, block: B:171:0x045e  */
    /* JADX WARN: Code duplicated, block: B:172:0x0467  */
    /* JADX WARN: Code duplicated, block: B:176:0x0477  */
    /* JADX WARN: Code duplicated, block: B:182:0x048c  */
    /* JADX WARN: Code duplicated, block: B:189:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:192:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:194:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:196:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:197:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:202:0x051c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:227:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:230:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:236:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:244:0x0644  */
    /* JADX WARN: Code duplicated, block: B:251:0x066c  */
    /* JADX WARN: Code duplicated, block: B:253:0x0677  */
    /* JADX WARN: Code duplicated, block: B:260:0x069b  */
    /* JADX WARN: Code duplicated, block: B:262:0x06a0 A[LOOP:8: B:245:0x0646->B:262:0x06a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:265:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:268:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:289:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:293:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:295:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:299:0x0710  */
    /* JADX WARN: Code duplicated, block: B:305:0x0745  */
    /* JADX WARN: Code duplicated, block: B:307:0x0770 A[LOOP:10: B:303:0x073f->B:307:0x0770, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:313:0x079d  */
    /* JADX WARN: Code duplicated, block: B:316:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:319:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:321:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:329:0x0807 A[Catch: SQLiteException -> 0x0868, all -> 0x0890, LOOP:3: B:329:0x0807->B:484:?, LOOP_START, TRY_LEAVE, TryCatch #9 {SQLiteException -> 0x0868, blocks: (B:327:0x0801, B:329:0x0807, B:330:0x080c), top: B:440:0x0801 }] */
    /* JADX WARN: Code duplicated, block: B:334:0x082d A[Catch: SQLiteException -> 0x0866, all -> 0x0890, TryCatch #14 {SQLiteException -> 0x0866, blocks: (B:332:0x081d, B:334:0x082d, B:335:0x0835, B:338:0x084e, B:337:0x083a, B:344:0x085c), top: B:447:0x081d }] */
    /* JADX WARN: Code duplicated, block: B:341:0x0856  */
    /* JADX WARN: Code duplicated, block: B:343:0x085b  */
    /* JADX WARN: Code duplicated, block: B:346:0x0862 A[PHI: r0 r9
  0x0862: PHI (r0v145 java.util.Map) = (r0v147 java.util.Map), (r0v154 java.util.Map) binds: [B:359:0x0889, B:345:0x0860] A[DONT_GENERATE, DONT_INLINE]
  0x0862: PHI (r9v19 android.database.Cursor) = (r9v20 android.database.Cursor), (r9v23 android.database.Cursor) binds: [B:359:0x0889, B:345:0x0860] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:367:0x0898  */
    /* JADX WARN: Code duplicated, block: B:371:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:374:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:377:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:379:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:381:0x0902  */
    /* JADX WARN: Code duplicated, block: B:382:0x090b  */
    /* JADX WARN: Code duplicated, block: B:384:0x093b  */
    /* JADX WARN: Code duplicated, block: B:387:0x0943  */
    /* JADX WARN: Code duplicated, block: B:396:0x0993  */
    /* JADX WARN: Code duplicated, block: B:397:0x099c  */
    /* JADX WARN: Code duplicated, block: B:401:0x09ab A[PHI: r31
  0x09ab: PHI (r31v7 java.util.Map) = (r31v8 java.util.Map), (r0v124 java.util.Map) binds: [B:400:0x09a9, B:398:0x099d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:406:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:411:0x0a35 A[Catch: SQLiteException -> 0x0a49, TRY_LEAVE, TryCatch #30 {SQLiteException -> 0x0a49, blocks: (B:409:0x0a2b, B:411:0x0a35), top: B:464:0x0a2b }] */
    /* JADX WARN: Code duplicated, block: B:420:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:479:0x08bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x09b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x097f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x09a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x0a60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x05d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x05ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x05c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x05c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x0699 A[EDGE_INSN: B:502:0x0699->B:259:0x0699 BREAK  A[LOOP:8: B:245:0x0646->B:262:0x06a0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x0734 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x0726 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x0787 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x070a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x077c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x057a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x0454 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x0498 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x0486 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:0x03e7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0213 A[EDGE_INSN: B:557:0x0213->B:76:0x0213 BREAK  A[LOOP:20: B:67:0x01cb->B:79:0x021b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x017a  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b8 A[Catch: SQLiteException -> 0x0223, all -> 0x0a6d, TRY_LEAVE, TryCatch #6 {all -> 0x0a6d, blocks: (B:60:0x01b2, B:62:0x01b8, B:66:0x01c6, B:67:0x01cb, B:68:0x01d5, B:69:0x01e5, B:74:0x020d, B:71:0x01f2, B:73:0x0206, B:88:0x022f), top: B:435:0x01b2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01be  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c6 A[Catch: SQLiteException -> 0x0223, all -> 0x0a6d, TRY_ENTER, TryCatch #6 {all -> 0x0a6d, blocks: (B:60:0x01b2, B:62:0x01b8, B:66:0x01c6, B:67:0x01cb, B:68:0x01d5, B:69:0x01e5, B:74:0x020d, B:71:0x01f2, B:73:0x0206, B:88:0x022f), top: B:435:0x01b2 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0215  */
    /* JADX WARN: Code duplicated, block: B:79:0x021b A[LOOP:20: B:67:0x01cb->B:79:0x021b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x0252  */
    /* JADX WARN: Code duplicated, block: B:95:0x0258  */
    /* JADX WARN: Code duplicated, block: B:97:0x0263  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v197, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r4v28, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v65, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v69, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r5v71, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v72 */
    /* JADX WARN: Type inference failed for: r5v73 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    final List zzb(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
        int i;
        int i2;
        boolean z2;
        ?? r5;
        Map map;
        Cursor cursor;
        Cursor cursorQuery;
        Map map2;
        String str2;
        Map map3;
        Iterator it;
        String str3;
        String str4;
        int iIntValue;
        com.google.android.gms.internal.measurement.zzii zziiVar;
        BitSet bitSet;
        BitSet bitSet2;
        ArrayMap arrayMap;
        List<com.google.android.gms.internal.measurement.zzff> list3;
        int i3;
        String str5;
        Long lValueOf;
        String str6;
        Map arrayMap2;
        ?? Zze;
        Cursor cursorRawQuery;
        ArrayMap arrayMap3;
        Iterator it2;
        com.google.android.gms.internal.measurement.zzii zziiVar2;
        List list4;
        Map map4;
        Iterator it3;
        String str7;
        Integer numValueOf;
        List arrayList;
        zzz zzzVar;
        ArrayMap arrayMap4;
        Iterator it4;
        com.google.android.gms.internal.measurement.zzhs zzhsVar;
        com.google.android.gms.internal.measurement.zzhs zzhsVarZza;
        zzpg zzpgVar;
        zzbc zzbcVarZzaf;
        long j;
        String strZzd;
        Map mapEmptyMap;
        String str8;
        Iterator it5;
        int iIntValue2;
        Set set;
        Integer numValueOf2;
        boolean zZzd;
        zzaa zzaaVar;
        String str9;
        ArrayMap arrayMap5;
        Cursor cursor2;
        String str10;
        Cursor cursorQuery2;
        Integer numValueOf3;
        List list5;
        List arrayList2;
        String str11;
        ArrayList arrayList3;
        Iterator it6;
        zzav zzavVarZzj;
        String str12;
        ContentValues contentValues;
        ArrayMap arrayMap6;
        Iterator it7;
        String strZzc;
        Map mapEmptyMap2;
        Iterator it8;
        int iIntValue3;
        Set set2;
        Integer numValueOf4;
        Iterator it9;
        boolean zZzd2;
        com.google.android.gms.internal.measurement.zzfn zzfnVar;
        zzic zzicVar;
        Integer numValueOf5;
        zzac zzacVar;
        Integer numValueOf6;
        String str13;
        ArrayMap arrayMap7;
        Cursor cursor3;
        Cursor cursorQuery3;
        Integer numValueOf7;
        List arrayList4;
        ArrayMap arrayMap8;
        int i4;
        Cursor cursorQuery4;
        List arrayList5;
        String str14 = "current_results";
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l;
        this.zze = l2;
        Iterator it10 = list.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (!it10.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzhs) it10.next()).zzd())) {
                z2 = true;
                break;
            }
        }
        zzpu.zza();
        zzic zzicVar2 = this.zzu;
        boolean zZzp = zzicVar2.zzc().zzp(this.zza, zzfy.zzaF);
        zzpu.zza();
        boolean zZzp2 = zzicVar2.zzc().zzp(this.zza, zzfy.zzaE);
        if (z2) {
            zzav zzavVarZzj2 = this.zzg.zzj();
            String str15 = this.zza;
            zzavVarZzj2.zzaw();
            zzavVarZzj2.zzg();
            Preconditions.checkNotEmpty(str15);
            ?? contentValues2 = new ContentValues();
            int i5 = 0;
            contentValues2.put("current_session_count", 0);
            try {
                i5 = new String[]{str15};
                zzavVarZzj2.zze().update("events", contentValues2, "app_id = ?", i5);
                r5 = i5;
            } catch (SQLiteException e2) {
                zzavVarZzj2.zzu.zzaV().zzb().zzc("Error resetting session-scoped event counts. appId", zzgu.zzl(str15), e2);
                r5 = i5;
            }
        }
        Map mapEmptyMap3 = Collections.emptyMap();
        String str16 = "Failed to merge filter. appId";
        String str17 = "Database error querying filters. appId";
        String str18 = "audience_id";
        if (zZzp2 && zZzp) {
            zzav zzavVarZzj3 = this.zzg.zzj();
            String str19 = this.zza;
            Preconditions.checkNotEmpty(str19);
            ArrayMap arrayMap9 = new ArrayMap();
            try {
                try {
                    cursorQuery4 = zzavVarZzj3.zze().query("event_filters", new String[]{"audience_id", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, "app_id=?", new String[]{str19}, null, null, null);
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery4.getBlob(i2))).zzbc();
                                    if (zzffVar.zzg()) {
                                        Integer numValueOf8 = Integer.valueOf(cursorQuery4.getInt(i));
                                        List list6 = (List) arrayMap9.get(numValueOf8);
                                        if (list6 == null) {
                                            arrayList5 = new ArrayList();
                                            arrayMap9.put(numValueOf8, arrayList5);
                                        } else {
                                            arrayList5 = list6;
                                        }
                                        arrayList5.add(zzffVar);
                                    }
                                } catch (IOException e3) {
                                    zzavVarZzj3.zzu.zzaV().zzb().zzc("Failed to merge filter. appId", zzgu.zzl(str19), e3);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i = 0;
                                i2 = 1;
                            }
                            if (cursorQuery4 != null) {
                                cursorQuery4.close();
                            }
                            map = arrayMap9;
                        } else {
                            mapEmptyMap3 = Collections.emptyMap();
                            if (cursorQuery4 != null) {
                                cursorQuery4.close();
                            }
                            map = mapEmptyMap3;
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        zzavVarZzj3.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str19), e);
                        mapEmptyMap3 = Collections.emptyMap();
                        if (cursorQuery4 != null) {
                        }
                        map = mapEmptyMap3;
                        zzav zzavVarZzj4 = this.zzg.zzj();
                        String str20 = this.zza;
                        zzavVarZzj4.zzaw();
                        zzavVarZzj4.zzg();
                        Preconditions.checkNotEmpty(str20);
                        cursorQuery = zzavVarZzj4.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str20}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    arrayMap8 = new ArrayMap();
                                    while (true) {
                                        i4 = cursorQuery.getInt(0);
                                        try {
                                            arrayMap8.put(Integer.valueOf(i4), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.zzw(com.google.android.gms.internal.measurement.zzii.zzi(), cursorQuery.getBlob(1))).zzbc());
                                        } catch (IOException e5) {
                                            zzavVarZzj4.zzu.zzaV().zzb().zzd("Failed to merge filter results. appId, audienceId, error", zzgu.zzl(str20), Integer.valueOf(i4), e5);
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            arrayMap8 = arrayMap8;
                                            str18 = str18;
                                        } catch (SQLiteException e6) {
                                            e = e6;
                                            zzavVarZzj4.zzu.zzaV().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str20), e);
                                            Map mapEmptyMap4 = Collections.emptyMap();
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = mapEmptyMap4;
                                        }
                                    }
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    map2 = arrayMap8;
                                } else {
                                    Map mapEmptyMap5 = Collections.emptyMap();
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    map2 = mapEmptyMap5;
                                    str18 = "audience_id";
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e7) {
                            e = e7;
                            str18 = "audience_id";
                        }
                        if (map2.isEmpty()) {
                            str4 = "Database error querying filters. appId";
                            str3 = "Failed to merge filter. appId";
                        } else {
                            HashSet hashSet = new HashSet(map2.keySet());
                            if (z2) {
                                String str21 = this.zza;
                                zzav zzavVarZzj5 = this.zzg.zzj();
                                str6 = this.zza;
                                zzavVarZzj5.zzaw();
                                zzavVarZzj5.zzg();
                                Preconditions.checkNotEmpty(str6);
                                arrayMap2 = new ArrayMap();
                                Zze = zzavVarZzj5.zze();
                                try {
                                    try {
                                        cursorRawQuery = Zze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                        try {
                                            if (cursorRawQuery.moveToFirst()) {
                                                do {
                                                    numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                    arrayList = (List) arrayMap2.get(numValueOf);
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                        arrayMap2.put(numValueOf, arrayList);
                                                    }
                                                    arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                } while (cursorRawQuery.moveToNext());
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                            } else {
                                                arrayMap2 = Collections.emptyMap();
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                            }
                                        } catch (SQLiteException e8) {
                                            e = e8;
                                            zzavVarZzj5.zzu.zzaV().zzb().zzc("Database error querying scoped filters. appId", zzgu.zzl(str6), e);
                                            arrayMap2 = Collections.emptyMap();
                                            if (cursorRawQuery != null) {
                                            }
                                            Preconditions.checkNotEmpty(str21);
                                            Preconditions.checkNotNull(map2);
                                            arrayMap3 = new ArrayMap();
                                            if (!map2.isEmpty()) {
                                                it2 = map2.keySet().iterator();
                                                while (it2.hasNext()) {
                                                    int iIntValue4 = ((Integer) it2.next()).intValue();
                                                    Integer numValueOf9 = Integer.valueOf(iIntValue4);
                                                    zziiVar2 = (com.google.android.gms.internal.measurement.zzii) map2.get(numValueOf9);
                                                    list4 = (List) arrayMap2.get(numValueOf9);
                                                    if (list4 != null) {
                                                    }
                                                    map4 = arrayMap2;
                                                    it3 = it2;
                                                    str7 = str17;
                                                    arrayMap3.put(numValueOf9, zziiVar2);
                                                    arrayMap2 = map4;
                                                    it2 = it3;
                                                    str17 = str7;
                                                }
                                            }
                                            str2 = str17;
                                            map3 = arrayMap3;
                                            it = hashSet.iterator();
                                            while (it.hasNext()) {
                                                iIntValue = ((Integer) it.next()).intValue();
                                                zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(Integer.valueOf(iIntValue));
                                                bitSet = new BitSet();
                                                bitSet2 = new BitSet();
                                                arrayMap = new ArrayMap();
                                                if (zziiVar != null) {
                                                    for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zziiVar.zze()) {
                                                        if (zzhqVar.zza()) {
                                                            int iZzb = zzhqVar.zzb();
                                                            if (zzhqVar.zzc()) {
                                                                lValueOf = Long.valueOf(zzhqVar.zzd());
                                                            } else {
                                                                lValueOf = null;
                                                            }
                                                            arrayMap.put(Integer.valueOf(iZzb), lValueOf);
                                                        }
                                                    }
                                                }
                                                ArrayMap arrayMap10 = new ArrayMap();
                                                if (zziiVar != null) {
                                                    for (com.google.android.gms.internal.measurement.zzik zzikVar : zziiVar.zzg()) {
                                                        if (!zzikVar.zza()) {
                                                        }
                                                    }
                                                }
                                                Map map5 = map3;
                                                if (zziiVar != null) {
                                                    i3 = 0;
                                                    while (i3 < zziiVar.zzb() * 64) {
                                                        if (zzpk.zzn(zziiVar.zza(), i3)) {
                                                            str5 = str16;
                                                            this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i3));
                                                            bitSet2.set(i3);
                                                            if (zzpk.zzn(zziiVar.zzc(), i3)) {
                                                                bitSet.set(i3);
                                                            }
                                                            i3++;
                                                            str16 = str5;
                                                        } else {
                                                            str5 = str16;
                                                        }
                                                        arrayMap.remove(Integer.valueOf(i3));
                                                        i3++;
                                                        str16 = str5;
                                                    }
                                                }
                                                String str22 = str16;
                                                Integer numValueOf10 = Integer.valueOf(iIntValue);
                                                com.google.android.gms.internal.measurement.zzii zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(numValueOf10);
                                                if (!zZzp2) {
                                                }
                                                this.zzc.put(Integer.valueOf(iIntValue), new zzy(this, this.zza, zziiVar3, bitSet, bitSet2, arrayMap, arrayMap10, null));
                                                str16 = str22;
                                                map = map;
                                                map3 = map5;
                                                map2 = map2;
                                            }
                                            str3 = str16;
                                            str4 = str2;
                                            if (!list.isEmpty()) {
                                                zzzVar = new zzz(this, null);
                                                arrayMap4 = new ArrayMap();
                                                it4 = list.iterator();
                                                while (it4.hasNext()) {
                                                    zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                                                    zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                                    if (zzhsVarZza != null) {
                                                        zzpgVar = this.zzg;
                                                        zzbcVarZzaf = zzpgVar.zzj().zzaf(this.zza, zzhsVar, zzhsVarZza.zzd());
                                                        zzpgVar.zzj().zzh(zzbcVarZzaf);
                                                        if (z) {
                                                            continue;
                                                        } else {
                                                            j = zzbcVarZzaf.zzc;
                                                            strZzd = zzhsVarZza.zzd();
                                                            mapEmptyMap = (Map) arrayMap4.get(strZzd);
                                                            if (mapEmptyMap == null) {
                                                                zzav zzavVarZzj6 = zzpgVar.zzj();
                                                                str9 = this.zza;
                                                                zzavVarZzj6.zzaw();
                                                                zzavVarZzj6.zzg();
                                                                Preconditions.checkNotEmpty(str9);
                                                                Preconditions.checkNotEmpty(strZzd);
                                                                arrayMap5 = new ArrayMap();
                                                                SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj6.zze();
                                                                try {
                                                                    try {
                                                                        String[] strArr = new String[2];
                                                                        str10 = str18;
                                                                        try {
                                                                            strArr[0] = str10;
                                                                            strArr[1] = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                                                            str8 = str14;
                                                                            try {
                                                                                cursorQuery2 = sQLiteDatabaseZze.query("event_filters", strArr, "app_id=? AND event_name=?", new String[]{str9, strZzd}, null, null, null);
                                                                                try {
                                                                                    try {
                                                                                        if (cursorQuery2.moveToFirst()) {
                                                                                            str18 = str10;
                                                                                            while (true) {
                                                                                                try {
                                                                                                    try {
                                                                                                        com.google.android.gms.internal.measurement.zzff zzffVar2 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery2.getBlob(1))).zzbc();
                                                                                                        numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                        list5 = (List) arrayMap5.get(numValueOf3);
                                                                                                        if (list5 == null) {
                                                                                                            zzbcVarZzaf = zzbcVarZzaf;
                                                                                                            try {
                                                                                                                arrayList2 = new ArrayList();
                                                                                                                arrayMap5.put(numValueOf3, arrayList2);
                                                                                                            } catch (SQLiteException e9) {
                                                                                                                e = e9;
                                                                                                                cursor2 = cursorQuery2;
                                                                                                                try {
                                                                                                                    zzavVarZzj6.zzu.zzaV().zzb().zzc(str4, zzgu.zzl(str9), e);
                                                                                                                    mapEmptyMap = Collections.emptyMap();
                                                                                                                    if (cursor2 != null) {
                                                                                                                        cursor2.close();
                                                                                                                    }
                                                                                                                } catch (Throwable th2) {
                                                                                                                    th = th2;
                                                                                                                    if (cursor2 != null) {
                                                                                                                        cursor2.close();
                                                                                                                    }
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            zzbcVarZzaf = zzbcVarZzaf;
                                                                                                            arrayList2 = list5;
                                                                                                        }
                                                                                                        arrayList2.add(zzffVar2);
                                                                                                    } catch (IOException e10) {
                                                                                                        zzbcVarZzaf = zzbcVarZzaf;
                                                                                                        zzavVarZzj6.zzu.zzaV().zzb().zzc(str3, zzgu.zzl(str9), e10);
                                                                                                    }
                                                                                                    if (!cursorQuery2.moveToNext()) {
                                                                                                        break;
                                                                                                    }
                                                                                                    zzbcVarZzaf = zzbcVarZzaf;
                                                                                                } catch (SQLiteException e11) {
                                                                                                    e = e11;
                                                                                                    zzbcVarZzaf = zzbcVarZzaf;
                                                                                                    cursor2 = cursorQuery2;
                                                                                                    zzavVarZzj6.zzu.zzaV().zzb().zzc(str4, zzgu.zzl(str9), e);
                                                                                                    mapEmptyMap = Collections.emptyMap();
                                                                                                    if (cursor2 != null) {
                                                                                                        cursor2.close();
                                                                                                    }
                                                                                                    arrayMap4.put(strZzd, mapEmptyMap);
                                                                                                    it5 = mapEmptyMap.keySet().iterator();
                                                                                                    while (it5.hasNext()) {
                                                                                                        iIntValue2 = ((Integer) it5.next()).intValue();
                                                                                                        set = this.zzb;
                                                                                                        numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                                        if (set.contains(numValueOf2)) {
                                                                                                            this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", numValueOf2);
                                                                                                        } else {
                                                                                                            zZzd = true;
                                                                                                            for (com.google.android.gms.internal.measurement.zzff zzffVar3 : (List) mapEmptyMap.get(numValueOf2)) {
                                                                                                                zzaaVar = new zzaa(this, this.zza, iIntValue2, zzffVar3);
                                                                                                                zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j, zzbcVarZzaf, zzd(iIntValue2, zzffVar3.zzb()));
                                                                                                                if (zZzd) {
                                                                                                                    this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                                                    break;
                                                                                                                }
                                                                                                                zzc(Integer.valueOf(iIntValue2)).zza(zzaaVar);
                                                                                                            }
                                                                                                            if (!zZzd) {
                                                                                                                this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    zzzVar = zzzVar;
                                                                                                    it4 = it4;
                                                                                                    str14 = str8;
                                                                                                }
                                                                                            }
                                                                                            if (cursorQuery2 != null) {
                                                                                                cursorQuery2.close();
                                                                                            }
                                                                                            mapEmptyMap = arrayMap5;
                                                                                        } else {
                                                                                            str18 = str10;
                                                                                            zzbcVarZzaf = zzbcVarZzaf;
                                                                                            mapEmptyMap = Collections.emptyMap();
                                                                                            if (cursorQuery2 != null) {
                                                                                                cursorQuery2.close();
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th3) {
                                                                                        th = th3;
                                                                                        cursor2 = cursorQuery2;
                                                                                        if (cursor2 != null) {
                                                                                            cursor2.close();
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                } catch (SQLiteException e12) {
                                                                                    e = e12;
                                                                                    str18 = str10;
                                                                                }
                                                                            } catch (SQLiteException e13) {
                                                                                e = e13;
                                                                                str18 = str10;
                                                                                cursor2 = null;
                                                                                zzavVarZzj6.zzu.zzaV().zzb().zzc(str4, zzgu.zzl(str9), e);
                                                                                mapEmptyMap = Collections.emptyMap();
                                                                                if (cursor2 != null) {
                                                                                    cursor2.close();
                                                                                }
                                                                                arrayMap4.put(strZzd, mapEmptyMap);
                                                                                it5 = mapEmptyMap.keySet().iterator();
                                                                                while (it5.hasNext()) {
                                                                                    iIntValue2 = ((Integer) it5.next()).intValue();
                                                                                    set = this.zzb;
                                                                                    numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                    if (set.contains(numValueOf2)) {
                                                                                        this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", numValueOf2);
                                                                                    } else {
                                                                                        zZzd = true;
                                                                                        while (r5.hasNext()) {
                                                                                            zzaaVar = new zzaa(this, this.zza, iIntValue2, zzffVar3);
                                                                                            zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j, zzbcVarZzaf, zzd(iIntValue2, zzffVar3.zzb()));
                                                                                            if (zZzd) {
                                                                                                this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                                break;
                                                                                            }
                                                                                            zzc(Integer.valueOf(iIntValue2)).zza(zzaaVar);
                                                                                        }
                                                                                        if (!zZzd) {
                                                                                            this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zzzVar = zzzVar;
                                                                                it4 = it4;
                                                                                str14 = str8;
                                                                            }
                                                                        } catch (SQLiteException e14) {
                                                                            e = e14;
                                                                            str18 = str10;
                                                                            str8 = str14;
                                                                            cursor2 = null;
                                                                            zzavVarZzj6.zzu.zzaV().zzb().zzc(str4, zzgu.zzl(str9), e);
                                                                            mapEmptyMap = Collections.emptyMap();
                                                                            if (cursor2 != null) {
                                                                                cursor2.close();
                                                                            }
                                                                            arrayMap4.put(strZzd, mapEmptyMap);
                                                                            it5 = mapEmptyMap.keySet().iterator();
                                                                            while (it5.hasNext()) {
                                                                                iIntValue2 = ((Integer) it5.next()).intValue();
                                                                                set = this.zzb;
                                                                                numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                if (set.contains(numValueOf2)) {
                                                                                    this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", numValueOf2);
                                                                                } else {
                                                                                    zZzd = true;
                                                                                    while (r5.hasNext()) {
                                                                                        zzaaVar = new zzaa(this, this.zza, iIntValue2, zzffVar3);
                                                                                        zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j, zzbcVarZzaf, zzd(iIntValue2, zzffVar3.zzb()));
                                                                                        if (zZzd) {
                                                                                            this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                            break;
                                                                                        }
                                                                                        zzc(Integer.valueOf(iIntValue2)).zza(zzaaVar);
                                                                                    }
                                                                                    if (!zZzd) {
                                                                                        this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                    }
                                                                                }
                                                                            }
                                                                            zzzVar = zzzVar;
                                                                            it4 = it4;
                                                                            str14 = str8;
                                                                        }
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        cursor2 = null;
                                                                    }
                                                                } catch (SQLiteException e15) {
                                                                    e = e15;
                                                                }
                                                                arrayMap4.put(strZzd, mapEmptyMap);
                                                            } else {
                                                                zzbcVarZzaf = zzbcVarZzaf;
                                                                str8 = str14;
                                                            }
                                                            it5 = mapEmptyMap.keySet().iterator();
                                                            while (it5.hasNext()) {
                                                                iIntValue2 = ((Integer) it5.next()).intValue();
                                                                set = this.zzb;
                                                                numValueOf2 = Integer.valueOf(iIntValue2);
                                                                if (set.contains(numValueOf2)) {
                                                                    this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", numValueOf2);
                                                                } else {
                                                                    zZzd = true;
                                                                    while (r5.hasNext()) {
                                                                        zzaaVar = new zzaa(this, this.zza, iIntValue2, zzffVar3);
                                                                        zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j, zzbcVarZzaf, zzd(iIntValue2, zzffVar3.zzb()));
                                                                        if (zZzd) {
                                                                            this.zzb.add(Integer.valueOf(iIntValue2));
                                                                            break;
                                                                        }
                                                                        zzc(Integer.valueOf(iIntValue2)).zza(zzaaVar);
                                                                    }
                                                                    if (!zZzd) {
                                                                        this.zzb.add(Integer.valueOf(iIntValue2));
                                                                    }
                                                                }
                                                            }
                                                            zzzVar = zzzVar;
                                                            it4 = it4;
                                                            str14 = str8;
                                                        }
                                                    }
                                                }
                                            }
                                            str11 = str14;
                                            if (z) {
                                                return new ArrayList();
                                            }
                                            if (!list2.isEmpty()) {
                                                arrayMap6 = new ArrayMap();
                                                it7 = list2.iterator();
                                                while (it7.hasNext()) {
                                                    com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it7.next();
                                                    strZzc = zziuVar.zzc();
                                                    mapEmptyMap2 = (Map) arrayMap6.get(strZzc);
                                                    if (mapEmptyMap2 == null) {
                                                        zzav zzavVarZzj7 = this.zzg.zzj();
                                                        str13 = this.zza;
                                                        zzavVarZzj7.zzaw();
                                                        zzavVarZzj7.zzg();
                                                        Preconditions.checkNotEmpty(str13);
                                                        Preconditions.checkNotEmpty(strZzc);
                                                        arrayMap7 = new ArrayMap();
                                                        SQLiteDatabase sQLiteDatabaseZze2 = zzavVarZzj7.zze();
                                                        try {
                                                            try {
                                                                String[] strArr2 = new String[2];
                                                                try {
                                                                    strArr2[0] = str18;
                                                                    strArr2[1] = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                                                    cursorQuery3 = sQLiteDatabaseZze2.query("property_filters", strArr2, "app_id=? AND property_name=?", new String[]{str13, strZzc}, null, null, null);
                                                                    try {
                                                                        try {
                                                                            if (cursorQuery3.moveToFirst()) {
                                                                                do {
                                                                                    try {
                                                                                        com.google.android.gms.internal.measurement.zzfn zzfnVar2 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursorQuery3.getBlob(1))).zzbc();
                                                                                        try {
                                                                                            numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                            arrayList4 = (List) arrayMap7.get(numValueOf7);
                                                                                            if (arrayList4 == null) {
                                                                                                arrayList4 = new ArrayList();
                                                                                                arrayMap7.put(numValueOf7, arrayList4);
                                                                                            }
                                                                                            arrayList4.add(zzfnVar2);
                                                                                        } catch (SQLiteException e16) {
                                                                                            e = e16;
                                                                                            zzavVarZzj7.zzu.zzaV().zzb().zzc(str4, zzgu.zzl(str13), e);
                                                                                            mapEmptyMap2 = Collections.emptyMap();
                                                                                            if (cursorQuery3 != null) {
                                                                                                cursorQuery3.close();
                                                                                            }
                                                                                        }
                                                                                    } catch (IOException e17) {
                                                                                        zzavVarZzj7.zzu.zzaV().zzb().zzc("Failed to merge filter", zzgu.zzl(str13), e17);
                                                                                    }
                                                                                } while (cursorQuery3.moveToNext());
                                                                                if (cursorQuery3 != null) {
                                                                                    cursorQuery3.close();
                                                                                }
                                                                                mapEmptyMap2 = arrayMap7;
                                                                            } else {
                                                                                mapEmptyMap2 = Collections.emptyMap();
                                                                                if (cursorQuery3 != null) {
                                                                                    cursorQuery3.close();
                                                                                }
                                                                            }
                                                                        } catch (SQLiteException e18) {
                                                                            e = e18;
                                                                        }
                                                                        arrayMap6.put(strZzc, mapEmptyMap2);
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                        cursor3 = cursorQuery3;
                                                                        if (cursor3 != null) {
                                                                            cursor3.close();
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (SQLiteException e19) {
                                                                    e = e19;
                                                                    cursorQuery3 = null;
                                                                    zzavVarZzj7.zzu.zzaV().zzb().zzc(str4, zzgu.zzl(str13), e);
                                                                    mapEmptyMap2 = Collections.emptyMap();
                                                                    if (cursorQuery3 != null) {
                                                                        cursorQuery3.close();
                                                                    }
                                                                    arrayMap6.put(strZzc, mapEmptyMap2);
                                                                    it8 = mapEmptyMap2.keySet().iterator();
                                                                    while (it8.hasNext()) {
                                                                        iIntValue3 = ((Integer) it8.next()).intValue();
                                                                        set2 = this.zzb;
                                                                        numValueOf4 = Integer.valueOf(iIntValue3);
                                                                        if (set2.contains(numValueOf4)) {
                                                                            this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", numValueOf4);
                                                                            break;
                                                                        }
                                                                        it9 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                                                                        zZzd2 = true;
                                                                        while (true) {
                                                                            if (it9.hasNext()) {
                                                                                zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it9.next();
                                                                                zzicVar = this.zzu;
                                                                                if (Log.isLoggable(zzicVar.zzaV().zzn(), 2)) {
                                                                                    zzgs zzgsVarZzk = zzicVar.zzaV().zzk();
                                                                                    if (zzfnVar.zza()) {
                                                                                        numValueOf6 = Integer.valueOf(zzfnVar.zzb());
                                                                                    } else {
                                                                                        numValueOf6 = null;
                                                                                    }
                                                                                    zzgsVarZzk.zzd("Evaluating filter. audience, filter, property", Integer.valueOf(iIntValue3), numValueOf6, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                                                    zzicVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                                }
                                                                                if (zzfnVar.zza()) {
                                                                                }
                                                                                zzgs zzgsVarZze = zzicVar.zzaV().zze();
                                                                                Object objZzl = zzgu.zzl(this.zza);
                                                                                if (zzfnVar.zza()) {
                                                                                    numValueOf5 = Integer.valueOf(zzfnVar.zzb());
                                                                                } else {
                                                                                    numValueOf5 = null;
                                                                                }
                                                                                zzgsVarZze.zzc("Invalid property filter ID. appId, id", objZzl, String.valueOf(numValueOf5));
                                                                                this.zzb.add(Integer.valueOf(iIntValue3));
                                                                                mapEmptyMap2 = mapEmptyMap2;
                                                                            } else {
                                                                                mapEmptyMap2 = mapEmptyMap2;
                                                                            }
                                                                            if (!zZzd2) {
                                                                                this.zzb.add(Integer.valueOf(iIntValue3));
                                                                            }
                                                                            mapEmptyMap2 = mapEmptyMap2;
                                                                            zzc(Integer.valueOf(iIntValue3)).zza(zzacVar);
                                                                            mapEmptyMap2 = mapEmptyMap2;
                                                                        }
                                                                    }
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                cursor3 = null;
                                                            }
                                                        } catch (SQLiteException e20) {
                                                            e = e20;
                                                        }
                                                    }
                                                    it8 = mapEmptyMap2.keySet().iterator();
                                                    while (it8.hasNext()) {
                                                        iIntValue3 = ((Integer) it8.next()).intValue();
                                                        set2 = this.zzb;
                                                        numValueOf4 = Integer.valueOf(iIntValue3);
                                                        if (set2.contains(numValueOf4)) {
                                                            this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", numValueOf4);
                                                            break;
                                                            break;
                                                        }
                                                        it9 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                                                        zZzd2 = true;
                                                        while (true) {
                                                            if (it9.hasNext()) {
                                                                zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it9.next();
                                                                zzicVar = this.zzu;
                                                                if (Log.isLoggable(zzicVar.zzaV().zzn(), 2)) {
                                                                    zzgs zzgsVarZzk2 = zzicVar.zzaV().zzk();
                                                                    if (zzfnVar.zza()) {
                                                                        numValueOf6 = Integer.valueOf(zzfnVar.zzb());
                                                                    } else {
                                                                        numValueOf6 = null;
                                                                    }
                                                                    zzgsVarZzk2.zzd("Evaluating filter. audience, filter, property", Integer.valueOf(iIntValue3), numValueOf6, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                                    zzicVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                }
                                                                if (zzfnVar.zza()) {
                                                                }
                                                                zzgs zzgsVarZze2 = zzicVar.zzaV().zze();
                                                                Object objZzl2 = zzgu.zzl(this.zza);
                                                                if (zzfnVar.zza()) {
                                                                    numValueOf5 = Integer.valueOf(zzfnVar.zzb());
                                                                } else {
                                                                    numValueOf5 = null;
                                                                }
                                                                zzgsVarZze2.zzc("Invalid property filter ID. appId, id", objZzl2, String.valueOf(numValueOf5));
                                                                this.zzb.add(Integer.valueOf(iIntValue3));
                                                                mapEmptyMap2 = mapEmptyMap2;
                                                            } else {
                                                                mapEmptyMap2 = mapEmptyMap2;
                                                            }
                                                            if (!zZzd2) {
                                                                this.zzb.add(Integer.valueOf(iIntValue3));
                                                            }
                                                            mapEmptyMap2 = mapEmptyMap2;
                                                            zzc(Integer.valueOf(iIntValue3)).zza(zzacVar);
                                                            mapEmptyMap2 = mapEmptyMap2;
                                                        }
                                                    }
                                                }
                                            }
                                            arrayList3 = new ArrayList();
                                            Set setKeySet = this.zzc.keySet();
                                            setKeySet.removeAll(this.zzb);
                                            it6 = setKeySet.iterator();
                                            while (it6.hasNext()) {
                                                int iIntValue5 = ((Integer) it6.next()).intValue();
                                                Map map6 = this.zzc;
                                                Integer numValueOf11 = Integer.valueOf(iIntValue5);
                                                zzy zzyVar = (zzy) map6.get(numValueOf11);
                                                Preconditions.checkNotNull(zzyVar);
                                                com.google.android.gms.internal.measurement.zzhg zzhgVarZzb = zzyVar.zzb(iIntValue5);
                                                arrayList3.add(zzhgVarZzb);
                                                zzavVarZzj = this.zzg.zzj();
                                                str12 = this.zza;
                                                com.google.android.gms.internal.measurement.zzii zziiVarZzc = zzhgVarZzb.zzc();
                                                zzavVarZzj.zzaw();
                                                zzavVarZzj.zzg();
                                                Preconditions.checkNotEmpty(str12);
                                                Preconditions.checkNotNull(zziiVarZzc);
                                                byte[] bArrZzcc = zziiVarZzc.zzcc();
                                                contentValues = new ContentValues();
                                                contentValues.put("app_id", str12);
                                                String str23 = str18;
                                                contentValues.put(str23, numValueOf11);
                                                String str24 = str11;
                                                contentValues.put(str24, bArrZzcc);
                                                try {
                                                    try {
                                                        if (zzavVarZzj.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                            zzavVarZzj.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str12));
                                                        }
                                                    } catch (SQLiteException e21) {
                                                        e = e21;
                                                        zzavVarZzj.zzu.zzaV().zzb().zzc("Error storing filter results. appId", zzgu.zzl(str12), e);
                                                    }
                                                } catch (SQLiteException e22) {
                                                    e = e22;
                                                }
                                                str11 = str24;
                                                str18 = str23;
                                            }
                                            return arrayList3;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        if (Zze != 0) {
                                            Zze.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e23) {
                                    e = e23;
                                    cursorRawQuery = null;
                                } catch (Throwable th8) {
                                    th = th8;
                                    Zze = 0;
                                    if (Zze != 0) {
                                        Zze.close();
                                    }
                                    throw th;
                                }
                                Preconditions.checkNotEmpty(str21);
                                Preconditions.checkNotNull(map2);
                                arrayMap3 = new ArrayMap();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        int iIntValue6 = ((Integer) it2.next()).intValue();
                                        Integer numValueOf12 = Integer.valueOf(iIntValue6);
                                        zziiVar2 = (com.google.android.gms.internal.measurement.zzii) map2.get(numValueOf12);
                                        list4 = (List) arrayMap2.get(numValueOf12);
                                        if (list4 != null) {
                                        }
                                        map4 = arrayMap2;
                                        it3 = it2;
                                        str7 = str17;
                                        arrayMap3.put(numValueOf12, zziiVar2);
                                        arrayMap2 = map4;
                                        it2 = it3;
                                        str17 = str7;
                                    }
                                }
                                str2 = str17;
                                map3 = arrayMap3;
                            } else {
                                str2 = "Database error querying filters. appId";
                                map3 = map2;
                            }
                            it = hashSet.iterator();
                            while (it.hasNext()) {
                                iIntValue = ((Integer) it.next()).intValue();
                                zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(Integer.valueOf(iIntValue));
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                arrayMap = new ArrayMap();
                                if (zziiVar != null) {
                                    while (r2.hasNext()) {
                                        if (zzhqVar.zza()) {
                                            int iZzb2 = zzhqVar.zzb();
                                            if (zzhqVar.zzc()) {
                                                lValueOf = Long.valueOf(zzhqVar.zzd());
                                            } else {
                                                lValueOf = null;
                                            }
                                            arrayMap.put(Integer.valueOf(iZzb2), lValueOf);
                                        }
                                    }
                                }
                                ArrayMap arrayMap11 = new ArrayMap();
                                if (zziiVar != null) {
                                    while (r2.hasNext()) {
                                        if (!zzikVar.zza()) {
                                        }
                                    }
                                }
                                Map map7 = map3;
                                if (zziiVar != null) {
                                    i3 = 0;
                                    while (i3 < zziiVar.zzb() * 64) {
                                        if (zzpk.zzn(zziiVar.zza(), i3)) {
                                            str5 = str16;
                                            this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i3));
                                            bitSet2.set(i3);
                                            if (zzpk.zzn(zziiVar.zzc(), i3)) {
                                                bitSet.set(i3);
                                            }
                                            i3++;
                                            str16 = str5;
                                        } else {
                                            str5 = str16;
                                        }
                                        arrayMap.remove(Integer.valueOf(i3));
                                        i3++;
                                        str16 = str5;
                                    }
                                }
                                String str25 = str16;
                                Integer numValueOf13 = Integer.valueOf(iIntValue);
                                com.google.android.gms.internal.measurement.zzii zziiVar4 = (com.google.android.gms.internal.measurement.zzii) map2.get(numValueOf13);
                                if (!zZzp2) {
                                }
                                this.zzc.put(Integer.valueOf(iIntValue), new zzy(this, this.zza, zziiVar4, bitSet, bitSet2, arrayMap, arrayMap11, null));
                                str16 = str25;
                                map = map;
                                map3 = map7;
                                map2 = map2;
                            }
                            str3 = str16;
                            str4 = str2;
                        }
                        if (!list.isEmpty()) {
                            zzzVar = new zzz(this, null);
                            arrayMap4 = new ArrayMap();
                            it4 = list.iterator();
                            while (it4.hasNext()) {
                                zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                                zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                if (zzhsVarZza != null) {
                                    zzpgVar = this.zzg;
                                    zzbcVarZzaf = zzpgVar.zzj().zzaf(this.zza, zzhsVar, zzhsVarZza.zzd());
                                    zzpgVar.zzj().zzh(zzbcVarZzaf);
                                    if (z) {
                                        j = zzbcVarZzaf.zzc;
                                        strZzd = zzhsVarZza.zzd();
                                        mapEmptyMap = (Map) arrayMap4.get(strZzd);
                                        if (mapEmptyMap == null) {
                                            zzav zzavVarZzj8 = zzpgVar.zzj();
                                            str9 = this.zza;
                                            zzavVarZzj8.zzaw();
                                            zzavVarZzj8.zzg();
                                            Preconditions.checkNotEmpty(str9);
                                            Preconditions.checkNotEmpty(strZzd);
                                            arrayMap5 = new ArrayMap();
                                            SQLiteDatabase sQLiteDatabaseZze3 = zzavVarZzj8.zze();
                                            String[] strArr3 = new String[2];
                                            str10 = str18;
                                            strArr3[0] = str10;
                                            strArr3[1] = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                            str8 = str14;
                                            cursorQuery2 = sQLiteDatabaseZze3.query("event_filters", strArr3, "app_id=? AND event_name=?", new String[]{str9, strZzd}, null, null, null);
                                            if (cursorQuery2.moveToFirst()) {
                                                str18 = str10;
                                                while (true) {
                                                    com.google.android.gms.internal.measurement.zzff zzffVar4 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery2.getBlob(1))).zzbc();
                                                    numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                    list5 = (List) arrayMap5.get(numValueOf3);
                                                    if (list5 == null) {
                                                        zzbcVarZzaf = zzbcVarZzaf;
                                                        arrayList2 = new ArrayList();
                                                        arrayMap5.put(numValueOf3, arrayList2);
                                                    } else {
                                                        zzbcVarZzaf = zzbcVarZzaf;
                                                        arrayList2 = list5;
                                                    }
                                                    arrayList2.add(zzffVar4);
                                                    if (!cursorQuery2.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    zzbcVarZzaf = zzbcVarZzaf;
                                                }
                                                if (cursorQuery2 != null) {
                                                    cursorQuery2.close();
                                                }
                                                mapEmptyMap = arrayMap5;
                                            } else {
                                                str18 = str10;
                                                zzbcVarZzaf = zzbcVarZzaf;
                                                mapEmptyMap = Collections.emptyMap();
                                                if (cursorQuery2 != null) {
                                                    cursorQuery2.close();
                                                }
                                            }
                                            arrayMap4.put(strZzd, mapEmptyMap);
                                        } else {
                                            zzbcVarZzaf = zzbcVarZzaf;
                                            str8 = str14;
                                        }
                                        it5 = mapEmptyMap.keySet().iterator();
                                        while (it5.hasNext()) {
                                            iIntValue2 = ((Integer) it5.next()).intValue();
                                            set = this.zzb;
                                            numValueOf2 = Integer.valueOf(iIntValue2);
                                            if (set.contains(numValueOf2)) {
                                                this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", numValueOf2);
                                            } else {
                                                zZzd = true;
                                                while (r5.hasNext()) {
                                                    zzaaVar = new zzaa(this, this.zza, iIntValue2, zzffVar3);
                                                    zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j, zzbcVarZzaf, zzd(iIntValue2, zzffVar3.zzb()));
                                                    if (zZzd) {
                                                        this.zzb.add(Integer.valueOf(iIntValue2));
                                                        break;
                                                    }
                                                    zzc(Integer.valueOf(iIntValue2)).zza(zzaaVar);
                                                }
                                                if (!zZzd) {
                                                    this.zzb.add(Integer.valueOf(iIntValue2));
                                                }
                                            }
                                        }
                                        zzzVar = zzzVar;
                                        it4 = it4;
                                        str14 = str8;
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        str11 = str14;
                        if (z) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            arrayMap6 = new ArrayMap();
                            it7 = list2.iterator();
                            while (it7.hasNext()) {
                                com.google.android.gms.internal.measurement.zziu zziuVar2 = (com.google.android.gms.internal.measurement.zziu) it7.next();
                                strZzc = zziuVar2.zzc();
                                mapEmptyMap2 = (Map) arrayMap6.get(strZzc);
                                if (mapEmptyMap2 == null) {
                                    zzav zzavVarZzj9 = this.zzg.zzj();
                                    str13 = this.zza;
                                    zzavVarZzj9.zzaw();
                                    zzavVarZzj9.zzg();
                                    Preconditions.checkNotEmpty(str13);
                                    Preconditions.checkNotEmpty(strZzc);
                                    arrayMap7 = new ArrayMap();
                                    SQLiteDatabase sQLiteDatabaseZze4 = zzavVarZzj9.zze();
                                    String[] strArr4 = new String[2];
                                    strArr4[0] = str18;
                                    strArr4[1] = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                    cursorQuery3 = sQLiteDatabaseZze4.query("property_filters", strArr4, "app_id=? AND property_name=?", new String[]{str13, strZzc}, null, null, null);
                                    if (cursorQuery3.moveToFirst()) {
                                        do {
                                            com.google.android.gms.internal.measurement.zzfn zzfnVar3 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursorQuery3.getBlob(1))).zzbc();
                                            numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                            arrayList4 = (List) arrayMap7.get(numValueOf7);
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                                arrayMap7.put(numValueOf7, arrayList4);
                                            }
                                            arrayList4.add(zzfnVar3);
                                        } while (cursorQuery3.moveToNext());
                                        if (cursorQuery3 != null) {
                                            cursorQuery3.close();
                                        }
                                        mapEmptyMap2 = arrayMap7;
                                    } else {
                                        mapEmptyMap2 = Collections.emptyMap();
                                        if (cursorQuery3 != null) {
                                            cursorQuery3.close();
                                        }
                                    }
                                    arrayMap6.put(strZzc, mapEmptyMap2);
                                }
                                it8 = mapEmptyMap2.keySet().iterator();
                                while (it8.hasNext()) {
                                    iIntValue3 = ((Integer) it8.next()).intValue();
                                    set2 = this.zzb;
                                    numValueOf4 = Integer.valueOf(iIntValue3);
                                    if (set2.contains(numValueOf4)) {
                                        this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", numValueOf4);
                                        break;
                                        break;
                                    }
                                    it9 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                                    zZzd2 = true;
                                    while (true) {
                                        if (it9.hasNext()) {
                                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it9.next();
                                            zzicVar = this.zzu;
                                            if (Log.isLoggable(zzicVar.zzaV().zzn(), 2)) {
                                                zzgs zzgsVarZzk3 = zzicVar.zzaV().zzk();
                                                if (zzfnVar.zza()) {
                                                    numValueOf6 = Integer.valueOf(zzfnVar.zzb());
                                                } else {
                                                    numValueOf6 = null;
                                                }
                                                zzgsVarZzk3.zzd("Evaluating filter. audience, filter, property", Integer.valueOf(iIntValue3), numValueOf6, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                zzicVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                            }
                                            if (zzfnVar.zza()) {
                                            }
                                            zzgs zzgsVarZze3 = zzicVar.zzaV().zze();
                                            Object objZzl3 = zzgu.zzl(this.zza);
                                            if (zzfnVar.zza()) {
                                                numValueOf5 = Integer.valueOf(zzfnVar.zzb());
                                            } else {
                                                numValueOf5 = null;
                                            }
                                            zzgsVarZze3.zzc("Invalid property filter ID. appId, id", objZzl3, String.valueOf(numValueOf5));
                                            this.zzb.add(Integer.valueOf(iIntValue3));
                                            mapEmptyMap2 = mapEmptyMap2;
                                        } else {
                                            mapEmptyMap2 = mapEmptyMap2;
                                        }
                                        if (!zZzd2) {
                                            this.zzb.add(Integer.valueOf(iIntValue3));
                                        }
                                        mapEmptyMap2 = mapEmptyMap2;
                                        zzc(Integer.valueOf(iIntValue3)).zza(zzacVar);
                                        mapEmptyMap2 = mapEmptyMap2;
                                    }
                                }
                            }
                        }
                        arrayList3 = new ArrayList();
                        Set setKeySet2 = this.zzc.keySet();
                        setKeySet2.removeAll(this.zzb);
                        it6 = setKeySet2.iterator();
                        while (it6.hasNext()) {
                            int iIntValue7 = ((Integer) it6.next()).intValue();
                            Map map8 = this.zzc;
                            Integer numValueOf14 = Integer.valueOf(iIntValue7);
                            zzy zzyVar2 = (zzy) map8.get(numValueOf14);
                            Preconditions.checkNotNull(zzyVar2);
                            com.google.android.gms.internal.measurement.zzhg zzhgVarZzb2 = zzyVar2.zzb(iIntValue7);
                            arrayList3.add(zzhgVarZzb2);
                            zzavVarZzj = this.zzg.zzj();
                            str12 = this.zza;
                            com.google.android.gms.internal.measurement.zzii zziiVarZzc2 = zzhgVarZzb2.zzc();
                            zzavVarZzj.zzaw();
                            zzavVarZzj.zzg();
                            Preconditions.checkNotEmpty(str12);
                            Preconditions.checkNotNull(zziiVarZzc2);
                            byte[] bArrZzcc2 = zziiVarZzc2.zzcc();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str12);
                            String str26 = str18;
                            contentValues.put(str26, numValueOf14);
                            String str27 = str11;
                            contentValues.put(str27, bArrZzcc2);
                            if (zzavVarZzj.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                zzavVarZzj.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str12));
                            }
                            str11 = str27;
                            str18 = str26;
                        }
                        return arrayList3;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    if (r5 != 0) {
                        r5.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e24) {
                e = e24;
                cursorQuery4 = null;
            } catch (Throwable th10) {
                th = th10;
                r5 = 0;
                if (r5 != 0) {
                    r5.close();
                }
                throw th;
            }
        } else {
            map = mapEmptyMap3;
        }
        zzav zzavVarZzj10 = this.zzg.zzj();
        String str28 = this.zza;
        zzavVarZzj10.zzaw();
        zzavVarZzj10.zzg();
        Preconditions.checkNotEmpty(str28);
        try {
            cursorQuery = zzavVarZzj10.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str28}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map mapEmptyMap6 = Collections.emptyMap();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                map2 = mapEmptyMap6;
                str18 = "audience_id";
            } else {
                arrayMap8 = new ArrayMap();
                while (true) {
                    i4 = cursorQuery.getInt(0);
                    arrayMap8.put(Integer.valueOf(i4), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.zzw(com.google.android.gms.internal.measurement.zzii.zzi(), cursorQuery.getBlob(1))).zzbc());
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    arrayMap8 = arrayMap8;
                    str18 = str18;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                map2 = arrayMap8;
            }
        } catch (SQLiteException e25) {
            e = e25;
            str18 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th11) {
            th = th11;
            cursor = null;
        }
        if (map2.isEmpty()) {
            str4 = "Database error querying filters. appId";
            str3 = "Failed to merge filter. appId";
        } else {
            HashSet hashSet2 = new HashSet(map2.keySet());
            if (z2) {
                String str29 = this.zza;
                zzav zzavVarZzj11 = this.zzg.zzj();
                str6 = this.zza;
                zzavVarZzj11.zzaw();
                zzavVarZzj11.zzg();
                Preconditions.checkNotEmpty(str6);
                arrayMap2 = new ArrayMap();
                Zze = zzavVarZzj11.zze();
                cursorRawQuery = Zze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) arrayMap2.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            arrayMap2.put(numValueOf, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } else {
                    arrayMap2 = Collections.emptyMap();
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                }
                Preconditions.checkNotEmpty(str29);
                Preconditions.checkNotNull(map2);
                arrayMap3 = new ArrayMap();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        int iIntValue8 = ((Integer) it2.next()).intValue();
                        Integer numValueOf15 = Integer.valueOf(iIntValue8);
                        zziiVar2 = (com.google.android.gms.internal.measurement.zzii) map2.get(numValueOf15);
                        list4 = (List) arrayMap2.get(numValueOf15);
                        if (list4 != null || list4.isEmpty()) {
                            map4 = arrayMap2;
                            it3 = it2;
                            str7 = str17;
                            arrayMap3.put(numValueOf15, zziiVar2);
                            arrayMap2 = map4;
                            it2 = it3;
                            str17 = str7;
                        } else {
                            zzpg zzpgVar2 = this.zzg;
                            map4 = arrayMap2;
                            it3 = it2;
                            List listZzq = zzpgVar2.zzp().zzq(zziiVar2.zzc(), list4);
                            if (listZzq.isEmpty()) {
                                arrayMap2 = map4;
                                it2 = it3;
                            } else {
                                com.google.android.gms.internal.measurement.zzih zzihVar = (com.google.android.gms.internal.measurement.zzih) zziiVar2.zzcl();
                                zzihVar.zzd();
                                zzihVar.zzc(listZzq);
                                List listZzq2 = zzpgVar2.zzp().zzq(zziiVar2.zza(), list4);
                                zzihVar.zzb();
                                zzihVar.zza(listZzq2);
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it11 = zziiVar2.zze().iterator();
                                while (it11.hasNext()) {
                                    Iterator it12 = it11;
                                    com.google.android.gms.internal.measurement.zzhq zzhqVar2 = (com.google.android.gms.internal.measurement.zzhq) it11.next();
                                    String str30 = str17;
                                    if (!list4.contains(Integer.valueOf(zzhqVar2.zzb()))) {
                                        arrayList6.add(zzhqVar2);
                                    }
                                    it11 = it12;
                                    str17 = str30;
                                }
                                str7 = str17;
                                zzihVar.zzf();
                                zzihVar.zze(arrayList6);
                                ArrayList arrayList7 = new ArrayList();
                                for (com.google.android.gms.internal.measurement.zzik zzikVar2 : zziiVar2.zzg()) {
                                    if (!list4.contains(Integer.valueOf(zzikVar2.zzb()))) {
                                        arrayList7.add(zzikVar2);
                                    }
                                }
                                zzihVar.zzh();
                                zzihVar.zzg(arrayList7);
                                arrayMap3.put(Integer.valueOf(iIntValue8), (com.google.android.gms.internal.measurement.zzii) zzihVar.zzbc());
                                arrayMap2 = map4;
                                it2 = it3;
                                str17 = str7;
                            }
                        }
                    }
                }
                str2 = str17;
                map3 = arrayMap3;
            } else {
                str2 = "Database error querying filters. appId";
                map3 = map2;
            }
            it = hashSet2.iterator();
            while (it.hasNext()) {
                iIntValue = ((Integer) it.next()).intValue();
                zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(Integer.valueOf(iIntValue));
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                arrayMap = new ArrayMap();
                if (zziiVar != null && zziiVar.zzf() != 0) {
                    while (r2.hasNext()) {
                        if (zzhqVar.zza()) {
                            int iZzb3 = zzhqVar.zzb();
                            if (zzhqVar.zzc()) {
                                lValueOf = Long.valueOf(zzhqVar.zzd());
                            } else {
                                lValueOf = null;
                            }
                            arrayMap.put(Integer.valueOf(iZzb3), lValueOf);
                        }
                    }
                }
                ArrayMap arrayMap12 = new ArrayMap();
                if (zziiVar != null && zziiVar.zzh() != 0) {
                    while (r2.hasNext()) {
                        if (!zzikVar.zza() && zzikVar.zzd() > 0) {
                            arrayMap12.put(Integer.valueOf(zzikVar.zzb()), Long.valueOf(zzikVar.zze(zzikVar.zzd() - 1)));
                            map3 = map3;
                        }
                    }
                }
                Map map9 = map3;
                if (zziiVar != null) {
                    i3 = 0;
                    while (i3 < zziiVar.zzb() * 64) {
                        if (zzpk.zzn(zziiVar.zza(), i3)) {
                            str5 = str16;
                            this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i3));
                            bitSet2.set(i3);
                            if (zzpk.zzn(zziiVar.zzc(), i3)) {
                                bitSet.set(i3);
                            }
                            i3++;
                            str16 = str5;
                        } else {
                            str5 = str16;
                        }
                        arrayMap.remove(Integer.valueOf(i3));
                        i3++;
                        str16 = str5;
                    }
                }
                String str210 = str16;
                Integer numValueOf16 = Integer.valueOf(iIntValue);
                com.google.android.gms.internal.measurement.zzii zziiVar5 = (com.google.android.gms.internal.measurement.zzii) map2.get(numValueOf16);
                if (!zZzp2 && zZzp && (list3 = (List) map.get(numValueOf16)) != null && this.zze != null && this.zzd != null) {
                    for (com.google.android.gms.internal.measurement.zzff zzffVar5 : list3) {
                        int iZzb4 = zzffVar5.zzb();
                        long jLongValue = this.zze.longValue() / 1000;
                        if (zzffVar5.zzj()) {
                            jLongValue = this.zzd.longValue() / 1000;
                        }
                        Integer numValueOf17 = Integer.valueOf(iZzb4);
                        if (arrayMap.containsKey(numValueOf17)) {
                            arrayMap.put(numValueOf17, Long.valueOf(jLongValue));
                        }
                        if (arrayMap12.containsKey(numValueOf17)) {
                            arrayMap12.put(numValueOf17, Long.valueOf(jLongValue));
                        }
                    }
                }
                this.zzc.put(Integer.valueOf(iIntValue), new zzy(this, this.zza, zziiVar5, bitSet, bitSet2, arrayMap, arrayMap12, null));
                str16 = str210;
                map = map;
                map3 = map9;
                map2 = map2;
            }
            str3 = str16;
            str4 = str2;
        }
        if (!list.isEmpty()) {
            zzzVar = new zzz(this, null);
            arrayMap4 = new ArrayMap();
            it4 = list.iterator();
            while (it4.hasNext()) {
                zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                if (zzhsVarZza != null) {
                    zzpgVar = this.zzg;
                    zzbcVarZzaf = zzpgVar.zzj().zzaf(this.zza, zzhsVar, zzhsVarZza.zzd());
                    zzpgVar.zzj().zzh(zzbcVarZzaf);
                    if (z) {
                        j = zzbcVarZzaf.zzc;
                        strZzd = zzhsVarZza.zzd();
                        mapEmptyMap = (Map) arrayMap4.get(strZzd);
                        if (mapEmptyMap == null) {
                            zzav zzavVarZzj12 = zzpgVar.zzj();
                            str9 = this.zza;
                            zzavVarZzj12.zzaw();
                            zzavVarZzj12.zzg();
                            Preconditions.checkNotEmpty(str9);
                            Preconditions.checkNotEmpty(strZzd);
                            arrayMap5 = new ArrayMap();
                            SQLiteDatabase sQLiteDatabaseZze5 = zzavVarZzj12.zze();
                            String[] strArr5 = new String[2];
                            str10 = str18;
                            strArr5[0] = str10;
                            strArr5[1] = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                            str8 = str14;
                            cursorQuery2 = sQLiteDatabaseZze5.query("event_filters", strArr5, "app_id=? AND event_name=?", new String[]{str9, strZzd}, null, null, null);
                            if (cursorQuery2.moveToFirst()) {
                                str18 = str10;
                                while (true) {
                                    com.google.android.gms.internal.measurement.zzff zzffVar6 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery2.getBlob(1))).zzbc();
                                    numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                    list5 = (List) arrayMap5.get(numValueOf3);
                                    if (list5 == null) {
                                        zzbcVarZzaf = zzbcVarZzaf;
                                        arrayList2 = new ArrayList();
                                        arrayMap5.put(numValueOf3, arrayList2);
                                    } else {
                                        zzbcVarZzaf = zzbcVarZzaf;
                                        arrayList2 = list5;
                                    }
                                    arrayList2.add(zzffVar6);
                                    if (!cursorQuery2.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    zzbcVarZzaf = zzbcVarZzaf;
                                }
                                if (cursorQuery2 != null) {
                                    cursorQuery2.close();
                                }
                                mapEmptyMap = arrayMap5;
                            } else {
                                str18 = str10;
                                zzbcVarZzaf = zzbcVarZzaf;
                                mapEmptyMap = Collections.emptyMap();
                                if (cursorQuery2 != null) {
                                    cursorQuery2.close();
                                }
                            }
                            arrayMap4.put(strZzd, mapEmptyMap);
                        } else {
                            zzbcVarZzaf = zzbcVarZzaf;
                            str8 = str14;
                        }
                        it5 = mapEmptyMap.keySet().iterator();
                        while (it5.hasNext()) {
                            iIntValue2 = ((Integer) it5.next()).intValue();
                            set = this.zzb;
                            numValueOf2 = Integer.valueOf(iIntValue2);
                            if (set.contains(numValueOf2)) {
                                this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", numValueOf2);
                            } else {
                                zZzd = true;
                                while (r5.hasNext()) {
                                    zzaaVar = new zzaa(this, this.zza, iIntValue2, zzffVar3);
                                    zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j, zzbcVarZzaf, zzd(iIntValue2, zzffVar3.zzb()));
                                    if (zZzd) {
                                        this.zzb.add(Integer.valueOf(iIntValue2));
                                        break;
                                    }
                                    zzc(Integer.valueOf(iIntValue2)).zza(zzaaVar);
                                }
                                if (!zZzd) {
                                    this.zzb.add(Integer.valueOf(iIntValue2));
                                }
                            }
                        }
                        zzzVar = zzzVar;
                        it4 = it4;
                        str14 = str8;
                    } else {
                        continue;
                    }
                }
            }
        }
        str11 = str14;
        if (z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            arrayMap6 = new ArrayMap();
            it7 = list2.iterator();
            while (it7.hasNext()) {
                com.google.android.gms.internal.measurement.zziu zziuVar3 = (com.google.android.gms.internal.measurement.zziu) it7.next();
                strZzc = zziuVar3.zzc();
                mapEmptyMap2 = (Map) arrayMap6.get(strZzc);
                if (mapEmptyMap2 == null) {
                    zzav zzavVarZzj13 = this.zzg.zzj();
                    str13 = this.zza;
                    zzavVarZzj13.zzaw();
                    zzavVarZzj13.zzg();
                    Preconditions.checkNotEmpty(str13);
                    Preconditions.checkNotEmpty(strZzc);
                    arrayMap7 = new ArrayMap();
                    SQLiteDatabase sQLiteDatabaseZze6 = zzavVarZzj13.zze();
                    String[] strArr6 = new String[2];
                    strArr6[0] = str18;
                    strArr6[1] = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                    cursorQuery3 = sQLiteDatabaseZze6.query("property_filters", strArr6, "app_id=? AND property_name=?", new String[]{str13, strZzc}, null, null, null);
                    if (cursorQuery3.moveToFirst()) {
                        do {
                            com.google.android.gms.internal.measurement.zzfn zzfnVar4 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursorQuery3.getBlob(1))).zzbc();
                            numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                            arrayList4 = (List) arrayMap7.get(numValueOf7);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                arrayMap7.put(numValueOf7, arrayList4);
                            }
                            arrayList4.add(zzfnVar4);
                        } while (cursorQuery3.moveToNext());
                        if (cursorQuery3 != null) {
                            cursorQuery3.close();
                        }
                        mapEmptyMap2 = arrayMap7;
                    } else {
                        mapEmptyMap2 = Collections.emptyMap();
                        if (cursorQuery3 != null) {
                            cursorQuery3.close();
                        }
                    }
                    arrayMap6.put(strZzc, mapEmptyMap2);
                }
                it8 = mapEmptyMap2.keySet().iterator();
                while (it8.hasNext()) {
                    iIntValue3 = ((Integer) it8.next()).intValue();
                    set2 = this.zzb;
                    numValueOf4 = Integer.valueOf(iIntValue3);
                    if (set2.contains(numValueOf4)) {
                        this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", numValueOf4);
                        break;
                        break;
                    }
                    it9 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                    zZzd2 = true;
                    while (true) {
                        if (it9.hasNext()) {
                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it9.next();
                            zzicVar = this.zzu;
                            if (Log.isLoggable(zzicVar.zzaV().zzn(), 2)) {
                                zzgs zzgsVarZzk4 = zzicVar.zzaV().zzk();
                                if (zzfnVar.zza()) {
                                    numValueOf6 = Integer.valueOf(zzfnVar.zzb());
                                } else {
                                    numValueOf6 = null;
                                }
                                zzgsVarZzk4.zzd("Evaluating filter. audience, filter, property", Integer.valueOf(iIntValue3), numValueOf6, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                zzicVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                            }
                            if (zzfnVar.zza() || zzfnVar.zzb() > 256) {
                                zzgs zzgsVarZze4 = zzicVar.zzaV().zze();
                                Object objZzl4 = zzgu.zzl(this.zza);
                                if (zzfnVar.zza()) {
                                    numValueOf5 = Integer.valueOf(zzfnVar.zzb());
                                } else {
                                    numValueOf5 = null;
                                }
                                zzgsVarZze4.zzc("Invalid property filter ID. appId, id", objZzl4, String.valueOf(numValueOf5));
                                this.zzb.add(Integer.valueOf(iIntValue3));
                                mapEmptyMap2 = mapEmptyMap2;
                            } else {
                                zzacVar = new zzac(this, this.zza, iIntValue3, zzfnVar);
                                zZzd2 = zzacVar.zzd(this.zzd, this.zze, zziuVar3, zzd(iIntValue3, zzfnVar.zzb()));
                                if (zZzd2) {
                                    zzc(Integer.valueOf(iIntValue3)).zza(zzacVar);
                                    mapEmptyMap2 = mapEmptyMap2;
                                } else {
                                    this.zzb.add(Integer.valueOf(iIntValue3));
                                }
                            }
                        } else {
                            mapEmptyMap2 = mapEmptyMap2;
                        }
                        if (!zZzd2) {
                            this.zzb.add(Integer.valueOf(iIntValue3));
                        }
                        mapEmptyMap2 = mapEmptyMap2;
                    }
                }
            }
        }
        arrayList3 = new ArrayList();
        Set setKeySet3 = this.zzc.keySet();
        setKeySet3.removeAll(this.zzb);
        it6 = setKeySet3.iterator();
        while (it6.hasNext()) {
            int iIntValue9 = ((Integer) it6.next()).intValue();
            Map map10 = this.zzc;
            Integer numValueOf18 = Integer.valueOf(iIntValue9);
            zzy zzyVar3 = (zzy) map10.get(numValueOf18);
            Preconditions.checkNotNull(zzyVar3);
            com.google.android.gms.internal.measurement.zzhg zzhgVarZzb3 = zzyVar3.zzb(iIntValue9);
            arrayList3.add(zzhgVarZzb3);
            zzavVarZzj = this.zzg.zzj();
            str12 = this.zza;
            com.google.android.gms.internal.measurement.zzii zziiVarZzc3 = zzhgVarZzb3.zzc();
            zzavVarZzj.zzaw();
            zzavVarZzj.zzg();
            Preconditions.checkNotEmpty(str12);
            Preconditions.checkNotNull(zziiVarZzc3);
            byte[] bArrZzcc3 = zziiVarZzc3.zzcc();
            contentValues = new ContentValues();
            contentValues.put("app_id", str12);
            String str211 = str18;
            contentValues.put(str211, numValueOf18);
            String str212 = str11;
            contentValues.put(str212, bArrZzcc3);
            if (zzavVarZzj.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                zzavVarZzj.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str12));
            }
            str11 = str212;
            str18 = str211;
        }
        return arrayList3;
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    protected final boolean zzbb() {
        return false;
    }
}
