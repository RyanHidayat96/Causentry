package defpackage;

import android.content.pm.ApplicationInfo;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes4.dex */
public class initSession {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $14 = 0;
    private static int $15 = 1;
    private static int $16 = 0;
    private static int $17 = 1;
    private static byte[] IconCompatParcelizer;
    public static final Map MediaBrowserCompat;
    public static final Map connect;
    private static Object disconnect;
    private static long getNotifyChildrenChangedOptions;
    private static long getRoot;
    private static int getServiceComponent;
    private static boolean getSessionToken;
    private static int handleMessage;
    private static int isConnected;
    private static Object read;
    private static int search;
    private static long sendCustomAction;
    private static int setCallbacksMessenger;
    private static byte[] unsubscribe;
    private static byte[] write;

    /* JADX WARN: Code duplicated, block: B:155:0x0411 A[Catch: Exception -> 0x0431, TryCatch #9 {Exception -> 0x0431, blocks: (B:106:0x0328, B:109:0x0339, B:111:0x035e, B:116:0x03a0, B:120:0x03b9, B:122:0x03bd, B:131:0x03d9, B:130:0x03d6, B:133:0x03db, B:135:0x03e1, B:136:0x03e2, B:110:0x034d, B:143:0x03ee, B:145:0x03f4, B:146:0x03f5, B:153:0x040b, B:155:0x0411, B:156:0x0412, B:162:0x0429, B:164:0x042f, B:165:0x0430, B:117:0x03a5, B:126:0x03d0, B:113:0x036f, B:115:0x039a), top: B:190:0x0328, inners: #7, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0412 A[Catch: Exception -> 0x0431, TryCatch #9 {Exception -> 0x0431, blocks: (B:106:0x0328, B:109:0x0339, B:111:0x035e, B:116:0x03a0, B:120:0x03b9, B:122:0x03bd, B:131:0x03d9, B:130:0x03d6, B:133:0x03db, B:135:0x03e1, B:136:0x03e2, B:110:0x034d, B:143:0x03ee, B:145:0x03f4, B:146:0x03f5, B:153:0x040b, B:155:0x0411, B:156:0x0412, B:162:0x0429, B:164:0x042f, B:165:0x0430, B:117:0x03a5, B:126:0x03d0, B:113:0x036f, B:115:0x039a), top: B:190:0x0328, inners: #7, #10, #11 }] */
    private static URL TuitionPaymentFragmentbindingInflater1(String str, ApplicationInfo applicationInfo) throws Throwable {
        byte b;
        byte b2;
        Throwable th;
        Throwable cause;
        byte b3;
        byte b4;
        char c;
        byte b5;
        byte b6;
        Object obj;
        byte b7;
        byte b8;
        char c2;
        Class<?> cls;
        Class<?>[] clsArr;
        Class<String> cls2;
        int i = 2 % 2;
        try {
            ArrayList<File> arrayList = new ArrayList();
            byte[] bArr = $$d;
            if (Class.forName($$f(bArr[148], bArr[372], bArr[13])).getField($$f(bArr[45], bArr[9], bArr[148])).get(applicationInfo) != null) {
                int i2 = $10 + 19;
                $11 = i2 % 128;
                int i3 = i2 % 2;
                try {
                    arrayList.add(Class.forName($$f(bArr[105], bArr[441], bArr[652])).getDeclaredConstructor(String.class).newInstance(Class.forName($$f(bArr[148], bArr[372], bArr[13])).getField($$f(bArr[45], bArr[9], bArr[148])).get(applicationInfo)));
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            Class<?> cls3 = Class.forName($$f(bArr[148], bArr[372], bArr[13]));
            int i4 = $11 + 101;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            Field field = cls3.getField($$f(bArr[15], bArr[9], bArr[896]));
            int i6 = $11 + 121;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            if (field.get(applicationInfo) != null) {
                Object[] objArr = (Object[]) Class.forName($$f(bArr[148], bArr[372], bArr[13])).getField($$f(bArr[15], bArr[9], bArr[896])).get(applicationInfo);
                int length = objArr.length;
                int i8 = $11 + 49;
                $10 = i8 % 128;
                int i9 = 2;
                int i10 = i8 % 2;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = $10 + 23;
                    int i13 = i12 % 128;
                    $11 = i13;
                    if (i12 % i9 == 0) {
                        obj = objArr[i11];
                        int i14 = 12 / 0;
                    } else {
                        obj = objArr[i11];
                    }
                    try {
                        Object[] objArr2 = {obj};
                        byte[] bArr2 = $$d;
                        byte b9 = bArr2[105];
                        int i15 = ((i13 | 21) << 1) - (i13 ^ 21);
                        int i16 = i15 % 128;
                        $10 = i16;
                        if (i15 % 2 != 0) {
                            b7 = b9;
                            b8 = bArr2[12727];
                            c2 = 11535;
                        } else {
                            b7 = b9;
                            b8 = bArr2[441];
                            c2 = 652;
                        }
                        int i17 = i16 + 119;
                        $11 = i17 % 128;
                        if (i17 % 2 == 0) {
                            cls = Class.forName($$f(b7, b8, bArr2[c2]));
                            clsArr = new Class[0];
                            cls2 = String.class;
                        } else {
                            cls = Class.forName($$f(b7, b8, bArr2[c2]));
                            clsArr = new Class[1];
                            cls2 = String.class;
                        }
                        clsArr[0] = cls2;
                        arrayList.add(cls.getDeclaredConstructor(clsArr).newInstance(objArr2));
                        int i18 = $11 + 97;
                        $10 = i18 % 128;
                        int i19 = i18 % 2;
                        i11++;
                        i9 = 2;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                }
            }
            for (File file : arrayList) {
                try {
                    byte[] bArr3 = $$d;
                    try {
                        Class<?> cls4 = Class.forName($$f(bArr3[105], bArr3[441], bArr3[652]));
                        int i20 = $10;
                        int i21 = ((i20 | 27) << 1) - (i20 ^ 27);
                        $11 = i21 % 128;
                        int i22 = i21 % 2;
                        Object objInvoke = cls4.getMethod($$f(bArr3[8], bArr3[145], bArr3[664]), null).invoke(file, null);
                        int i23 = $11;
                        int i24 = (i23 & 45) + (i23 | 45);
                        $10 = i24 % 128;
                        int i25 = i24 % 2;
                        if (((Boolean) objInvoke).booleanValue()) {
                            int i26 = $11 + 47;
                            $10 = i26 % 128;
                            if (i26 % 2 != 0) {
                                try {
                                    b = bArr3[84];
                                    b2 = bArr3[8039];
                                } catch (Throwable th4) {
                                    th = th4;
                                    cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            } else {
                                b = bArr3[105];
                                b2 = bArr3[441];
                            }
                            try {
                                Class<?> cls5 = Class.forName($$f(b, b2, bArr3[652]));
                                int i27 = $10;
                                int i28 = ((i27 | 13) << 1) - (i27 ^ 13);
                                $11 = i28 % 128;
                                if (i28 % 2 == 0) {
                                    b3 = bArr3[21];
                                    b4 = bArr3[35];
                                    c = 3758;
                                } else {
                                    b3 = bArr3[55];
                                    b4 = bArr3[126];
                                    c = 301;
                                }
                                Object objInvoke2 = cls5.getMethod($$f(b3, b4, (short) (-bArr3[c])), null).invoke(file, null);
                                int i29 = $11;
                                int i30 = (i29 & 9) + (i29 | 9);
                                $10 = i30 % 128;
                                int i31 = i30 % 2;
                                String str2 = (String) objInvoke2;
                                try {
                                    byte b10 = bArr3[25];
                                    int i32 = i29 + 91;
                                    $10 = i32 % 128;
                                    int i33 = i32 % 2;
                                    if (str2.endsWith($$f(b10, bArr3[1059], (short) (-bArr3[770])))) {
                                        StringBuilder sb = new StringBuilder();
                                        try {
                                            String str$$f = $$f(bArr3[45], bArr3[441], (short) 80);
                                            int i34 = $11;
                                            int i35 = (i34 ^ 47) + ((i34 & 47) << 1);
                                            $10 = i35 % 128;
                                            int i36 = i35 % 2;
                                            sb.append(str$$f);
                                            try {
                                                byte b11 = bArr3[105];
                                                byte b12 = bArr3[441];
                                                int i37 = $11;
                                                int i38 = (i37 & 101) + (i37 | 101);
                                                $10 = i38 % 128;
                                                int i39 = i38 % 2;
                                                try {
                                                    Class<?> cls6 = Class.forName($$f(b11, b12, bArr3[652]));
                                                    int i40 = $11;
                                                    int i41 = (i40 ^ 3) + ((i40 & 3) << 1);
                                                    $10 = i41 % 128;
                                                    if (i41 % 2 != 0) {
                                                        b6 = bArr3[90];
                                                        b5 = bArr3[24];
                                                    } else {
                                                        byte b13 = bArr3[15];
                                                        b5 = bArr3[126];
                                                        b6 = b13;
                                                    }
                                                    try {
                                                        try {
                                                            sb.append((String) cls6.getMethod($$f(b6, b5, (short) ((b5 ^ 72) | (b5 & 72))), null).invoke(file, null));
                                                            int i42 = $10 + 123;
                                                            $11 = i42 % 128;
                                                            if (i42 % 2 == 0) {
                                                                byte b14 = bArr3[13];
                                                                sb.append($$f(b14, (byte) ((b14 ^ 98) | (b14 & 98)), (short) 103));
                                                            } else {
                                                                byte b15 = bArr3[13];
                                                                sb.append($$f(b15, (byte) ((b15 ^ 86) | (b15 & 86)), (short) 102));
                                                            }
                                                            sb.append(str);
                                                            String string = sb.toString();
                                                            int i43 = $10 + 73;
                                                            $11 = i43 % 128;
                                                            int i44 = i43 % 2;
                                                            try {
                                                                Object[] objArr3 = {string};
                                                                Constructor<?> declaredConstructor = Class.forName($$f(bArr3[105], bArr3[441], (short) 102)).getDeclaredConstructor(String.class);
                                                                int i45 = $10;
                                                                int i46 = (i45 ^ 17) + ((i45 & 17) << 1);
                                                                $11 = i46 % 128;
                                                                int i47 = i46 % 2;
                                                                URL url = (URL) declaredConstructor.newInstance(objArr3);
                                                                ZipFile zipFile = new ZipFile(file);
                                                                try {
                                                                    if (zipFile.getEntry(str.substring(1)) != null) {
                                                                        int i48 = $11 + 27;
                                                                        $10 = i48 % 128;
                                                                        int i49 = i48 % 2;
                                                                        zipFile.close();
                                                                        return url;
                                                                    }
                                                                    zipFile.close();
                                                                    int i50 = $11;
                                                                    int i51 = (i50 & 27) + (i50 | 27);
                                                                    $10 = i51 % 128;
                                                                    int i52 = i51 % 2;
                                                                    int i53 = $11;
                                                                    int i54 = ((i53 | 119) << 1) - (i53 ^ 119);
                                                                    $10 = i54 % 128;
                                                                    int i55 = i54 % 2;
                                                                } catch (Throwable th5) {
                                                                    try {
                                                                        zipFile.close();
                                                                        throw th5;
                                                                    } catch (Throwable th6) {
                                                                        th5.addSuppressed(th6);
                                                                        throw th5;
                                                                    }
                                                                }
                                                            } catch (Throwable th7) {
                                                                Throwable cause4 = th7.getCause();
                                                                if (cause4 != null) {
                                                                    throw cause4;
                                                                }
                                                                throw th7;
                                                            }
                                                        } catch (Exception unused) {
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        Throwable cause5 = th.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                            }
                                        } catch (Exception unused2) {
                                        }
                                    }
                                } catch (Exception unused3) {
                                }
                                int i56 = $11;
                                int i57 = ((i56 | 119) << 1) - (i56 ^ 119);
                                $10 = i57 % 128;
                                int i58 = i57 % 2;
                            } catch (Throwable th11) {
                                th = th11;
                                cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        Throwable cause6 = th.getCause();
                        if (cause6 != null) {
                            throw cause6;
                        }
                        throw th;
                    }
                } catch (Throwable th13) {
                    th = th13;
                }
            }
        } catch (Exception unused4) {
        }
        int i59 = $10;
        int i60 = (i59 ^ 31) + ((i59 & 31) << 1);
        $11 = i60 % 128;
        int i61 = i60 % 2;
        return null;
    }

    private static void b(Object obj) {
        int i = 2 % 2;
        int i2 = $11;
        int i3 = (i2 & 103) + (i2 | 103);
        $10 = i3 % 128;
        int i4 = i3 % 2;
    }

    private initSession() {
    }

    public static Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        Object obj;
        int i2 = 2 % 2;
        int i3 = $10;
        int i4 = ((i3 | 49) << 1) - (i3 ^ 49);
        $11 = i4 % 128;
        int i5 = i4 % 2;
        Map map = MediaBrowserCompat;
        if (i5 == 0) {
            obj = map.get(Integer.valueOf(i ^ search));
            int i6 = 71 / 0;
        } else {
            int i7 = search;
            obj = map.get(Integer.valueOf(((~i) & i7) | ((~i7) & i)));
        }
        int i8 = $11;
        int i9 = ((i8 | 21) << 1) - (i8 ^ 21);
        $10 = i9 % 128;
        int i10 = i9 % 2;
        return obj;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 86501. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    static {
        /*
            Method dump skipped, instruction units count: 8650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.initSession.<clinit>():void");
    }

    public static Object b(char c, int i, int i2, int i3, boolean z, String str, Class[] clsArr) {
        byte[] bArr;
        char c2;
        String str$$f;
        Class<?>[] clsArr2;
        String str$$f2;
        Object declaredMethod;
        int i4 = 2 % 2;
        Map map = MediaBrowserCompat;
        Object obj = map.get(Integer.valueOf(i3));
        if (obj != null) {
            int i5 = $10;
            int i6 = (i5 & 15) + (i5 | 15);
            $11 = i6 % 128;
            int i7 = i6 % 2;
            return obj;
        }
        Integer numValueOf = Integer.valueOf(i3);
        Object obj2 = read;
        try {
            Object[] objArr = new Object[3];
            objArr[2] = Integer.valueOf(i2);
            Integer numValueOf2 = Integer.valueOf(i);
            int i8 = $10;
            int i9 = (i8 ^ 15) + ((i8 & 15) << 1);
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                objArr[0] = numValueOf2;
                objArr[1] = Character.valueOf(c);
                bArr = $$d;
                c2 = 9899;
            } else {
                objArr[1] = numValueOf2;
                objArr[0] = Character.valueOf(c);
                bArr = $$d;
                c2 = 441;
            }
            int i10 = $10 + 61;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                byte b = bArr[c2];
                byte b2 = $$d[86];
                str$$f = $$f(b, b2, (short) ((b2 ^ 18206) | (b2 & 18206)));
            } else {
                byte b3 = bArr[c2];
                byte b4 = $$d[9];
                str$$f = $$f(b3, b4, (short) (b4 | 136));
            }
            Class<?> cls = Class.forName(str$$f, true, (ClassLoader) disconnect);
            byte[] bArr2 = $$d;
            byte b5 = bArr2[77];
            int i11 = $11;
            int i12 = (i11 & 75) + (i11 | 75);
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                str$$f2 = $$f(b5, bArr2[24081], (short) 24664);
                clsArr2 = new Class[2];
            } else {
                String str$$f3 = $$f(b5, bArr2[324], (short) 1081);
                clsArr2 = new Class[3];
                str$$f2 = str$$f3;
            }
            int i13 = $11;
            int i14 = (i13 & 99) + (i13 | 99);
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                clsArr2[0] = Character.TYPE;
                clsArr2[0] = Integer.TYPE;
            } else {
                clsArr2[0] = Character.TYPE;
                clsArr2[1] = Integer.TYPE;
            }
            clsArr2[2] = Integer.TYPE;
            Class cls2 = (Class) cls.getMethod(str$$f2, clsArr2).invoke(obj2, objArr);
            if (str == null) {
                int i15 = $11;
                int i16 = (i15 ^ 45) + ((i15 & 45) << 1);
                int i17 = i16 % 128;
                $10 = i17;
                int i18 = i16 % 2;
                if (!(!z)) {
                    int i19 = i17 + 115;
                    $11 = i19 % 128;
                    if (i19 % 2 == 0) {
                        declaredMethod = cls2.getDeclaredConstructor(clsArr);
                        int i20 = 22 / 0;
                    } else {
                        declaredMethod = cls2.getDeclaredConstructor(clsArr);
                    }
                    int i21 = $11 + 39;
                    $10 = i21 % 128;
                    int i22 = i21 % 2;
                } else {
                    declaredMethod = cls2.getConstructor(clsArr);
                    int i23 = $11;
                    int i24 = ((i23 | 9) << 1) - (i23 ^ 9);
                    $10 = i24 % 128;
                    int i25 = i24 % 2;
                }
            } else {
                Object obj3 = null;
                if (clsArr == null) {
                    int i26 = $11;
                    int i27 = (i26 & 21) + (i26 | 21);
                    int i28 = i27 % 128;
                    $10 = i28;
                    if (i27 % 2 != 0) {
                        obj3.hashCode();
                        throw null;
                    }
                    if (z) {
                        int i29 = i28 + 45;
                        $11 = i29 % 128;
                        if (i29 % 2 == 0) {
                            cls2.getDeclaredField(str);
                            throw null;
                        }
                        declaredMethod = cls2.getDeclaredField(str);
                    } else {
                        declaredMethod = cls2.getField(str);
                    }
                } else if (!z) {
                    declaredMethod = cls2.getMethod(str, clsArr);
                } else {
                    int i30 = $11;
                    int i31 = (i30 & 73) + (i30 | 73);
                    $10 = i31 % 128;
                    if (i31 % 2 != 0) {
                        cls2.getDeclaredMethod(str, clsArr);
                        throw null;
                    }
                    declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                }
            }
            map.put(numValueOf, declaredMethod);
            int i32 = $11;
            int i33 = (i32 & 45) + (i32 | 45);
            $10 = i33 % 128;
            int i34 = i33 % 2;
            return declaredMethod;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(char c, int i, int i2) throws Throwable {
        Object[] objArr;
        Class<?> cls;
        byte b;
        Class<?>[] clsArr;
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = i4 + 89;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        Object obj = read;
        int i7 = (i4 ^ 67) + ((i4 & 67) << 1);
        $10 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i4 + 63;
        $10 = i9 % 128;
        try {
            if (i9 % 2 != 0) {
                objArr = new Object[2];
                objArr[3] = Integer.valueOf(i2);
            } else {
                objArr = new Object[3];
                objArr[2] = Integer.valueOf(i2);
            }
            objArr[1] = Integer.valueOf(i);
            objArr[0] = Character.valueOf(c);
            byte[] bArr = $$d;
            int i10 = $11;
            int i11 = (i10 & 13) + (i10 | 13);
            $10 = i11 % 128;
            int i12 = i11 % 2;
            byte b2 = bArr[441];
            byte b3 = bArr[9];
            String str$$f = $$f(b2, b3, (short) ((b3 ^ 136) | (b3 & 136)));
            int i13 = $11;
            int i14 = (i13 ^ 103) + ((i13 & 103) << 1);
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cls = Class.forName(str$$f, false, (ClassLoader) disconnect);
                b = bArr[122];
            } else {
                cls = Class.forName(str$$f, true, (ClassLoader) disconnect);
                b = bArr[77];
            }
            String str$$f2 = $$f(b, bArr[324], (short) 1081);
            int i15 = $11 + 11;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                clsArr = new Class[3];
                clsArr[0] = Character.TYPE;
                clsArr[1] = Integer.TYPE;
            } else {
                clsArr = new Class[3];
                clsArr[0] = Character.TYPE;
                clsArr[1] = Integer.TYPE;
            }
            int i16 = $10;
            int i17 = (i16 & 81) + (i16 | 81);
            $11 = i17 % 128;
            int i18 = i17 % 2;
            clsArr[2] = Integer.TYPE;
            return cls.getMethod(str$$f2, clsArr).invoke(obj, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int TuitionPaymentFragmentbindingInflater1(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = $11;
        int i3 = (i2 ^ 61) + ((i2 & 61) << 1);
        int i4 = i3 % 128;
        $10 = i4;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Object obj3 = read;
        int i5 = i4 + 11;
        int i6 = i5 % 128;
        $11 = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 75;
        int i9 = i8 % 128;
        $10 = i9;
        int i10 = i8 % 2;
        try {
            Object[] objArr = {obj};
            byte[] bArr = $$d;
            int i11 = (i9 & 13) + (i9 | 13);
            int i12 = i11 % 128;
            $11 = i12;
            int i13 = i11 % 2;
            byte b = bArr[441];
            byte b2 = bArr[9];
            int i14 = i12 + 31;
            $10 = i14 % 128;
            Class<?> cls = Class.forName(i14 % 2 != 0 ? $$f(b, b2, (short) (b2 | 23660)) : $$f(b, b2, (short) ((b2 ^ 136) | (b2 & 136))), true, (ClassLoader) disconnect);
            byte b3 = bArr[77];
            byte b4 = bArr[324];
            int i15 = $11;
            int i16 = (i15 ^ 109) + ((i15 & 109) << 1);
            $10 = i16 % 128;
            int i17 = i16 % 2;
            String str$$f = $$f(b3, b4, (short) 1081);
            Class<?>[] clsArr = new Class[1];
            int i18 = $11;
            int i19 = (i18 & 57) + (i18 | 57);
            $10 = i19 % 128;
            int i20 = i19 % 2;
            clsArr[0] = Object.class;
            int iIntValue = ((Integer) cls.getMethod(str$$f, clsArr).invoke(obj3, objArr)).intValue();
            int i21 = $11;
            int i22 = (i21 ^ 103) + ((i21 & 103) << 1);
            $10 = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 47 / 0;
            }
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int b(int i) throws Throwable {
        byte b;
        byte b2;
        byte b3;
        int i2 = 2 % 2;
        int i3 = $11 + 65;
        int i4 = i3 % 128;
        $10 = i4;
        int i5 = i3 % 2;
        Object obj = read;
        int i6 = (i4 & 7) + (i4 | 7);
        int i7 = i6 % 128;
        $11 = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 49;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = $$d;
            int i11 = $10 + 33;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                b = bArr[19296];
                b2 = bArr[39];
                b3 = 6854;
            } else {
                b = bArr[441];
                b2 = bArr[9];
                b3 = 136;
            }
            Class<?> cls = Class.forName($$f(b, b2, (short) (b3 | b2)), true, (ClassLoader) disconnect);
            int i12 = $11;
            int i13 = ((i12 | 31) << 1) - (i12 ^ 31);
            $10 = i13 % 128;
            int i14 = i13 % 2;
            String str$$f = $$f(bArr[77], bArr[324], (short) 1081);
            Class<?>[] clsArr = new Class[1];
            Class<?> cls2 = Integer.TYPE;
            int i15 = $11 + 71;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            clsArr[0] = cls2;
            int iIntValue = ((Integer) cls.getMethod(str$$f, clsArr).invoke(obj, objArr)).intValue();
            int i17 = $11;
            int i18 = (i17 ^ 117) + ((i17 & 117) << 1);
            $10 = i18 % 128;
            int i19 = i18 % 2;
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003d -> B:14:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x002e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(short r6, int r7, byte r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r8 = r8 * 4
            int r8 = r8 + 104
            int r7 = r7 * r0
            int r7 = r7 + 4
            int r6 = r6 * r0
            int r1 = r6 + 7
            byte[] r2 = defpackage.initSession.$$a
            byte[] r1 = new byte[r1]
            int r6 = r6 + 6
            r3 = 0
            if (r2 != 0) goto L28
            int r8 = defpackage.initSession.$17
            int r8 = r8 + 85
            int r4 = r8 % 128
            defpackage.initSession.$16 = r4
            int r8 = r8 % r0
            if (r8 == 0) goto L24
            r8 = 67
            int r8 = r8 / r3
        L24:
            r8 = r6
            r5 = r7
            r4 = r3
            goto L41
        L28:
            r4 = r3
        L29:
            byte r5 = (byte) r8
            r1[r4] = r5
            if (r4 != r6) goto L3d
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r3)
            int r7 = defpackage.initSession.$16
            int r7 = r7 + 113
            int r8 = r7 % 128
            defpackage.initSession.$17 = r8
            int r7 = r7 % r0
            return r6
        L3d:
            int r4 = r4 + 1
            r5 = r2[r7]
        L41:
            int r7 = r7 + 1
            int r8 = r8 + r5
            int r8 = r8 + (-1)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.initSession.$$c(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0047 -> B:18:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$f(int r9, int r10, short r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = defpackage.initSession.$16
            int r1 = r1 + 15
            int r2 = r1 % 128
            defpackage.initSession.$17 = r2
            int r1 = r1 % r0
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L22
            byte[] r1 = defpackage.initSession.$$d
            int r9 = r9 + 28
            r5 = 67
            int r10 = r5 >>> r10
            int r11 = r11 + 106
            byte[] r5 = new byte[r9]
            if (r1 != 0) goto L20
            r6 = r4
            goto L2e
        L20:
            r0 = r4
            goto L3a
        L22:
            byte[] r1 = defpackage.initSession.$$d
            int r9 = r9 + r4
            int r10 = 119 - r10
            int r11 = r11 + 4
            byte[] r5 = new byte[r9]
            if (r1 != 0) goto L39
            r6 = r3
        L2e:
            int r2 = r2 + 123
            int r7 = r2 % 128
            defpackage.initSession.$16 = r7
            int r2 = r2 % r0
            r0 = r11
            r11 = r10
            r10 = r9
            goto L4e
        L39:
            r0 = r3
        L3a:
            byte r2 = (byte) r10
            r5[r0] = r2
            int r6 = r0 + 1
            if (r6 != r9) goto L47
            java.lang.String r9 = new java.lang.String
            r9.<init>(r5, r3)
            return r9
        L47:
            r0 = r1[r11]
            r8 = r10
            r10 = r9
            r9 = r0
            r0 = r11
            r11 = r8
        L4e:
            int r9 = -r9
            int r11 = r11 + r9
            int r9 = r11 + (-1)
            int r11 = r0 + 1
            int r0 = defpackage.initSession.$16
            int r0 = r0 + 53
            int r2 = r0 % 128
            defpackage.initSession.$17 = r2
            int r0 = r0 % 2
            r0 = r6
            r8 = r10
            r10 = r9
            r9 = r8
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.initSession.$$f(int, int, short):java.lang.String");
    }
}
