package defpackage;

import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.Layout;
import android.text.TextUtils;
import android.text.style.AlignmentSpan;
import android.text.style.BulletSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.getCardElevation;
import java.lang.reflect.Method;
import java.util.Stack;
import org.sufficientlysecure.htmltextview.NumberSpan;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes4.dex */
public final class CardView implements getAudioEnabled {
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1;
    private static final BulletSpan b = new BulletSpan(10);
    public setUsingRotationDegrees TuitionPaymentFragmentbindingInflater1;
    public getViewPortSize TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public getCardElevation TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Stack<String> asBinder = new Stack<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Stack<Integer> f119a = new Stack<>();
    private StringBuilder g = new StringBuilder();
    private int d = 0;

    /* JADX INFO: loaded from: classes5.dex */
    public static class a {
        private static final byte[] $$c = {94, -56, 58, -24};
        private static final int $$f = 131;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {5, -91, 77, 46, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
        private static final int $$e = 215;
        private static final byte[] $$a = {109, 48, -62, 38, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 21, 49, 2, -2, -1, -4, 0, 21, -9, 8, 1, -35, 39, -6, 11, -1, 21, -17, -27, 39, 11, -7, 23, -19, -49, 64, -9, 15, -5, -55, 40, 22, 12, -11, -2, 5, 3, -17, 19, 4, -5, -5, 2, 13, 7, -4, 7};
        private static final int $$b = 227;
        private static long b = 5259598959123697492L;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1722126073720242515L;

        private static void d(int i, short s, int i2, Object[] objArr) {
            int i3 = 115 - (i * 3);
            int i4 = s + 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[34 - i2];
            int i5 = 33 - i2;
            int i6 = -1;
            if (bArr == null) {
                i3 = (i5 + i4) - 2;
                i4 = i4;
                i6 = -1;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i3;
                int i8 = i4 + 1;
                if (i7 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i3 = (i3 + bArr[i8]) - 2;
                    i4 = i8;
                    i6 = i7;
                }
            }
        }

        private static void e(short s, short s2, int i, Object[] objArr) {
            byte[] bArr = $$d;
            int i2 = s2 * 52;
            int i3 = s + 4;
            int i4 = i + 84;
            byte[] bArr2 = new byte[i2 + 1];
            int i5 = -1;
            if (bArr == null) {
                i5 = -1;
                i4 = (i2 + (-i3)) - 10;
                i3 = i3;
            }
            while (true) {
                int i6 = i3 + 1;
                int i7 = i5 + 1;
                bArr2[i7] = (byte) i4;
                if (i7 == i2) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i5 = i7;
                i4 = (i4 + (-bArr[i6])) - 10;
                i3 = i6;
            }
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            abortCapture abortcapture = new abortCapture();
            char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
            abortcapture.b = 4;
            while (abortcapture.b < cArrB.length) {
                int i3 = $11 + 107;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                int i5 = abortcapture.b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 64838), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1355, 38 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 47773), View.MeasureSpec.getSize(0) + 468, 12 - TextUtils.lastIndexOf("", '0', 0, 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
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
            int i6 = $11 + 63;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i3 = $10 + 91;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19471 - TextUtils.lastIndexOf("", '0', 0, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2624, 13 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getMode(0) + 39422), 481 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 37 - TextUtils.getOffsetBefore("", 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
            }
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i6 = $10 + 69;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - View.resolveSizeAndState(0, 0, 0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 482, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 70121. Try increasing type updates limit count.
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
            */
        public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context r46, int r47, int r48, int r49) {
            /*
                Method dump skipped, instruction units count: 7012
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: CardView.a.TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context, int, int, int):java.lang.Object[]");
        }

        private static String $$g(byte b2, int i, byte b3) {
            byte[] bArr = $$c;
            int i2 = 107 - (b2 * 2);
            int i3 = (b3 * 2) + 4;
            int i4 = i * 4;
            byte[] bArr2 = new byte[1 - i4];
            int i5 = 0 - i4;
            int i6 = -1;
            if (bArr == null) {
                i2 += i3;
                i3++;
                i6 = -1;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i2;
                if (i7 == i5) {
                    return new String(bArr2, 0);
                }
                int i8 = i3;
                i2 = bArr[i3] + i2;
                i3 = i8 + 1;
                i6 = i7;
            }
        }
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        if (str == null) {
            return null;
        }
        return "<HTML_TEXTVIEW_ESCAPED_PLACEHOLDER></HTML_TEXTVIEW_ESCAPED_PLACEHOLDER>".concat(String.valueOf(str)).replace("<ul", "<HTML_TEXTVIEW_ESCAPED_UL_TAG").replace("</ul>", "</HTML_TEXTVIEW_ESCAPED_UL_TAG>").replace("<ol", "<HTML_TEXTVIEW_ESCAPED_OL_TAG").replace("</ol>", "</HTML_TEXTVIEW_ESCAPED_OL_TAG>").replace("<li", "<HTML_TEXTVIEW_ESCAPED_LI_TAG").replace("</li>", "</HTML_TEXTVIEW_ESCAPED_LI_TAG>").replace("<a", "<HTML_TEXTVIEW_ESCAPED_A_TAG").replace("</a>", "</HTML_TEXTVIEW_ESCAPED_A_TAG>");
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class d {
        private d() {
        }

        /* synthetic */ d(byte b) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class TuitionPaymentFragmentbindingInflater1 {
        private TuitionPaymentFragmentbindingInflater1() {
        }

        /* synthetic */ TuitionPaymentFragmentbindingInflater1(byte b) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, byte b) {
            this(str);
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte b) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte b) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class b {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class asBinder {
        private asBinder() {
        }

        /* synthetic */ asBinder(byte b) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class g {
        private g() {
        }

        /* synthetic */ g(byte b) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class asInterface {
        private asInterface() {
        }

        /* synthetic */ asInterface(byte b) {
            this();
        }
    }

    @Override // defpackage.getAudioEnabled
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean z, String str, Editable editable, Attributes attributes) {
        setUsingRotationDegrees setusingrotationdegrees;
        int i;
        if (z) {
            if (str.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_UL_TAG")) {
                this.asBinder.push(str);
            } else if (str.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_OL_TAG")) {
                this.asBinder.push(str);
                this.f119a.push(1);
            } else if (str.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_LI_TAG")) {
                if (editable.length() > 0 && editable.charAt(editable.length() - 1) != '\n') {
                    editable.append("\n");
                }
                if (!this.asBinder.isEmpty()) {
                    String strPeek = this.asBinder.peek();
                    if (strPeek.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_OL_TAG")) {
                        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1((byte) 0);
                        int length = editable.length();
                        editable.setSpan(tuitionPaymentFragmentbindingInflater1, length, length, 17);
                        Stack<Integer> stack = this.f119a;
                        stack.push(Integer.valueOf(stack.pop().intValue() + 1));
                    } else if (strPeek.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_UL_TAG")) {
                        d dVar = new d((byte) 0);
                        int length2 = editable.length();
                        editable.setSpan(dVar, length2, length2, 17);
                    }
                }
            } else if (str.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_A_TAG")) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(attributes != null ? attributes.getValue("href") : null, (byte) 0);
                int length3 = editable.length();
                editable.setSpan(tuitionPaymentFragmentspecialinlinedviewModeldefault2, length3, length3, 17);
            } else {
                byte b2 = 0;
                if (str.equalsIgnoreCase("code")) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(b2);
                    int length4 = editable.length();
                    editable.setSpan(tuitionPaymentFragmentspecialinlinedviewModeldefault3, length4, length4, 17);
                } else if (str.equalsIgnoreCase("center")) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(b2);
                    int length5 = editable.length();
                    editable.setSpan(tuitionPaymentFragmentspecialinlinedviewModeldefault1, length5, length5, 17);
                } else if (str.equalsIgnoreCase("s") || str.equalsIgnoreCase("strike")) {
                    b bVar = new b(b2);
                    int length6 = editable.length();
                    editable.setSpan(bVar, length6, length6, 17);
                } else if (str.equalsIgnoreCase("table")) {
                    asBinder asbinder = new asBinder(b2);
                    int length7 = editable.length();
                    editable.setSpan(asbinder, length7, length7, 17);
                    if (this.d == 0) {
                        this.g = new StringBuilder();
                        editable.append("table placeholder");
                    }
                    this.d++;
                } else if (str.equalsIgnoreCase("tr")) {
                    g gVar = new g((byte) 0);
                    int length8 = editable.length();
                    editable.setSpan(gVar, length8, length8, 17);
                } else {
                    byte b3 = 0;
                    if (str.equalsIgnoreCase("th")) {
                        asInterface asinterface = new asInterface(b3);
                        int length9 = editable.length();
                        editable.setSpan(asinterface, length9, length9, 17);
                    } else {
                        if (!str.equalsIgnoreCase("td")) {
                            return false;
                        }
                        a aVar = new a(b3);
                        int length10 = editable.length();
                        editable.setSpan(aVar, length10, length10, 17);
                    }
                }
            }
        } else if (str.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_UL_TAG")) {
            this.asBinder.pop();
        } else if (str.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_OL_TAG")) {
            this.asBinder.pop();
            this.f119a.pop();
        } else if (str.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_LI_TAG")) {
            if (!this.asBinder.isEmpty()) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i3 = i2 >= 0 ? i2 * 2 : 20;
                if (this.asBinder.peek().equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_UL_TAG")) {
                    if (editable.length() > 0 && editable.charAt(editable.length() - 1) != '\n') {
                        editable.append("\n");
                    }
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int leadingMargin = i4 >= 0 ? i4 : 10;
                    BulletSpan bulletSpan = i4 >= 0 ? new BulletSpan(TuitionPaymentFragmentspecialinlinedviewModeldefault3) : b;
                    if (this.asBinder.size() > 1) {
                        leadingMargin -= bulletSpan.getLeadingMargin(true);
                        if (this.asBinder.size() > 2) {
                            leadingMargin -= (this.asBinder.size() - 2) * i3;
                        }
                    }
                    TuitionPaymentFragmentbindingInflater1(editable, d.class, false, new LeadingMarginSpan.Standard(i3 * (this.asBinder.size() - 1)), new BulletSpan(leadingMargin));
                } else if (this.asBinder.peek().equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_OL_TAG")) {
                    if (editable.length() > 0) {
                        i = 10;
                        if (editable.charAt(editable.length() - 1) != '\n') {
                            editable.append("\n");
                        }
                    } else {
                        i = 10;
                    }
                    int leadingMargin2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (leadingMargin2 < 0) {
                        leadingMargin2 = i;
                    }
                    NumberSpan numberSpan = new NumberSpan(leadingMargin2, this.f119a.lastElement().intValue() - 1);
                    if (this.asBinder.size() > 1) {
                        leadingMargin2 -= numberSpan.getLeadingMargin(true);
                        if (this.asBinder.size() > 2) {
                            leadingMargin2 -= (this.asBinder.size() - 2) * i3;
                        }
                    }
                    TuitionPaymentFragmentbindingInflater1(editable, TuitionPaymentFragmentbindingInflater1.class, false, new LeadingMarginSpan.Standard(i3 * (this.asBinder.size() - 1)), new NumberSpan(leadingMargin2, this.f119a.lastElement().intValue() - 1));
                }
            }
        } else if (str.equalsIgnoreCase("HTML_TEXTVIEW_ESCAPED_A_TAG")) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(editable, TuitionPaymentFragmentspecialinlinedviewModeldefault2.class);
            final String str2 = objTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? ((TuitionPaymentFragmentspecialinlinedviewModeldefault2) objTuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
            TuitionPaymentFragmentbindingInflater1(editable, TuitionPaymentFragmentspecialinlinedviewModeldefault2.class, false, new URLSpan(str2) { // from class: org.sufficientlysecure.htmltextview.HtmlTagHandler$1
                @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                public void onClick(View view) {
                    if (this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                        getCardElevation unused = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        getURL();
                    } else {
                        super.onClick(view);
                    }
                }
            });
        } else if (str.equalsIgnoreCase("code")) {
            TuitionPaymentFragmentbindingInflater1(editable, TuitionPaymentFragmentspecialinlinedviewModeldefault3.class, false, new TypefaceSpan("monospace"));
        } else if (str.equalsIgnoreCase("center")) {
            TuitionPaymentFragmentbindingInflater1(editable, TuitionPaymentFragmentspecialinlinedviewModeldefault1.class, true, new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER));
        } else if (str.equalsIgnoreCase("s") || str.equalsIgnoreCase("strike")) {
            TuitionPaymentFragmentbindingInflater1(editable, b.class, false, new StrikethroughSpan());
        } else if (str.equalsIgnoreCase("table")) {
            int i5 = this.d - 1;
            this.d = i5;
            if (i5 == 0) {
                getViewPortSize getviewportsize = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                getViewPortSize getviewportsizeTuitionPaymentFragmentbindingInflater1 = getviewportsize != null ? getviewportsize.TuitionPaymentFragmentbindingInflater1() : null;
                setUsingRotationDegrees setusingrotationdegrees2 = this.TuitionPaymentFragmentbindingInflater1;
                if (setusingrotationdegrees2 != null) {
                    setusingrotationdegrees = new setUsingRotationDegrees();
                    setusingrotationdegrees.TuitionPaymentFragmentbindingInflater1 = setusingrotationdegrees2.TuitionPaymentFragmentbindingInflater1;
                    setusingrotationdegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = setusingrotationdegrees2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    setusingrotationdegrees.b = setusingrotationdegrees2.b;
                } else {
                    setusingrotationdegrees = null;
                }
                TuitionPaymentFragmentbindingInflater1(editable, asBinder.class, false, setusingrotationdegrees, getviewportsizeTuitionPaymentFragmentbindingInflater1);
            } else {
                TuitionPaymentFragmentbindingInflater1(editable, asBinder.class, false, new Object[0]);
            }
        } else if (str.equalsIgnoreCase("tr")) {
            TuitionPaymentFragmentbindingInflater1(editable, g.class, false, new Object[0]);
        } else if (str.equalsIgnoreCase("th")) {
            TuitionPaymentFragmentbindingInflater1(editable, asInterface.class, false, new Object[0]);
        } else {
            if (!str.equalsIgnoreCase("td")) {
                return false;
            }
            TuitionPaymentFragmentbindingInflater1(editable, a.class, false, new Object[0]);
        }
        if (this.d <= 0 && !str.equalsIgnoreCase("table")) {
            return true;
        }
        this.g.append("<");
        if (!z) {
            this.g.append("/");
        }
        StringBuilder sb = this.g;
        sb.append(str.toLowerCase());
        sb.append(">");
        return true;
    }

    private void TuitionPaymentFragmentbindingInflater1(Editable editable, Class cls, boolean z, Object... objArr) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(editable, cls);
        int spanStart = editable.getSpanStart(objTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int length = editable.length();
        if (this.d > 0) {
            int spanStart2 = editable.getSpanStart(TuitionPaymentFragmentspecialinlinedviewModeldefault2(editable, cls));
            int length2 = editable.length();
            CharSequence charSequenceSubSequence = editable.subSequence(spanStart2, length2);
            editable.delete(spanStart2, length2);
            this.g.append(charSequenceSubSequence);
        }
        editable.removeSpan(objTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        if (spanStart != length) {
            if (z) {
                editable.append("\n");
                length++;
            }
            for (Object obj : objArr) {
                editable.setSpan(obj, spanStart, length, 33);
            }
        }
    }

    private static Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Editable editable, Class cls) {
        Object[] spans = editable.getSpans(0, editable.length(), cls);
        if (spans.length == 0) {
            return null;
        }
        for (int length = spans.length; length > 0; length--) {
            int i = length - 1;
            if (editable.getSpanFlags(spans[i]) == 17) {
                return spans[i];
            }
        }
        return null;
    }

    public static void TuitionPaymentFragmentbindingInflater1(float f) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Math.round(f);
    }
}
