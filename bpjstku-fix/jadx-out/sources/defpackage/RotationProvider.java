package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import com.bpjstku.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes7.dex */
public final class RotationProvider extends LinkMovementMethod {
    private boolean TuitionPaymentFragmentbindingInflater1;
    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean asBinder;
    private TuitionPaymentFragmentspecialinlinedviewModeldefault1 asInterface;
    private ClickableSpan b;
    private final RectF g = new RectF();
    private static final byte[] $$c = {39, -79, 42};
    private static final int $$d = 106;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {88, ByteCompanionObject.MAX_VALUE, -112, -47, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 125;
    private static int d = 0;
    private static int notify = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int[] f208a = {879250765, 515515322, -143613947, -447101439, -1005893713, 2043492248, 1504048210, -433786717, -122191087, 370605214, 138007334, -1457181536, 558168028, 2131954295, 1720046864, 460196991, -86732760, -2025624665};

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str);
    }

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
    }

    private static void c(byte b2, byte b3, int i, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = 55 - (i * 52);
        int i3 = 98 - (b3 * 14);
        byte[] bArr2 = new byte[53 - b2];
        int i4 = 52 - b2;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i2 + (-i3)) - 11;
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
            i3 = (i7 + (-bArr[i9])) - 11;
            i5 = i8;
        }
    }

    public static RotationProvider TuitionPaymentFragmentspecialinlinedviewModeldefault1(TextView... textViewArr) {
        int i = 2 % 2;
        RotationProvider rotationProvider = new RotationProvider();
        int length = textViewArr.length;
        int i2 = 0;
        while (i2 <= 0) {
            int i3 = d + 7;
            notify = i3 % 128;
            if (i3 % 2 == 0) {
                TextView textView = textViewArr[0];
                textView.setMovementMethod(rotationProvider);
                Linkify.addLinks(textView, 0);
                i2 += 106;
            } else {
                TextView textView2 = textViewArr[0];
                textView2.setMovementMethod(rotationProvider);
                Linkify.addLinks(textView2, 1);
                i2++;
            }
        }
        return rotationProvider;
    }

    protected RotationProvider() {
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f208a;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 57;
                $10 = i8 % 128;
                if (i8 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i6] = Integer.valueOf(iArr2[i7]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i6;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), View.MeasureSpec.getMode(i6) + 3291, 30 - Process.getGidForName(""), 1948206109, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i7 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.combineMeasuredStates(0, 0), 3290 - ImageFormat.getBitsPerPixel(0), Color.alpha(0) + 31, 1948206109, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i7++;
                }
                i2 = 2;
                i4 = -1870535734;
                i6 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f208a;
        long j = 0;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $11 + 13;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    try {
                        Object[] objArr4 = new Object[i5];
                        objArr4[0] = Integer.valueOf(iArr5[i9]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 3291;
                            int packedPositionChild = 30 - ExpandableListView.getPackedPositionChild(j);
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, edgeSlop, packedPositionChild, 1948206109, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        i9 >>= 1;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    length3 = length3;
                    Object[] objArr5 = {Integer.valueOf(iArr5[i9])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), View.resolveSizeAndState(0, 0, 0) + 3291, 31 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1948206109, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    i9++;
                }
                length3 = length3;
                i5 = 1;
                j = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i11 = $11 + 71;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i13 = 17;
            for (int i14 = 1; i13 > i14; i14 = 1) {
                int i15 = $10 + 19;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i13];
                Object[] objArr6 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Process.getGidForName("") + 1), 2558 - TextUtils.indexOf((CharSequence) "", '0'), 'M' - AndroidCharacter.getMirror('0'), 683220507, false, $$e(b10, b11, b11), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i13--;
            }
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr7 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (28879 - ExpandableListView.getPackedPositionType(0L)), TextUtils.getCapsMode("", 0, 0) + 348, KeyEvent.keyCodeFromString("") + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) throws Throwable {
        ClickableSpan clickableSpan;
        boolean z;
        int i = 2 % 2;
        int i2 = notify + 91;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            textView.hashCode();
            obj.hashCode();
            throw null;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != textView.hashCode()) {
            int i3 = d + 47;
            notify = i3 % 128;
            if (i3 % 2 == 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = textView.hashCode();
                textView.setAutoLinkMask(1);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = textView.hashCode();
                textView.setAutoLinkMask(0);
            }
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = textView.getTotalPaddingLeft();
        int totalPaddingTop = textView.getTotalPaddingTop();
        int scrollX = textView.getScrollX();
        int scrollY = (y - totalPaddingTop) + textView.getScrollY();
        Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(scrollY);
        float f = (x - totalPaddingLeft) + scrollX;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
        this.g.left = layout.getLineLeft(lineForVertical);
        this.g.top = layout.getLineTop(lineForVertical);
        this.g.right = layout.getLineWidth(lineForVertical) + this.g.left;
        this.g.bottom = layout.getLineBottom(lineForVertical);
        if (!this.g.contains(f, scrollY)) {
            int i4 = notify + 5;
            d = i4 % 128;
            int i5 = i4 % 2;
            clickableSpan = null;
            break;
        }
        int i6 = d + 117;
        notify = i6 % 128;
        int i7 = i6 % 2;
        Object[] spans = spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        int length = spans.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                int i9 = notify + 5;
                d = i9 % 128;
                int i10 = i9 % 2;
                clickableSpan = null;
                break;
            }
            Object obj2 = spans[i8];
            if (obj2 instanceof ClickableSpan) {
                clickableSpan = (ClickableSpan) obj2;
                break;
            }
            i8++;
        }
        if (motionEvent.getAction() == 0) {
            this.b = clickableSpan;
        }
        if (this.b != null) {
            int i11 = d + 63;
            notify = i11 % 128;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            if (clickableSpan != null) {
                b(textView, clickableSpan, spannable);
            }
            return z;
        }
        int i13 = d;
        int i14 = i13 + 79;
        notify = i14 % 128;
        int i15 = i14 % 2;
        if (action == 1) {
            if (z && clickableSpan == this.b) {
                Spanned spanned = (Spanned) textView.getText();
                b bVar = new b(clickableSpan, clickableSpan instanceof URLSpan ? ((URLSpan) clickableSpan).getURL() : spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan)).toString());
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } else {
                    bVar.b.onClick(textView);
                }
            }
            this.asBinder = false;
            this.b = null;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(textView);
            TuitionPaymentFragmentbindingInflater1(textView);
            return z;
        }
        int i16 = i13 + 75;
        notify = i16 % 128;
        if (i16 % 2 != 0 ? action == 2 : action == 4) {
            if (clickableSpan != this.b) {
                TuitionPaymentFragmentbindingInflater1(textView);
            }
            if (clickableSpan != null) {
                b(textView, clickableSpan, spannable);
                return z;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(textView);
            return z;
        }
        if (action != 3) {
            return false;
        }
        this.asBinder = false;
        this.b = null;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(textView);
        TuitionPaymentFragmentbindingInflater1(textView);
        return false;
    }

    private void b(TextView textView, ClickableSpan clickableSpan, Spannable spannable) {
        int i = 2 % 2;
        int i2 = d + 29;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.TuitionPaymentFragmentbindingInflater1) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1 = true;
        int spanStart = spannable.getSpanStart(clickableSpan);
        int spanEnd = spannable.getSpanEnd(clickableSpan);
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(textView.getHighlightColor());
        spannable.setSpan(backgroundColorSpan, spanStart, spanEnd, 18);
        textView.setTag(R.id.bettermovementmethod_highlight_background_span, backgroundColorSpan);
        Selection.setSelection(spannable, spanStart, spanEnd);
        int i3 = notify + 61;
        d = i3 % 128;
        int i4 = i3 % 2;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TextView textView) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 65;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.TuitionPaymentFragmentbindingInflater1) {
            this.TuitionPaymentFragmentbindingInflater1 = false;
            Spannable spannable = (Spannable) textView.getText();
            spannable.removeSpan((BackgroundColorSpan) textView.getTag(R.id.bettermovementmethod_highlight_background_span));
            Selection.removeSelection(spannable);
            return;
        }
        int i4 = i2 + 11;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    protected static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Runnable {
        private b TuitionPaymentFragmentbindingInflater1;

        protected interface b {
        }

        protected TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    protected static class b {
        String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ClickableSpan b;

        b(ClickableSpan clickableSpan, String str) {
            this.b = clickableSpan;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        }
    }

    private void TuitionPaymentFragmentbindingInflater1(TextView textView) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = notify + 91;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iMyTid = (Process.myTid() >> 22) + 651;
            int i4 = 45 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, iMyTid, i4, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{496471222, 647288973, 1677893693, -1686862390, 1035557004, 1662185615, -678775360, 119795216, -1932751594, -447379023, 1129230149, 404832168, 1516240571, -1110442423}, (ViewConfiguration.getScrollBarSize() >> 8) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{-689148948, -494356947, -1816942419, 808152223, -214331613, 726877395, 105948207, 66608220, 1425814534, 308538217}, View.MeasureSpec.getSize(0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int scrollBarSize = 651 - (ViewConfiguration.getScrollBarSize() >> 8);
            int iMyPid = (Process.myPid() >> 22) + 44;
            byte b4 = (byte) ($$b & 182);
            byte b5 = $$a[7];
            Object[] objArr5 = new Object[1];
            c(b4, b5, b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, scrollBarSize, iMyPid, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 652;
                int iKeyCodeFromString = 44 - KeyEvent.keyCodeFromString("");
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) 15, bArr2[5], bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, iLastIndexOf, iKeyCodeFromString, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            int i7 = ~System.identityHashCode(this);
            int i8 = ((((~((-985208090) | i7)) | 3736576) * (-241)) - 2105383655) + (((~(i7 | (-981471514))) | (-985513856)) * 241) + 862287055;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.indexOf("", ""), Drawable.resolveOpacity(0, 0) + 1610, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 862287055, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 651;
                    int gidForName = Process.getGidForName("") + 45;
                    byte b6 = (byte) ($$b & 182);
                    byte b7 = $$a[7];
                    Object[] objArr9 = new Object[1];
                    c(b6, b7, b7, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionGroup, iResolveOpacity, gidForName, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetAfter("", 0), 695 - Gravity.getAbsoluteGravity(0, 0), 99 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63405 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 792, 83 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char defaultSize = (char) View.getDefaultSize(0, 0);
                    int longPressTimeout = 651 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iRed = Color.red(0) + 44;
                    byte[] bArr3 = $$a;
                    Object[] objArr11 = new Object[1];
                    c((byte) 15, bArr3[5], bArr3[7], objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize, longPressTimeout, iRed, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    e(new int[]{496471222, 647288973, 1677893693, -1686862390, 1035557004, 1662185615, -678775360, 119795216, -1932751594, -447379023, 1129230149, 404832168, 1516240571, -1110442423}, 22 - TextUtils.indexOf("", "", 0, 0), objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e(new int[]{-689148948, -494356947, -1816942419, 808152223, -214331613, 726877395, 105948207, 66608220, 1425814534, 308538217}, 15 - (ViewConfiguration.getTouchSlop() >> 8), objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cAlpha = (char) Color.alpha(0);
                        int iMyPid2 = 651 - (Process.myPid() >> 22);
                        int i11 = 44 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte b8 = (byte) ($$b & 182);
                        byte b9 = $$a[7];
                        Object[] objArr14 = new Object[1];
                        c(b8, b9, b9, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAlpha, iMyPid2, i11, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cBlue = (char) Color.blue(0);
                        int i12 = 652 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i13 = 45 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[7];
                        byte b11 = bArr4[5];
                        Object[] objArr15 = new Object[1];
                        c(b10, b11, b11, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cBlue, i12, i13, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr10;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i14 = ((int[]) objArr[0])[0];
        int i15 = ((int[]) objArr[2])[0];
        if (i15 == i14) {
            Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[0])[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i19 = i16 + (-572945103) + (((~(1017824993 | startUptimeMillis)) | 5578778) * 336) + (((~(startUptimeMillis | 1021255803)) | 2147968) * (-168)) + (((~((~startUptimeMillis) | 1021255803)) | 1017824993) * 168);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr16[3])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i22 = notify + 9;
                d = i22 % 128;
                int i23 = 2;
                int i24 = i22 % 2;
                int i25 = 0;
                while (i25 < strArr.length) {
                    int i26 = d + 9;
                    notify = i26 % 128;
                    int i27 = i26 % i23;
                    arrayList.add(strArr[i25]);
                    i25++;
                    i23 = 2;
                }
            }
            Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            Object[] objArr17 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i28 = ((int[]) objArr[3])[0];
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i31 = (-1529366119) + (((~(1007094630 | iIdentityHashCode)) | (-1003663821)) * 672);
            int i32 = ~iIdentityHashCode;
            int i33 = i28 + i31 + (((~(iIdentityHashCode | (-1003663821))) | (~((-1007094631) | i32))) * (-672)) + (((~(1003663820 | i32)) | (-1071102959)) * 672);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr17[3])[0] = i35 ^ (i35 << 5);
        }
        int i36 = notify + 29;
        d = i36 % 128;
        if (i36 % 2 != 0) {
            throw null;
        }
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
    private static java.lang.String $$e(byte r5, byte r6, short r7) {
        /*
            byte[] r0 = defpackage.RotationProvider.$$c
            int r5 = r5 * 4
            int r5 = r5 + 3
            int r7 = r7 * 56
            int r7 = 122 - r7
            int r6 = r6 * 3
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r4 = r5
            r7 = r6
            r3 = r2
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            int r3 = r3 + 1
            r4 = r0[r5]
        L29:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RotationProvider.$$e(byte, byte, short):java.lang.String");
    }
}
