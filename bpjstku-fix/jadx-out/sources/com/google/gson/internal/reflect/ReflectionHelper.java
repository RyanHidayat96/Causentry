package com.google.gson.internal.reflect;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.JsonIOException;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class ReflectionHelper {
    private static final RecordHelper RECORD_HELPER;

    static {
        RecordHelper recordNotSupportedHelper;
        try {
            recordNotSupportedHelper = new RecordSupportedHelper();
        } catch (NoSuchMethodException unused) {
            recordNotSupportedHelper = new RecordNotSupportedHelper();
        }
        RECORD_HELPER = recordNotSupportedHelper;
    }

    private ReflectionHelper() {
    }

    public static void makeAccessible(AccessibleObject accessibleObject) throws JsonIOException {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e2) {
            String accessibleObjectDescription = getAccessibleObjectDescription(accessibleObject, false);
            StringBuilder sb = new StringBuilder("Failed making ");
            sb.append(accessibleObjectDescription);
            sb.append(" accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            throw new JsonIOException(sb.toString(), e2);
        }
    }

    public static String getAccessibleObjectDescription(AccessibleObject accessibleObject, boolean z) {
        String string;
        if (accessibleObject instanceof Field) {
            StringBuilder sb = new StringBuilder("field '");
            sb.append(fieldToString((Field) accessibleObject));
            sb.append("'");
            string = sb.toString();
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            appendExecutableParameters(method, sb2);
            String string2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder("method '");
            sb3.append(method.getDeclaringClass().getName());
            sb3.append("#");
            sb3.append(string2);
            sb3.append("'");
            string = sb3.toString();
        } else if (accessibleObject instanceof Constructor) {
            StringBuilder sb4 = new StringBuilder("constructor '");
            sb4.append(constructorToString((Constructor) accessibleObject));
            sb4.append("'");
            string = sb4.toString();
        } else {
            StringBuilder sb5 = new StringBuilder("<unknown AccessibleObject> ");
            sb5.append(accessibleObject.toString());
            string = sb5.toString();
        }
        if (!z || !Character.isLowerCase(string.charAt(0))) {
            return string;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(Character.toUpperCase(string.charAt(0)));
        sb6.append(string.substring(1));
        return sb6.toString();
    }

    public static String fieldToString(Field field) {
        StringBuilder sb = new StringBuilder();
        sb.append(field.getDeclaringClass().getName());
        sb.append("#");
        sb.append(field.getName());
        return sb.toString();
    }

    public static String constructorToString(Constructor<?> constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        appendExecutableParameters(constructor, sb);
        return sb.toString();
    }

    private static void appendExecutableParameters(AccessibleObject accessibleObject, StringBuilder sb) {
        Class<?>[] parameterTypes;
        sb.append('(');
        if (accessibleObject instanceof Method) {
            parameterTypes = ((Method) accessibleObject).getParameterTypes();
        } else {
            parameterTypes = ((Constructor) accessibleObject).getParameterTypes();
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    public static String tryMakeAccessible(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("Failed making constructor '");
            sb.append(constructorToString(constructor));
            sb.append("' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ");
            sb.append(e2.getMessage());
            return sb.toString();
        }
    }

    public static boolean isRecord(Class<?> cls) {
        return RECORD_HELPER.isRecord(cls);
    }

    public static String[] getRecordComponentNames(Class<?> cls) {
        return RECORD_HELPER.getRecordComponentNames(cls);
    }

    public static Method getAccessor(Class<?> cls, Field field) {
        return RECORD_HELPER.getAccessor(cls, field);
    }

    public static <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
        return RECORD_HELPER.getCanonicalRecordConstructor(cls);
    }

    public static RuntimeException createExceptionForUnexpectedIllegalAccess(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RuntimeException createExceptionForRecordReflectionException(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    static class RecordNotSupportedHelper extends RecordHelper {
        private static final byte[] $$c = {113, 29, -123, -97};
        private static final int $$d = 237;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {99, -43, -44, -62, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 111;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int asBinder = 1;
        private static char[] TuitionPaymentFragmentbindingInflater1 = {47486, 47473, 47483, 47469, 47472, 47478, 47409, 47468, 47436, 47462, 47467, 47482, 47474, 47452, 47475, 47484, 47476, 47471, 47437};
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2047719711;
        private static boolean b = true;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r0 = 53 - r8
                byte[] r1 = com.google.gson.internal.reflect.ReflectionHelper.RecordNotSupportedHelper.$$a
                int r6 = r6 + 4
                int r7 = r7 * 14
                int r7 = r7 + 84
                byte[] r0 = new byte[r0]
                int r8 = 52 - r8
                r2 = 0
                if (r1 != 0) goto L14
                r3 = r6
                r4 = r2
                goto L2e
            L14:
                r3 = r2
                r5 = r7
                r7 = r6
                r6 = r5
            L18:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                r3 = r1[r7]
                r5 = r3
                r3 = r7
                r7 = r5
            L2e:
                int r7 = -r7
                int r6 = r6 + r7
                int r6 = r6 + (-11)
                r7 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.reflect.ReflectionHelper.RecordNotSupportedHelper.a(short, int, short, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
            char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
            int i3 = 0;
            if (cArr2 != null) {
                int i4 = $10 + 61;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $10 + 43;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i3] = Integer.valueOf(cArr2[i6]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char defaultSize = (char) (31339 - View.getDefaultSize(i3, i3));
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', i3) + 2995;
                            int jumpTapTimeout = 17 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            byte b2 = (byte) ($$d & 3);
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, iLastIndexOf, jumpTapTimeout, 1182129903, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i6++;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - TextUtils.getOffsetBefore("", 0)), Color.red(0) + 253, 22 - ((Process.getThreadPriority(0) + 20) >> 6), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            float f = 0.0f;
            int i9 = 33602;
            int i10 = 1687675375;
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i11 = $10 + 101;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (i9 - Color.blue(0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3085, (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 25, -2146875848, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    f = 0.0f;
                    i9 = 33602;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!b) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i13 = $10 + 33;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i15 = $11 + 119;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i17 = $11 + 87;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >>> 1) >> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] >>> i] + iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i10);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 33602), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3085, 26 - View.resolveSizeAndState(0, 0, 0), -2146875848, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } else {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (MotionEvent.axisFromString("") + 33603), TextUtils.indexOf("", "", 0) + 3085, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26, -2146875848, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                }
                i10 = 1687675375;
            }
            objArr[0] = new String(cArr6);
        }

        private RecordNotSupportedHelper() {
            super();
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        String[] getRecordComponentNames(Class<?> cls) {
            int i = 2 % 2;
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
            int i = 2 % 2;
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public Method getAccessor(Class<?> cls, Field field) {
            int i = 2 % 2;
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        boolean isRecord(Class<?> cls) throws Throwable {
            char c;
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int trimmedLength = 651 - TextUtils.getTrimmedLength("");
                int scrollBarSize = 44 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr = $$a;
                byte b2 = bArr[80];
                byte b3 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, trimmedLength, scrollBarSize, -459846511, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(null, null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(null, null, TextUtils.getTrimmedLength("") + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
            long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                int iBlue = Color.blue(0) + 651;
                int gidForName = 43 - Process.getGidForName("");
                Object[] objArr5 = new Object[1];
                a((byte) 51, $$a[5], (byte) 52, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, iBlue, gidForName, -873460649, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char size = (char) View.MeasureSpec.getSize(0);
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 651;
                    int defaultSize = 44 - View.getDefaultSize(0, 0);
                    byte b4 = $$a[7];
                    Object[] objArr6 = new Object[1];
                    a((byte) 51, b4, (byte) (b4 | 15), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, iCombineMeasuredStates, defaultSize, -1595579076, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i2 = ((int[]) objArr7[2])[0];
                int i3 = ((int[]) objArr7[0])[0];
                int iIdentityHashCode = System.identityHashCode(this);
                int i4 = ((((~((-805504518) | iIdentityHashCode)) * 521) - 1680353780) + (((~((~iIdentityHashCode) | (-805504518))) | (-810516384)) * 521)) - 2005070243;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[3])[0] = i6 ^ (i6 << 5);
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                c = 2;
            } else {
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), MotionEvent.axisFromString("") + 1611, ExpandableListView.getPackedPositionGroup(0L) + 26, 2145681644, false, null, new Class[0]);
                    }
                    Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -2005070243, 0};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iLastIndexOf = 650 - TextUtils.lastIndexOf("", '0');
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 44;
                        Object[] objArr9 = new Object[1];
                        a((byte) 51, $$a[5], (byte) 52, objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout, iLastIndexOf, maxKeyCode, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 695 - KeyEvent.getDeadChar(0, 0), KeyEvent.getDeadChar(0, 0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 63406), 792 - ExpandableListView.getPackedPositionChild(0L), 83 - (ViewConfiguration.getWindowTouchSlop() >> 8)), Integer.TYPE, Integer.TYPE});
                    }
                    Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char size2 = (char) View.MeasureSpec.getSize(0);
                        int iResolveSize = 651 - View.resolveSize(0, 0);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 44;
                        byte b5 = $$a[7];
                        Object[] objArr11 = new Object[1];
                        a((byte) 51, b5, (byte) (b5 | 15), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(size2, iResolveSize, packedPositionGroup, -1595579076, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                    try {
                        Object[] objArr12 = new Object[1];
                        c(null, null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        c(null, null, Color.red(0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr13);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                            int iIndexOf = 651 - TextUtils.indexOf("", "", 0);
                            int i9 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43;
                            Object[] objArr14 = new Object[1];
                            a((byte) 51, $$a[5], (byte) 52, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(threadPriority, iIndexOf, i9, -873460649, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                            char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                            int iArgb = 651 - Color.argb(0, 0, 0, 0);
                            int i10 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43;
                            byte[] bArr2 = $$a;
                            byte b6 = bArr2[80];
                            byte b7 = bArr2[7];
                            Object[] objArr15 = new Object[1];
                            a(b6, b7, b7, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, iArgb, i10, -459846511, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                        asBinder = i11 % 128;
                        c = 2;
                        int i12 = i11 % 2;
                        objArr = objArr10;
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
            int i13 = ((int[]) objArr[0])[0];
            int i14 = ((int[]) objArr[c])[0];
            if (i14 != i13) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[1];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i14));
            }
            Object[] objArr16 = new Object[4];
            objArr16[0] = new int[]{i};
            objArr16[c] = new int[]{i};
            objArr16[3] = new int[1];
            int i15 = ((int[]) objArr[3])[0];
            int i16 = ((int[]) objArr[c])[0];
            int i17 = ((int[]) objArr[0])[0];
            objArr16[1] = new String[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i18 = i15 + 158142275 + (((~((-428886407) | iIdentityHashCode2)) | 427819264) * (-140)) + ((~((-1067143) | iIdentityHashCode2)) * 70) + (((~(iIdentityHashCode2 | 432317216)) | (-5565095)) * 70);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            Object obj = objArr16[3];
            ((int[]) obj)[0] = i20 ^ (i20 << 5);
            int i21 = asBinder + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
            int i22 = i21 % 2;
            int i23 = ((int[]) obj)[0];
            int i24 = i23 * i23;
            int i25 = -(539039914 * i23);
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            int i27 = -(i23 * (-463529194));
            int i28 = (((i26 | i27) << 1) - (i27 ^ i26)) - (-1922925568);
            int i29 = i28 >> 15;
            int i30 = (((-262143) & i29) + (i29 | (-262143))) / 131072;
            int i31 = (i30 ^ 1) + ((i30 & 1) << 1);
            int i32 = (i28 ^ i31) + ((i31 & i28) << 1);
            int i33 = i28 >> 28;
            int i34 = ((i33 ^ (-31)) + ((i33 & (-31)) << 1)) / 16;
            int i35 = -(((i34 ^ 1) + ((i34 & 1) << 1)) ^ i32);
            int i36 = (i35 & 6) + (i35 | 6);
            int i37 = i36 >> 16;
            int i38 = (((-131071) ^ i37) + ((i37 & (-131071)) << 1)) / 65536;
            int i39 = (i38 ^ 1) + ((i38 & 1) << 1);
            return 0 / (((-((i39 & 1) + (i39 | 1))) & i36) * 757);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(int r5, byte r6, short r7) {
            /*
                int r5 = r5 + 67
                int r7 = r7 * 3
                int r7 = 4 - r7
                byte[] r0 = com.google.gson.internal.reflect.ReflectionHelper.RecordNotSupportedHelper.$$c
                int r6 = r6 * 4
                int r1 = 1 - r6
                byte[] r1 = new byte[r1]
                r2 = 0
                int r6 = 0 - r6
                if (r0 != 0) goto L17
                r3 = r5
                r5 = r6
                r4 = r2
                goto L27
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L25:
                r3 = r0[r7]
            L27:
                int r5 = r5 + r3
                int r7 = r7 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.reflect.ReflectionHelper.RecordNotSupportedHelper.$$e(int, byte, short):java.lang.String");
        }
    }

    static abstract class RecordHelper {
        public abstract Method getAccessor(Class<?> cls, Field field);

        abstract <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls);

        abstract String[] getRecordComponentNames(Class<?> cls);

        abstract boolean isRecord(Class<?> cls);

        private RecordHelper() {
        }
    }

    static class RecordSupportedHelper extends RecordHelper {
        private final Method getName;
        private final Method getRecordComponents;
        private final Method getType;
        private final Method isRecord;

        private RecordSupportedHelper() throws NoSuchMethodException {
            super();
            this.isRecord = Class.class.getMethod("isRecord", new Class[0]);
            Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
            this.getRecordComponents = method;
            Class<?> componentType = method.getReturnType().getComponentType();
            this.getName = componentType.getMethod("getName", new Class[0]);
            this.getType = componentType.getMethod("getType", new Class[0]);
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        boolean isRecord(Class<?> cls) {
            try {
                return ((Boolean) this.isRecord.invoke(cls, new Object[0])).booleanValue();
            } catch (ReflectiveOperationException e2) {
                throw ReflectionHelper.createExceptionForRecordReflectionException(e2);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        String[] getRecordComponentNames(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.getRecordComponents.invoke(cls, new Object[0]);
                String[] strArr = new String[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    strArr[i] = (String) this.getName.invoke(objArr[i], new Object[0]);
                }
                return strArr;
            } catch (ReflectiveOperationException e2) {
                throw ReflectionHelper.createExceptionForRecordReflectionException(e2);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.getRecordComponents.invoke(cls, new Object[0]);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    clsArr[i] = (Class) this.getType.invoke(objArr[i], new Object[0]);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e2) {
                throw ReflectionHelper.createExceptionForRecordReflectionException(e2);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public Method getAccessor(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), new Class[0]);
            } catch (ReflectiveOperationException e2) {
                throw ReflectionHelper.createExceptionForRecordReflectionException(e2);
            }
        }
    }
}
