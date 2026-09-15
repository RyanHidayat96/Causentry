package com.datadog.android.rum;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.actions.SearchIntents;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JQ\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0015\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0015\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/datadog/android/rum/DdRumContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "Landroid/net/Uri;", "p0", "", "p1", "", "p2", "", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "(Landroid/net/Uri;)Ljava/lang/String;", "Landroid/content/ContentValues;", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", "", "onCreate", "()Z", "p3", "p4", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DdRumContentProvider extends ContentProvider {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final int DEFAULT_IMPORTANCE = 100;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f689a;
    private static int asBinder;
    private static int asInterface;
    private static char b;
    private static int processImportance;
    private static final byte[] $$c = {111, 40, 23, -13};
    private static final int $$f = 240;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.datadog.android.rum.DdRumContentProvider.$$a
            int r6 = r6 + 1
            int r5 = r5 + 84
            int r7 = 206 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r5
            r5 = r6
            r3 = r2
            goto L25
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L21:
            int r7 = r7 + 1
            r4 = r0[r7]
        L25:
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.DdRumContentProvider.d(int, byte, int, java.lang.Object[]):void");
    }

    private static void e(short s, short s2, int i, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = s2 + 4;
        int i3 = s + 65;
        byte[] bArr2 = new byte[114 - i];
        int i4 = 113 - i;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i2 + (-i3)) - 3;
            i5 = -1;
        }
        while (true) {
            int i6 = i2;
            int i7 = i3;
            int i8 = i5 + 1;
            bArr2[i8] = (byte) i7;
            if (i8 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i9 = i6 + 1;
            i2 = i9;
            i3 = (i7 + (-bArr[i9])) - 3;
            i5 = i8;
        }
    }

    public static final /* synthetic */ int access$getProcessImportance$cp() {
        int i = 2 % 2;
        int i2 = f689a + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = processImportance;
        if (i3 != 0) {
            int i5 = 32 / 0;
        }
        return i4;
    }

    public static final /* synthetic */ void access$setProcessImportance$cp(int i) {
        int i2 = 2 % 2;
        int i3 = f689a + 95;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        processImportance = i;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\u00020\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/DdRumContentProvider$Companion;", "", "<init>", "()V", "", "DEFAULT_IMPORTANCE", "I", "processImportance", "getProcessImportance$dd_sdk_android_rum_release", "()I", "setProcessImportance$dd_sdk_android_rum_release", "(I)V"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int getProcessImportance$dd_sdk_android_rum_release() {
            return DdRumContentProvider.access$getProcessImportance$cp();
        }

        public final void setProcessImportance$dd_sdk_android_rum_release(int i) {
            DdRumContentProvider.access$setProcessImportance$cp(i);
        }

        public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Companion companion, int i) {
            companion.getProcessImportance$dd_sdk_android_rum_release();
            companion.setProcessImportance$dd_sdk_android_rum_release(i);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                int i6 = $11 + 27;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentbindingInflater1);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char touchSlop = (char) (47773 - (ViewConfiguration.getTouchSlop() >> 8));
                        int deadChar = KeyEvent.getDeadChar(i3, i3) + 468;
                        int jumpTapTimeout = 13 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, deadChar, jumpTapTimeout, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i10 = i5;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 47773), Process.getGidForName("") + 469, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i10 + 1;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Drawable.resolveOpacity(0, 0), 2323 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf("", "", 0) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i11 = $10 + 45;
            $11 = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1439203057
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
            Method dump skipped, instruction units count: 13028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.DdRumContentProvider.onCreate():boolean");
    }

    static {
        byte[] bArr = new byte[548];
        System.arraycopy("1Y)0ñÿ<Éï\u0003ôü\u0006óD»û\nï\u000bô÷\u0010ê\b÷þ=»û\u0000\u0005ò\u000eñ<ÁÿñC¼\u0000\u0005ý\u0000å\u0003\u000bÿë\u0000\u0006òøHÜà\u0005\u001dàå#ëÿë\u0000\u0006òø5Ûì\bð\nòøR®\u0000\bÿ÷\u0005òEý¸øÿ\u0000ø\u0006þ=¸ø\u0001\u0002ÿìM½üü\u0002é\u0006õMðÜ\tò\b÷þ\u001bìå\t\u0005ô÷+Ñ\u000e÷÷\u0005ô÷þ\u0000\bÿ÷\u0005ò\u0000øÿ\u0000ø\u0006þë\n\u0001ë'Û\büö\u0005üü\u0002é\u0006õ?ñÿ<Éï\u0003ôü\u0006óD»û\nï\u000bô÷\u0010ê\b÷þ=Êë\u0007û:Êûì\bð\u000e4êË\u0007û'Ûì\bð\u000e\u0012ììû\b\u0003÷ö\fð÷$åõ\búðü\büö)àê\u0010\u0018Ñ\u000e÷÷\u0005ô÷M®\u0000\bÿ÷\u0005òEý¸øÿ\u0000ø\u0006þ=¸ø\u0001\u0002ÿìM½üü\u0002é\u0006õMïñÿ<Éï\u0003ôü\u0006óDÇ\u0000ê\u00100»\få\t\u0005ô÷C¾û\büö;¹\nñù\rïüCâØ\u0007øð\n\u0002ì\u0011ò%Üî\u0010õú&Ëÿü\u0002ÿ\u0005ð êõ\u0002ÿìÜ\tò\b÷þ\u001bìå\t\u0005ô÷+Ñ\u000e÷÷\u0005ô÷\u000föø\u0007øø\u0004\u001bØ\u0005÷\bê\fð>Ûì\b÷þ)Þì Ö\u000eð\u0003\bå*èå\u0007÷þ#Ü\u0019×\u0003ü\fõ\u0015é\u001aèå\u0007÷þ+×\b÷\u000eê\u0001ë\u000bî\"×þ\u0001øþ+Ôú\u0002\têMÍÜ\tò\b÷þ\u001bìå\t\u0005ô÷+Ñ\u000e÷÷\u0005ô÷\u000föø\u0007øø\u0004\u001bØ\u0005÷\bê\fð>ÿî\u001aëø\u0007òõ3Ð\u0002ù\tê\b÷þøñÿ<Éï\u0003ôü\u0006óDÇ\u0000ê\u0010üöø\u0007øø\u00046êÛì\bð\nòø3Ñþ÷\u0010ûì.Ûô÷\fð-Öø\u0007øø\u0004".getBytes("ISO-8859-1"), 0, bArr, 0, 548);
        $$d = bArr;
        $$e = 254;
        $$a = new byte[]{51, -5, 77, 89, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
        $$b = 159;
        asInterface = 0;
        f689a = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        asBinder = 1;
        TuitionPaymentFragmentbindingInflater1();
        INSTANCE = new Companion(null);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        asBinder = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @JvmStatic
    private static final void overrideProcessImportance(int i) {
        int i2 = 2 % 2;
        int i3 = f689a + 111;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(INSTANCE, i);
        int i5 = f689a + 31;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri p0, String p1, String[] p2) {
        int i = 2 % 2;
        int i2 = f689a + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int i4 = f689a + 93;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri p0) {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        f689a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int i4 = f689a + 81;
        asInterface = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri p0, ContentValues p1) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        f689a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri p0, String[] p1, String p2, String[] p3, String p4) {
        int i = 2 % 2;
        int i2 = f689a + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int i4 = asInterface + 21;
        f689a = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri p0, ContentValues p1, String p2, String[] p3) {
        int i = 2 % 2;
        int i2 = f689a + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int i4 = f689a + 75;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        b = (char) 45645;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 48334;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 5574;
        TuitionPaymentFragmentbindingInflater1 = (char) 52651;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 108
            byte[] r0 = com.datadog.android.rum.DdRumContentProvider.$$c
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.DdRumContentProvider.$$g(int, short, int):java.lang.String");
    }
}
