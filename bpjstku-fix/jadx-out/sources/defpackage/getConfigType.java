package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@getExtraEncoderProfiles
public final class getConfigType implements AutoValue_StreamSpec1, CameraConfigProviderExternalSyntheticLambda0, getZslDisabled {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f924a;
    private static int asBinder;
    static final ProcessingNodeExternalSyntheticLambda7 b;
    final CameraConfigs TuitionPaymentFragmentbindingInflater1;
    final setExpectedFrameRateRange TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final CameraConfigs TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final ExtraSupportedResolutionQuirk<String> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final setCompatibilityId d;
    private static final byte[] $$d = {29, -5, -24, -13, -1, 22, -1, 12, 7, 28, 5, -3, 25, 13, -1, 17, 15, -51, -9, 27, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
    private static final int $$e = 231;
    private static final byte[] $$a = {31, -3, -46, 11, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 130;
    private static int asInterface = 0;
    private static int INotificationSideChannel = 1;
    private static int g = 1;

    interface TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> {
        T TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    interface b<T, U> {
        U TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t);
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = (~((~i2) | i6)) | (~(i6 | i3));
        int i8 = (~i6) | (~i3);
        int i9 = i7 | (~(i8 | i2));
        int i10 = (~i8) | i2;
        int i11 = ~(i3 | i2);
        int i12 = i2 + i6 + i4 + ((-417414852) * i) + (1247522396 * i5);
        int i13 = i12 * i12;
        int i14 = (i2 * (-1219797419)) + 1526988800 + ((-1219797419) * i6) + (825712212 * i9) + ((-1651424424) * i10) + ((-825712212) * i11) + ((-2045509632) * i4) + ((-2135949312) * i) + ((-953155584) * i5) + ((-430374912) * i13);
        int i15 = ((i2 * 184508743) - 476012450) + (i6 * 184508743) + (i9 * (-996)) + (i10 * 1992) + (i11 * 996) + (i4 * 184509739) + (i * (-953474796)) + (i5 * (-288057996)) + (i13 * (-839712768));
        int i16 = i14 + (i15 * i15 * 1709113344);
        if (i16 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i16 != 2) {
            return i16 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
        }
        return b(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = 84 - r6
            byte[] r0 = defpackage.getConfigType.$$a
            int r8 = r8 + 4
            int r7 = r7 * 15
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2c:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getConfigType.c(short, byte, byte, java.lang.Object[]):void");
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
    private static void f(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.getConfigType.$$d
            int r7 = r7 * 16
            int r7 = 20 - r7
            int r6 = r6 * 24
            int r6 = 108 - r6
            int r8 = r8 * 36
            int r1 = r8 + 17
            byte[] r1 = new byte[r1]
            int r8 = r8 + 16
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2f:
            int r6 = r6 + r7
            int r6 = r6 + (-10)
            int r7 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getConfigType.f(int, int, byte, java.lang.Object[]):void");
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 67;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 2624 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() % (f924a * 9053247990562531611L);
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getTrimmedLength("") + 39422), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 481, TextUtils.getCapsMode("", 0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 19472), View.getDefaultSize(0, 0) + 2624, 13 - Color.red(0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (f924a ^ 9053247990562531611L);
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 39422), 481 - TextUtils.indexOf("", "", 0), 36 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $10 + 43;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 39422), (Process.myTid() >> 22) + 481, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    @isSamsungJ6
    getConfigType(CameraConfigs cameraConfigs, CameraConfigs cameraConfigs2, setExpectedFrameRateRange setexpectedframeraterange, setCompatibilityId setcompatibilityid, @getSupportedBitrateRange(TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "PACKAGE_NAME") ExtraSupportedResolutionQuirk<String> extraSupportedResolutionQuirk) {
        this.d = setcompatibilityid;
        this.TuitionPaymentFragmentbindingInflater1 = cameraConfigs;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cameraConfigs2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = setexpectedframeraterange;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = extraSupportedResolutionQuirk;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        getConfigType getconfigtype = (getConfigType) objArr[0];
        int i = 2 % 2;
        final setCompatibilityId setcompatibilityid = getconfigtype.d;
        Objects.requireNonNull(setcompatibilityid);
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) getconfigtype.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: CameraCaptureResult
            @Override // getConfigType.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                return setcompatibilityid.getWritableDatabase();
            }
        }, new b() { // from class: CameraCaptureMetaDataAwbMode
            @Override // getConfigType.b
            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
                throw new SynchronizationException("Timed out while trying to open db.", (Throwable) obj);
            }
        });
        int i2 = INotificationSideChannel + 69;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return sQLiteDatabase;
        }
        throw null;
    }

    @Override // defpackage.AutoValue_StreamSpec1
    public final AutoValue_SurfaceSizeDefinition TuitionPaymentFragmentspecialinlinedviewModeldefault3(final retryRequest retryrequest, final resume resumeVar) {
        int i = 2 % 2;
        new Object[]{retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), resumeVar.a(), retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2()};
        long jLongValue = ((Long) TuitionPaymentFragmentbindingInflater1(new b() { // from class: CameraCaptureResultEmptyCameraCaptureResult
            @Override // getConfigType.b
            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
                long jInsert;
                getConfigType getconfigtype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                resume resumeVar2 = resumeVar;
                retryRequest retryrequest2 = retryrequest;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (((SQLiteDatabase) getConfigType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -442946330, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{getconfigtype}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 442946330)).compileStatement("PRAGMA page_count").simpleQueryForLong() * ((SQLiteDatabase) getConfigType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -442946330, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{getconfigtype}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 442946330)).compileStatement("PRAGMA page_size").simpleQueryForLong() >= getconfigtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b()) {
                    getconfigtype.TuitionPaymentFragmentbindingInflater1(new getAnalysisSize(resumeVar2.a(), LogEventDropped.Reason.CACHE_FULL, 1L));
                    return -1L;
                }
                Long lTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getConfigType.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sQLiteDatabase, retryrequest2);
                if (lTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                    jInsert = lTuitionPaymentFragmentspecialinlinedviewModeldefault1.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", retryrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    contentValues.put("priority", Integer.valueOf(getImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(retryrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault3())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (retryrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault1() != null) {
                        contentValues.put("extras", Base64.encodeToString(retryrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int iTuitionPaymentFragmentbindingInflater1 = getconfigtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
                byte[] bArr = resumeVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault1().b;
                boolean z = bArr.length <= iTuitionPaymentFragmentbindingInflater1;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", resumeVar2.a());
                contentValues2.put("timestamp_ms", Long.valueOf(resumeVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()));
                contentValues2.put("uptime_ms", Long.valueOf(resumeVar2.g()));
                contentValues2.put("payload_encoding", resumeVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                contentValues2.put("code", resumeVar2.TuitionPaymentFragmentbindingInflater1());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr : new byte[0]);
                contentValues2.put("product_id", resumeVar2.asInterface());
                contentValues2.put("pseudonymous_id", resumeVar2.asBinder());
                contentValues2.put("experiment_ids_clear_blob", resumeVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                contentValues2.put("experiment_ids_encrypted_blob", resumeVar2.d());
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr.length) / ((double) iTuitionPaymentFragmentbindingInflater1));
                    for (int i2 = 1; i2 <= iCeil; i2++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (i2 - 1) * iTuitionPaymentFragmentbindingInflater1, Math.min(i2 * iTuitionPaymentFragmentbindingInflater1, bArr.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i2));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry<String, String> entry : resumeVar2.INotificationSideChannel().entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", entry.getKey());
                    contentValues4.put("value", entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            }
        })).longValue();
        Object obj = null;
        if (jLongValue < 1) {
            int i2 = asInterface + 43;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        AutoValue_StreamSpec autoValue_StreamSpec = new AutoValue_StreamSpec(jLongValue, retryrequest, resumeVar);
        int i4 = INotificationSideChannel + 121;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return autoValue_StreamSpec;
        }
        obj.hashCode();
        throw null;
    }

    static Long TuitionPaymentFragmentspecialinlinedviewModeldefault1(SQLiteDatabase sQLiteDatabase, retryRequest retryrequest) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(getImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3()))));
        if (retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1() != null) {
            int i2 = INotificationSideChannel + 117;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 0));
        } else {
            sb.append(" and extras is null");
        }
        Long l = (Long) b(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: CameraCaptureMetaDataAfMode
            @Override // getConfigType.b
            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
                Cursor cursor = (Cursor) obj;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return null;
            }
        });
        int i4 = asInterface + 5;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r0 = new java.lang.StringBuilder("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
        r0.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3(r4));
        r4 = r0.toString();
        r1 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
        TuitionPaymentFragmentbindingInflater1(new defpackage.getS720pSizeMap(r3, r4, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r4.iterator().hasNext() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r4.iterator().hasNext() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r4 = defpackage.getConfigType.asInterface + 123;
        defpackage.getConfigType.INotificationSideChannel = r4 % 128;
        r4 = r4 % 2;
     */
    @Override // defpackage.AutoValue_StreamSpec1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void TuitionPaymentFragmentbindingInflater1(java.lang.Iterable<defpackage.AutoValue_SurfaceSizeDefinition> r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = defpackage.getConfigType.asInterface
            int r1 = r1 + 91
            int r2 = r1 % 128
            defpackage.getConfigType.INotificationSideChannel = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1d
            java.util.Iterator r1 = r4.iterator()
            boolean r1 = r1.hasNext()
            r2 = 53
            int r2 = r2 / 0
            if (r1 != 0) goto L31
            goto L27
        L1d:
            java.util.Iterator r1 = r4.iterator()
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L31
        L27:
            int r4 = defpackage.getConfigType.asInterface
            int r4 = r4 + 123
            int r1 = r4 % 128
            defpackage.getConfigType.INotificationSideChannel = r1
            int r4 = r4 % r0
            return
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in "
            r0.<init>(r1)
            java.lang.String r4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            getS720pSizeMap r0 = new getS720pSizeMap
            java.lang.String r1 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"
            r0.<init>()
            r3.TuitionPaymentFragmentbindingInflater1(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getConfigType.TuitionPaymentFragmentbindingInflater1(java.lang.Iterable):void");
    }

    @Override // defpackage.AutoValue_StreamSpec1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Iterable<AutoValue_SurfaceSizeDefinition> iterable) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            iterable.iterator().hasNext();
            throw null;
        }
        if (iterable.iterator().hasNext()) {
            StringBuilder sb = new StringBuilder("DELETE FROM events WHERE _id in ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3(iterable));
            String string = sb.toString();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            ((SQLiteDatabase) TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -442946330, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 442946330)).compileStatement(string).execute();
            return;
        }
        int i3 = INotificationSideChannel + 73;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 91 / 0;
        }
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(Iterable<AutoValue_SurfaceSizeDefinition> iterable) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("(");
        Iterator<AutoValue_SurfaceSizeDefinition> it = iterable.iterator();
        while (it.hasNext()) {
            int i2 = INotificationSideChannel + 45;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                sb.append(it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                it.hasNext();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            sb.append(it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            if (it.hasNext()) {
                sb.append(',');
                int i3 = asInterface + 117;
                INotificationSideChannel = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.AutoValue_StreamSpec1
    public final long TuitionPaymentFragmentbindingInflater1(retryRequest retryrequest) {
        int i = 2 % 2;
        long jLongValue = ((Long) b(((SQLiteDatabase) TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -442946330, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 442946330)).rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(getImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3()))}), new b() { // from class: CameraCaptureCallbacksNoOpCameraCaptureCallback
            @Override // getConfigType.b
            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
                Cursor cursor = (Cursor) obj;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return 0L;
            }
        })).longValue();
        int i2 = asInterface + 111;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        return jLongValue;
    }

    @Override // defpackage.AutoValue_StreamSpec1
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(final retryRequest retryrequest) {
        int i = 2 % 2;
        boolean zBooleanValue = ((Boolean) TuitionPaymentFragmentbindingInflater1(new b() { // from class: CameraCaptureResults
            @Override // getConfigType.b
            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
                getConfigType getconfigtype = this.TuitionPaymentFragmentbindingInflater1;
                Long lTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getConfigType.TuitionPaymentFragmentspecialinlinedviewModeldefault1((SQLiteDatabase) obj, retryrequest);
                if (lTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    return Boolean.FALSE;
                }
                Object[] objArr = {getconfigtype};
                return (Boolean) getConfigType.b(((SQLiteDatabase) getConfigType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -442946330, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 442946330)).rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lTuitionPaymentFragmentspecialinlinedviewModeldefault1.toString()}), new getConfigType.b() { // from class: CameraCaptureFailureReason
                    @Override // getConfigType.b
                    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj2) {
                        return Boolean.valueOf(((Cursor) obj2).moveToNext());
                    }
                });
            }
        })).booleanValue();
        int i2 = asInterface + 111;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.AutoValue_StreamSpec1
    public final void b(final retryRequest retryrequest, final long j) {
        int i = 2 % 2;
        TuitionPaymentFragmentbindingInflater1(new b() { // from class: CameraConfig
            @Override // getConfigType.b
            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
                long j2 = j;
                retryRequest retryrequest2 = retryrequest;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j2));
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{retryrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(getImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(retryrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault3()))}) <= 0) {
                    contentValues.put("backend_name", retryrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    contentValues.put("priority", Integer.valueOf(getImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(retryrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault3())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
        int i2 = asInterface + 79;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // defpackage.AutoValue_StreamSpec1
    public final Iterable<AutoValue_SurfaceSizeDefinition> TuitionPaymentFragmentspecialinlinedviewModeldefault1(final retryRequest retryrequest) {
        int i = 2 % 2;
        Iterable<AutoValue_SurfaceSizeDefinition> iterable = (Iterable) TuitionPaymentFragmentbindingInflater1(new b() { // from class: CameraCaptureMetaDataAwbState
            @Override // getConfigType.b
            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
                getConfigType getconfigtype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                retryRequest retryrequest2 = retryrequest;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                List list = (List) getConfigType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1710977740, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{getconfigtype, sQLiteDatabase, retryrequest2, Integer.valueOf(getconfigtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2())}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1710977742);
                for (Priority priority : Priority.values()) {
                    if (priority != retryrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getconfigtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2() - list.size();
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 0) {
                            break;
                        }
                        list.addAll((List) getConfigType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1710977740, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{getconfigtype, sQLiteDatabase, retryRequest.b().TuitionPaymentFragmentbindingInflater1(retryrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(priority).TuitionPaymentFragmentbindingInflater1(retryrequest2.TuitionPaymentFragmentspecialinlinedviewModeldefault1()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(), Integer.valueOf(iTuitionPaymentFragmentspecialinlinedviewModeldefault2)}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1710977742));
                    }
                }
                final HashMap map = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                for (int i2 = 0; i2 < list.size(); i2++) {
                    sb.append(((AutoValue_SurfaceSizeDefinition) list.get(i2)).TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                    if (i2 < list.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                getConfigType.b(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new getConfigType.b() { // from class: setCaptureProcessProgressSupported
                    @Override // getConfigType.b
                    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj2) {
                        Map map2 = map;
                        Cursor cursor = (Cursor) obj2;
                        while (cursor.moveToNext()) {
                            byte b2 = 0;
                            long j = cursor.getLong(0);
                            Set hashSet = (Set) map2.get(Long.valueOf(j));
                            if (hashSet == null) {
                                hashSet = new HashSet();
                                map2.put(Long.valueOf(j), hashSet);
                            }
                            hashSet.add(new getConfigType.TuitionPaymentFragmentbindingInflater1(cursor.getString(1), cursor.getString(2), b2));
                        }
                        return null;
                    }
                });
                return (List) getConfigType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 249909907, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{getconfigtype, list, map}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -249909904);
            }
        });
        int i2 = asInterface + 65;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        return iterable;
    }

    @Override // defpackage.AutoValue_StreamSpec1
    public final Iterable<retryRequest> b() {
        int i = 2 % 2;
        Iterable<retryRequest> iterable = (Iterable) TuitionPaymentFragmentbindingInflater1(new b() { // from class: CameraCaptureCallbacksComboCameraCaptureCallback
            @Override // getConfigType.b
            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
                return (List) getConfigType.b(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new getConfigType.b() { // from class: getUltraMaximumSizeMap
                    @Override // getConfigType.b
                    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj2) {
                        Cursor cursor = (Cursor) obj2;
                        ArrayList arrayList = new ArrayList();
                        while (cursor.moveToNext()) {
                            retryRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = retryRequest.b().TuitionPaymentFragmentbindingInflater1(cursor.getString(1)).TuitionPaymentFragmentspecialinlinedviewModeldefault2(getImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(cursor.getInt(2)));
                            String string = cursor.getString(3);
                            arrayList.add(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(string == null ? null : Base64.decode(string, 0)).TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                        }
                        return arrayList;
                    }
                });
            }
        });
        int i2 = asInterface + 13;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        return iterable;
    }

    @Override // defpackage.AutoValue_StreamSpec1
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        final long jTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1() - this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iIntValue = ((Integer) TuitionPaymentFragmentbindingInflater1(new b() { // from class: getS1440pSizeMap
            @Override // getConfigType.b
            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
                final getConfigType getconfigtype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                String[] strArr = {String.valueOf(jTuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                getConfigType.b(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new getConfigType.b() { // from class: CameraCaptureMetaDataAeMode
                    @Override // getConfigType.b
                    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj2) {
                        getConfigType getconfigtype2 = getconfigtype;
                        Cursor cursor = (Cursor) obj2;
                        while (cursor.moveToNext()) {
                            getconfigtype2.TuitionPaymentFragmentbindingInflater1(new getAnalysisSize(cursor.getString(1), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getInt(0)));
                        }
                        return null;
                    }
                });
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            }
        })).intValue();
        int i2 = INotificationSideChannel + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return iIntValue;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.d.close();
        if (i3 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        final getConfigType getconfigtype = (getConfigType) objArr[0];
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) objArr[1];
        final retryRequest retryrequest = (retryRequest) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        final ArrayList arrayList = new ArrayList();
        Long lTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(sQLiteDatabase, retryrequest);
        if (lTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            int i2 = INotificationSideChannel + 5;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return arrayList;
        }
        b(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lTuitionPaymentFragmentspecialinlinedviewModeldefault1.toString()}, null, null, null, String.valueOf(iIntValue)), new b() { // from class: getMaximumSizeMap
            @Override // getConfigType.b
            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
                getConfigType getconfigtype2 = this.TuitionPaymentFragmentbindingInflater1;
                List list = arrayList;
                retryRequest retryrequest2 = retryrequest;
                Cursor cursor = (Cursor) obj;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    boolean z = cursor.getInt(7) != 0;
                    abortRequests.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new abortRequests.TuitionPaymentFragmentbindingInflater1();
                    tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new HashMap();
                    resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(cursor.getString(1)).TuitionPaymentFragmentbindingInflater1(cursor.getLong(2)).TuitionPaymentFragmentspecialinlinedviewModeldefault2(cursor.getLong(3));
                    if (z) {
                        String string = cursor.getString(4);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(new issueNextRequest(string == null ? getConfigType.b : new ProcessingNodeExternalSyntheticLambda7(string), cursor.getBlob(5)));
                    } else {
                        String string2 = cursor.getString(4);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(new issueNextRequest(string2 == null ? getConfigType.b : new ProcessingNodeExternalSyntheticLambda7(string2), (byte[]) getConfigType.b(((SQLiteDatabase) getConfigType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -442946330, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{getconfigtype2}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 442946330)).query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new getConfigType.b() { // from class: CameraCaptureCallback
                            @Override // getConfigType.b
                            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj2) {
                                Cursor cursor2 = (Cursor) obj2;
                                ArrayList arrayList2 = new ArrayList();
                                int length = 0;
                                while (cursor2.moveToNext()) {
                                    byte[] blob = cursor2.getBlob(0);
                                    arrayList2.add(blob);
                                    length += blob.length;
                                }
                                byte[] bArr = new byte[length];
                                int length2 = 0;
                                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                    byte[] bArr2 = (byte[]) arrayList2.get(i4);
                                    System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                    length2 += bArr2.length;
                                }
                                return bArr;
                            }
                        })));
                    }
                    if (!cursor.isNull(6)) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Integer.valueOf(cursor.getInt(6)));
                    }
                    if (!cursor.isNull(8)) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Integer.valueOf(cursor.getInt(8)));
                    }
                    if (!cursor.isNull(9)) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cursor.getString(9));
                    }
                    if (!cursor.isNull(10)) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(cursor.getBlob(10));
                    }
                    if (!cursor.isNull(11)) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cursor.getBlob(11));
                    }
                    list.add(new AutoValue_StreamSpec(j, retryrequest2, TuitionPaymentFragmentspecialinlinedviewModeldefault2.b()));
                }
                return null;
            }
        });
        int i4 = asInterface + 47;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return arrayList;
    }

    static class TuitionPaymentFragmentbindingInflater1 {
        final String TuitionPaymentFragmentbindingInflater1;
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* synthetic */ TuitionPaymentFragmentbindingInflater1(String str, String str2, byte b) {
            this(str, str2);
        }

        private TuitionPaymentFragmentbindingInflater1(String str, String str2) {
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0218  */
    /* JADX WARN: Code duplicated, block: B:63:0x0559 A[LOOP:1: B:61:0x0553->B:63:0x0559, LOOP_END] */
    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws Throwable {
        Object[] objArr2;
        AutoValue_SurfaceSizeDefinition autoValue_SurfaceSizeDefinition;
        resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2CancelAll;
        getConfigType getconfigtype = (getConfigType) objArr[0];
        List list = (List) objArr[1];
        Map map = (Map) objArr[2];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 876;
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr3 = new Object[1];
            c(b2, bArr[5], b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, iKeyCodeFromString, maximumDrawingCacheSize, -1650998592, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{18595, 56827, 25096, 34997, 7665, 41496, 51372, 23949, 57877, 2238, 40330, 8748, 18607, 56794, 25204, 35006, 7647, 41542, 51376, 24024, 57965, 2186}, 38231 - (Process.myPid() >> 22), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{18599, 59725, 2917, 44315, 53053, 25032, 33780, 9637, 18367, 63576, 6768, 48247, 56847, 28712, 37581}, 41443 - TextUtils.getTrimmedLength(""), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int iArgb = Color.argb(0, 0, 0, 0) + 876;
            int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', 0);
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr6 = new Object[1];
            c(b3, b4, (byte) (b4 | 37), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, iArgb, iLastIndexOf, 2012020043, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 876;
                int iBlue = Color.blue(0) + 10;
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr7 = new Object[1];
                c(b5, b6, (byte) (b6 | 89), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop, iKeyCodeFromString2, iBlue, 2012931276, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iMyUid = Process.myUid();
            int i4 = ~iMyUid;
            int i5 = 1813040072 + (((~((-554261054) | i4)) | 553668624) * (-108)) + (((~(i4 | 594571282)) | (~((-594571283) | iMyUid)) | (-595163712)) * 54) + ((iMyUid | (-595163712)) * 54) + 1437099596;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr2[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{18595, 12645, 47924, 9707, 44937, 10310, 37392, 7315, 34539, Typography.pound, 35176, 29519, 65007, 26516, 57416, 27244, 54308, 24306, 55444, 16720, 52002, 46551, 16374, 47528, 8827, 44039}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31176, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{18593, 56914, 25978, 35871, 4915, 47829, 49640, 26816, 65434, 1727, 44124, 13180, 23069, 57602, 2096, 40896, 9981, 19865}, (ViewConfiguration.getTapTimeout() >> 16) + 38629, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i8 = asInterface + 125;
                    INotificationSideChannel = i8 % 128;
                    if (i8 % 2 == 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr11 = new Object[1];
            e(new char[]{18600, 63486, 13838, 30388, 46488, 62591, 13453, 29479, 45645, 62121, 12595, 28740, 45293, 65295, 16305, 32476}, (ViewConfiguration.getLongPressTimeout() >> 16) + 48989, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(new char[]{18603, 63861, 11009, 24021, 36858, 12724, 25156, 38014, 50706, 2248, 47759, 60603, 7525, 20250, 61740, 9210}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 45522, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, getconfigtype)).intValue();
            int i9 = asInterface + 13;
            INotificationSideChannel = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, 1437099596};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[53];
                byte b8 = (byte) (b7 - 1);
                byte b9 = b7;
                Object[] objArr14 = new Object[1];
                f(b8, b9, (byte) (b9 - 1), objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b10 = bArr2[53];
                byte b11 = b10;
                Object[] objArr15 = new Object[1];
                f(b11, (byte) (b11 - 1), b10, objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char defaultSize = (char) View.getDefaultSize(0, 0);
                        int i11 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 876;
                        int maxKeyCode = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b12 = $$a[7];
                        byte b13 = b12;
                        Object[] objArr17 = new Object[1];
                        c(b12, b13, (byte) (b13 | 89), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, i11, maxKeyCode, 2012931276, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        e(new char[]{18595, 56827, 25096, 34997, 7665, 41496, 51372, 23949, 57877, 2238, 40330, 8748, 18607, 56794, 25204, 35006, 7647, 41542, 51376, 24024, 57965, 2186}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 38231, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        e(new char[]{18599, 59725, 2917, 44315, 53053, 25032, 33780, 9637, 18367, 63576, 6768, 48247, 56847, 28712, 37581}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 41443, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                            int scrollBarSize = 876 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int i12 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte b14 = $$a[7];
                            byte b15 = b14;
                            Object[] objArr20 = new Object[1];
                            c(b14, b15, (byte) (b15 | 37), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, scrollBarSize, i12, 2012020043, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                            int iResolveSizeAndState = 876 - View.resolveSizeAndState(0, 0, 0);
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
                            byte[] bArr3 = $$a;
                            byte b16 = bArr3[7];
                            Object[] objArr21 = new Object[1];
                            c(b16, bArr3[5], b16, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates, iResolveSizeAndState, keyRepeatDelay, -1650998592, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr2 = objArr16;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i13 = ((int[]) objArr2[2])[0];
        int i14 = ((int[]) objArr2[0])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr2[1])[0];
            Object[] objArr22 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i16 = i15 + ((((-1703544620) + (((~(839329404 | iElapsedRealtime)) | 73930753) * 576)) + (((~((~iElapsedRealtime) | 913260157)) | 805708880) * 576)) - 365559232);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr22[1])[0] = i18 ^ (i18 << 5);
        } else {
            int[] iArr = new int[i14];
            int i19 = i14 - 1;
            iArr[i19] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i19) % 2) - 1], 1).show();
            int i20 = ((int[]) objArr2[1])[0];
            Object[] objArr23 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int iNextInt = new Random().nextInt();
            int i21 = i20 + (((~(iNextInt | 834110722)) | (-793800494)) * 56) + 1573066140 + (((~((~iNextInt) | (-793800494))) | 834110722) * 56);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr23[1])[0] = i23 ^ (i23 << 5);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int i24 = INotificationSideChannel + 79;
            asInterface = i24 % 128;
            if (i24 % 2 != 0) {
                autoValue_SurfaceSizeDefinition = (AutoValue_SurfaceSizeDefinition) listIterator.next();
                int i25 = 82 / 0;
                if (map.containsKey(Long.valueOf(autoValue_SurfaceSizeDefinition.TuitionPaymentFragmentspecialinlinedviewModeldefault1()))) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2CancelAll = autoValue_SurfaceSizeDefinition.b().cancelAll();
                    for (TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 : (Set) map.get(Long.valueOf(autoValue_SurfaceSizeDefinition.TuitionPaymentFragmentspecialinlinedviewModeldefault1()))) {
                        int i26 = asInterface + 95;
                        INotificationSideChannel = i26 % 128;
                        int i27 = i26 % 2;
                        tuitionPaymentFragmentspecialinlinedviewModeldefault2CancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        int i28 = INotificationSideChannel + 13;
                        asInterface = i28 % 128;
                        int i29 = i28 % 2;
                    }
                    listIterator.set(new AutoValue_StreamSpec(autoValue_SurfaceSizeDefinition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), autoValue_SurfaceSizeDefinition.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), tuitionPaymentFragmentspecialinlinedviewModeldefault2CancelAll.b()));
                }
            } else {
                autoValue_SurfaceSizeDefinition = (AutoValue_SurfaceSizeDefinition) listIterator.next();
                if (map.containsKey(Long.valueOf(autoValue_SurfaceSizeDefinition.TuitionPaymentFragmentspecialinlinedviewModeldefault1()))) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2CancelAll = autoValue_SurfaceSizeDefinition.b().cancelAll();
                    while (r6.hasNext()) {
                        int i210 = asInterface + 95;
                        INotificationSideChannel = i210 % 128;
                        int i211 = i210 % 2;
                        tuitionPaymentFragmentspecialinlinedviewModeldefault2CancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        int i212 = INotificationSideChannel + 13;
                        asInterface = i212 % 128;
                        int i213 = i212 % 2;
                    }
                    listIterator.set(new AutoValue_StreamSpec(autoValue_SurfaceSizeDefinition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), autoValue_SurfaceSizeDefinition.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), tuitionPaymentFragmentspecialinlinedviewModeldefault2CancelAll.b()));
                }
            }
        }
        return list;
    }

    private <T> T TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault1, b<Throwable, T> bVar) {
        int i = 2 % 2;
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        while (true) {
            try {
                return tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1() >= ((long) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) + jTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
                    int i2 = INotificationSideChannel + 31;
                    asInterface = i2 % 128;
                    int i3 = i2 % 2;
                    return tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                SystemClock.sleep(50L);
                int i4 = INotificationSideChannel + 117;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    @Override // defpackage.getZslDisabled
    public final void TuitionPaymentFragmentbindingInflater1(long j, LogEventDropped.Reason reason, String str) {
        int i = 2 % 2;
        TuitionPaymentFragmentbindingInflater1(new getAnalysisSize(str, reason, j));
        int i2 = INotificationSideChannel + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.getZslDisabled
    public final AutoValue_Config_Option TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        final AutoValue_Config_Option.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AutoValue_Config_Option.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        AutoValue_Config_Option autoValue_Config_Option = (AutoValue_Config_Option) TuitionPaymentFragmentbindingInflater1(new b() { // from class: AutoValue_SurfaceConfig
            @Override // getConfigType.b
            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
                final getConfigType getconfigtype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String str2 = str;
                final Map map2 = map;
                final AutoValue_Config_Option.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
                return (AutoValue_Config_Option) getConfigType.b(((SQLiteDatabase) obj).rawQuery(str2, new String[0]), new getConfigType.b() { // from class: getCompatibilityId
                    @Override // getConfigType.b
                    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj2) throws Throwable {
                        LogEventDropped.Reason reason;
                        getConfigType getconfigtype2 = getconfigtype;
                        Map map3 = map2;
                        AutoValue_Config_Option.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        Cursor cursor = (Cursor) obj2;
                        while (cursor.moveToNext()) {
                            String string = cursor.getString(0);
                            int i2 = cursor.getInt(1);
                            if (i2 == LogEventDropped.Reason.REASON_UNKNOWN.getNumber()) {
                                reason = LogEventDropped.Reason.REASON_UNKNOWN;
                            } else if (i2 == LogEventDropped.Reason.MESSAGE_TOO_OLD.getNumber()) {
                                reason = LogEventDropped.Reason.MESSAGE_TOO_OLD;
                            } else if (i2 == LogEventDropped.Reason.CACHE_FULL.getNumber()) {
                                reason = LogEventDropped.Reason.CACHE_FULL;
                            } else if (i2 == LogEventDropped.Reason.PAYLOAD_TOO_BIG.getNumber()) {
                                reason = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
                            } else if (i2 == LogEventDropped.Reason.MAX_RETRIES_REACHED.getNumber()) {
                                reason = LogEventDropped.Reason.MAX_RETRIES_REACHED;
                            } else if (i2 == LogEventDropped.Reason.INVALID_PAYLOD.getNumber()) {
                                reason = LogEventDropped.Reason.INVALID_PAYLOD;
                            } else if (i2 == LogEventDropped.Reason.SERVER_ERROR.getNumber()) {
                                reason = LogEventDropped.Reason.SERVER_ERROR;
                            } else {
                                sdkVersion.TuitionPaymentFragmentbindingInflater1("SQLiteEventStore", Integer.valueOf(i2));
                                reason = LogEventDropped.Reason.REASON_UNKNOWN;
                            }
                            long j = cursor.getLong(2);
                            if (!map3.containsKey(string)) {
                                map3.put(string, new ArrayList());
                            }
                            List list = (List) map3.get(string);
                            LogEventDropped.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new LogEventDropped.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1 = reason;
                            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
                            list.add(new LogEventDropped(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1));
                        }
                        for (Map.Entry entry : map3.entrySet()) {
                            toStreamSpec.b bVar = new toStreamSpec.b();
                            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (String) entry.getKey();
                            toStreamSpec.b bVarTuitionPaymentFragmentbindingInflater1 = bVar.TuitionPaymentFragmentbindingInflater1((List) entry.getValue());
                            tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(new toStreamSpec(bVarTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, Collections.unmodifiableList(bVarTuitionPaymentFragmentbindingInflater1.b)));
                        }
                        final long jTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getconfigtype2.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1 = (AutoValue_CameraThreadConfig) getconfigtype2.TuitionPaymentFragmentbindingInflater1(new getConfigType.b() { // from class: CameraCaptureCallbacks
                            @Override // getConfigType.b
                            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj3) {
                                final long j2 = jTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                return (AutoValue_CameraThreadConfig) getConfigType.b(((SQLiteDatabase) obj3).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new getConfigType.b() { // from class: CameraCaptureFailure
                                    @Override // getConfigType.b
                                    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj4) {
                                        long j3 = j2;
                                        Cursor cursor2 = (Cursor) obj4;
                                        cursor2.moveToNext();
                                        long j4 = cursor2.getLong(0);
                                        AutoValue_CameraThreadConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = new AutoValue_CameraThreadConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        tuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j4;
                                        tuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j3;
                                        return new AutoValue_CameraThreadConfig(tuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                    }
                                });
                            }
                        });
                        AutoValue_AttachedSurfaceInfo.b bVar2 = new AutoValue_AttachedSurfaceInfo.b();
                        getValueClass.b bVar3 = new getValueClass.b();
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        long jSimpleQueryForLong = ((SQLiteDatabase) getConfigType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -442946330, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{getconfigtype2}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 442946330)).compileStatement("PRAGMA page_count").simpleQueryForLong();
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        bVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = jSimpleQueryForLong * ((SQLiteDatabase) getConfigType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -442946330, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{getconfigtype2}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 442946330)).compileStatement("PRAGMA page_size").simpleQueryForLong();
                        bVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = setExpectedFrameRateRange.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
                        bVar2.TuitionPaymentFragmentbindingInflater1 = new getValueClass(bVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault3, bVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AutoValue_AttachedSurfaceInfo(bVar2.TuitionPaymentFragmentbindingInflater1);
                        tuitionPaymentFragmentspecialinlinedviewModeldefault4.b = getconfigtype2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
                        return new AutoValue_Config_Option(tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1, Collections.unmodifiableList(tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault1), tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault4.b);
                    }
                });
            }
        });
        int i2 = INotificationSideChannel + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return autoValue_Config_Option;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        final getConfigType getconfigtype = (getConfigType) objArr[0];
        int i = 2 % 2;
        getconfigtype.TuitionPaymentFragmentbindingInflater1(new b() { // from class: retrieveCameraCaptureResult
            @Override // getConfigType.b
            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
                getConfigType getconfigtype2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                StringBuilder sb = new StringBuilder("UPDATE global_log_event_state SET last_metrics_upload_ms=");
                sb.append(getconfigtype2.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                sQLiteDatabase.compileStatement(sb.toString()).execute();
                return null;
            }
        });
        int i2 = asInterface + 19;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // defpackage.CameraConfigProviderExternalSyntheticLambda0
    public final <T> T TuitionPaymentFragmentspecialinlinedviewModeldefault2(CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1<T> tuitionPaymentFragmentbindingInflater1) {
        int i = 2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        final SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -442946330, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 442946330);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: CameraCaptureMetaData
            @Override // getConfigType.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                sQLiteDatabase.beginTransaction();
                return null;
            }
        }, new b() { // from class: CameraCaptureMetaDataAeState
            @Override // getConfigType.b
            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
                throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
            }
        });
        try {
            T tB = tuitionPaymentFragmentbindingInflater1.b();
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            int i2 = INotificationSideChannel + 11;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return tB;
            }
            throw null;
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.sqlite.SQLiteDatabase, int] */
    final <T> T TuitionPaymentFragmentbindingInflater1(b<SQLiteDatabase, T> bVar) {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        INotificationSideChannel = i2 % 128;
        ?? r1 = i2 % 2;
        try {
            if (r1 == 0) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -442946330, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 442946330);
                sQLiteDatabase.beginTransaction();
                bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -442946330, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{this}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 442946330);
            sQLiteDatabase2.beginTransaction();
            T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sQLiteDatabase2);
            sQLiteDatabase2.setTransactionSuccessful();
            sQLiteDatabase2.endTransaction();
            int i3 = asInterface + 51;
            INotificationSideChannel = i3 % 128;
            int i4 = i3 % 2;
            return tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        } catch (Throwable th) {
            r1.endTransaction();
            throw th;
        }
    }

    static <T> T b(Cursor cursor, b<Cursor, T> bVar) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        try {
            T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cursor);
            cursor.close();
            int i4 = INotificationSideChannel + 83;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
    }

    static {
        asBinder = 0;
        asInterface();
        b = new ProcessingNodeExternalSyntheticLambda7("proto");
        int i = g + 21;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    final List<AutoValue_SurfaceSizeDefinition> b(List<AutoValue_SurfaceSizeDefinition> list, Map<Long, Set<TuitionPaymentFragmentbindingInflater1>> map) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (List) TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 249909907, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this, list, map}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -249909904);
    }

    final List<AutoValue_SurfaceSizeDefinition> b(SQLiteDatabase sQLiteDatabase, retryRequest retryrequest, int i) {
        Object[] objArr = {this, sQLiteDatabase, retryrequest, Integer.valueOf(i)};
        return (List) TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1710977740, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1710977742);
    }

    final SQLiteDatabase TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (SQLiteDatabase) TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -442946330, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 442946330);
    }

    @Override // defpackage.getZslDisabled
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 366225115, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -366225114);
    }

    static void asInterface() {
        f924a = -259320005672902183L;
    }
}
