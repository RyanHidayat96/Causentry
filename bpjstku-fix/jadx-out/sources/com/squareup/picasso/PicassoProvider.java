package com.squareup.picasso;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class PicassoProvider extends ContentProvider {
    static Context context;
    private static final byte[] $$c = {58, 66, -14, -31};
    private static final int $$f = 233;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {17, 104, 102, -28, -17, -3, 58, -57, -19, 1, -14, -6, 4, -15, 66, -59, -2, -24, 14, 46, -72, -9, 11, -21, 11, -9, -10, 2, 52, -73, 8, -13, -7, -10, 10, 50, -40, -41, 11, -21, 11, -9, -10, 2, 33, -52, 2, 6, -18, 7, -14, -8, 0, 31, -32, -6, -14, -11, 6, -2, -8, -1, -18, 44, -39, -22, 6, -11, -4, -1, -2, -17, -5, -1, 56, 0, -64, -10, -11, 10, -18, -1, 8, -16, 57, -58, -17, -4, 6, -23, -2, -5, 8, -14, -11, 65, -43, -18, -23, 3, 21, -41, 11, -21, 11, -17, -3, 58, -66, -9, -11, -3, 6, -6, -7, 2, -22, -4, -5, 14, 46, -56, -23, -11, 6, 6, 48, -24, -55, -11, 6, 6, 11, -23, -18, -9, 12, -18, 73, -22, 12, -22, -38, 7, -16, 6, -11, -4, 25, -22, -29, 7, 3, -14, -11, 41, -49, 12, -11, -11, 3, -14, -11, -4, -2, 6, -3, -11, 3, -16, -2, -10, -3, -2, -10, 4, -4, -23, 8, -1, -23, 37, -39, 6, -6, -12, 3, -6, -6, 0, -25, 4, -13, Base64.padSymbol, -4, 38, -46, -8, -9, 9, -4, -38, 7, -16, 6, -11, -4, 25, -22, -29, 7, 3, -14, -11, 41, -49, 12, -11, -11, 3, -14, -11, 13, -12, -10, 5, -10, -10, 2, 25, -42, 3, -11, 6, -24, 10, -18, 60, -11, 60, -73, 8, -1, -7, -22, 6, -18, 12, -24, 69, -64, -10, -11, 10, -18, -1, 8, -16, 57, -61, -20, 2, 6, -22, 6, -11, -4, -10, 64, -29, -52, 2, 6, -22, 6, -11, -4, -10, 74, -51, -24, -13, -7, -10, 10, 31, -39, -22, 6, -11, -4, 38, -49, -3, -8, 10, -24, 31, -22, -22, 10, -7, -12, -2, -22, 16, -18, 6, -17, 6, -7, -2, -23, -11, 6, 6, 12, -24, -17, -9, 11, -19, -6, 10, -4, 30, -50, 5, 12, -38, 0, -8, 8, -4, 19, -40, 7, -3, -16, 2, -19, Base64.padSymbol};
    private static final int $$e = 207;
    private static final byte[] $$a = {5, 11, -122, -94, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
    private static final int $$b = 188;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 6604793978371717054L;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 4
            int r5 = 103 - r5
            int r0 = 53 - r6
            byte[] r1 = com.squareup.picasso.PicassoProvider.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = -1
            if (r1 != 0) goto L12
            r3 = r2
            r2 = r7
            goto L2b
        L12:
            r4 = r7
            r7 = r5
            r5 = r4
        L15:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r0[r2] = r3
            if (r2 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L25:
            r3 = r1[r5]
            r4 = r2
            r2 = r5
            r5 = r3
            r3 = r4
        L2b:
            int r7 = r7 + r5
            int r7 = r7 + (-11)
            int r5 = r2 + 1
            r2 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.PicassoProvider.b(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 84
            int r6 = r6 + 4
            int r0 = r7 + 1
            byte[] r1 = com.squareup.picasso.PicassoProvider.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r5 = r6
            r4 = r7
            r3 = r2
            goto L23
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L1f
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L1f:
            r4 = r1[r6]
            int r3 = r3 + 1
        L23:
            int r4 = -r4
            int r6 = r6 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-5)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.PicassoProvider.c(byte, int, byte, java.lang.Object[]):void");
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 17;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - (ViewConfiguration.getScrollBarSize() >> 8)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1356, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 37, 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - View.resolveSize(0, 0)), 467 - ImageFormat.getBitsPerPixel(0), 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $11 + 125;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i8 = $10 + 113;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 39 / 0;
        }
    }

    /* JADX WARN: Type inference failed for: r1v81, types: [boolean, int] */
    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -388623811
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        /*
            Method dump skipped, instruction units count: 14000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.PicassoProvider.onCreate():boolean");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        int i3 = 17 / 0;
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, byte r6, int r7) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r6 = r6 * 2
            int r6 = 107 - r6
            byte[] r1 = com.squareup.picasso.PicassoProvider.$$c
            int r5 = r5 * 3
            int r5 = r5 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r6 = r5
            r4 = r7
            r3 = r2
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            int r3 = r3 + 1
            r4 = r1[r5]
        L29:
            int r4 = -r4
            int r5 = r5 + 1
            int r6 = r6 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.PicassoProvider.$$g(byte, byte, int):java.lang.String");
    }
}
