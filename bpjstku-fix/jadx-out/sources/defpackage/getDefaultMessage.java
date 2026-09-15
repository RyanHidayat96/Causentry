package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.core.view.ViewCompat;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentStreamingConfirmationDialogBinding;
import com.google.android.material.button.MaterialButton;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0012B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0013\u0010\u0010R\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00178\u0015X\u0094D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\u001c8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u001a\u0010\u0013\u001a\u00020\u001e8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u0018\u0010 R\u0016\u0010\u0014\u001a\u00020!8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0013\u0010$"}, d2 = {"LgetDefaultMessage;", "LMediaSessionCompatMediaSessionImplApi181;", "Lkotlin/Function0;", "", "p0", "p1", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentbindingInflater1", "()V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "Lkotlin/jvm/functions/Function0;", "asBinder", "", "d", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()I", "Lcom/bpjstku/databinding/FragmentStreamingConfirmationDialogBinding;", "Lcom/bpjstku/databinding/FragmentStreamingConfirmationDialogBinding;", "", "Z", "()Z", "", "Ljava/lang/String;", "LgetDefaultMessage$b;", "LgetDefaultMessage$b;", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getDefaultMessage extends MediaSessionCompatMediaSessionImplApi181 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] asInterface;
    private static int cancel;
    private static long onTransact;
    private FragmentStreamingConfirmationDialogBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public b g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Function0<Unit> b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {59, -124, -78, 46};
    private static final int $$d = 212;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {89, 107, -36, -112, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 232;
    private static int INotificationSideChannel = 1;
    private static int cancelAll = 0;
    private static int notify = 1;

    public interface b {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 84 - r6
            byte[] r0 = defpackage.getDefaultMessage.$$a
            int r8 = r8 * 2
            int r8 = r8 + 53
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r5 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r7]
        L28:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getDefaultMessage.e(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getDefaultMessage(Function0 function0, Function0 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = cancelAll;
            int i3 = i2 + 41;
            notify = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 43;
            notify = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            function0 = null;
        }
        if ((i & 2) != 0) {
            int i8 = cancelAll + 83;
            notify = i8 % 128;
            int i9 = i8 % 2;
            function1 = null;
        }
        this(function0, function1);
    }

    public getDefaultMessage(Function0<Unit> function0, Function0<Unit> function1) {
        this.TuitionPaymentFragmentbindingInflater1 = function0;
        this.b = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.layout.fragment_streaming_confirmation_dialog;
        this.a = "";
    }

    /* JADX INFO: renamed from: getDefaultMessage$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"LgetDefaultMessage$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "Lkotlin/Function0;", "", "p1", "p2", "LgetDefaultMessage;", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)LgetDefaultMessage;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$c = {109, 84, -87, -114};
        private static final int $$f = 145;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {113, 29, -123, -97, -14, 0, Base64.padSymbol, -56, 1, -21, 17, -5, -13, 6, 55, -53, -15, 8, -16, 1, 4, 3, 52, -70, -5, 6, Base64.padSymbol, -65, -4, 9, -3, -9, 60, -32, -37, -1, 5, 17, -15, -20, 6, 36, -51, 15, -11, -8, 78, -77, -1, 24, -32, 15, -15, -7, 16, -4, -19, 78, -64};
        private static final int $$e = 82;
        private static final byte[] $$a = {91, -9, 99, 11, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
        private static final int $$b = 221;
        private static int b = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6377398940819159759L;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -2136766322;
        private static char TuitionPaymentFragmentbindingInflater1 = 34097;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r5, int r6, byte r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = defpackage.getDefaultMessage.Companion.$$a
                int r6 = r6 * 52
                int r6 = 55 - r6
                int r1 = 53 - r7
                int r5 = r5 * 14
                int r5 = r5 + 84
                byte[] r1 = new byte[r1]
                int r7 = 52 - r7
                r2 = 0
                if (r0 != 0) goto L17
                r4 = r5
                r5 = r7
                r3 = r2
                goto L2b
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r5
                int r6 = r6 + 1
                r1[r3] = r4
                if (r3 != r7) goto L27
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L27:
                r4 = r0[r6]
                int r3 = r3 + 1
            L2b:
                int r5 = r5 + r4
                int r5 = r5 + (-10)
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.getDefaultMessage.Companion.a(int, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(short r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 55
                int r0 = 56 - r6
                int r8 = r8 * 55
                int r8 = 59 - r8
                int r7 = 99 - r7
                byte[] r1 = defpackage.getDefaultMessage.Companion.$$d
                byte[] r0 = new byte[r0]
                int r6 = 55 - r6
                r2 = 0
                if (r1 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2d
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r1[r8]
                r5 = r8
                r8 = r7
                r7 = r3
                r3 = r5
            L2d:
                int r7 = -r7
                int r3 = r3 + 1
                int r8 = r8 + r7
                int r7 = r8 + (-2)
                r8 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.getDefaultMessage.Companion.d(short, int, int, java.lang.Object[]):void");
        }

        private Companion() {
        }

        private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            SessionProcessor sessionProcessor = new SessionProcessor();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr.length;
            char[] cArr5 = new char[length2];
            int i3 = 0;
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr3.length;
            char[] cArr6 = new char[length3];
            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i4 = $11 + 39;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i3) + 8329);
                        int jumpTapTimeout = 1235 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i6 = 36 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        String str$$g = $$g(b2, b3, (byte) (b3 + 2));
                        Class[] clsArr = new Class[1];
                        clsArr[i3] = Object.class;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, jumpTapTimeout, i6, -653973969, false, str$$g, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cResolveSize = (char) View.resolveSize(i3, i3);
                        int i7 = 2763 - (ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1));
                        int packedPositionType = 14 - ExpandableListView.getPackedPositionType(0L);
                        byte b4 = (byte) i3;
                        byte b5 = b4;
                        String str$$g2 = $$g(b4, b5, b5);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i3] = Object.class;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, i7, packedPositionType, 1504416861, false, str$$g2, clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    int i8 = cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                    objArr4[1] = Integer.valueOf(i8);
                    objArr4[i3] = sessionProcessor;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cKeyCodeFromString = (char) (43325 - KeyEvent.keyCodeFromString(""));
                        int fadingEdgeLength = 253 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i9 = 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        Class[] clsArr3 = new Class[3];
                        clsArr3[i3] = Object.class;
                        clsArr3[1] = Integer.TYPE;
                        clsArr3[2] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, fadingEdgeLength, i9, -721491957, false, "j", clsArr3);
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i10 = cArr4[iIntValue2] * 32718;
                    Object[] objArr5 = new Object[2];
                    objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                    objArr5[i3] = Integer.valueOf(i10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", i3) + 65200);
                        int modifierMetaStateMask = 2890 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int i11 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17;
                        byte b6 = (byte) i3;
                        byte b7 = b6;
                        String str$$g3 = $$g(b6, b7, (byte) (b7 + 1));
                        Class[] clsArr4 = new Class[2];
                        clsArr4[i3] = Integer.TYPE;
                        clsArr4[1] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, modifierMetaStateMask, i11, 2012627446, false, str$$g3, clsArr4);
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) ((((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))) ^ (((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L)))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    int i12 = $10 + 23;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 3 / 3;
                    }
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        @JvmStatic
        public static getDefaultMessage b(String p0, Function0<Unit> p1, Function0<Unit> p2) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            getDefaultMessage getdefaultmessage = new getDefaultMessage(p1, p2);
            Bundle bundle = new Bundle();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            int i2 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 31533);
                int maximumFlingVelocity = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 29;
                byte b2 = $$a[37];
                Object[] objArr2 = new Object[1];
                a(b2, b2, (byte) 52, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, maximumFlingVelocity, iLastIndexOf, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{45581, 49419, 1414, 50612}, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), Drawable.resolveOpacity(0, 0), new char[]{8068, 33596, 19105, 56888, 53762, 15058, 50826, 53753, 52048, 37537, 28833, 3703, 6033, 9206, 4308, 43890, 7263, 58973, 53412, 9234, 20152, 48065}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{39020, 64889, 8707, 14460}, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31778), MotionEvent.axisFromString("") + 66943385, new char[]{22925, 38095, 21377, 41575, 30783, 26480, 22665, 60772, 47716, 46761, 18244, 44796, 48548, 25256, 17295}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cGreen = (char) (31533 - Color.green(0));
                int i3 = 922 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int jumpTapTimeout = 28 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte[] bArr = $$a;
                byte b3 = bArr[80];
                Object[] objArr5 = new Object[1];
                a(b3, bArr[37], b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, i3, jumpTapTimeout, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i4 = b + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char maxKeyCode = (char) (31533 - (KeyEvent.getMaxKeyCode() >> 16));
                    int iCombineMeasuredStates = 921 - View.combineMeasuredStates(0, 0);
                    int i6 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27;
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[80];
                    Object[] objArr6 = new Object[1];
                    a(b4, b4, bArr2[33], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maxKeyCode, iCombineMeasuredStates, i6, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i7 = ((int[]) objArr7[3])[0];
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i7}, (String[]) objArr7[4]};
                int iMyPid = Process.myPid();
                int i8 = ~((-1024578809) | iMyPid);
                int i9 = ~iMyPid;
                int i10 = i8 | (~(749500835 | i9));
                int i11 = ~(1024578808 | i9);
                int i12 = (((1980392943 + ((i10 | i11) * (-516))) + (((~(iMyPid | (-738218145))) | (~((-11282692) | i9))) * 516)) + ((11282691 | i11) * 516)) - 1416662670;
                int i13 = (i12 << 13) ^ i12;
                int i14 = i13 ^ (i13 >>> 17);
                ((int[]) objArr[0])[0] = i14 ^ (i14 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{7354, 21725, 1569, 10784}, (char) (8198 - View.MeasureSpec.getMode(0)), TextUtils.getCapsMode("", 0, 0), new char[]{19524, 8682, 25396, 30407, 63565, 8354, 18005, 13510, 32424, 54100, 36252, 57281, 40066, 58530, 51530, 5037, 20284, 50268, 527, 57963, 6922, 6355, 33201, 5763, 27264, 60557}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{33929, 19340, 39940, 5879}, (char) ((Process.myTid() >> 22) + 63388), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{12934, 25116, 861, 59406, 41014, 17175, 18367, 27647, 14994, 64664, 58333, 64882, 1463, 7710, 64860, 23537, 43951, 62211}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
                        b = i15 % 128;
                        int i16 = i15 % 2;
                        applicationContext = null;
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                try {
                    Object[] objArr10 = {applicationContext, Integer.valueOf(p0.length()), 0, -1416662670};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[5];
                    Object[] objArr11 = new Object[1];
                    d(b5, b5, bArr3[8], objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    byte b6 = bArr3[8];
                    Object[] objArr12 = new Object[1];
                    d(b6, b6, bArr3[5], objArr12);
                    Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 31533);
                        int mirror = 969 - AndroidCharacter.getMirror('0');
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                        byte[] bArr4 = $$a;
                        byte b7 = bArr4[80];
                        Object[] objArr14 = new Object[1];
                        a(b7, b7, bArr4[33], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(trimmedLength, mirror, modifierMetaStateMask, -1142834547, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{45581, 49419, 1414, 50612}, (char) View.resolveSize(0, 0), ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), new char[]{8068, 33596, 19105, 56888, 53762, 15058, 50826, 53753, 52048, 37537, 28833, 3703, 6033, 9206, 4308, 43890, 7263, 58973, 53412, 9234, 20152, 48065}, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{39020, 64889, 8707, 14460}, (char) (31778 - ((Process.getThreadPriority(0) + 20) >> 6)), 66943384 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{22925, 38095, 21377, 41575, 30783, 26480, 22665, 60772, 47716, 46761, 18244, 44796, 48548, 25256, 17295}, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
                            int gidForName = 920 - Process.getGidForName("");
                            int iMyTid = (Process.myTid() >> 22) + 28;
                            byte[] bArr5 = $$a;
                            byte b8 = bArr5[80];
                            Object[] objArr17 = new Object[1];
                            a(b8, bArr5[37], b8, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, gidForName, iMyTid, -778300370, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 31534);
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 921;
                            int threadPriority = 28 - ((Process.getThreadPriority(0) + 20) >> 6);
                            byte b9 = $$a[37];
                            Object[] objArr18 = new Object[1];
                            a(b9, b9, (byte) 52, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, minimumFlingVelocity, threadPriority, -1048449946, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr13;
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
            if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    int i17 = b + 69;
                    while (true) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
                        int i18 = i17 % 2;
                        if (i2 >= strArr.length) {
                            break;
                        }
                        arrayList.add(strArr[i2]);
                        i2++;
                        i17 = b + 1;
                    }
                }
                throw null;
            }
            int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
            b = i19 % 128;
            int i20 = i19 % 2;
            int i21 = ((int[]) objArr[0])[0];
            int i22 = ((int[]) objArr[3])[0];
            Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i22}, (String[]) objArr[4]};
            int iMyPid2 = Process.myPid();
            int i23 = ~iMyPid2;
            int i24 = i21 + (((((~((-1580208559) | i23)) | (~((-193871086) | iMyPid2))) | (~(i23 | 193871085))) * 959) - 209723898) + (((~(iMyPid2 | 193871085)) | (~(i23 | (-193871086))) | (~((-1580208559) | iMyPid2))) * 959);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            Object obj = objArr19[0];
            ((int[]) obj)[0] = i26 ^ (i26 << 5);
            int i27 = ((int[]) obj)[0];
            int i28 = i27 * i27;
            int i29 = -(897839336 * i27);
            int i30 = (i28 & i29) + (i28 | i29);
            int i31 = -(i27 * 1803172896);
            int i32 = (i30 & i31) + (i31 | i30);
            int i33 = (i32 ^ (-655166448)) + (((-655166448) & i32) << 1);
            int i34 = i33 >> 26;
            int i35 = (((i34 | ComposerKt.defaultsKey) << 1) - (i34 ^ ComposerKt.defaultsKey)) / 64;
            int i36 = ((i35 | 1) << 1) - (i35 ^ 1);
            int i37 = ((i33 | i36) << 1) - (i36 ^ i33);
            int i38 = i33 >> 15;
            int i39 = (((-262143) & i38) + (i38 | (-262143))) / 131072;
            int i40 = -((((i39 | 1) << 1) - (i39 ^ 1)) ^ i37);
            int i41 = ((i40 | 6) << 1) - (i40 ^ 6);
            int i42 = i41 >> 18;
            int i43 = (((i42 | (-32767)) << 1) - (i42 ^ (-32767))) / 16384;
            bundle.putString("28\\product_webview".substring(10242 / (((-((((i43 | 1) << 1) - (i43 ^ 1)) + 1)) & i41) * 569)), p0);
            getdefaultmessage.setArguments(bundle);
            return getdefaultmessage;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, int r7, byte r8) {
            /*
                int r7 = r7 * 4
                int r0 = r7 + 1
                int r8 = 104 - r8
                byte[] r1 = defpackage.getDefaultMessage.Companion.$$c
                int r6 = r6 * 4
                int r6 = r6 + 4
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2a
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r7) goto L21
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L21:
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2a:
                int r6 = -r6
                int r8 = r8 + 1
                int r6 = r6 + r3
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.getDefaultMessage.Companion.$$g(int, int, byte):java.lang.String");
        }
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = cancelAll;
        int i3 = i2 + 73;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i5 = i2 + 97;
        notify = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentStreamingConfirmationDialogBinding fragmentStreamingConfirmationDialogBindingInflate = FragmentStreamingConfirmationDialogBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = fragmentStreamingConfirmationDialogBindingInflate;
        Object obj = null;
        if (fragmentStreamingConfirmationDialogBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = notify + 39;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            fragmentStreamingConfirmationDialogBindingInflate = null;
        }
        FrameLayout root = fragmentStreamingConfirmationDialogBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        FrameLayout frameLayout = root;
        int i4 = notify + 47;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            return frameLayout;
        }
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: d */
    public final boolean getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = cancelAll + 79;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i2 = cancelAll + 109;
            notify = i2 % 128;
            int i3 = i2 % 2;
            String string = arguments.getString("product_webview");
            if (string == null) {
                string = "";
            }
            this.a = string;
            int i4 = cancelAll + 17;
            notify = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 2;
            }
        }
        int i6 = notify + 111;
        cancelAll = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        FragmentStreamingConfirmationDialogBinding fragmentStreamingConfirmationDialogBinding;
        int i = 2 % 2;
        int i2 = notify + 73;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            fragmentStreamingConfirmationDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = 94 / 0;
            if (fragmentStreamingConfirmationDialogBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = cancelAll + 113;
                notify = i4 % 128;
                int i5 = i4 % 2;
                fragmentStreamingConfirmationDialogBinding = null;
            }
        } else {
            fragmentStreamingConfirmationDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (fragmentStreamingConfirmationDialogBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = cancelAll + 113;
                notify = i6 % 128;
                int i7 = i6 % 2;
                fragmentStreamingConfirmationDialogBinding = null;
            }
        }
        if (Intrinsics.areEqual(this.a, "VISION+")) {
            fragmentStreamingConfirmationDialogBinding.tvInfo.setText(R.string.label_terms_condition_dialog_title_vision_plus);
            fragmentStreamingConfirmationDialogBinding.btnNextVisionPlus.setText(R.string.action_ok_vision_plus);
        }
        if (Intrinsics.areEqual(this.a, "RCTI+")) {
            int i8 = cancelAll + 73;
            notify = i8 % 128;
            if (i8 % 2 == 0) {
                fragmentStreamingConfirmationDialogBinding.tvInfo.setText(R.string.label_terms_condition_dialog_title_rcti_plus);
                fragmentStreamingConfirmationDialogBinding.btnNextVisionPlus.setText(R.string.action_ok_rcti_plus);
                throw null;
            }
            fragmentStreamingConfirmationDialogBinding.tvInfo.setText(R.string.label_terms_condition_dialog_title_rcti_plus);
            fragmentStreamingConfirmationDialogBinding.btnNextVisionPlus.setText(R.string.action_ok_rcti_plus);
        }
        int i9 = cancelAll + 105;
        notify = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void b() {
        int i = 2 % 2;
        int i2 = notify + 9;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        final FragmentStreamingConfirmationDialogBinding fragmentStreamingConfirmationDialogBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentStreamingConfirmationDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = notify + 115;
            cancelAll = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 3;
            }
            fragmentStreamingConfirmationDialogBinding = null;
        }
        TextView textView = fragmentStreamingConfirmationDialogBinding.tvInfo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: toCameraAccessException
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getDefaultMessage.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        MaterialButton materialButton = fragmentStreamingConfirmationDialogBinding.btnNextVisionPlus;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: toCameraCaptureSession
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getDefaultMessage.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fragmentStreamingConfirmationDialogBinding, this, (View) obj);
            }
        }));
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $10 + 115;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i6 = $10 + 51;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(asInterface[i + i8])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.alpha(0) + 2187, (ViewConfiguration.getLongPressTimeout() >> 16) + 40, 841711447, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(onTransact), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (ViewConfiguration.getTouchSlop() >> 8)), ImageFormat.getBitsPerPixel(0) + 3012, 26 - (ViewConfiguration.getFadingEdgeLength() >> 16), 321985076, false, $$e(b4, b5, (byte) (b5 - 3)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - TextUtils.getOffsetBefore("", 0)), 3376 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 16 - TextUtils.lastIndexOf("", '0', 0), -968507904, false, $$e(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i9 = $11 + 125;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - KeyEvent.getDeadChar(0, 0)), 3375 - TextUtils.lastIndexOf("", '0', 0, 0), 17 - ((Process.getThreadPriority(0) + 20) >> 6), -968507904, false, $$e(b8, b9, (byte) (-b9)), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b10 = (byte) 0;
                byte b11 = (byte) (b10 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((Process.myTid() >> 22) + 36505), ((Process.getThreadPriority(0) + 20) >> 6) + 3376, 16 - TextUtils.indexOf((CharSequence) "", '0'), -968507904, false, $$e(b10, b11, (byte) (-b11)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws Throwable {
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 46399), Color.rgb(0, 0, 0) + 16777256, 19 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        c(TextUtils.indexOf("", "", 0), (KeyEvent.getMaxKeyCode() >> 16) + 22, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36704), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        c((ViewConfiguration.getKeyRepeatDelay() >> 16) + 22, TextUtils.indexOf((CharSequence) "", '0', 0) + 16, (char) (38769 - Color.green(0)), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = -1;
        long j2 = j ^ (-825002045485883321L);
        long jIdentityHashCode = System.identityHashCode(this);
        long j3 = ((j2 | 2922259220227842308L) | jIdentityHashCode) ^ j;
        long j4 = (((long) 477) * 2922259220227842308L) + (((long) (-475)) * (-825002045485883321L)) + (((long) (-476)) * ((((j ^ 2922259220227842308L) | (-825002045485883321L)) ^ j) | j3)) + (((long) 952) * j3) + (((long) 476) * (((j2 | (jIdentityHashCode ^ j)) | 2922259220227842308L) ^ j));
        int i3 = 0;
        while (i3 != 10) {
            int i4 = notify + 93;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.red(0) + 37836), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
            int i7 = cancelAll + 101;
            notify = i7 % 128;
            int i8 = i7 % 2;
            long j5 = jLongValue;
            int i9 = 0;
            while (true) {
                for (int i10 = 0; i10 != 8; i10++) {
                    i6 = (((((int) (j5 >> i10)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                }
                if (i9 != 0) {
                    break;
                }
                int i11 = notify + 109;
                cancelAll = i11 % 128;
                i9 = i11 % 2 != 0 ? i9 + 96 : i9 + 1;
                j5 = j4;
            }
            if (i6 == i2) {
                return;
            }
            int i12 = cancelAll + 51;
            notify = i12 % 128;
            if (i12 % 2 == 0) {
                jLongValue *= 1024;
                i3 += 52;
            } else {
                jLongValue -= 1024;
                i3++;
            }
        }
        Object[] objArr3 = new Object[1];
        c(37 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr3);
        Class<?> cls2 = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(52 - MotionEvent.axisFromString(""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
        int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
        try {
            Object[] objArr5 = {-813003597};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46039 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 1135, 18 - View.getDefaultSize(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 337300049, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr5), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int i13 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr7 = new Object[1];
                e(b2, b3, b3, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMakeMeasureSpec, i13, iIndexOf, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getScrollBarSize() >> 8)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1116, 17 - TextUtils.indexOf("", "", 0)), Boolean.TYPE});
            }
            Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6);
            int i14 = ((int[]) objArr8[1])[0];
            int i15 = ((int[]) objArr8[3])[0];
            if (i15 != i14) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr8[0];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i15));
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getDefaultMessage getdefaultmessage, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = getdefaultmessage.TuitionPaymentFragmentbindingInflater1;
        if (function0 != null) {
            int i2 = notify + 25;
            cancelAll = i2 % 128;
            if (i2 % 2 != 0) {
                function0.invoke();
                int i3 = 18 / 0;
            } else {
                function0.invoke();
            }
        }
        b bVar = getdefaultmessage.g;
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 107;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(FragmentStreamingConfirmationDialogBinding fragmentStreamingConfirmationDialogBinding, getDefaultMessage getdefaultmessage, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (fragmentStreamingConfirmationDialogBinding.cbAgreeTermCondition.isChecked()) {
            int i2 = notify;
            int i3 = i2 + 119;
            cancelAll = i3 % 128;
            int i4 = i3 % 2;
            Function0<Unit> function0 = getdefaultmessage.b;
            if (function0 != null) {
                int i5 = i2 + 77;
                cancelAll = i5 % 128;
                int i6 = i5 % 2;
                function0.invoke();
            }
            b bVar = getdefaultmessage.g;
            getdefaultmessage.dismiss();
        } else {
            String string = getdefaultmessage.getString(R.string.message_check_tnc);
            Intrinsics.checkNotNullExpressionValue(string, "");
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = cancelAll + 43;
        notify = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 62 / 0;
        }
        return unit;
    }

    static {
        cancel = 0;
        asInterface();
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = INotificationSideChannel + 81;
        cancel = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getDefaultMessage() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    static void asInterface() {
        asInterface = new char[]{16029, 22196, 61140, 1788, 40459, 13867, 20092, 59352, 32675, 38873, 12206, 18189, 57165, 30561, 35996, 9379, 48369, 54329, 27708, 33857, 7271, 46473, 9864, 20135, 63168, 7919, 34310, 11830, 22125, 65461, 26552, 36826, 14333, 24379, 51020, 28526, 38044, 45558, 55771, 24998, 35215, 4394, 47438, 49433, 26872, 61643, 6372, 41139, 51271, 20519, 63494, 1005, 43979, 45557, 55774, 25013, 35200, 4464, 47435, 49420, 26863, 61668, 6315, 41107, 51286, 20503, 63517, 1004, 43971};
        onTransact = 8123384915362699706L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, int r7, byte r8) {
        /*
            byte[] r0 = defpackage.getDefaultMessage.$$c
            int r6 = r6 * 4
            int r1 = r6 + 1
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r7 = r7 + 109
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2e
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getDefaultMessage.$$e(short, int, byte):java.lang.String");
    }
}
