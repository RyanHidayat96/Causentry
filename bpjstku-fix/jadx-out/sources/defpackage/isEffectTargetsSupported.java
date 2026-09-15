package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class isEffectTargetsSupported {
    private static long TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final setEffect TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final notifyActive b;
    private static final byte[] $$c = {27, -8, 5, 78};
    private static final int $$f = 174;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {109, 7, 114, -90, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 60, -11, -7, 15, -1, -6, -16, 5, -11, 6, 3, -73, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -27, 1};
    private static final int $$e = 41;
    private static final byte[] $$a = {57, -56, 23, -36, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 90;
    private static int asBinder = 0;
    private static int d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1221a = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 15
            int r0 = r8 + 38
            int r7 = r7 * 52
            int r7 = 107 - r7
            byte[] r1 = defpackage.isEffectTargetsSupported.$$a
            int r6 = r6 * 3
            int r6 = 84 - r6
            byte[] r0 = new byte[r0]
            int r8 = r8 + 37
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2f
        L18:
            r3 = r2
        L19:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2f:
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isEffectTargetsSupported.c(byte, short, int, java.lang.Object[]):void");
    }

    private static void f(byte b, int i, int i2, Object[] objArr) {
        int i3 = 50 - (b * 47);
        int i4 = 99 - i2;
        int i5 = i * 47;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[48 - i5];
        int i6 = 47 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 = i6 + i4 + 3;
        }
        while (true) {
            i7++;
            i3++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = i4 + bArr[i3] + 3;
        }
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentbindingInflater1();
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("DataAccessObject");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = sb.toString();
        int i = f1221a + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    public isEffectTargetsSupported(Context context) {
        this(new notifyActive(context), new setEffect(context));
    }

    private isEffectTargetsSupported(notifyActive notifyactive, setEffect seteffect) {
        this.b = notifyactive;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = seteffect;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5 A[Catch: all -> 0x00fa, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x000d, B:18:0x00b6, B:20:0x00bb, B:21:0x00be, B:22:0x00bf, B:24:0x00c3, B:25:0x00ca, B:28:0x00cf, B:30:0x00d5, B:32:0x00e1, B:34:0x00eb, B:36:0x00ef), top: B:49:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f5 A[LOOP:1: B:28:0x00cf->B:38:0x00f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void b(LinkedList<notifyInactive.TuitionPaymentFragmentbindingInflater1> linkedList, ServerConfiguration serverConfiguration) {
        int i;
        synchronized (this) {
            notifyActive notifyactive = this.b;
            if (!linkedList.isEmpty()) {
                try {
                    SQLiteDatabase writableDatabase = notifyactive.getWritableDatabase();
                    writableDatabase.beginTransaction();
                    for (notifyInactive.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 : linkedList) {
                        try {
                            if (tuitionPaymentFragmentbindingInflater1.g.f1275a.active) {
                                mergeConfigs mergeconfigs = tuitionPaymentFragmentbindingInflater1.g;
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("visitor_id", Long.valueOf(mergeconfigs.cancelAll));
                                contentValues.put("session_id", Long.valueOf(mergeconfigs.d));
                                contentValues.put("sequence_nr", Integer.valueOf(mergeconfigs.b));
                                contentValues.put("basic_segment", tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                contentValues.put("event_segment", tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);
                                contentValues.put("event_id", Integer.valueOf(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                contentValues.put("session_start", Long.valueOf(mergeconfigs.g));
                                contentValues.put("event_start", Long.valueOf(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                contentValues.put("multiplicity", Integer.valueOf(mergeconfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == -1 ? 1 : mergeconfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                contentValues.put("server_id", Integer.valueOf(tuitionPaymentFragmentbindingInflater1.f1283a));
                                contentValues.put("app_id", tuitionPaymentFragmentbindingInflater1.b);
                                contentValues.put("sr_param", mergeconfigs.asInterface);
                                writableDatabase.insert("Events", null, contentValues);
                            }
                        } catch (Throwable th) {
                            writableDatabase.endTransaction();
                            throw th;
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Exception unused) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        String str = notifyActive.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        ViewPort.a("Error inserting batch record into database.");
                    }
                }
                if (serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > 0) {
                    for (i = 0; i < linkedList.size(); i++) {
                        if (linkedList.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2 == notifyActive.TuitionPaymentFragmentbindingInflater1) {
                            try {
                                this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(notifyActive.TuitionPaymentFragmentbindingInflater1, serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                break;
                            } catch (Exception unused2) {
                                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                    ViewPort.TuitionPaymentFragmentbindingInflater1("Database error.");
                                }
                            }
                        }
                    }
                }
            } else if (serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > 0) {
                while (i < linkedList.size()) {
                    if (linkedList.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2 == notifyActive.TuitionPaymentFragmentbindingInflater1) {
                        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(notifyActive.TuitionPaymentFragmentbindingInflater1, serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        break;
                    }
                }
            }
            throw th;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentbindingInflater1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 63;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            obj = null;
            if (abortcapture.b >= cArrB.length) {
                break;
            }
            int i5 = $10 + 39;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 64837), 1357 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 37, 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - TextUtils.lastIndexOf("", '0', 0, 0)), 468 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i8 = $10 + 125;
        $11 = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j, long j2) {
        synchronized (this) {
            try {
                this.b.getWritableDatabase().delete("Events", "visitor_id= ? AND session_id= ?", new String[]{String.valueOf(j), String.valueOf(j2)});
            } catch (Exception unused) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentbindingInflater1("Database error.");
                }
            }
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j, boolean z) {
        synchronized (this) {
            try {
                this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(j - 540000, z);
            } catch (Exception unused) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.a("Database error.");
                }
            }
        }
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        try {
            if (this.b.getWritableDatabase().delete("Events", null, null) <= 0) {
                return false;
            }
            int i2 = d + 95;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return true;
        } catch (Exception unused) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.a("Database error.");
                int i4 = d + 33;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            }
            return false;
        }
    }

    public final long b() throws Throwable {
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSizeAndState = (char) (43042 - View.resolveSizeAndState(0, 0, 0));
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 3111;
            int iRed = Color.red(0) + 22;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[7], bArr[37], bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, offsetAfter, iRed, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{49910, 33427, 63781, 47208, 49815, 2466, 61439, 6663, 61413, 14881, 48507, 30687, 39009, 25783, 35005, 17710, 19195, 37171, 26211, 37532, 30571, 50079, 13799, 57354, 8697, 60467}, KeyEvent.normalizeMetaState(0) + 1, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{32373, 39111, 59773, 60369, 32272, 5108, 65442, 18876, 21370, 8313, 44323, 9242, 9448, 32497, 39079, 5808, 63080, 35705, 30250}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char absoluteGravity = (char) (43042 - Gravity.getAbsoluteGravity(0, 0));
            int iCombineMeasuredStates = 3111 - View.combineMeasuredStates(0, 0);
            int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte[] bArr2 = $$a;
            byte b = bArr2[7];
            byte b2 = bArr2[132];
            Object[] objArr5 = new Object[1];
            c(b, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity, iCombineMeasuredStates, iIndexOf, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (43042 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                int bitsPerPixel = 3110 - ImageFormat.getBitsPerPixel(0);
                int i = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21;
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                c(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, bitsPerPixel, i, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i2 = ((int[]) objArr7[2])[0];
            int i3 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i3};
            int iNextInt = new Random().nextInt();
            int i4 = ~iNextInt;
            int i5 = (((878206818 + ((~(143817403 | i4)) * (-560))) + ((~(iNextInt | (-1426850885))) * (-560))) + (((~(1561214055 | i4)) | 9454232) * 560)) - 310263920;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i2}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{28812, 55430, 31726, 14043, 28902, 21432, 27942, 38055, 24030, 24625, 16309, 63788, 10771, 16127, 2571, 52151, 63627, 52001, 58553, 7207}, (ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{9451, 5573, 34424, 13681, 9346, 40702, 37027, 38658, 2531, 44407, 49718, 64145, 32347, 62451, 63421, 51212, 44252, 1657, 6446, 8069}, 1 - TextUtils.getTrimmedLength(""), objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, -310263920};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[50];
                byte b6 = (byte) (b5 - 1);
                Object[] objArr11 = new Object[1];
                f(b5, b6, b6, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr3[50];
                byte b8 = (byte) (b7 - 1);
                byte b9 = b7;
                Object[] objArr12 = new Object[1];
                f(b8, b9, b9, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (43041 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int size = View.MeasureSpec.getSize(0) + 3111;
                    int i8 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
                    byte b10 = $$a[7];
                    byte b11 = b10;
                    Object[] objArr14 = new Object[1];
                    c(b10, b11, b11, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, size, i8, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{49910, 33427, 63781, 47208, 49815, 2466, 61439, 6663, 61413, 14881, 48507, 30687, 39009, 25783, 35005, 17710, 19195, 37171, 26211, 37532, 30571, 50079, 13799, 57354, 8697, 60467}, (ViewConfiguration.getScrollBarSize() >> 8) + 1, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{32373, 39111, 59773, 60369, 32272, 5108, 65442, 18876, 21370, 8313, 44323, 9242, 9448, 32497, 39079, 5808, 63080, 35705, 30250}, 1 - Drawable.resolveOpacity(0, 0), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char tapTimeout = (char) (43042 - (ViewConfiguration.getTapTimeout() >> 16));
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 3111;
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 22;
                        byte[] bArr4 = $$a;
                        byte b12 = bArr4[7];
                        byte b13 = bArr4[132];
                        Object[] objArr17 = new Object[1];
                        c(b12, b13, b13, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, threadPriority, offsetBefore, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char fadingEdgeLength = (char) (43042 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 3111;
                        int iCombineMeasuredStates2 = 22 - View.combineMeasuredStates(0, 0);
                        byte[] bArr5 = $$a;
                        Object[] objArr18 = new Object[1];
                        c(bArr5[7], bArr5[37], bArr5[132], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, iKeyCodeFromString, iCombineMeasuredStates2, -1272852037, false, (String) objArr18[0], null);
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
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArr[0])[0];
            int i12 = ((int[]) objArr[2])[0];
            int i13 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i12};
            int iIdentityHashCode = System.identityHashCode(this);
            int i14 = ~((-1075053785) | iIdentityHashCode);
            int i15 = i11 + 129939770 + ((34095106 | i14) * (-476)) + (i14 * 952) + ((~((~iIdentityHashCode) | (-1075053785))) * 476);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
            Object[] objArr19 = {new int[1], new int[]{i13}, iArr2, strArr2};
            try {
                synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    Long lTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2("sessionid");
                    if (lTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                        return -1L;
                    }
                    long jLongValue3 = lTuitionPaymentFragmentspecialinlinedviewModeldefault2.longValue();
                    int i18 = ((int[]) objArr19[0])[0];
                    int i19 = i18 * i18;
                    int i20 = -(460811619 * i18);
                    int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                    int i22 = -(i18 * (-735948761));
                    int i23 = (i21 & i22) + (i22 | i21);
                    int i24 = (i23 & (-237878375)) + ((-237878375) | i23);
                    int i25 = i24 >> 18;
                    int i26 = ((i25 ^ (-32767)) + ((i25 & (-32767)) << 1)) / 16384;
                    int i27 = (i24 - (~(((i26 | 1) << 1) - (i26 ^ 1)))) - 1;
                    int i28 = ((i24 >> 21) - 4095) / 2048;
                    int i29 = -(i27 ^ ((i28 & 1) + (i28 | 1)));
                    int i30 = ((i29 | 2) << 1) - (i29 ^ 2);
                    int i31 = i30 >> 20;
                    int i32 = ((i31 ^ (-8191)) + ((i31 & (-8191)) << 1)) / 4096;
                    int i33 = (i32 ^ 1) + ((i32 & 1) << 1);
                    long j2 = jLongValue3 + (((long) (472320 / (((-(((i33 | 1) << 1) - (i33 ^ 1))) & i30) * 1920))) - 122);
                    setEffect seteffect = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("sessionid", Long.valueOf(j2));
                    seteffect.getWritableDatabase().update("parm", contentValues, "_id=1", null);
                    return j2;
                }
            } catch (Exception unused2) {
                if (!SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    return -1L;
                }
                ViewPort.a("Database error.");
                return -1L;
            }
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[3];
        if (strArr3 != null) {
            for (String str : strArr3) {
                arrayList.add(str);
            }
        }
        throw new RuntimeException(String.valueOf(i10));
    }

    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        d = i2 % 128;
        int i3 = i2 % 2;
        try {
            Long lTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2("visitorid");
            if (lTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                setEffect seteffect = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                ContentValues contentValues = new ContentValues();
                contentValues.put("visitorid", (Integer) 0);
                contentValues.put("sessionid", (Integer) 0);
                seteffect.getWritableDatabase().insert("parm", null, contentValues);
                int i4 = asBinder + 29;
                d = i4 % 128;
                int i5 = i4 % 2;
            } else if (lTuitionPaymentFragmentspecialinlinedviewModeldefault2.longValue() != 0) {
                return lTuitionPaymentFragmentspecialinlinedviewModeldefault2.longValue();
            }
        } catch (Exception unused) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.a("Database error.");
            }
        }
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        try {
            lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
            setEffect seteffect2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("visitorid", Long.valueOf(jTuitionPaymentFragmentspecialinlinedviewModeldefault2));
            seteffect2.getWritableDatabase().update("parm", contentValues2, "_id=1", null);
        } catch (Exception unused2) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.a("Database error.");
            }
        }
        return jTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static long TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = d + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            jLongValue += Double.valueOf(Math.random() * 65536.0d).longValue() << (i4 * 8);
        }
        int i5 = d + 65;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return jLongValue;
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(mergeConfigs mergeconfigs) {
        boolean z;
        synchronized (this) {
            try {
                notifyActive notifyactive = this.b;
                ContentValues contentValues = new ContentValues();
                contentValues.put("multiplicity", Integer.valueOf(mergeconfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                contentValues.put("sr_param", mergeconfigs.asInterface);
                z = notifyactive.getWritableDatabase().update("Events", contentValues, "visitor_id= ? AND session_id= ?", new String[]{String.valueOf(mergeconfigs.cancelAll), String.valueOf(mergeconfigs.d)}) > 0;
            } catch (Exception unused) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.a("can't update multiplicity");
                }
                return false;
            }
        }
        return z;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentbindingInflater1 = -1045077318779051719L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, int r8, short r9) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r8 = r8 * 2
            int r8 = r8 + 107
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r0 = defpackage.isEffectTargetsSupported.$$c
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r7 = r7 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isEffectTargetsSupported.$$g(byte, int, short):java.lang.String");
    }
}
