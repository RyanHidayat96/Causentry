package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R>\u0010\u000b\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"LCaptureRequestOptions;", "", "<init>", "()V", "Ljava/util/HashMap;", "", "Lkotlin/collections/TuitionPaymentFragmentbindingInflater1;", "b", "Ljava/util/HashMap;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Ljava/util/HashMap;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CaptureRequestOptions {
    public static final CaptureRequestOptions INSTANCE = new CaptureRequestOptions();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final HashMap<String, String> TuitionPaymentFragmentbindingInflater1 = new HashMap<String, String>() { // from class: com.bpjstku.util.utils.ExtensionUtils$extMapping$1
        private static final byte[] $$c = {97, 58, 103, -72};
        private static final int $$f = 137;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {94, 6, -99, -107, 6, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$e = 163;
        private static final byte[] $$a = {104, 27, -72, 120, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 20;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int g = 1;
        private static char TuitionPaymentFragmentbindingInflater1 = 22042;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 53037;
        private static char b = 7591;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 49115;

        public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
            int i7 = ~i4;
            int i8 = ~(i7 | i);
            int i9 = ~i;
            int i10 = ~((~i3) | i9);
            int i11 = ~(i9 | i4);
            int i12 = i10 | i11;
            int i13 = (~(i3 | i7)) | i11 | i8;
            int i14 = i + i4 + i6 + ((-168536539) * i5) + (1787681333 * i2);
            int i15 = i14 * i14;
            int i16 = ((-1349843359) * i) + 1460535296 + ((-923239215) * i4) + ((-1716058528) * i8) + (i12 * (-1289454384)) + ((-1289454384) * i13) + (366215168 * i6) + (1604583424 * i5) + (216268800 * i2) + (1778253824 * i15);
            int i17 = (i * (-925914073)) + 175428941 + (i4 * (-925912777)) + (i8 * (-864)) + (i12 * 432) + (i13 * 432) + (i6 * (-925913209)) + (i5 * 1252505731) + (i2 * 30625011) + (i15 * (-2030960640));
            return i16 + ((i17 * i17) * 899809280) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = 92 - r8
                int r7 = r7 * 15
                int r0 = r7 + 38
                byte[] r1 = com.bpjstku.util.utils.ExtensionUtils$extMapping$1.$$a
                int r6 = r6 * 2
                int r6 = 84 - r6
                byte[] r0 = new byte[r0]
                int r7 = r7 + 37
                r2 = 0
                if (r1 != 0) goto L17
                r4 = r7
                r6 = r8
                r3 = r2
                goto L2e
            L17:
                r3 = r2
            L18:
                int r8 = r8 + 1
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r8
                r8 = r6
                r6 = r5
            L2e:
                int r8 = r8 + r4
                int r8 = r8 + (-11)
                r5 = r8
                r8 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.utils.ExtensionUtils$extMapping$1.a(short, short, byte, java.lang.Object[]):void");
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
        private static void d(int r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = 4 - r8
                int r6 = r6 * 32
                int r6 = r6 + 84
                int r7 = r7 * 51
                int r7 = 53 - r7
                byte[] r0 = com.bpjstku.util.utils.ExtensionUtils$extMapping$1.$$d
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r6
                r6 = r7
                r4 = r2
                goto L29
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r7) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                int r8 = r8 + 1
                r3 = r0[r8]
            L29:
                int r6 = r6 + r3
                int r6 = r6 + (-11)
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.utils.ExtensionUtils$extMapping$1.d(int, short, byte, java.lang.Object[]):void");
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
                    int i4 = $10 + 49;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                int i6 = $11 + 23;
                $10 = i6 % 128;
                int i7 = 58224;
                char c = 1;
                if (i6 % 2 != 0) {
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 1];
                } else {
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                }
                int i8 = 0;
                while (i8 < 16) {
                    int i9 = $10 + 57;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    char c2 = cArr3[c];
                    char c3 = cArr3[i3];
                    int i11 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) b) ^ 8611973335120459638L)));
                    int i12 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        objArr2[2] = Integer.valueOf(i12);
                        objArr2[c] = Integer.valueOf(i11);
                        objArr2[i3] = Integer.valueOf(c2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 47773);
                            int touchSlop = 468 - (ViewConfiguration.getTouchSlop() >> 8);
                            int i13 = 13 - (TypedValue.complexToFloat(i3) > 0.0f ? 1 : (TypedValue.complexToFloat(i3) == 0.0f ? 0 : -1));
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[c] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, touchSlop, i13, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[c] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 47774), (ViewConfiguration.getLongPressTimeout() >> 16) + 468, 13 - Color.green(0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i7 -= 40503;
                        i8++;
                        int i14 = $10 + 105;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        i3 = 0;
                        c = 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
                Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), View.combineMeasuredStates(0, 0) + 2323, TextUtils.indexOf("", "", 0) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
        }

        {
            if (put("application/vnd.mozilla.xul+xml", "xul") == null) {
                if (put("application/json", "json") == null) {
                    if (put("x-conference/x-cooltalk", "ice") == null) {
                        if (put("video/x-sgi-movie", "movie") != null) {
                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("video/x-sgi-movie").toString());
                        }
                        if (put("video/x-msvideo", "avi") == null) {
                            if (put("video/x-ms-wmv", "wmv") == null) {
                                if (put("video/vnd.mpegurl", "m4u") == null) {
                                    if (put("text/x-component", "htc") == null) {
                                        if (put("text/x-setext", "etx") == null) {
                                            if (put("text/vnd.wap.wmlscript", "wmls") == null) {
                                                if (put("text/vnd.wap.wml", "wml") == null) {
                                                    if (put("text/tab-separated-values", "tsv") == null) {
                                                        if (put("text/sgml", "sgml") == null) {
                                                            if (put("text/css", "css") == null) {
                                                                if (put("text/calendar", "ics") == null) {
                                                                    if (put("model/vrml", "vrlm") == null) {
                                                                        if (put("model/mesh", "mesh") == null) {
                                                                            if (put("model/iges", "iges") == null) {
                                                                                if (put("image/x-rgb", "rgb") == null) {
                                                                                    if (put("image/x-portable-pixmap", "ppm") == null) {
                                                                                        if (put("image/x-portable-graymap", "pgm") == null) {
                                                                                            if (put("image/x-portable-bitmap", "pbm") == null) {
                                                                                                if (put("image/x-portable-anymap", "pnm") == null) {
                                                                                                    if (put("image/x-icon", "ico") == null) {
                                                                                                        if (put("image/x-cmu-raster", "ras") == null) {
                                                                                                            if (put("image/vnd.wap.wbmp", "wbmp") == null) {
                                                                                                                if (put("image/vnd.djvu", "djvu") == null) {
                                                                                                                    if (put("image/svg+xml", "svg") == null) {
                                                                                                                        if (put("image/ief", "ief") == null) {
                                                                                                                            if (put("image/cgm", "cgm") != null) {
                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/cgm").toString());
                                                                                                                            }
                                                                                                                            if (put("image/bmp", "bmp") == null) {
                                                                                                                                if (put("chemical/x-xyz", "xyz") == null) {
                                                                                                                                    if (put("chemical/x-pdb", "pdb") == null) {
                                                                                                                                        if (put("audio/x-pn-realaudio", "ra") == null) {
                                                                                                                                            if (put("audio/x-mpegurl", "m3u") == null) {
                                                                                                                                                if (put("audio/x-aiff", "aiff") == null) {
                                                                                                                                                    if (put("audio/mpeg", "mp3") == null) {
                                                                                                                                                        if (put("audio/midi", "midi") == null) {
                                                                                                                                                            if (put("application/xml-dtd", "dtd") == null) {
                                                                                                                                                                if (put("application/xml", "xml") == null) {
                                                                                                                                                                    if (put("application/xslt+xml", "xslt") == null) {
                                                                                                                                                                        if (put("application/xhtml+xml", "xhtml") == null) {
                                                                                                                                                                            if (put("application/x-wais-source", "src") == null) {
                                                                                                                                                                                if (put("application/x-ustar", "ustar") == null) {
                                                                                                                                                                                    if (put("application/x-troff-ms", "ms") == null) {
                                                                                                                                                                                        if (put("application/x-troff-me", "me") == null) {
                                                                                                                                                                                            if (put("application/x-troff-man", "man") == null) {
                                                                                                                                                                                                if (put("application/x-troff", "roff") == null) {
                                                                                                                                                                                                    if (put("application/x-texinfo", "texi") == null) {
                                                                                                                                                                                                        if (put("application/x-tex", "tex") == null) {
                                                                                                                                                                                                            if (put("application/x-tcl", "tcl") == null) {
                                                                                                                                                                                                                if (put("application/x-sv4crc", "sv4crc") == null) {
                                                                                                                                                                                                                    if (put("application/x-sv4cpio", "sv4cpio") == null) {
                                                                                                                                                                                                                        if (put("application/x-stuffit", "sit") == null) {
                                                                                                                                                                                                                            if (put("application/x-shockwave-flash", "swf") == null) {
                                                                                                                                                                                                                                if (put("application/x-shar", "shar") == null) {
                                                                                                                                                                                                                                    if (put("application/x-sh", "sh") == null) {
                                                                                                                                                                                                                                        if (put("application/x-netcdf", "cdf") == null) {
                                                                                                                                                                                                                                            if (put("application/x-latex", "latex") == null) {
                                                                                                                                                                                                                                                if (put("application/x-koan", "skm") == null) {
                                                                                                                                                                                                                                                    if (put("application/x-javascript", "js") == null) {
                                                                                                                                                                                                                                                        if (put("application/x-hdf", "hdf") == null) {
                                                                                                                                                                                                                                                            if (put("application/x-gtar", "gtar") == null) {
                                                                                                                                                                                                                                                                if (put("application/x-futuresplash", "spl") == null) {
                                                                                                                                                                                                                                                                    if (put("application/x-dvi", "dvi") == null) {
                                                                                                                                                                                                                                                                        if (put("application/x-director", "dir") == null) {
                                                                                                                                                                                                                                                                            if (put("application/x-csh", "csh") == null) {
                                                                                                                                                                                                                                                                                if (put("application/x-cpio", "cpio") == null) {
                                                                                                                                                                                                                                                                                    if (put("application/x-chess-pgn", "pgn") == null) {
                                                                                                                                                                                                                                                                                        if (put("application/x-cdlink", "vcd") == null) {
                                                                                                                                                                                                                                                                                            if (put("application/x-bcpio", "bcpio") == null) {
                                                                                                                                                                                                                                                                                                if (put("application/vnd.rn-realmedia", "rm") == null) {
                                                                                                                                                                                                                                                                                                    if (put("application/vnd.ms-powerpoint", "ppt") == null) {
                                                                                                                                                                                                                                                                                                        if (put("application/vnd.openxmlformats-officedocument.presentationml.presentation", "pptx") == null) {
                                                                                                                                                                                                                                                                                                            if (put("application/vnd.mif", "mif") == null) {
                                                                                                                                                                                                                                                                                                                if (put("application/srgs+xml", "grxml") == null) {
                                                                                                                                                                                                                                                                                                                    if (put("application/srgs", "gram") == null) {
                                                                                                                                                                                                                                                                                                                        if (put("application/smil", "smil") == null) {
                                                                                                                                                                                                                                                                                                                            if (put("application/rdf+xml", "rdf") == null) {
                                                                                                                                                                                                                                                                                                                                if (put("application/x-ogg", "ogg") == null) {
                                                                                                                                                                                                                                                                                                                                    if (put("application/oda", "oda") == null) {
                                                                                                                                                                                                                                                                                                                                        if (put("application/mathml+xml", "mathml") == null) {
                                                                                                                                                                                                                                                                                                                                            if (put("application/mac-compactpro", "cpt") == null) {
                                                                                                                                                                                                                                                                                                                                                if (put("application/mac-binhex40", "hqx") == null) {
                                                                                                                                                                                                                                                                                                                                                    if (put("application/jnlp", "jnlp") == null) {
                                                                                                                                                                                                                                                                                                                                                        if (put("application/andrew-inset", "ez") == null) {
                                                                                                                                                                                                                                                                                                                                                            if (put("text/plain", "txt") == null) {
                                                                                                                                                                                                                                                                                                                                                                if (put("text/rtf", "rtf") == null) {
                                                                                                                                                                                                                                                                                                                                                                    if (put("text/richtext", "rtx") == null) {
                                                                                                                                                                                                                                                                                                                                                                        if (put("text/html", "html") == null) {
                                                                                                                                                                                                                                                                                                                                                                            if (put("application/zip", "zip") == null) {
                                                                                                                                                                                                                                                                                                                                                                                if (put("application/x-rar-compressed", "rar") == null) {
                                                                                                                                                                                                                                                                                                                                                                                    if (put("application/x-gzip", "gzip") == null) {
                                                                                                                                                                                                                                                                                                                                                                                        if (put("application/tgz", "tgz") != null) {
                                                                                                                                                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/tgz").toString());
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                        if (put("application/x-tar", "tar") == null) {
                                                                                                                                                                                                                                                                                                                                                                                            if (put("image/gif", "gif") != null) {
                                                                                                                                                                                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/gif").toString());
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                            if (put("image/jpeg", "jpg") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                if (put("image/tiff", "tiff") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                    if (put("image/png", "png") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                        if (put("audio/basic", "au") != null) {
                                                                                                                                                                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("audio/basic").toString());
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                        if (put("audio/x-wav", "wav") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                            if (put("video/quicktime", "mov") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                if (put("video/mpeg", "mpg") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                    if (put("application/msword", "doc") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                        if (put("application/vnd.openxmlformats-officedocument.wordprocessingml.document", "docx") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                            if (put("application/vnd.oasis.opendocument.text", "odt") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                if (put("application/vnd.ms-excel", "xls") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                    if (put("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "xlsx") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                        if (put("application/vnd.oasis.opendocument.spreadsheet", "ods") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                            if (put("application/postscript", "ps") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                if (put("application/pdf", "pdf") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (put("application/octet-stream", "exe") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (put("application/java-archive", "jar") != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/java-archive").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (put("image/jpg", "jpg") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (put("image/webp", "webp") != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/webp").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (put("image/x-ms-bmp", "bmp") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (put("video/3gpp", "3gp") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (put("video/3gpp2", "3g2") != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("video/3gpp2").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (put("video/avi", "avi") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (put("video/x-matroska", "mkv") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (put("video/mp4", "mp4") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (put("video/webm", "webm") != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("video/webm").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (put("video/wav", "wav") == null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    g = i % 128;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (i % 2 == 0) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("video/wav").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("video/mp4").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("video/x-matroska").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("video/avi").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("video/3gpp").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/x-ms-bmp").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/jpg").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/octet-stream").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/pdf").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/postscript").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/vnd.oasis.opendocument.spreadsheet").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/vnd.ms-excel").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/vnd.oasis.opendocument.text").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/vnd.openxmlformats-officedocument.wordprocessingml.document").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/msword").toString());
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("video/mpeg").toString());
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("video/quicktime").toString());
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("audio/x-wav").toString());
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/png").toString());
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/tiff").toString());
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/jpeg").toString());
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-tar").toString());
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-gzip").toString());
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-rar-compressed").toString());
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/zip").toString());
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("text/html").toString());
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("text/richtext").toString());
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("text/rtf").toString());
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("text/plain").toString());
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/andrew-inset").toString());
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/jnlp").toString());
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/mac-binhex40").toString());
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/mac-compactpro").toString());
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/mathml+xml").toString());
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/oda").toString());
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-ogg").toString());
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/rdf+xml").toString());
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/smil").toString());
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/srgs").toString());
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/srgs+xml").toString());
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/vnd.mif").toString());
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/vnd.openxmlformats-officedocument.presentationml.presentation").toString());
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/vnd.ms-powerpoint").toString());
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/vnd.rn-realmedia").toString());
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-bcpio").toString());
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-cdlink").toString());
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-chess-pgn").toString());
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-cpio").toString());
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-csh").toString());
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-director").toString());
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-dvi").toString());
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-futuresplash").toString());
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-gtar").toString());
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-hdf").toString());
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-javascript").toString());
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-koan").toString());
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-latex").toString());
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-netcdf").toString());
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-sh").toString());
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-shar").toString());
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-shockwave-flash").toString());
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-stuffit").toString());
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-sv4cpio").toString());
                                                                                                                                                                                                                }
                                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-sv4crc").toString());
                                                                                                                                                                                                            }
                                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-tcl").toString());
                                                                                                                                                                                                        }
                                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-tex").toString());
                                                                                                                                                                                                    }
                                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-texinfo").toString());
                                                                                                                                                                                                }
                                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-troff").toString());
                                                                                                                                                                                            }
                                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-troff-man").toString());
                                                                                                                                                                                        }
                                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-troff-me").toString());
                                                                                                                                                                                    }
                                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-troff-ms").toString());
                                                                                                                                                                                }
                                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-ustar").toString());
                                                                                                                                                                            }
                                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/x-wais-source").toString());
                                                                                                                                                                        }
                                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/xhtml+xml").toString());
                                                                                                                                                                    }
                                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/xslt+xml").toString());
                                                                                                                                                                }
                                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/xml").toString());
                                                                                                                                                            }
                                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/xml-dtd").toString());
                                                                                                                                                        }
                                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("audio/midi").toString());
                                                                                                                                                    }
                                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("audio/mpeg").toString());
                                                                                                                                                }
                                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("audio/x-aiff").toString());
                                                                                                                                            }
                                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("audio/x-mpegurl").toString());
                                                                                                                                        }
                                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("audio/x-pn-realaudio").toString());
                                                                                                                                    }
                                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("chemical/x-pdb").toString());
                                                                                                                                }
                                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("chemical/x-xyz").toString());
                                                                                                                            }
                                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/bmp").toString());
                                                                                                                        }
                                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/ief").toString());
                                                                                                                    }
                                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/svg+xml").toString());
                                                                                                                }
                                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/vnd.djvu").toString());
                                                                                                            }
                                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/vnd.wap.wbmp").toString());
                                                                                                        }
                                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/x-cmu-raster").toString());
                                                                                                    }
                                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/x-icon").toString());
                                                                                                }
                                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/x-portable-anymap").toString());
                                                                                            }
                                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/x-portable-bitmap").toString());
                                                                                        }
                                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/x-portable-graymap").toString());
                                                                                    }
                                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/x-portable-pixmap").toString());
                                                                                }
                                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("image/x-rgb").toString());
                                                                            }
                                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("model/iges").toString());
                                                                        }
                                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("model/mesh").toString());
                                                                    }
                                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("model/vrml").toString());
                                                                }
                                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("text/calendar").toString());
                                                            }
                                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("text/css").toString());
                                                        }
                                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("text/sgml").toString());
                                                    }
                                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("text/tab-separated-values").toString());
                                                }
                                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("text/vnd.wap.wml").toString());
                                            }
                                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("text/vnd.wap.wmlscript").toString());
                                        }
                                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("text/x-setext").toString());
                                    }
                                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("text/x-component").toString());
                                }
                                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("video/vnd.mpegurl").toString());
                            }
                            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("video/x-ms-wmv").toString());
                        }
                        throw new IllegalArgumentException("Duplicated Mimetype: ".concat("video/x-msvideo").toString());
                    }
                    throw new IllegalArgumentException("Duplicated Mimetype: ".concat("x-conference/x-cooltalk").toString());
                }
                throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/json").toString());
            }
            throw new IllegalArgumentException("Duplicated Mimetype: ".concat("application/vnd.mozilla.xul+xml").toString());
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            boolean z;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
            int i3 = i2 % 128;
            g = i3;
            int i4 = i2 % 2;
            if (obj == null) {
                int i5 = i3 + 3;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = obj instanceof String;
            }
            if (z) {
                return super.containsKey((String) obj);
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            int i = 2 % 2;
            if (obj == null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                g = i2 % 128;
                int i3 = i2 % 2;
            } else if (!(obj instanceof String)) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
                g = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            boolean zContainsValue = super.containsValue((String) obj);
            int i6 = g + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 == 0) {
                return zContainsValue;
            }
            throw null;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<String, String>> entrySet() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return (Set) TuitionPaymentFragmentbindingInflater1(1990887494, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1990887493, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this});
            }
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            int i = 2 % 2;
            if (obj == null) {
                int i2 = g + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
            } else if (!(obj instanceof String)) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
                g = i4 % 128;
                Object obj2 = null;
                if (i4 % 2 != 0) {
                    return null;
                }
                obj2.hashCode();
                throw null;
            }
            return (String) super.get((String) obj);
        }

        private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws Throwable {
            Object[] objArr2;
            ExtensionUtils$extMapping$1 extensionUtils$extMapping$1 = (ExtensionUtils$extMapping$1) objArr[0];
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int iMyPid = (Process.myPid() >> 22) + 876;
                int iBlue = 10 - Color.blue(0);
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr3 = new Object[1];
                a(b2, b3, (byte) (b3 | 89), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iMyPid, iBlue, -1650998592, false, (String) objArr3[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr4 = new Object[1];
            c(new char[]{32649, 53325, 6280, 37094, 36126, 33885, 6208, 42266, 18284, 60609, 143, 12301, 9868, 32683, 61923, 8198, 7946, 60942, 39199, 47498, 16531, 3504, 54234, 10395}, 22 - Drawable.resolveOpacity(0, 0), objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            c(new char[]{28762, 11163, 14802, 54919, 19487, 4388, 31430, 57164, 40489, 7480, 5865, 42230, 32348, 18415, 55194, 9574, 40345, 43010}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14, objArr5);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0');
                int mirror = AndroidCharacter.getMirror('0') - '&';
                byte[] bArr = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr[7], bArr[28], (byte) ($$b | 32), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iIndexOf, mirror, 2012020043, false, (String) objArr6[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 876;
                    int i2 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[7];
                    Object[] objArr7 = new Object[1];
                    a(b4, bArr2[28], b4, objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, offsetAfter, i2, 2012931276, false, (String) objArr7[0], null);
                }
                Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr2 = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
                int iNextInt = new Random().nextInt();
                int i3 = 1001096684 + (((~iNextInt) | 513355387) * 1444) + (((~(iNextInt | (-236522584))) | (~(276832812 | iNextInt)) | 236522579) * (-1444)) + 2105516068;
                int i4 = (i3 << 13) ^ i3;
                int i5 = i4 ^ (i4 >>> 17);
                ((int[]) objArr2[1])[0] = i5 ^ (i5 << 5);
            } else {
                Object[] objArr9 = new Object[1];
                c(new char[]{64072, 40190, 34271, 26554, 55279, 54885, 56136, 37020, 54382, 51190, 39682, 9056, 1897, 62360, 20445, 16619, 31083, 6466, 36375, 46294, 33625, 17629, 50655, 24386, 50993, 40480, 64692, 47709}, 25 - TextUtils.indexOf((CharSequence) "", '0'), objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                c(new char[]{37893, 22679, 26663, 59954, 38118, 40217, 43827, 46832, 15540, 44337, 11680, 27494, 58607, 5133, 38881, 38753, 2215, 25533, 35089, 44000}, 'B' - AndroidCharacter.getMirror('0'), objArr10);
                Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr11 = new Object[1];
                c(new char[]{21906, 17294, 55126, 9575, 41898, 13749, 48156, 37997, 58401, 55100, 3025, 44897, 43746, 64672, 596, 11074, 8079, 38202}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                c(new char[]{32316, 13963, 4622, 58633, 50762, 21870, 11844, 44372, 57486, 2117, 44077, 11029, 48956, 47086, 21105, 54560, 59214, 26271}, (ViewConfiguration.getTouchSlop() >> 8) + 16, objArr12);
                try {
                    Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, extensionUtils$extMapping$1)).intValue()), 0, -914048548};
                    byte[] bArr3 = $$d;
                    byte b5 = (byte) (-bArr3[6]);
                    byte b6 = b5;
                    Object[] objArr14 = new Object[1];
                    d(b5, b6, b6, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    byte b7 = bArr3[8];
                    byte b8 = b7;
                    Object[] objArr15 = new Object[1];
                    d(b7, b8, b8, objArr15);
                    objArr2 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 10;
                            byte[] bArr4 = $$a;
                            byte b9 = bArr4[7];
                            Object[] objArr16 = new Object[1];
                            a(b9, bArr4[28], b9, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, iResolveOpacity, threadPriority, 2012931276, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr2);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(new char[]{32649, 53325, 6280, 37094, 36126, 33885, 6208, 42266, 18284, 60609, 143, 12301, 9868, 32683, 61923, 8198, 7946, 60942, 39199, 47498, 16531, 3504, 54234, 10395}, Color.rgb(0, 0, 0) + 16777238, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(new char[]{28762, 11163, 14802, 54919, 19487, 4388, 31430, 57164, 40489, 7480, 5865, 42230, 32348, 18415, 55194, 9574, 40345, 43010}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cArgb2 = (char) Color.argb(0, 0, 0, 0);
                                int defaultSize = View.getDefaultSize(0, 0) + 876;
                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11;
                                byte[] bArr5 = $$a;
                                Object[] objArr19 = new Object[1];
                                a(bArr5[7], bArr5[28], (byte) ($$b | 32), objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb2, defaultSize, iIndexOf2, 2012020043, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                                int iMyTid = (Process.myTid() >> 22) + 876;
                                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10;
                                byte b10 = $$a[7];
                                byte b11 = b10;
                                Object[] objArr20 = new Object[1];
                                a(b10, b11, (byte) (b11 | 89), objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iMyTid, maximumFlingVelocity, -1650998592, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
                            g = i6 % 128;
                            int i7 = i6 % 2;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i8 = ((int[]) objArr2[2])[0];
            int i9 = ((int[]) objArr2[0])[0];
            if (i9 != i8) {
                throw new RuntimeException(String.valueOf(i9));
            }
            int i10 = ((int[]) objArr2[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int iNextInt2 = new Random().nextInt();
            int i11 = i10 + (-208210156) + (((~((-829809984) | iNextInt2)) | 275849237) * 1504) + ((~(iNextInt2 | (-553960747))) * (-1504)) + 1983095648;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr21[1])[0] = i13 ^ (i13 << 5);
            int i14 = g + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
            int i15 = i14 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (46399 - TextUtils.lastIndexOf("", '0', 0)), ExpandableListView.getPackedPositionGroup(0L) + 40, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19, 1513912262, false, "b", null);
            }
            int i16 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getInt(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) ((Process.myPid() >> 22) + 37836), 59 - TextUtils.getOffsetBefore("", 0), 18 - (ViewConfiguration.getTouchSlop() >> 8), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
            }
            int i17 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getInt(null);
            long j2 = i17;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (37836 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0) + 60, TextUtils.indexOf("", "") + 18, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            int i18 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getInt(null);
            long j3 = 371;
            long j4 = (j3 * 2752555449184655719L) + (j3 * 2766698047975130520L);
            long j5 = -370;
            long j6 = -1;
            long j7 = j6 ^ 2766698047975130520L;
            long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
            long j8 = jFreeMemory ^ j6;
            long j9 = 2752555449184655719L ^ j6;
            long j10 = j4 + ((((j7 | j8) ^ j6) | ((j9 | jFreeMemory) ^ j6)) * j5);
            long j11 = ((j7 | jFreeMemory) ^ j6) | ((j9 | j8) ^ j6);
            long j12 = j6 ^ 2771767383398260223L;
            long j13 = j10 + (j5 * (j11 | j12)) + (((long) 370) * j12);
            int i19 = i18;
            int i20 = 0;
            while (true) {
                for (int i21 = 0; i21 != 8; i21++) {
                    i19 = (((((int) (j2 >> i21)) & 255) + (i19 << 6)) + (i19 << 16)) - i19;
                }
                if (i20 != 0) {
                    break;
                }
                i20++;
                int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
                g = i22 % 128;
                if (i22 % 2 == 0) {
                    int i23 = 3 / 4;
                }
                j2 = j13;
            }
            if (i19 != i16) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46400 - KeyEvent.keyCodeFromString("")), 40 - (ViewConfiguration.getPressedStateDuration() >> 16), 20 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
                int[] iArr = new int[i17];
                int i24 = i17 - 1;
                iArr[i24] = 1;
                Toast.makeText((Context) null, iArr[((i17 * i24) % 2) - 1], 1).show();
                int i25 = g + 123;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i25 % 128;
                int i26 = i25 % 2;
            }
            return super.entrySet();
        }

        private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
            ExtensionUtils$extMapping$1 extensionUtils$extMapping$1 = (ExtensionUtils$extMapping$1) objArr[0];
            Object obj = objArr[1];
            Object obj2 = objArr[2];
            int i = 2 % 2;
            if (obj == null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
                g = i2 % 128;
                int i3 = i2 % 2;
            } else if (!(obj instanceof String)) {
                return false;
            }
            if (obj2 == null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
                g = i4 % 128;
                int i5 = i4 % 2;
            } else {
                boolean z = obj2 instanceof String;
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
                int i7 = i6 % 128;
                g = i7;
                int i8 = i6 % 2;
                if (!z) {
                    int i9 = i7 + 25;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                    int i10 = i9 % 2;
                    return false;
                }
            }
            return Boolean.valueOf(super.remove((String) obj, (String) obj2));
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            int i = 2 % 2;
            if (obj == null || (obj instanceof String)) {
                return (String) super.getOrDefault((String) obj, (String) obj2);
            }
            int i2 = g;
            int i3 = i2 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            Object obj3 = null;
            if (i3 % 2 != 0) {
                obj3.hashCode();
                throw null;
            }
            int i4 = i2 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 == 0) {
                return obj2;
            }
            obj3.hashCode();
            throw null;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
            g = i2 % 128;
            int i3 = i2 % 2;
            Set<String> setKeySet = super.keySet();
            int i4 = g + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            return setKeySet;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            int i = 2 % 2;
            int i2 = g + 25;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            if (obj == null) {
                int i5 = i3 + 53;
                g = i5 % 128;
                int i6 = i5 % 2;
            } else if (!(obj instanceof String)) {
                return null;
            }
            String str = (String) super.remove((String) obj);
            int i7 = g + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
            return str;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                super.size();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            return super.size();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<String> values() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                super.values();
                throw null;
            }
            return super.values();
        }

        private Set<Map.Entry<String, String>> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            return (Set) TuitionPaymentFragmentbindingInflater1(1990887494, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1990887493, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this});
        }

        @Override // java.util.HashMap, java.util.Map
        public final boolean remove(Object obj, Object obj2) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            return ((Boolean) TuitionPaymentFragmentbindingInflater1(1439607913, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1439607913, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this, obj, obj2})).booleanValue();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, short r7, short r8) {
            /*
                int r8 = r8 * 2
                int r8 = 108 - r8
                int r7 = r7 * 3
                int r0 = r7 + 1
                byte[] r1 = com.bpjstku.util.utils.ExtensionUtils$extMapping$1.$$c
                int r6 = r6 + 4
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r4 = r8
                r3 = r2
                r8 = r6
                goto L2a
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                r0[r3] = r4
                int r6 = r6 + 1
                if (r3 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L23:
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r5
            L2a:
                int r6 = r6 + r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.utils.ExtensionUtils$extMapping$1.$$g(int, short, short):java.lang.String");
        }
    };

    private CaptureRequestOptions() {
    }

    public static HashMap<String, String> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentbindingInflater1;
    }
}
