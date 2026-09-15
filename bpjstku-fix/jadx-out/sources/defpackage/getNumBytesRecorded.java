package defpackage;

import android.R;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
final class getNumBytesRecorded<T> extends AutoValue_RecordingStats<T> {
    private final JsonReader.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final getAudioStats<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault3<?>[] b;
    private static final byte[] $$d = {12, -88, 33, 118, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 11, 7, -15, 1, 6, 16, -5, 11, -6, -3, 73, -73, 3, 15, 15, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 70};
    private static final int $$e = 105;
    private static final byte[] $$a = {46, 47, -18, 64, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
    private static final int $$b = 44;
    public static final AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1 = new AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: getNumBytesRecorded.1
        @Override // AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final AutoValue_RecordingStats<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Type type, Set<? extends Annotation> set, CapabilitiesByQuality capabilitiesByQuality) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> clsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = toValidatedProfiles.TuitionPaymentFragmentspecialinlinedviewModeldefault2(type);
            if (clsTuitionPaymentFragmentspecialinlinedviewModeldefault2.isInterface() || clsTuitionPaymentFragmentspecialinlinedviewModeldefault2.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (checkQualityConstantsOrThrow.TuitionPaymentFragmentbindingInflater1(clsTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                String strConcat = "Platform ".concat(String.valueOf(clsTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                if (type instanceof ParameterizedType) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strConcat);
                    sb.append(" in ");
                    sb.append(type);
                    strConcat = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strConcat);
                sb2.append(" requires explicit JsonAdapter to be registered");
                throw new IllegalArgumentException(sb2.toString());
            }
            if (clsTuitionPaymentFragmentspecialinlinedviewModeldefault2.isAnonymousClass()) {
                StringBuilder sb3 = new StringBuilder("Cannot serialize anonymous class ");
                sb3.append(clsTuitionPaymentFragmentspecialinlinedviewModeldefault2.getName());
                throw new IllegalArgumentException(sb3.toString());
            }
            if (clsTuitionPaymentFragmentspecialinlinedviewModeldefault2.isLocalClass()) {
                StringBuilder sb4 = new StringBuilder("Cannot serialize local class ");
                sb4.append(clsTuitionPaymentFragmentspecialinlinedviewModeldefault2.getName());
                throw new IllegalArgumentException(sb4.toString());
            }
            if (clsTuitionPaymentFragmentspecialinlinedviewModeldefault2.getEnclosingClass() != null && !Modifier.isStatic(clsTuitionPaymentFragmentspecialinlinedviewModeldefault2.getModifiers())) {
                StringBuilder sb5 = new StringBuilder("Cannot serialize non-static nested class ");
                sb5.append(clsTuitionPaymentFragmentspecialinlinedviewModeldefault2.getName());
                throw new IllegalArgumentException(sb5.toString());
            }
            if (Modifier.isAbstract(clsTuitionPaymentFragmentspecialinlinedviewModeldefault2.getModifiers())) {
                StringBuilder sb6 = new StringBuilder("Cannot serialize abstract class ");
                sb6.append(clsTuitionPaymentFragmentspecialinlinedviewModeldefault2.getName());
                throw new IllegalArgumentException(sb6.toString());
            }
            if (checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(clsTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                StringBuilder sb7 = new StringBuilder("Cannot serialize Kotlin type ");
                sb7.append(clsTuitionPaymentFragmentspecialinlinedviewModeldefault2.getName());
                sb7.append(". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapter from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                throw new IllegalArgumentException(sb7.toString());
            }
            getAudioStats getaudiostatsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getAudioStats.TuitionPaymentFragmentspecialinlinedviewModeldefault3(clsTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            TreeMap treeMap = new TreeMap();
            while (type != Object.class) {
                Class<?> clsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = toValidatedProfiles.TuitionPaymentFragmentspecialinlinedviewModeldefault2(type);
                boolean zTuitionPaymentFragmentbindingInflater1 = checkQualityConstantsOrThrow.TuitionPaymentFragmentbindingInflater1(clsTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                for (Field field : clsTuitionPaymentFragmentspecialinlinedviewModeldefault3.getDeclaredFields()) {
                    int modifiers = field.getModifiers();
                    if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !zTuitionPaymentFragmentbindingInflater1)) {
                        Type typeTuitionPaymentFragmentspecialinlinedviewModeldefault1 = checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(type, clsTuitionPaymentFragmentspecialinlinedviewModeldefault3, field.getGenericType());
                        Set<? extends Annotation> setTuitionPaymentFragmentspecialinlinedviewModeldefault2 = checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(field);
                        String name = field.getName();
                        AutoValue_RecordingStats<T> autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = capabilitiesByQuality.TuitionPaymentFragmentspecialinlinedviewModeldefault2(typeTuitionPaymentFragmentspecialinlinedviewModeldefault1, setTuitionPaymentFragmentspecialinlinedviewModeldefault2, name);
                        field.setAccessible(true);
                        AutoValue_StreamInfo autoValue_StreamInfo = (AutoValue_StreamInfo) field.getAnnotation(AutoValue_StreamInfo.class);
                        if (autoValue_StreamInfo != null) {
                            name = autoValue_StreamInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        }
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(name, field, autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) treeMap.put(name, tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        if (tuitionPaymentFragmentspecialinlinedviewModeldefault4 != null) {
                            StringBuilder sb8 = new StringBuilder("Conflicting fields:\n    ");
                            sb8.append(tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            sb8.append("\n    ");
                            sb8.append(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            throw new IllegalArgumentException(sb8.toString());
                        }
                    }
                }
                Class<?> clsTuitionPaymentFragmentspecialinlinedviewModeldefault4 = toValidatedProfiles.TuitionPaymentFragmentspecialinlinedviewModeldefault2(type);
                type = checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(type, clsTuitionPaymentFragmentspecialinlinedviewModeldefault4, clsTuitionPaymentFragmentspecialinlinedviewModeldefault4.getGenericSuperclass());
            }
            return new getEncoderProfiles(new getNumBytesRecorded(getaudiostatsTuitionPaymentFragmentspecialinlinedviewModeldefault3, treeMap));
        }
    };

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 10
            int r7 = 13 - r7
            byte[] r0 = defpackage.getNumBytesRecorded.$$a
            int r6 = r6 * 3
            int r6 = r6 + 97
            int r8 = 11 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-5)
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getNumBytesRecorded.a(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.getNumBytesRecorded.$$d
            int r7 = r7 * 5
            int r1 = 53 - r7
            int r6 = r6 * 15
            int r6 = r6 + 84
            int r5 = r5 * 47
            int r5 = r5 + 4
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r6 = r5
            r3 = r7
            r4 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r0[r5]
        L2b:
            int r5 = r5 + 1
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + 3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getNumBytesRecorded.c(short, int, int, java.lang.Object[]):void");
    }

    getNumBytesRecorded(getAudioStats<T> getaudiostats, Map<String, TuitionPaymentFragmentspecialinlinedviewModeldefault3<?>> map) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getaudiostats;
        this.b = (TuitionPaymentFragmentspecialinlinedviewModeldefault3[]) map.values().toArray(new TuitionPaymentFragmentspecialinlinedviewModeldefault3[map.size()]);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = JsonReader.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // defpackage.AutoValue_RecordingStats
    public final T b(JsonReader jsonReader) throws Throwable {
        Object[] objArr;
        char c;
        getNumBytesRecorded<T> getnumbytesrecorded = this;
        try {
            T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getnumbytesrecorded.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            try {
                jsonReader.b();
                while (jsonReader.a()) {
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getnumbytesrecorded.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == -1) {
                        jsonReader.INotificationSideChannelDefault();
                        jsonReader.RemoteActionCompatParcelizer();
                    } else {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3<?> tuitionPaymentFragmentspecialinlinedviewModeldefault3 = getnumbytesrecorded.b[iTuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cAlpha = (char) Color.alpha(0);
                            int iRgb = (-16776340) - Color.rgb(0, 0, 0);
                            int fadingEdgeLength = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            byte b = $$a[11];
                            byte b2 = b;
                            Object[] objArr2 = new Object[1];
                            a(b2, (byte) (b2 + 1), b, objArr2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, iRgb, fadingEdgeLength, -1199417970, false, (String) objArr2[0], null);
                        }
                        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                        long jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 876;
                            int i = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            byte[] bArr = $$a;
                            byte b3 = bArr[11];
                            Object[] objArr3 = new Object[1];
                            a((byte) (b3 + 1), b3, bArr[8], objArr3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, maximumDrawingCacheSize, i, 254769921, false, (String) objArr3[0], null);
                        }
                        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                int deadChar = KeyEvent.getDeadChar(0, 0) + 876;
                                int keyRepeatDelay = 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                byte b4 = $$a[11];
                                byte b5 = b4;
                                Object[] objArr4 = new Object[1];
                                a(b4, b5, (byte) (b5 + 3), objArr4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, deadChar, keyRepeatDelay, 1324201839, false, (String) objArr4[0], null);
                            }
                            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                            objArr = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
                            int iNextInt = new Random().nextInt(1580043511);
                            int i2 = 1060618538 + (((~((~iNextInt) | 898112758)) | (-938426112)) * (-245));
                            int i3 = ~(iNextInt | 898112758);
                            int i4 = i2 + (i3 * (-245)) + ((i3 | 938422987) * 245) + 1190927553;
                            int i5 = (i4 << 13) ^ i4;
                            int i6 = i5 ^ (i5 >>> 17);
                            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                            c = 2;
                        } else {
                            try {
                                Object[] objArr6 = {Integer.valueOf(((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, tuitionPaymentFragmentspecialinlinedviewModeldefault3)).intValue()), 1190927553};
                                byte[] bArr2 = $$d;
                                byte b6 = bArr2[39];
                                byte b7 = (byte) (b6 - 1);
                                byte b8 = b6;
                                Object[] objArr7 = new Object[1];
                                c(b7, b8, b8, objArr7);
                                Class<?> cls = Class.forName((String) objArr7[0]);
                                byte b9 = bArr2[39];
                                byte b10 = (byte) (b9 - 1);
                                Object[] objArr8 = new Object[1];
                                c(b9, b10, b10, objArr8);
                                objArr = (Object[]) cls.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                                    int touchSlop = 876 - (ViewConfiguration.getTouchSlop() >> 8);
                                    int jumpTapTimeout = 10 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                    byte b11 = $$a[11];
                                    byte b12 = b11;
                                    Object[] objArr9 = new Object[1];
                                    a(b11, b12, (byte) (b12 + 3), objArr9);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(trimmedLength, touchSlop, jumpTapTimeout, 1324201839, false, (String) objArr9[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                                try {
                                    long jLongValue2 = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                                        int mode = 876 - View.MeasureSpec.getMode(0);
                                        int i7 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11;
                                        byte[] bArr3 = $$a;
                                        byte b13 = bArr3[11];
                                        Object[] objArr10 = new Object[1];
                                        a((byte) (b13 + 1), b13, bArr3[8], objArr10);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, mode, i7, 254769921, false, (String) objArr10[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char c4 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                                        int i8 = 877 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                        int i9 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
                                        byte b14 = $$a[11];
                                        byte b15 = b14;
                                        Object[] objArr11 = new Object[1];
                                        a(b15, (byte) (b15 + 1), b14, objArr11);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c4, i8, i9, -1199417970, false, (String) objArr11[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                    c = 2;
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
                        int i10 = ((int[]) objArr[c])[0];
                        int i11 = ((int[]) objArr[0])[0];
                        if (i11 == i10) {
                            int i12 = ((int[]) objArr[1])[0];
                            Object[] objArr12 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                            int iNextInt2 = new Random().nextInt(1115270120);
                            int i13 = ~iNextInt2;
                            int i14 = i12 + (-1985269932) + ((~(60311590 | i13)) * (-560)) + ((~(iNextInt2 | 62487159)) * (-560)) + (((~((-20001362) | i13)) | R.raw.loaderror) * 560);
                            int i15 = (i14 << 13) ^ i14;
                            int i16 = i15 ^ (i15 >>> 17);
                            ((int[]) objArr12[1])[0] = i16 ^ (i16 << 5);
                            Object objB = tuitionPaymentFragmentspecialinlinedviewModeldefault3.b.b(jsonReader);
                            Field field = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            T t = tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            field.set(t, objB);
                            getnumbytesrecorded = this;
                            tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = t;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArr[3];
                            if (strArr != null) {
                                for (String str : strArr) {
                                    arrayList.add(str);
                                }
                            }
                            throw new RuntimeException(String.valueOf(i11));
                        }
                    }
                }
                T t2 = tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                jsonReader.TuitionPaymentFragmentbindingInflater1();
                return t2;
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused3) {
            throw new AssertionError();
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw checkQualityConstantsOrThrow.TuitionPaymentFragmentbindingInflater1(e3);
        }
    }

    @Override // defpackage.AutoValue_RecordingStats
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, T t) throws IOException {
        try {
            setqualityselector.b();
            for (TuitionPaymentFragmentspecialinlinedviewModeldefault3<?> tuitionPaymentFragmentspecialinlinedviewModeldefault3 : this.b) {
                setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1);
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setqualityselector, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(t));
            }
            setqualityselector.TuitionPaymentFragmentbindingInflater1();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonAdapter(");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(")");
        return sb.toString();
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> {
        final String TuitionPaymentFragmentbindingInflater1;
        final Field TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final AutoValue_RecordingStats<T> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, Field field, AutoValue_RecordingStats<T> autoValue_RecordingStats) {
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = field;
            this.b = autoValue_RecordingStats;
        }
    }
}
