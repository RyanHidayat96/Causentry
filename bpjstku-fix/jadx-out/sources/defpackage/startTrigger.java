package defpackage;

import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes6.dex */
public class startTrigger {
    private static final byte[] b = {83, -4, -55, -17, -1, -3, 12, 26, -27, 9, -14, 19, -15, -5};
    private static final int TuitionPaymentFragmentbindingInflater1 = 120;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r0 = 11 - r8
            byte[] r1 = defpackage.startTrigger.b
            int r7 = r7 * 2
            int r7 = r7 + 102
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r8 = 10 - r8
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + 2
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.startTrigger.a(int, byte, short, java.lang.Object[]):void");
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        try {
            for (byte b2 : str.getBytes(StandardCharsets.UTF_8)) {
            }
            byte b3 = b[4];
            byte b4 = (byte) (b3 + 1);
            Object[] objArr = new Object[1];
            a(b3, b4, b4, objArr);
            Method declaredMethod = ClassLoader.class.getDeclaredMethod((String) objArr[0], String.class);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(startTrigger.class.getClassLoader(), str);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
